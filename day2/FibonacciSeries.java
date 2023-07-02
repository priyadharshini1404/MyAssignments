package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8, firstnum = 0, secnum = 1, sum;
	       System.out.println(firstnum);
	       System.out.println(secnum);
	       
	       for (int i = 1; i <=8; i++) {
	    	   
	    	   sum= firstnum + secnum;
	    	   
	    	   firstnum = secnum;
	    	   
	    	   secnum = sum;
	    	  System.out.println(sum);
			
		}

	}

}
