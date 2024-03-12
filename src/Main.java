import utils.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

        static UI ui = new UI();
    public static void main(String[] args) {
        Bank bank = new Bank("Lollandsbanken");
        File file = new File("data/customers.csv");
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while(scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] line = s.split(",");
                String name = line[0];
                int balance = Integer.parseInt(line[1].trim());
                bank.createCustomer(name,balance);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        bank.userDialog();

    }
}