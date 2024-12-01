public class App {
    public static void main(String[] args) throws Exception {
    //Create constant for converting miles and kilometers
    final double kilometers_per_mile = 1.609;

    //Display table headers
    System.out.print(
        "Miles         Kilometers \n");

    //Create conversion table
     for (int i = 1; i <= 10; i++) {
        System.out.printf(
            "%-13d%-10.3f\n", i, (i * kilometers_per_mile));
    }
    }
}
