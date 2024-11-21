// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // input
            String word = args[0];
            int num = Integer.parseInt(args[1]);

           String vowelsAndSpecial = "AEFHILMNORSXaefhilmnorsx";

           for (int i = 0; i < word.length() ; i++) { 
                char ch = word.charAt(i);
                String article = (vowelsAndSpecial.indexOf(ch) >= 0) ? "an" : "a ";
                System.out.println("Give me " + article + " " + ch + ": " + ch + "!"); 

        }
         System.out.println ("What does that spell?");
         for (int i = 0; i < num; i++ ) {
          System.out.println( word + "!!!");

         }
         
}
}
