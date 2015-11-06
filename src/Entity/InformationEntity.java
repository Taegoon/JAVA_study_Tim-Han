package Entity;

public class InformationEntity {
	
	private int info_id;
	private String info_title;
	private String info_contents;
	private String info_date;
	private HairShopEntity hairshop_id;
	private MemberEntity member_id;
	public InformationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InformationEntity(int info_id, String info_title,
			String info_contents, String info_date, HairShopEntity hairshop_id,
			MemberEntity member_id) {
		super();
		this.info_id = info_id;
		this.info_title = info_title;
		this.info_contents = info_contents;
		this.info_date = info_date;
		this.hairshop_id = hairshop_id;
		this.member_id = member_id;
	}
	public int getInfo_id() {
		return info_id;
	}
	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}
	public String getInfo_title() {
		return info_title;
	}
	public void setInfo_title(String info_title) {
		this.info_title = info_title;
	}
	public String getInfo_contents() {
		return info_contents;
	}
	public void setInfo_contents(String info_contents) {
		this.info_contents = info_contents;
	}
	public String getInfo_date() {
		return info_date;
	}
	public void setInfo_date(String info_date) {
		this.info_date = info_date;
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
	
}
