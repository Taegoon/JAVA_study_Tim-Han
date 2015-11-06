package Entity;

public class HDRestScheduleEntity {
	private String rest_code;
	private String reason;
	private String start_time;
	private String end_time;
	private String hd_id;
	public HDRestScheduleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HDRestScheduleEntity(String rest_code, String reason,
			String start_time, String end_time, String hd_id) {
		super();
		this.rest_code = rest_code;
		this.reason = reason;
		this.start_time = start_time;
		this.end_time = end_time;
		this.hd_id = hd_id;
	}
	public String getRest_code() {
		return rest_code;
	}
	public void setRest_code(String rest_code) {
		this.rest_code = rest_code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	public String getHd_id() {
		return hd_id;
	}
	public void setHd_id(String hd_id) {
		this.hd_id = hd_id;
	}
	
}
