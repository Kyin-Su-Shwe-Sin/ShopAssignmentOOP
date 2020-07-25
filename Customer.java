package DiscountSystemOOP;

public class Customer {
	public String name;
	public Boolean member=false;
	public String memberType;
	public Customer (String name){
		this.name=name;
	}
	public Customer (String name, String memberType) {
		this.name=name;
		this.memberType=memberType;
	}
	public Boolean isMember() {
		if(memberType.equals("premium")) {
			member = true;
		}else if(memberType.equals("gold")) {
			member = true;
		}else if(memberType.equals("silver")) {
			member = true;
		}else {
			member =false;
		}
		return member;
	}
	
	public String toString() {
		return "Customer Name : "+name+"Customer Member Type : "+memberType;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
