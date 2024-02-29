package Modul1;
import java.util.Scanner;

public class Kegiatan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose Your Option(1-3): ");
            int user = input.nextInt();

            switch (user) {
                case 1:
                    System.out.print("Enter Your NIM : ");
                    String nim = input.next();

                    if (nim.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String username = input.next();
                    System.out.print("Enter your password (admin): ");
                    String password = input.next();

                    if (username.equals("admin") && password.equals("4dm1n")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found !!");
                    }
                    break;
                case 3:
                    System.out.print("Sayonara");
                    return;
                default:
                    System.out.println("Pilihan Salah");
            }
        }
    }
}