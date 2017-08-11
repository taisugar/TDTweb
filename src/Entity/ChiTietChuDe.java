package Entity;

public class ChiTietChuDe {
	private ChuDe chude;
	private ThanhVien thanhVien;
	private int maCTCD;

	public ChuDe getChude() {
		return chude;
	}

	public void setChude(ChuDe chude) {
		this.chude = chude;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public int getMaCTCD() {
		return maCTCD;
	}

	public void setMaCTCD(int maCTCD) {
		this.maCTCD = maCTCD;
	}

	public ChiTietChuDe(ChuDe chude, ThanhVien thanhVien, int maCTCD) {
		super();
		this.chude = chude;
		this.thanhVien = thanhVien;
		this.maCTCD = maCTCD;
	}

	public ChiTietChuDe() {
	}
}
