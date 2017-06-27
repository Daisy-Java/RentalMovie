package com.hjp.rentalMovie;

/**
 * 新片
 * @author huangjp
 * 2017年6月23日 下午2:19:48
 */
public class NewReleasePrice extends Price{

	@Override
	int getPriceCode() {
		
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int daysRenced) {
		
		return daysRenced * 3;
	}
	
	/**
	 * 算积分
	 * @param : 
	 * @return:
	 */
	public int getFrequentRenterPoints(int daysRenced){
		
		//如果租的是新片并且租期大于1天，则积分+1(学会使用三目运算法)
		return daysRenced > 1 ? 2 : 1;
	}

}
