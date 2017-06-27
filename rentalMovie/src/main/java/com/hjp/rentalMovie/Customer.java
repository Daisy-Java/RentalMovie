package com.hjp.rentalMovie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author huangjp
 * @Descripition : 顾客类
 * 2017年6月19日 上午9:30:38
 */
public class Customer {

	private String name;
	
	private Vector<Rental> rentals = new Vector<Rental>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addRental(Rental arg){
		rentals.add(arg);
	}
	
	/**
	 * 生成详单
	 * @param : 
	 * @return:
	 */
	public String statement(){
		
		Enumeration<Rental> customerRentals = rentals.elements();
		String result = "顾客" + getName() + "的租赁记录:\n";
		while(customerRentals.hasMoreElements()){
			Rental each = customerRentals.nextElement();
			result += each.getMovie().getTitle() + "：" + String.valueOf(each.getCharge()) + "\n";
		}
		
		result += "花费：" + String.valueOf(getTotalCharge()) + "\n";
		result += "你获取了：" + String.valueOf(getTotalFrequentRenterPoints()) + "个积分\n";
		return result;
		
	}
	
	/**
	 * HTML版本
	 * @param : 
	 * @return:
	 */
	public String htmlStatement(){
		
		Enumeration<Rental> customerRentals = rentals.elements();
		String result = "<h1>顾客" + getName() + "的租赁记录:</h1>\n";
		while(customerRentals.hasMoreElements()){
			Rental each = customerRentals.nextElement();
			result += each.getMovie().getTitle() + "：" + String.valueOf(each.getCharge()) + "<br>\n";
		}
		
		result += "花费：" + String.valueOf(getTotalCharge()) + "\n";
		result += "你获取了：" + String.valueOf(getTotalFrequentRenterPoints()) + "个积分\n";
		return result;
		
	}
	
	/**
	 * 获取全部花费
	 * @param : 
	 * @return:
	 */
	private double getTotalCharge(){
		double result = 0;
		Enumeration<Rental> customerRentals = rentals.elements();
		while(customerRentals.hasMoreElements()){
			Rental each = customerRentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	/**
	 * 获取全部积分
	 * @param : 
	 * @return:
	 */
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration<Rental> customerRentals = rentals.elements();
		while(customerRentals.hasMoreElements()){
			Rental each = customerRentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
	
	
}
