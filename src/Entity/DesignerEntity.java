package Entity;

public class DesignerEntity {
	private int id;
	private String name;
	private String nickname;
	private String jikwi;
	private String career;
	private String img;
	private int count;
	private String date;
	HairShopEntity hairshop;
	
	
	
	public DesignerEntity(int id, String name, String nickname,
			String jikwi, String career, String img, int count,
			String description, String date, HairShopEntity hairshop) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.jikwi = jikwi;
		this.career = career;
		this.img = img;
		this.count = count;
		this.date = date;
		this.hairshop = hairshop;
	}
	public DesignerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJikwi() {
		return jikwi;
	}
	public void setJikwi(String jikwi) {
		this.jikwi = jikwi;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public HairShopEntity getHairshop() {
		return hairshop;
	}
	public void setHairshop(HairShopEntity hairshop) {
		this.hairshop = hairshop;
	}
	
	
}
