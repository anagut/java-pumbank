package com.pumbank.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pumbank.models.Hijx;
import com.pumbank.persistance.HijoManager;

public class PagaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String hidrecibido = request.getParameter("hid");
		int hidrec = Integer.parseInt(hidrecibido);

		try {
			Hijx elhijo = HijoManager.getInstance().getHijo(hidrec);
			request.setAttribute("elHijo", elhijo);
			request.getRequestDispatcher("/paga.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
