package com.test;

public class Course {
	
	private String cname;
	private String duration;
	private String loc;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public void details()
	{
		System.out.println(cname+" "+duration+" "+loc);
	}
}
