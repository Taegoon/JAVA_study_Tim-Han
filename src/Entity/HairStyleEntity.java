package Entity;

public class HairStyleEntity {
	private  String hs_code;
	private String hs_name;
	private int reserve_time;
	private String hs_price;
	
	public HairStyleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HairStyleEntity(String hs_code, String hs_name, int reserve_time,
			String hs_price) {
		super();
		this.hs_code = hs_code;
		this.hs_name = hs_name;
		this.reserve_time = reserve_time;
		this.hs_price = hs_price;
	}
	public String getHs_code() {
		return hs_code;
	}
	public void setHs_code(String hs_code) {
		this.hs_code = hs_code;
	}
	public String getHs_name() {
		return hs_name;
	}
	public void setHs_name(String hs_name) {
		this.hs_name = hs_name;
	}
	public int getReserve_time() {
		return reserve_time;
	}
	public void setReserve_time(int reserve_time) {
		this.reserve_time = reserve_time;
	}
	public String getHs_price() {
		return hs_price;
	}
	public void setHs_price(String hs_price) {
		this.hs_price = hs_price;
	}
	
}
