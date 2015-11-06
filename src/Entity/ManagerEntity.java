package Entity;

public class ManagerEntity {
	private String mng_id;
	private String mng_pw;
	private String mng_name;
	public ManagerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerEntity(String mng_id, String mng_pw, String mng_name) {
		super();
		this.mng_id = mng_id;
		this.mng_pw = mng_pw;
		this.mng_name = mng_name;
	}
	public String getMng_id() {
		return mng_id;
	}
	public void setMng_id(String mng_id) {
		this.mng_id = mng_id;
	}
	public String getMng_pw() {
		return mng_pw;
	}
	public void setMng_pw(String mng_pw) {
		this.mng_pw = mng_pw;
	}
	public String getMng_name() {
		return mng_name;
	}
	public void setMng_name(String mng_name) {
		this.mng_name = mng_name;
	}
	
}
