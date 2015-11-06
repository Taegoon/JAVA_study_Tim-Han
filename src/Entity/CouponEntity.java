package Entity;

public class CouponEntity {
	private int code;
	private HairShopEntity hairshop_id;
	private int down_sale;
	private String start_term;
	private String end_term;
	private String description;
	public CouponEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CouponEntity(int code, HairShopEntity hairshop_id, int down_sale,
			String start_term, String end_term, String description) {
		super();
		this.code = code;
		this.hairshop_id = hairshop_id;
		this.down_sale = down_sale;
		this.start_term = start_term;
		this.end_term = end_term;
		this.description = description;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public HairShopEntity getHairshop_id() {
		return hairshop_id;
	}
	public void setHairshop_id(HairShopEntity hairshop_id) {
		this.hairshop_id = hairshop_id;
	}
	public int getDown_sale() {
		return down_sale;
	}
	public void setDown_sale(int down_sale) {
		this.down_sale = down_sale;
	}
	public String getStart_term() {
		return start_term;
	}
	public void setStart_term(String start_term) {
		this.start_term = start_term;
	}
	public String getEnd_term() {
		return end_term;
	}
	public void setEnd_term(String end_term) {
		this.end_term = end_term;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
