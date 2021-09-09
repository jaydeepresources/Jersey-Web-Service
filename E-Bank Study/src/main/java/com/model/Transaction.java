package com.model;

public class Transaction {

	private int tid;
	private float tamount;
	private float tbalance;
	private String tdate;
	private String type;
	private int cfid;
	private int ctid;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int tid, float tamount, float tbalance, String tdate, String type, int cfid, int ctid) {
		super();
		this.tid = tid;
		this.tamount = tamount;
		this.tbalance = tbalance;
		this.tdate = tdate;
		this.type = type;
		this.cfid = cfid;
		this.ctid = ctid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public float getTamount() {
		return tamount;
	}

	public void setTamount(float tamount) {
		this.tamount = tamount;
	}

	public float getTbalance() {
		return tbalance;
	}

	public void setTbalance(float tbalance) {
		this.tbalance = tbalance;
	}

	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCfid() {
		return cfid;
	}

	public void setCfid(int cfid) {
		this.cfid = cfid;
	}

	public int getCtid() {
		return ctid;
	}

	public void setCtid(int ctid) {
		this.ctid = ctid;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", tamount=" + tamount + ", tbalance=" + tbalance + ", tdate=" + tdate
				+ ", type=" + type + ", cfid=" + cfid + ", ctid=" + ctid + "]";
	}

}
