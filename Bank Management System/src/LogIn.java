import java.util.Scanner;

public class LogIn {
    Scanner in = new Scanner(System.in);
    private String name; // Info Hiding
    private String Id;

    public void Set() {
        System.out.print("NAME : ");
        name = in.nextLine();
        System.out.print("ID   : ");
        Id = in.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }


}
