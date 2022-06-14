import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        String agency;
        int fico;
        String again;

        Scanner userInput = new Scanner(System.in);

        // Loop to allow user to test multiple inputs/values
        do {

            System.out.println("Select agency | Experian (E) | TransUnion (T) | Vantage (V)");

                // Agency variable assigned value from user input
                agency = userInput.nextLine();

                while (true) {
                    //Simple Input validation
                    if (agency.equalsIgnoreCase("E") || agency.equalsIgnoreCase("T") || agency.equalsIgnoreCase("V")) {

                        break;

                    } else {

                        System.out.println("Invalid Entry");
                        System.out.println("Select agency | Experian (E) | TransUnion (T) | Vantage (V)");
                        agency = userInput.nextLine();
                    }
                }

                //Getting user input for FICO score
                System.out.println("Enter FICO credit score");

                // fico variable assigned from user input
                fico = userInput.nextInt();

                while (true) {

                    //Simple input validation
                    if (fico >= 300 && fico <= 850) {

                        break;

                    } else {

                        System.out.println("Invalid Entry");
                        System.out.println("Please enter a value between 300 and 850");
                        fico = userInput.nextInt();

                    }
                }

                //Using the factory to generate concrete product of type specified by agency variable
                Agency agencyProduct = AgencyFactory.getAgency(agency, fico);
                System.out.println(agencyProduct);

            System.out.println("Continue? Y/N?");

            userInput.nextLine();

            again = userInput.nextLine();

        } while (again.equalsIgnoreCase("Y"));

    }
}
