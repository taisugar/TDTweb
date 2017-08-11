package Entity;

public class SinhVien {
	private int mssv;
	private String TenSV;
	private int Sdt;
	private int Lop;
	private String Gioitinh;

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getTenSV() {
		return TenSV;
	}

	public void setTenSV(String tenSV) {
		TenSV = tenSV;
	}

	public int getSdt() {
		return Sdt;
	}

	public void setSdt(int sdt) {
		Sdt = sdt;
	}

	public int getLop() {
		return Lop;
	}

	public void setLop(int lop) {
		Lop = lop;
	}

	public String getGioitinh() {
		return Gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}

	public SinhVien() {

	}

	public SinhVien(int mssv, String tenSV, int sdt, int lop, String gioitinh) {
		super();
		this.mssv = mssv;
		TenSV = tenSV;
		Sdt = sdt;
		Lop = lop;
		Gioitinh = gioitinh;
	}
}
