package Entity;

public class BinhLuan {
	private int maBinhluan;
	private String noidung;
	private int vote;
	private int maBaiviet;

	public int getMaBinhluan() {
		return maBinhluan;
	}

	public void setMaBinhluan(int maBinhluan) {
		this.maBinhluan = maBinhluan;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public int getMaBaiviet() {
		return maBaiviet;
	}

	public void setMaBaiviet(int maBaiviet) {
		this.maBaiviet = maBaiviet;
	}

	public BinhLuan(int maBinhluan, String noidung, int vote, int maBaiviet) {
		super();
		this.maBinhluan = maBinhluan;
		this.noidung = noidung;
		this.vote = vote;
		this.maBaiviet = maBaiviet;
	}

	public BinhLuan() {
	}

}
