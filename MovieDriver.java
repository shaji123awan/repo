import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")){

            System.out.println("Enter the name of a movie");
            String movieName = scanner.nextLine();

            System.out.println("Enter the rating of the movie");
            String rating = scanner.nextLine();

            System.out.println("Enter the number of tickets sold for this movie");
            int ticketsSold = scanner.nextInt(); scanner.nextLine();

            // Create an object
            Movie aMovie = new Movie(movieName,rating,ticketsSold);
            System.out.println(aMovie);

            System.out.println("Do you want to enter another? (y or n)");
            repeat = scanner.nextLine();
        }
        System.out.println("Goodbye");
    }
}