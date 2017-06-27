package com.hjp.rentalMovie;
/**
 * 儿童片
 * @author huangjp
 * 2017年6月23日 下午2:19:58
 */
public class ChildrenPrice extends Price{

	@Override
	int getPriceCode() {
		
		return Movie.CHILDERNS;
	}
	
	@Override
	public double getCharge(int daysRenced) {
		
		double result = 2;
		if(daysRenced > 2){
			result += (daysRenced - 2) * 1.5;
		}
		return result;
	}

}
