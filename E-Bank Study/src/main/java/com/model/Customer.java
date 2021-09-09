package com.model;

public class Customer {

	private int cid;
	private String cname;
	private String cpin;
	private String cpan;
	private String cphone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String cpin, String cpan, String cphone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpin = cpin;
		this.cpan = cpan;
		this.cphone = cphone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpin() {
		return cpin;
	}

	public void setCpin(String cpin) {
		this.cpin = cpin;
	}

	public String getCpan() {
		return cpan;
	}

	public void setCpan(String cpan) {
		this.cpan = cpan;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cpin=" + cpin + ", cpan=" + cpan + ", cphone=" + cphone
				+ "]";
	}

}
