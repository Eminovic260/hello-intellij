public class Demenagement {
    public static void main (String[] args) {
        int totalBox = 34;
        int truckCapacity = 9;
        int remainBox = totalBox;
        int travel = 1;

        while (remainBox > 0) {
            int boxInTravel = Math.min(remainBox, truckCapacity);
            System.out.println("voyage de " +  boxInTravel + " cartons");
            remainBox -= boxInTravel;
            travel++;
        }
    }
}
