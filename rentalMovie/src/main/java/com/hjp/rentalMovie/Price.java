package com.hjp.rentalMovie;

/**
 * 抽象类：价格(使用多态代替条件语句)
 * @author huangjp
 * 2017年6月23日 下午2:17:12
 */
public abstract class Price {

	abstract int getPriceCode();
	
	/**
	 * 算费(每个价格的行为都不一样)
	 * @param : 
	 * @return:
	 */
	public abstract double getCharge(int daysRenced);
	
	/**
	 * 算积分(只有新片的行为特殊)
	 * @param : 
	 * @return:
	 */
	public int getFrequentRenterPoints(int daysRenced){
		
		return 1;
	}
	
}
