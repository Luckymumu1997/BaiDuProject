package entity;

public class Bussite {

	private Integer id;
	private Integer lineName;//线路名称，1，2，3
	private Integer isSite;//是否是停靠站，1-是，0-否
	private String name;//站点名称
	private String workStart;//上班经过时间
	private String workDown;//下班经过时间
	private String longitude;//经度
	private String latitude;//纬度
	private Integer number;//编号
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLineName() {
		return lineName;
	}
	public void setLineName(Integer lineName) {
		this.lineName = lineName;
	}
	public Integer getIsSite() {
		return isSite;
	}
	public void setIsSite(Integer isSite) {
		this.isSite = isSite;
	}
	public void setIsSite(int isSite) {
		this.isSite = isSite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkStart() {
		return workStart;
	}
	public void setWorkStart(String workStart) {
		this.workStart = workStart;
	}
	public String getWorkDown() {
		return workDown;
	}
	public void setWorkDown(String workDown) {
		this.workDown = workDown;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
