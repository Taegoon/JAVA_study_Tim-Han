package Entity;

public class CommenEntity {
	private String com_code;
	private HairShopEntity hairshop_id;
	private MemberEntity member_id;
	private String comment_edit;
	private String comment_time;
	public CommenEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommenEntity(String com_code, HairShopEntity hairshop_id,
			MemberEntity member_id, String comment_edit, String comment_time) {
		super();
		this.com_code = com_code;
		this.hairshop_id = hairshop_id;
		this.member_id = member_id;
		this.comment_edit = comment_edit;
		this.comment_time = comment_time;
	}
	public String getCom_code() {
		return com_code;
	}
	public void setCom_code(String com_code) {
		this.com_code = com_code;
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
	public String getComment_edit() {
		return comment_edit;
	}
	public void setComment_edit(String comment_edit) {
		this.comment_edit = comment_edit;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	
}
