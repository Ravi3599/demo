package com.bridgelabz.oops;

import java.util.LinkedList;
import java.util.Scanner;

public class StockPortfolio {
	static int noOfData;
	static String shareName;
	static int noOfShare;
	static int sharePrice;
	static LinkedList<Stock> myLinkedList = new LinkedList<>();
	static int[] price = new int[10];

	public static void main(String[] args) {
	 getData();
	 totalValueOfStocks();
	}
	public static void getData() {
	int noOfData1;
	int i=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("How many data you want to enter");
	noOfData = sc.nextInt();
	noOfData1=noOfData;
	for(int m = 0;noOfData1 > 0;m++) {
		System.out.println("Enter stock name:");
		shareName  = sc.next();
		System.out.println("Enter number of shares:");
		noOfShare  = sc.nextInt();
		System.out.println("Enter each individual share price:");
		sharePrice  = sc.nextInt();
		Stock stock = new Stock(shareName,noOfShare,sharePrice);
		myLinkedList.add(stock);
		
		price[i++]=Stock.sharePrice*Stock.noOfShare;
		noOfData1--;

	}
    System.out.println(myLinkedList);

	}
	public static void totalValueOfStocks() {
		int sumOfShares=0;
		for(int i = 0; i< noOfData;i++) {
			sumOfShares= sumOfShares + price[i];

		}
		System.out.println("Total Share Price: "+sumOfShares);


	}
}
