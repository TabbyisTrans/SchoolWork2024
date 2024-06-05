import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class PWManager {
    public static void main(String[] args) throws Exception {
        String ANSI_TEAL = "\u001B[36m";
        String ANSI_RESET = "\u001B[0m";
        ArrayList<Login> logins = new ArrayList<Login>();
        try {
            Scanner input = new Scanner(new File("src/logins.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                System.out.println(temp[0] + ", " + temp[1] + ", " + temp[2]);
                logins.add(new Login(temp[0], temp[1], temp[2]));
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing logins.csv");
        }

        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.println("Enter an option:");
            System.out.println("1. Add a login, 2. Get a login, 3. Exit");
            String option = scan.nextLine();
            if (option.equals("1")) {
                System.out.println("Enter site name:");
                String siteName = scan.nextLine();
                System.out.println("Enter username:");
                String username = scan.nextLine();
                System.out.println(ANSI_TEAL +  "Enter password (type random for a random 20 digit password):" + ANSI_RESET);
                String password = scan.nextLine();
                if(password.equals("random")) {
                    password = Login.generatePassword();
                }
                logins.add(new Login(siteName, username, password));
                String save = siteName + "," + username + "," + password;
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/logins.csv", true));
                writer.write(save + "\n");
                writer.close();
                exit = true;
            } else if (option.equals("2")) {
                System.out.println("Enter site name:");
                String siteName = scan.nextLine();
                for (int i = 0; i < logins.size(); i++) {
                    if (logins.get(i).getSiteName().equals(siteName)) {
                        System.out.println("Login for " + logins.get(i).getSiteName());
                        System.out.println("Username: " + logins.get(i).getUsername());
                        System.out.println("Password: " + logins.get(i).getPassword());
                        exit = true;
                    }
                }
            } else if (option.equals("3")) {
                exit = true;
            } else {
                System.out.println("Invalid option");
            }
        }
        scan.close();
    }
}