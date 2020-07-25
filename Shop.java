package DiscountSystemOOP;

import java.sql.Date;

public class Shop {
	Customer c;
	DiscountRate d;
	Date date;
	double serviceExpense;
	double productExpense;
	
	Shop(Customer c, double se, double pe, Date d){
		this.c=c;
		this.serviceExpense=se;
		this.productExpense=pe;
		this.date=d;
	}
	public double getTotalExpense() {
		double totalExpense;
		if(c.isMember()) {
			totalExpense =(serviceExpense + productExpense) -((serviceExpense * d.getServiceDiscountRate(c.memberType)) + (productExpense * d.getProductDiscountRate(c.memberType)));
		}else {
			totalExpense = serviceExpense + productExpense;
		}
		return totalExpense;
	}
	
	public String toString() {
		return "Customer Name : "+c.name+"\nCustomer MemberType : "+c.memberType+
				"\nServiceExpense : "+serviceExpense+"\nproductExpense : "+productExpense+
				"\nTotal Expense : "+getTotalExpense();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Aung Aung","silver");
		Shop s1=new Shop(c1, 10000.0, 15000.0, new Date(2020-07-24));
		System.out.println(s1.toString());
		
		System.out.println("\n");
		
		Customer c2=new Customer("Mya Mya","premium");
		Shop s2=new Shop(c2, 10000.0, 15000.0, new Date(2020-07-30));
		System.out.println(s2.toString());
		
		System.out.println("\n");
		
		Customer c3=new Customer("Sandar","normal");
		Shop s3=new Shop(c3, 10000.0, 15000.0, new Date(2020-07-30));
		System.out.println(s3.toString());
	}

}
