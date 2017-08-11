package Entity;

public class GiangVien {
	private String msGV;
	private String TenGV;
	private String Email;
	private int SDT;
	private String Gioitinh;

	public String getMsGV() {
		return msGV;
	}

	public void setMsGV(String msGV) {
		this.msGV = msGV;
	}

	public String getTenGV() {
		return TenGV;
	}

	public void setTenGV(String tenGV) {
		TenGV = tenGV;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getSDT() {
		return SDT;
	}

	public void setSDT(int sDT) {
		SDT = sDT;
	}

	public String getGioitinh() {
		return Gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}

	public GiangVien(String msGV, String tenGV, String email, int sDT, String gioitinh) {
		super();
		this.msGV = msGV;
		TenGV = tenGV;
		Email = email;
		SDT = sDT;
		Gioitinh = gioitinh;
	}

	public GiangVien() {
	}

}
