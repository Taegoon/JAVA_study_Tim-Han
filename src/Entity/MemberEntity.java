package Entity;

public class MemberEntity {
	private String member_id;
	private String member_name;
	private String member_nick;
	private String passwords;
	private String phone_no;
	private String lever;
	private String email;
	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberEntity(String member_id, String member_name,
			String member_nick, String passwords, String phone_no,
			String lever, String email) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_nick = member_nick;
		this.passwords = passwords;
		this.phone_no = phone_no;
		this.lever = lever;
		this.email = email;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getLever() {
		return lever;
	}
	public void setLever(String lever) {
		this.lever = lever;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
