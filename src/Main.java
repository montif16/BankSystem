import utils.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

        static UI ui = new UI();
    public static void main(String[] args) {
        Bank bank = new Bank("Lollandsbanken");
        String path = "data/customers.csv";
        File file = new File(path);
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
        bank.writeCustomers();


    }
}