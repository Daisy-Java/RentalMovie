package com.hjp.rentalMovie;
/**
 * 普通片
 * @author huangjp
 * 2017年6月23日 下午2:18:57
 */
public class RegularPrice extends Price{

	@Override
	int getPriceCode() {
		
		return Movie.REGULAR;
	}
	
	@Override
	public double getCharge(int daysRenced) {
		
		return daysRenced * 1;
	}

}
