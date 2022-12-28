import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);
        LogIn Info = new LogIn();
        Functionality func= new Functionality();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*   Bank Manager    *-*-*-*-*-*-*-*-*-*\n");

        System.out.println("                          LOG IN :");

        Info.Set();
        System.out.println("\nHello "+Info.getName()+"\nWelcome To Bank Services.\n");
        func.Menu();


    }


}


