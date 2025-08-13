import java.util.Scanner;
/**
 * Main class for the moving simulation program
 * It asks the user for the total number of boxes and the truck's capacity
 * then calculates and displays the number of trips required to complete the move
 */
public class Demenagement {

    /**
     * The main entry point of the program.
     * It handles user input for the total boxes and truck capacity,
     * then prints the details of each trip required to complete the move
     * @param args command line arguments (not used)
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalBox = 0;
        int truckCapacity =0;
        int inputWait = 1;

        while ( inputWait <= 2) {
            System.out.print(inputWait == 1 ? "Entrez le nombre de boites: " : "Entrez le nombre de capacité: ");

        if (scan.hasNextInt()){
            int input = scan.nextInt();

            if (input > 0) {
                if (inputWait == 1){
                    totalBox = input;
                }else {
                    truckCapacity = input;
                }
                inputWait++;
            }
            }
        }
        int remainingBox = totalBox;
        int travelNumber = 1;

        while (remainingBox > 0){
        int boxThisTravel = Math.min(remainingBox, truckCapacity);
        System.out.println("Voyage " + travelNumber + ": " + boxThisTravel);
        remainingBox -= boxThisTravel;
        travelNumber++;
        }
        scan.close();

    }
    }
