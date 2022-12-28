import java.util.Scanner;

public class Functionality implements Services {
    double balance;
    double previousTransaction;
    int choice ;

    Scanner in = new Scanner(System.in);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount ) {
            balance -= amount;
            previousTransaction = -amount;
        }
        else if (balance < amount) {
            System.out.println("Sorry...!! " +
                    " \nYou Don't Have Sufficient Balance." +
                    "\nThank You.");
        }

    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited Amount : " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdraw Amount : " + Math.abs(previousTransaction));
        } else {
            System.out.println("Ops...!! It seems to you have no transaction history.");
        }
    }


    public void Menu() {
        do {


            System.out.println("*-*-*-*-*-*-*-*-*-*-*   Bank Manager    *-*-*-*-*-*-*-*-*-*");
            System.out.println("  __________________________________________________________");
            System.out.println(".'                                                          '.");
            System.out.println("|                         Menu                                |");
            System.out.println("|  1.  Check Balance              2.  Deposit Amount          |");
            System.out.println("|                                                             |");
            System.out.println("|  3.  Withdraw Amount            4.  Previous Transaction    |");
            System.out.println("|                                                             |");
            System.out.println("|                      5.  Exit                               |");
            System.out.println("'.___________________________________________________________.'");

            System.out.println("               _________________________");
            System.out.println("              |                         '.");
            System.out.println("              |   Choose an option:       >");
            System.out.println("              |_________________________.'");
            System.out.print("                           ");
            choice = in.nextInt();
            System.out.println("");

            switch (choice) {
                case 1 -> {
                    System.out.println("              _____________________________");
                    System.out.println("            .'                             '.");
                    System.out.println("           <           Check Balance         >");
                    System.out.println("            '._____________________________.'");
                    System.out.println("                               ");


                    System.out.println("--------------------------");
                    System.out.println("Balance : " + balance+"TK ");
                    System.out.println("--------------------------");
                    System.out.println("         .******************************************.");
                    System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                    System.out.println("         '******************************************'");
                    System.out.print("                              ");
                    int Choise2 = in.nextInt();
                    if(Choise2==2){
                        System.out.println("Thank You for using our services.");
                        System.out.println("Have a good day.");
                        choice=5;
                    }






                }
                case 2 -> {
                    System.out.println("........................");
                    System.out.println("Enter Amount to Deposit: ");
                    System.out.println("........................");
                    double taka = in.nextDouble();
                    if(taka<=0){
                        System.out.println("Sorry,\nYour Deposit process is Failed.");

                        System.out.println("         .******************************************.");
                        System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                        System.out.println("         '******************************************'");
                        System.out.print("                              ");
                        int Choise2 = in.nextInt();
                        if(Choise2==2){
                            System.out.println("Thank You for using our services.");
                            System.out.println("Have a good day.");
                            choice=5;
                        }
                        break;

                    }
                    deposit(taka);
                    System.out.println("\n");
                    System.out.println("");
                    System.out.println("You have Deposited Successfully.");
                    System.out.println("Your Deposited Money: " + taka+"TK ");
                    System.out.println("Thank You.");
                    System.out.println("--------------------------");
                    System.out.println("Balance : " + balance+"TK ");
                    System.out.println("--------------------------");

                    System.out.println("         .******************************************.");
                    System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                    System.out.println("         '******************************************'");
                    System.out.print("                              ");
                    int Choise2 = in.nextInt();
                    if(Choise2==2){
                        System.out.println("Thank You for using our services.");
                        System.out.println("Have a good day.");
                        choice=5;
                    }
                }
                case 3 -> {
                    System.out.println("--------------------------");
                    System.out.println("Balance : " + balance+"TK ");
                    System.out.println("--------------------------");

                    System.out.println("......................");
                    System.out.println("Enter the amount to Withdraw: ");
                    double WAmount = in.nextDouble();
                   if(WAmount <= 0){

                       System.out.println("Sorry,\nYour request is Failed");
                       System.out.println("         .******************************************.");
                       System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                       System.out.println("         '******************************************'");
                       System.out.print("                              ");
                       int Choise2 = in.nextInt();
                       if(Choise2==2){
                           System.out.println("Thank You for using our services.");
                           System.out.println("Have a good day.");
                           choice=5;
                       }
                       break;

                   }
                    withdraw(WAmount);

                    System.out.println("Successful.");
                    System.out.println("Withdrawn Money: " + WAmount);
                    System.out.println("Thank You..!!!");
                    System.out.println("--------------------------");
                    System.out.println("Balance : " + balance+"TK ");
                    System.out.println("--------------------------");

                    System.out.println("         .******************************************.");
                    System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                    System.out.println("         '******************************************'");
                    System.out.print("                              ");
                    int Choise2 = in.nextInt();
                    if(Choise2==2){
                        System.out.println("Thank You for using our services.");
                        System.out.println("Have a good day.");
                        choice=5;
                    }
                }

                case 4 -> {
                    System.out.println("......................");
                    System.out.println("Previous Transaction: ");
                    getPreviousTransaction();

                    System.out.println("         .******************************************.");
                    System.out.println("        <       Press 1 for Menu or 2 for Exit       >");
                    System.out.println("         '******************************************'");
                    System.out.print("                              ");
                    int Choise2 = in.nextInt();
                    if(Choise2==2){
                        System.out.println("Thank You for using our services.");
                        System.out.println("Have a good day.");
                        choice=5;
                    }

                }
                case 5 -> {
                    System.out.println("Thank You for using our services.");
                    System.out.println("Have a good day.");
                }
                default -> {
                    System.out.println("You have Entered a wrong key.");
                    System.out.println("Choose a correct option.");
                }


            }


            System.out.println("\n");


        }
        while (choice != 5);
    }
}
