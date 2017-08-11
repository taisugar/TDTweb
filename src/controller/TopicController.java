package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

import Entity.BaiViet;
import Entity.BinhLuan;
import Entity.ChuDe;

/**
 * Servlet implementation class TopicController
 */
@WebServlet("/TopicController")
public class TopicController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("txtAction");
		HttpSession session = request.getSession();
		
		if(action.equals("getalltopic")) {
			List<ChuDe> lsallTopic = this.getAllTopic();
			
			if (!lsallTopic.isEmpty()) {
				session.setAttribute("topic", this.getAllTopic());
				response.sendRedirect("index.jsp");
            } else{
            	out.println("failed !!!!!!!!!!!!");
            }
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public List<ChuDe> getAllTopic() {
		connection = (Connection) this.getServletContext().getAttribute("con");
		List<ChuDe> lsAllTopic = new ArrayList<ChuDe>();

		String sql = "SELECT * FROM ChuDe";

		try {
			Statement stm = connection.createStatement();
			ResultSet data = stm.executeQuery(sql);
			while (data.next()) {
				int maChude = data.getInt(1);
				String tenChude = data.getString(2);
				ChuDe chuDe = new ChuDe(maChude, tenChude);
				lsAllTopic.add(chuDe);
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lsAllTopic;
	}
}
