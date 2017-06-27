package com.hjp.rentalMovie;
/**
 * 
 * @author huangjp
 * @Descripition : 某个顾客租赁了一部影片
 * 2017年6月19日 上午9:27:48
 */
public class Rental {

	private Movie movie;
	
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
	
	/**
	 * 算费
	 * @param : 
	 * @return:
	 */
	public double getCharge(){
		
		return movie.getCharge(getDaysRented());
	}
	
	/**
	 * 算积分
	 * @param : 
	 * @return:
	 */
	public int getFrequentRenterPoints(){
		
		return movie.getFrequentRenterPoints(getDaysRented());
	}
	
}
