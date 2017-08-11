package Entity;

public class ThanhVien {
	private int maThanhVien;
	private String TenThanhVien;
	private TaiKhoan TK;
	private ChiTietThanhVien CTTV;
	private ChiTietChuDe CTCD;

	public int getMaThanhVien() {
		return maThanhVien;
	}

	public void setMaThanhVien(int maThanhVien) {
		this.maThanhVien = maThanhVien;
	}

	public String getTenThanhVien() {
		return TenThanhVien;
	}

	public void setTenThanhVien(String tenThanhVien) {
		TenThanhVien = tenThanhVien;
	}

	public TaiKhoan getTK() {
		return TK;
	}

	public void setTK(TaiKhoan tK) {
		TK = tK;
	}

	public ChiTietThanhVien getCTTV() {
		return CTTV;
	}

	public void setCTTV(ChiTietThanhVien cTTV) {
		CTTV = cTTV;
	}

	public ChiTietChuDe getCTCD() {
		return CTCD;
	}

	public void setCTCD(ChiTietChuDe cTCD) {
		CTCD = cTCD;
	}

	public ThanhVien() {
	}

	public ThanhVien(int maThanhVien, String tenThanhVien, TaiKhoan tK, ChiTietThanhVien cTTV,
			ChiTietChuDe cTCD) {
		super();
		this.maThanhVien = maThanhVien;
		TenThanhVien = tenThanhVien;
		TK = tK;
		CTTV = cTTV;
		CTCD = cTCD;
	}

}
