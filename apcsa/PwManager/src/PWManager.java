import java.io.File;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.ArrayList;

public class PWManager {
    public static void main(String[] args) throws Exception {
        String ANSI_TEAL = "\u001B[36m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        ArrayList<Login> logins = new ArrayList<Login>();
        try {
            Scanner input = new Scanner(new File("src/logins.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                logins.add(new Login(temp[0], temp[1], temp[2]));
            }
            input.close();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Error reading or parsing logins.csv" + ANSI_RESET);
        }

        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.println(ANSI_TEAL + "Enter an option:" + ANSI_RESET);
            System.out.println(ANSI_TEAL + "1." + ANSI_RESET + " Add a login," + ANSI_TEAL + " 2. " + ANSI_RESET + "Get a login, " + ANSI_TEAL + "3." + ANSI_RESET + " Exit");
            String option = scan.nextLine();
            if (option.equals("1")) {
                System.out.println(ANSI_TEAL + "Enter site name:" + ANSI_RESET);
                String siteName = scan.nextLine();
                System.out.println(ANSI_TEAL + "Enter username:" + ANSI_RESET);
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
                System.out.println(ANSI_TEAL + "Enter site name:" + ANSI_RESET);
                String siteName = scan.nextLine();
                for (int i = 0; i < logins.size(); i++) {
                    if (logins.get(i).getSiteName().equals(siteName)) {
                        System.out.println();
                        System.out.println(ANSI_TEAL + "Login for " + ANSI_RESET + logins.get(i).getSiteName());
                        System.out.println(ANSI_TEAL + "Username: " + ANSI_RESET + logins.get(i).getUsername());
                        System.out.println(ANSI_TEAL + "Password: " + ANSI_RESET + logins.get(i).getPassword());
                    }
                    exit = true;
                }
            } else if (option.equals("3")) {
                exit = true;
            } else {
                System.out.println(ANSI_RED + "Invalid option" + ANSI_RESET);
                System.out.println();
            }
        }
        scan.close();
    }
}