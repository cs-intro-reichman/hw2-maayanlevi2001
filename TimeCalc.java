public class TimeCalc {
    public static void main(String[] args) {
        // Ensure there are exactly two arguments
        if (args.length < 2) {
            System.out.println("Please provide the time and minutes to add.");
            return;
        }

        // input
        String time = args[0]; // First command-line argument (time)
        int minutesToAdd = Integer.parseInt(args[1]); // Second command-line argument (minutes to add)

        // Split the time string into hours and minutes
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));

		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        // Total minutes calculation
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;

        // Calculate the new hours and minutes
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // print
        System.out.println(newHours + ":" + newMinutes);

    }
}
