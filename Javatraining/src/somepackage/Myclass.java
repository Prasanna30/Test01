package somepackage;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i = 1, n = 20, t1 = 0, t2 = 1;
	        //System.out.print("First " + n + " terms: ");
	        while (i <= n)
	        {
	            
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	            i++;
	            
	            System.out.print(t1 + "  ");
	           // System.out.println(isFibonocci(i)   i+ " is a Fibonocci": );
	        }

	}

}
