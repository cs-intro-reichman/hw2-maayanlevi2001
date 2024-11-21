// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // inputs
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean needToPrintTable = mode.equals("v");
        boolean allSequencesReachedOne = true;
		for(int i = 1 ; i <= n; i++){
         int seed = i;
		 if(needToPrintTable){
          System.out.print(seed + " ");
		 }
		 
		 int columnNum = 1;
		 if(seed==1){
			seed = (seed*3)+1;
			if(needToPrintTable){
				System.out.print(seed + " ");
			}
			
			columnNum++;
		 }
		 
		  while(seed!=1){
            if(seed%2==0){
				seed = seed/2;
			}else{
				seed = (seed*3)+1;
			}
			columnNum++;
			if(needToPrintTable){
				System.out.print(seed + " ");
			}
			
		  }
         if(needToPrintTable){
			System.out.println( "(" + columnNum + ")");
		 }
		  
		  if(seed !=1){
			allSequencesReachedOne = false;
		  }
		}
		if(allSequencesReachedOne== true){
	
			System.out.println("Every one of the first " + n +" hailstone sequences reached 1.");
		}
		}
		
}