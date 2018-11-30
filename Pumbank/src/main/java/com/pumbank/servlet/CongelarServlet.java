package com.pumbank.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pumbank.models.Congelar;
import com.pumbank.models.Hijx;
import com.pumbank.persistance.HijoManager;

/**
 * Servlet implementation class CongelarServlet
 */
public class CongelarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("hid");

		try {
			int hid = Integer.parseInt(id);
			Hijx hijo = HijoManager.getInstance().getHijo(hid);
			request.setAttribute("unH", hijo);
			request.getRequestDispatcher("/congelar.jsp").forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fecha_inicio = request.getParameter("fecha_inicio");
		String fecha_fin = request.getParameter("fecha_fin");
		String id = request.getParameter("conid");
		
		System.out.println("Fechas:" + fecha_inicio + fecha_fin);
		
		try {

			int conid = Integer.parseInt(id);
			
						
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			Date fecha_inicio_D = format.parse(fecha_inicio);
			System.out.println(fecha_inicio_D); 
			
			Date fecha_fin_D = format.parse(fecha_fin);
			System.out.println(fecha_fin_D);
			

			Congelar congelado = HijoManager.getInstance().getCongelar(conid);

			congelado.setFecha_inicio(fecha_inicio_D);
			
			congelado.setFecha_fin(fecha_fin_D);

			HijoManager.getInstance().updateCongelar(congelado);

			request.setAttribute("daleCongelado", congelado);
			request.setAttribute("mensaje", "Your account has been freeze");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		doGet(request, response);

	}

}
