package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.SinhVien;
import Entity.TaiKhoan;
import Entity.ThanhVien;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("txtEmail");
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		String action = request.getParameter("txtAction");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		if (action.equals("login")) {
			if(username.equals("") || password.equals("")) {
				out.print("Vui long nhap thong tin dang nhap!!!");
			}
			else{
				TaiKhoan acc = this.checkLogin(Integer.parseInt(username), password);
				if (acc != null) {
					ThanhVien thanhVien = this.getInforThanhVien(Integer.parseInt(username));
					if (thanhVien != null) {
						acc.setThanhVien(thanhVien);
						out.print("success");
						session.setAttribute("TaiKhoan", acc);
					}
				} else {
					out.print("Sai username hoac password!!!");
				}
			}
		} else if (action.equals("register")) {
			if (this.getInforSinhVien(Integer.parseInt(username)) != null){
				TaiKhoan acc = new TaiKhoan();
				acc.setUsername(Integer.parseInt(username));
				acc.setPassword(password);
				acc.setEmail(email);
				acc.setPosition(1);
				if (this.checkLogin(Integer.parseInt(username), password) != null) {
					out.print("Tai khoan da duoc dang ky");
				}else {
					addTaikhoan(acc);
					out.print("success");
				}
			} else {
				out.print("Ban khong phai la sinh vien truong");
			}
		} else if (action.equals("logout")) {
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private TaiKhoan checkLogin(int username, String password) {
		String sql = "SELECT * FROM TaiKhoan WHERE Username = ? AND Password = ?";
		Connection con = (Connection) this.getServletContext().getAttribute("con");
		
		try {
			PreparedStatement psm = con.prepareStatement(sql);
			psm.setInt(1, username);
			psm.setString(2, password);
			ResultSet rs = psm.executeQuery();
			if(rs.next()){
				TaiKhoan acc = new TaiKhoan();
				acc.setUsername(rs.getInt(1));
				acc.setPassword(rs.getString(2));
				acc.setEmail(rs.getString(3));
				acc.setPosition(rs.getInt(4));
				return acc;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private ThanhVien getInforThanhVien(int username) {
		String sql = "SELECT * FROM ThanhVien WHERE MaTaiKhoan = ?";
		Connection con = (Connection) this.getServletContext().getAttribute("con");
		
		try {
			PreparedStatement psm = con.prepareStatement(sql);
			psm.setInt(1, username);
			ResultSet rs = psm.executeQuery();
			if(rs.next()){
				ThanhVien thanhVien = new ThanhVien();
				thanhVien.setMaThanhVien(rs.getInt(1));
				thanhVien.setTenThanhVien(rs.getString(2));
				return thanhVien;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	private SinhVien getInforSinhVien(int id) {
		Connection con = (Connection) this.getServletContext().getAttribute("con");
		String sql = "SELECT * FROM SinhVien WHERE MaSV = ?";

		try {
			PreparedStatement psm = con.prepareStatement(sql);
			psm.setInt(1, id);
			ResultSet data = psm.executeQuery();
			if(data.next()) {
				int mssv = data.getInt(1);
				String tenSV = data.getString(2);
				int sdt = data.getInt(3);
				int lop = data.getInt(4);
				String gioitinh = data.getString(5);
				SinhVien sinhVien = new SinhVien(mssv, tenSV, sdt, lop, gioitinh);
				return sinhVien;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private boolean addTaikhoan(TaiKhoan tk) {
		Connection con = (Connection) this.getServletContext().getAttribute("con");
		String sql = "INSERT INTO TaiKhoan(Username, Password, Email, LoaiTK) VALUES(?, ?, ?, ?)";

		try {
			PreparedStatement psm = con.prepareStatement(sql);
			psm.setInt(1, tk.getUsername());
			psm.setString(2, tk.getPassword());
			psm.setString(3, tk.getEmail());
			psm.setInt(4, tk.getPosition());
			int row = psm.executeUpdate();
			return (row == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}

/*if (action.equals("edit")) {
	if (((String) session.getAttribute("loginedUser")) != null) {
		String id = request.getParameter("id");
		boolean isEdit = this.EditInforUser(id);
	} else {
		response.sendRedirect("login.jsp");
	}

}
if (action.equals("delete")) {
	if (((String) session.getAttribute("loginedUser")) != null) {
		String id = request.getParameter("id");
		boolean isDelete = this.DeleteInforUser(id);
		if (isDelete) {
			//session.setAttribute("lstInforUser", this.getAllInforUser());
			response.sendRedirect("viewinforuser.jsp");
		} else {
			response.sendRedirect("errorAccount.jsp");
		}
	} else {
		response.sendRedirect("login.jsp");
	}
}
}

public boolean EditInforUser(String id) {
String sql = "UPDATE Infor SET Name = ?, Address = ?, Phone = ? where IdInfor = ?";
try {
	PreparedStatement ptm = connection.prepareStatement(sql);
	ptm.setInt(4, Integer.parseInt(id));
	int row = ptm.executeUpdate();
	ptm.close();
	return (row == 1);
} catch (SQLException e) {
	e.printStackTrace();
}
return false;
}

private boolean DeleteInforUser(String id) {
String sql = "DELETE FROM Infor WHERE idInfor = ?";
Connection con = (Connection) this.getServletContext().getAttribute("con");
try {
	PreparedStatement psm = con.prepareStatement(sql);
	psm.setInt(1, Integer.parseInt(id));
	return psm.executeUpdate() == 1;
} catch (SQLException e) {
	e.printStackTrace();
}

return false;
}
*/
