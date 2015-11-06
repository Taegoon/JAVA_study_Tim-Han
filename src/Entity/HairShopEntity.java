package Entity;

public class HairShopEntity {
	private String hairShop_id;
	private String name;
	private String addr;
	private String phone;
	private String email;
	private String web;
	private int count;
	private String open;
	private String close;
	private String img;
	private String des;
	private String status;
	private AreaEntity area_id;
	
	public HairShopEntity(String hairShop_id, String name, String addr,
			String phone, String email, String web, int count, String open,
			String close, String img, String des, String status,
			AreaEntity area_id) {
		super();
		this.hairShop_id = hairShop_id;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.email = email;
		this.web = web;
		this.count = count;
		this.open = open;
		this.close = close;
		this.img = img;
		this.des = des;
		this.status = status;
		this.area_id = area_id;
	}
	public String getHairShop_id() {
		return hairShop_id;
	}
	public void setHairShop_id(String hairShop_id) {
		this.hairShop_id = hairShop_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AreaEntity getArea_id() {
		return area_id;
	}
	public void setArea_id(AreaEntity area_id) {
		this.area_id = area_id;
	}
	
	public HairShopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
