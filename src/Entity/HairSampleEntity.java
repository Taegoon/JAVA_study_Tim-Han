package Entity;

public class HairSampleEntity {
	private int  hair_code;
	private String hair_name;
	private String hair_img;
	private String hair_count;
	private String hair_price;
	private HairShopEntity hairshop_id;
	private DesignerEntity hd_id;
	public HairSampleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HairSampleEntity(int hair_code, String hair_name, String hair_img,
			String hair_count, String hair_price, HairShopEntity hairshop_id,
			DesignerEntity hd_id) {
		super();
		this.hair_code = hair_code;
		this.hair_name = hair_name;
		this.hair_img = hair_img;
		this.hair_count = hair_count;
		this.hair_price = hair_price;
		this.hairshop_id = hairshop_id;
		this.hd_id = hd_id;
	}
	public int getHair_code() {
		return hair_code;
	}
	public void setHair_code(int hair_code) {
		this.hair_code = hair_code;
	}
	public String getHair_name() {
		return hair_name;
	}
	public void setHair_name(String hair_name) {
		this.hair_name = hair_name;
	}
	public String getHair_img() {
		return hair_img;
	}
	public void setHair_img(String hair_img) {
		this.hair_img = hair_img;
	}
	public String getHair_count() {
		return hair_count;
	}
	public void setHair_count(String hair_count) {
		this.hair_count = hair_count;
	}
	public String getHair_price() {
		return hair_price;
	}
	public void setHair_price(String hair_price) {
		this.hair_price = hair_price;
	}
	public HairShopEntity getHairshop_id() {
		return hairshop_id;
	}
	public void setHairshop_id(HairShopEntity hairshop_id) {
		this.hairshop_id = hairshop_id;
	}
	public DesignerEntity getHd_id() {
		return hd_id;
	}
	public void setHd_id(DesignerEntity hd_id) {
		this.hd_id = hd_id;
	}
	
	
}
