package Entity;

public class ReserveEntity {
	private int reserve_code;
	private String start_time;
	private String end_time;
	private String reserve_status;
	private DesignerEntity hd_id;
	private HairShopEntity hairshop_id;
	private MemberEntity member_id;
	private int price ;
	private String history;
	private Hair_LengthEntity hl_code;
	private HairStyleEntity hs_code;
	private int down_sales;
	private String phone;
	public ReserveEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReserveEntity(int reserve_code, String start_time, String end_time,
			String reserve_status, DesignerEntity hd_id,
			HairShopEntity hairshop_id, MemberEntity member_id, int price,
			String history, Hair_LengthEntity hl_code,
			HairStyleEntity hs_code, int down_sales, String phone) {
		super();
		this.reserve_code = reserve_code;
		this.start_time = start_time;
		this.end_time = end_time;
		this.reserve_status = reserve_status;
		this.hd_id = hd_id;
		this.hairshop_id = hairshop_id;
		this.member_id = member_id;
		this.price = price;
		this.history = history;
		this.hl_code = hl_code;
		this.hs_code = hs_code;
		this.down_sales = down_sales;
		this.phone = phone;
	}
	public int getReserve_code() {
		return reserve_code;
	}
	public void setReserve_code(int reserve_code) {
		this.reserve_code = reserve_code;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getReserve_status() {
		return reserve_status;
	}
	public void setReserve_status(String reserve_status) {
		this.reserve_status = reserve_status;
	}
	public DesignerEntity getHd_id() {
		return hd_id;
	}
	public void setHd_id(DesignerEntity hd_id) {
		this.hd_id = hd_id;
	}
	public HairShopEntity getHairshop_id() {
		return hairshop_id;
	}
	public void setHairshop_id(HairShopEntity hairshop_id) {
		this.hairshop_id = hairshop_id;
	}
	public MemberEntity getMember_id() {
		return member_id;
	}
	public void setMember_id(MemberEntity member_id) {
		this.member_id = member_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public Hair_LengthEntity getHl_code() {
		return hl_code;
	}
	public void setHl_code(Hair_LengthEntity hl_code) {
		this.hl_code = hl_code;
	}
	public HairStyleEntity getHs_code() {
		return hs_code;
	}
	public void setHs_code(HairStyleEntity hs_code) {
		this.hs_code = hs_code;
	}
	public int getDown_sales() {
		return down_sales;
	}
	public void setDown_sales(int down_sales) {
		this.down_sales = down_sales;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
