public class TestRandom {
  public static void main(String[] args) {
	// input
        int N = Integer.parseInt(args[0]);

        // values names
        int greaterThanHalf = 0;
        int lessThanOrEqualToHalf = 0;

        
        for (int i = 0; i < N; i++) {
            double rand = Math.random(); 
            if (rand > 0.5) {
                greaterThanHalf++;
            } else {
                lessThanOrEqualToHalf++;
            }
        }

        // edge case: 
        if (greaterThanHalf == 0 || lessThanOrEqualToHalf == 0) {
            System.out.println("> 0.5: " + greaterThanHalf + " times");
            System.out.println("<= 0.5: " + lessThanOrEqualToHalf + " times");

        } else {
            // Calculate and print 
            double ratio = (double) greaterThanHalf / lessThanOrEqualToHalf;
            System.out.println("> 0.5:  " + greaterThanHalf + " times");
            System.out.println("<= 0.5: " + lessThanOrEqualToHalf + " times");
            System.out.println("Ratio:  " + ratio);
        }
    }
}
