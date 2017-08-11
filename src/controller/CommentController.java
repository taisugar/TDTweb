package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import Entity.TaiKhoan;

/**
 * Servlet implementation class CommentController
 */
@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommentController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("txtAction");
		String comment = request.getParameter("txtComment");
		String machude = request.getParameter("machude");
		HttpSession session = request.getSession();

		ArrayList<BaiViet> lsPost = (ArrayList<BaiViet>) session.getAttribute("post");

		if (lsPost == null) {

		} else {
			for (BaiViet bv : lsPost) {
				int mabl = bv.getBinhluan().size();
				BinhLuan binhLuan = new BinhLuan(++mabl, comment, 0, bv.getMaBaiViet());
				bv.getBinhluan().add(binhLuan);
				if (addComment(binhLuan)) {
					out.print("success !!");
				} else {
					out.print("error !! ");
				}
			}
		}

		if (action.equals("getallpost")) {
			List<BaiViet> lsAllPost = this.getAllPostByID(Integer.parseInt(machude));

			if (!lsAllPost.isEmpty()) {
				session.setAttribute("post", lsAllPost);
				out.println("success !!!!!!!!!!!!");
			} else {
				out.println("failed !!!!!!!!!!!!");
			}
		}
	}

	private boolean addComment(BinhLuan binhLuan) {
		connection = (Connection) this.getServletContext().getAttribute("con");
		String sql = "INSERT INTO BinhLuan(MaBinhLuan, NoiDung, Vote, MaBaiViet) VALUES(?, ?, ?, ?)";

		try {
			PreparedStatement psm = connection.prepareStatement(sql);
			psm.setInt(1, binhLuan.getMaBinhluan());
			psm.setString(2, binhLuan.getNoidung());
			psm.setInt(3, binhLuan.getVote());
			psm.setInt(4, binhLuan.getMaBaiviet());
			int row = psm.executeUpdate();
			psm.close();
			return (row == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean VoteBinhluan(int id, int vote) {
		String sql = "UPDATE BinhLuan SET Vote = ? where MaBinhLuan = ?";
		try {
			PreparedStatement ptm = connection.prepareStatement(sql);
			ptm.setInt(1, vote);
			ptm.setInt(2, id);
			int row = ptm.executeUpdate();
			ptm.close();
			return (row == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean VoteBaiViet(int id, int vote) {
		String sql = "UPDATE BaiViet SET Vote = ? where MaBaiViet = ?";
		try {
			PreparedStatement ptm = connection.prepareStatement(sql);
			ptm.setInt(1, vote);
			ptm.setInt(2, id);
			int row = ptm.executeUpdate();
			ptm.close();
			return (row == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public List<BaiViet> getAllPostByID(int id) {

		connection = (Connection) this.getServletContext().getAttribute("con");
		List<BaiViet> lsAllPost = new ArrayList<BaiViet>();

		String sql = "SELECT * FROM BaiViet WHERE MaChuDe = ?";

		try {
			PreparedStatement psm = connection.prepareStatement(sql);
			psm.setInt(1, id);
			ResultSet data = psm.executeQuery();
			while (data.next()) {
				int MaBaiViet = data.getInt(1);
				String Tieude = data.getString(2);
				String Noidung = data.getString(3);
				int vote = data.getInt(4);
				int maChude = data.getInt(5);
				ChuDe chuDe = this.getTopicByID(maChude);
				List<BinhLuan> lsAllComment = this.getAllComment(MaBaiViet);
				BaiViet baiViet = new BaiViet(MaBaiViet, chuDe, Noidung, lsAllComment, vote, Tieude);
				lsAllPost.add(baiViet);
			}
			psm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lsAllPost;
	}

	public ChuDe getTopicByID(int id) {
		connection = (Connection) this.getServletContext().getAttribute("con");
		String sql = "SELECT * FROM ChuDe WHERE MaChuDe = ?";

		try {
			PreparedStatement psm = connection.prepareStatement(sql);
			psm.setInt(1, id);
			ResultSet data = psm.executeQuery();
			if (data.next()) {
				int MaChuDe = data.getInt(1);
				String tenChuDe = data.getString(2);
				ChuDe chuDe = new ChuDe(MaChuDe, tenChuDe);
				return chuDe;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<BinhLuan> getAllComment(int maBaiviet) {
		connection = (Connection) this.getServletContext().getAttribute("con");
		String sql = "SELECT * FROM BinhLuan WHERE MaBaiViet = ?";
		List<BinhLuan> lsAllComment = new ArrayList<BinhLuan>();

		try {
			PreparedStatement psm = connection.prepareStatement(sql);
			psm.setInt(1, maBaiviet);
			ResultSet data = psm.executeQuery();
			while (data.next()) {
				int maBinhluan = data.getInt(1);
				String Noidung = data.getString(2);
				int vote = data.getInt(3);
				int mabaiviet = data.getInt(4);
				BinhLuan binhLuan = new BinhLuan(maBinhluan, Noidung, vote, mabaiviet);
				lsAllComment.add(binhLuan);
			}
			psm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lsAllComment;
	}
}
