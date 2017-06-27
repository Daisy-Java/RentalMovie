package com.hjp.rentalMovie;
/**
 * 
 * @author huangjp
 * @Descripition: 影片的纯数据类
 * 操作者告诉程序：顾客租了哪些影片、租期多长，程序根据租赁时间和影片类型算出费用。影片分为三类：普通片、儿童片和新片。除了计算费用，还要为常客计算积分，积分会根据租片种类是否为新片而有不同。
 * 2017年6月19日 上午9:22:36
 */
public class Movie {

	/** 儿童片*/
	public static final int CHILDERNS = 2;
	
	/** 普通片*/
	public static final int REGULAR = 0;
	
	/** 新片*/
	public static final int NEW_RELEASE = 1;	
	
	/** 标题*/
	private String title;
	
	/** 单价*/
	//private int priceCode;
	//运用多态取代类型
	private Price price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case CHILDERNS:
			price = new ChildrenPrice();
			break;
		default:
			throw new IllegalArgumentException("不正确的价格！");
		}
	}
	
	/**
	 * 算费(根据面向对象的原则，把算费放到Movie类)
	 * @param : 
	 * @return:
	 */
	public double getCharge(int daysRenced){	
		return price.getCharge(daysRenced);
	}
	
	/**
	 * 算积分(根据面向对象的原则，把算积分放到Movie类)
	 * @param : 
	 * @return:
	 */
	public int getFrequentRenterPoints(int daysRenced){
		
		return price.getFrequentRenterPoints(daysRenced);
	}
	
}
