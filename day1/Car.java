package week1.day1;

public class Car {
	
	public void noOfWheel() {
		 System.out.println("noOfWheel : 4");
	}
	
	public void color() {
		System.out.println("Black");
	}
	
	public int modelNo() {
		return 123;
	
	}

	public String brandName() {
		return "AUDI";
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		
		String brandName = c.brandName();
		System.out.println(brandName);
		int modelNo = c.modelNo();
		System.out.println(modelNo);
		c.color();
		c.noOfWheel();

	}

}
