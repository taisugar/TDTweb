package Entity;

public class ChuDe {
	private int maChude;
	private String TenChude;
	
	public int getMaChude() {
		return maChude;
	}

	public void setMaChude(int maChude) {
		this.maChude = maChude;
	}

	public String getTenChude() {
		return TenChude;
	}

	public void setTenChude(String tenChude) {
		TenChude = tenChude;
	}
	
	public ChuDe() {
	}

	public ChuDe(int maChude, String tenChude) {
		super();
		this.maChude = maChude;
		TenChude = tenChude;
	}

}
