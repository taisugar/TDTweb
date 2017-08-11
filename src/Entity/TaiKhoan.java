package Entity;

public class TaiKhoan {
	private String email;
	private int username;
	private String password;
	private int position;
	private ThanhVien thanhVien;
	
	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public TaiKhoan() {
	}

	public TaiKhoan(String email, int username, String password, int position, ThanhVien thanhVien) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.position = position;
		this.thanhVien = thanhVien;
	}

}
