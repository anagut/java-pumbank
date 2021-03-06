package com.andresbank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.andresbank.models.Cliente;
import com.andresbank.models.Cuenta;
import com.mysql.jdbc.Statement;

public class CuentaDAO extends DAO {
	
//	extends usa la opcion de "herencia" para usar, en este caso los drivers y el url, de DAO.java. 

	private static CuentaDAO instance = null;

	public static CuentaDAO getInstance() throws Exception {
		if (instance == null)
			instance = new CuentaDAO();

		return instance;
	}

	private CuentaDAO() throws Exception {
	}

	public Cuenta getCuentaByCid(int cidrec) throws SQLException {
		Cuenta resCuenta = null;

// 		Crear driver

//		para no estar llamando a la conexion todo el rato. Generar un Pool de conexiones en DAO
//		Connection conn = DriverManager.getConnection(url, "root", "root");
		Connection conn = datasource.getConnection();

//		java.sql establecer que statements poner dentro del driver. Especificar los campos en SELECT para saber encontrarlos

		String sql = "SELECT cid, nombre, numero, saldo FROM cuenta WHERE cid=?";

		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, cidrec);

		ResultSet rs = psmt.executeQuery();

		System.out.println("ResultSet; " + rs);

//		usamos un while porque desconocemos el tama�o de los datos que vamos a recibir, y pedimos los campos con getInt/getString etc.

		while (rs.next()) {
			System.out.println("ResultSet:" + rs.getInt(1));
			resCuenta = new Cuenta(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
		}

		rs.close();
		psmt.close();

		conn.close();

		return resCuenta;

	}

	public int crearCuenta(Cuenta cuenta, Cliente cliente) throws SQLException {
		int cidres = 0;

		Connection conn = datasource.getConnection();

		conn.setAutoCommit(false);

		try {
			String sql = "INSERT INTO `cuenta` ( `nombre`, `numero`, `saldo`) VALUES (?, ?, ?)";
//	Para que te devuelva las claves generadas de la base de datos al DAO
			PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1, cuenta.getNombre());
			psmt.setString(2, cuenta.getNumero());
			psmt.setDouble(3, cuenta.getSaldo());

			psmt.executeUpdate();

			ResultSet rs = psmt.getGeneratedKeys();

			if (rs.next()) {
				cidres = rs.getInt(1);
			}

			psmt.close();
			rs.close();

//	INSERTAR CLIENTE-CUENTA
			String sql1 = "INSERT INTO `cliente_cuenta` ( `cliente`, `cuenta`) VALUES (?, ?)";
			psmt = conn.prepareStatement(sql1);
			psmt.setInt(1, cliente.getUid());
			psmt.setInt(2, cidres);

			psmt.executeUpdate();
			psmt.close();

			conn.commit();
			conn.close();
		} catch (Exception e) {
			System.out.println("Excepcion tx: " + e.getMessage());
			conn.rollback();
		}

		return cidres;

	}

	public boolean editarCuenta(Cuenta cuenta) throws SQLException {

		boolean todoOk = false;

		Connection conn = datasource.getConnection();

		String sql = "UPDATE cuenta SET `nombre`=?,`numero`=?,`saldo`=? WHERE cid=?";
		// Para que te devuelva las claves generadas de la base de datos al DAO
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, cuenta.getNombre());
		psmt.setString(2, cuenta.getNumero());
		psmt.setDouble(3, cuenta.getSaldo());
		psmt.setInt(4, cuenta.getCid());

		psmt.executeUpdate();
		todoOk = true;

		psmt.close();

		conn.close();

		return todoOk;

	}

	public boolean borrarCuenta(Cuenta cuenta) throws SQLException {

		boolean todoOk = false;

		Connection conn = datasource.getConnection();

		conn.setAutoCommit(false);

		try {
			String sql = "DELETE FROM `cliente_cuenta` WHERE `cliente_cuenta`.`cuenta` = ?";
			// Para que te devuelva las claves generadas de la base de datos al DAO
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cuenta.getCid());

			psmt.executeUpdate();

			psmt.close();

			sql = "DELETE FROM cuenta WHERE cid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, cuenta.getCid());

			psmt.executeUpdate();
			psmt.close();
			
			conn.commit();
	
			todoOk = true;
			System.out.println("Punto1");
			
		} catch (Exception e) {
			System.out.println("Excepcion tx: " + e.getMessage());
			conn.rollback();
		}finally {
		
		conn.close();}

		return todoOk;

	}
}
