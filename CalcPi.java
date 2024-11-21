// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // set variable
		int num = Integer.parseInt(args[0]);
		double odd = 1.0;
		double piApproximated = 0.0;

		for(int i = 0 ; i<num;i++){
     double n = 1.0/odd;
	 if(i%2==0){
piApproximated = piApproximated + n;
	 }else{
piApproximated = piApproximated - n;
	 }
	
	  odd+=2;
		}

		 System.out.println("pi according to Java: 3.141592653589793");
         System.out.println("pi, approximated:     " + piApproximated*4);
	}
	
}

