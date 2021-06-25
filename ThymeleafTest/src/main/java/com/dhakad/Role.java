package com.dhakad;

public class Role {

	
	private int rolid;
	private String roleName;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Role(int rolid, String roleName) {
		super();
		this.rolid = rolid;
		this.roleName = roleName;
	}


	public int getRolid() {
		return rolid;
	}


	public void setRolid(int rolid) {
		this.rolid = rolid;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
