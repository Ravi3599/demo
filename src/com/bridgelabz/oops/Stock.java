package com.bridgelabz.oops;

public class Stock {
	static String shareName;
	static int noOfShare;
	static int sharePrice;
	public Stock(String shareName, int noOfShare, int sharePrice) {
		super();
		this.shareName = shareName;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return "Stock [shareName=" +shareName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
	}
	
}
