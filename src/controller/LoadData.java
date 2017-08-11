package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.TaiKhoan;

/**
 * Servlet implementation class LoadDataFromServlet
 */
@WebServlet("/LoadData")
public class LoadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadData() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

/*		try {
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("loginedUser");

			if (username != null) {
				
				out.println("<h2>Welcome " + username + "</h2>");
				List<Account> lstAc = this.getAllAccount();
				out.println("<table border = 1>");
				out.println("<tr>");
				out.println("<td> Id </td>");
				out.println("<td> Username </td>");
				out.println("<td> Password </td>");
				out.println("</tr>");
				for (Account a : lstAc) {
					out.println("<tr>");
					out.println("<td>" + a.getId() + "</td>");
					out.println("<td>" + a.getUsername() + "</td>");
					out.println("<td>" + a.getPassword() + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			} else {
				response.sendRedirect("login.jsp");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
