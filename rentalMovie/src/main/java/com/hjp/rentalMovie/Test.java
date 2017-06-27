package com.hjp.rentalMovie;
/**
 * 可靠的测试环境
 * @author huangjp
 * @Descripition :
 * 2017年6月19日 上午10:57:16
 */
public class Test {

	public static void main(String[] args) {
		
		Customer custA = new Customer("A");
		Customer custB = new Customer("B");
		Customer custC = new Customer("C");
		
		Movie movieA = new Movie();
		movieA.setTitle("异形");
		movieA.setPriceCode(1);
		
		Movie movieB = new Movie();
		movieB.setTitle("多拉爱梦");
		movieB.setPriceCode(2);
		
		Movie movieC = new Movie();
		movieC.setTitle("楚乔传");
		movieC.setPriceCode(0);
		
		Rental rentalA = new Rental(movieA, 2);
		Rental rentalB = new Rental(movieB, 2);
		Rental rentalC = new Rental(movieC, 2);
		
		custA.addRental(rentalA);
		custB.addRental(rentalB);
		custC.addRental(rentalC);
		
		String resultA = custA.statement();
		System.out.println(resultA);
		
		String resultB = custB.statement();
		System.out.println(resultB);
		
		String resultC = custC.statement();
		System.out.println(resultC);
		
		/**output:
			顾客A的租赁记录
			异形：6.0
			花费：6.0
			你获取了：2个积分
			
			顾客B的租赁记录
			多拉爱梦：1.5
			花费：1.5
			你获取了：1个积分
			
			顾客C的租赁记录
			楚乔传：2.0
			花费：2.0
			你获取了：1个积分
		 */
		
		
		String resultAOnHtml = custA.htmlStatement();
		System.out.println(resultAOnHtml);
		
		String resultBOnHtml = custB.htmlStatement();
		System.out.println(resultBOnHtml);
		
		String resultCOnHtml = custC.htmlStatement();
		System.out.println(resultCOnHtml);
		
	}
}
