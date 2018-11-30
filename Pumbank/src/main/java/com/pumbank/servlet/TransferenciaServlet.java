package com.pumbank.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pumbank.models.Hijx;
import com.pumbank.persistance.HijoManager;

public class TransferenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String id = request.getParameter("hid");

		try {
			int hid = Integer.parseInt(id);
			Hijx hijo = HijoManager.getInstance().getHijo(hid);
			request.setAttribute("unH", hijo);
			request.getRequestDispatcher("/transferencia.jsp").forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String saldo = request.getParameter("saldo");
		String id = request.getParameter("hid");

		try {
			
			int hid = Integer.parseInt(id);
			Double saldoDouble = (saldo != null && !saldo.equals("")) ? Double.parseDouble(saldo) : 0;

			Hijx unHijo = HijoManager.getInstance().getHijo(hid);
			
			unHijo.setSaldoMas(saldoDouble);
				
			HijoManager.getInstance().updateHijo(unHijo);
			 
			request.setAttribute("saldoHijo", unHijo);
			request.setAttribute("mensaje", "Saldo cambiado!");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		doGet(request, response);

	}

}
