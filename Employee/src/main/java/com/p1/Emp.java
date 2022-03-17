package com.p1;

public class Emp {

	int eid;
	String ename;
	
	
	public Emp() {
		
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
}
