package DiscountSystemOOP;

public class DiscountRate {
	static double serviceDiscountPremium=0.2; 
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	
	static double productDiscountPremium=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	
	static double getServiceDiscountRate(String type) {
		if(type.equals("premium")) {
			return serviceDiscountPremium;
		}else if(type.equals("gold")) {
			return serviceDiscountGold;
		}else {
			return serviceDiscountSilver;
		}
	}
	
	static double getProductDiscountRate(String type) {
		if(type.equals("premium")) {
			return productDiscountPremium;
		}else if(type.equals("gold")) {
			return productDiscountGold;
		}else {
			return productDiscountSilver;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
