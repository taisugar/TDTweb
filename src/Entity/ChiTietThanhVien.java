package Entity;

public class ChiTietThanhVien {
	private int maCTTV;
	private SinhVien sv;
	private GiangVien gv;

	public int getMaCTTV() {
		return maCTTV;
	}

	public void setMaCTTV(int maCTTV) {
		this.maCTTV = maCTTV;
	}

	public SinhVien getSv() {
		return sv;
	}

	public void setSv(SinhVien sv) {
		this.sv = sv;
	}

	public GiangVien getGv() {
		return gv;
	}

	public void setGv(GiangVien gv) {
		this.gv = gv;
	}

	public ChiTietThanhVien(int maCTTV, SinhVien sv, GiangVien gv) {
		super();
		this.maCTTV = maCTTV;
		this.sv = sv;
		this.gv = gv;
	}

	public ChiTietThanhVien() {
	}

}
