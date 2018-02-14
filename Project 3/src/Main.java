import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);

        double milesPG;
        double tankCapa;
        double tankFill;
        double milesRemain;
        double rawRange;
        System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        milesPG = scanner.nextDouble();
        if (milesPG <= 0 ) {
            System.out.print("\nERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.out.println("");

            System.exit(0);
        }
        System.out.print("\nEnter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCapa = scanner.nextDouble();

        if (tankCapa <= 0) {
            System.out.print("\nERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        System.out.print("\nEnter the percentage of the gas tank that is currently filled (from 0-100%): ");
        tankFill = scanner.nextDouble();
        if (tankFill < 0 || tankFill > 100){
            System.out.print("\nERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }
        rawRange = milesPG * tankCapa * (tankFill * 0.01);
        int rawRange1 = (int)rawRange;
        if (rawRange1 <= 25) {
            System.out.print("\nAttention! Your current estimated range is running low: " + rawRange1 + " miles left!!!");

        }else if (rawRange1 > 25){
                System.out.print("\nKeep driving! Your current estimated range is: " + rawRange1 + " miles!");
                //And we are done!!
            //another comment

            }
    }



}
