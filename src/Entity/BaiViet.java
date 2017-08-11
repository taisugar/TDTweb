package Entity;

import java.util.List;

public class BaiViet {
	private int maBaiViet;
	private ChuDe chuDe;
	private String noidung;
	private List<BinhLuan> lstbinhluan;
	private int vote;
	private String tieuDe;
	
	public int getMaBaiViet() {
		return maBaiViet;
	}

	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}

	public ChuDe getChuDe() {
		return chuDe;
	}

	public void setChuDe(ChuDe chuDe) {
		this.chuDe = chuDe;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public List<BinhLuan> getBinhluan() {
		return lstbinhluan;
	}

	public void setBinhluan(List<BinhLuan> binhluan) {
		this.lstbinhluan = binhluan;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public BaiViet(int maBaiViet, ChuDe chuDe, String noidung, List<BinhLuan> lstbinhluan, int vote, String tieuDe) {
		super();
		this.maBaiViet = maBaiViet;
		this.chuDe = chuDe;
		this.noidung = noidung;
		this.lstbinhluan = lstbinhluan;
		this.vote = vote;
		this.tieuDe = tieuDe;
	}

	public BaiViet() {
	}

}
