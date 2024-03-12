import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<String> listOfActions;
    Customer currentCustomer;


    public Bank(String name) {
        //todo:
        customers = new ArrayList<>();
        listOfActions = new ArrayList<>();

        listOfActions.add("1) Opret kunde");
        listOfActions.add("2) Vis kunder");
        listOfActions.add("3) Se kontoposteringer");
        listOfActions.add("4) Indsæt/hæv penge");
        listOfActions.add("5) Opret ny konto");
        listOfActions.add("6) Vælg eksisterende kunde");
        listOfActions.add("7) Afslut");

         // 1) instantiate the two ArrayLists
        // 2) add the following actions to the list of actions
        // - Opret kunde
        // - Se Kontooversigt
        // - Se Kontoposteringer
        // - Indsæt/hæv penge
        // - Opret ny konto
        // - Vælg eksisterende kunde
        // - Afslut



    }
    public void createCustomer(String name, int balance){
        Customer c = new Customer(name,balance);
        currentCustomer = c;
        this.customers.add(c);

        //todo:
        // 1) create an instance of the Customer class and assign it to the currentCustomer attribute of this class
        // 2) add it to the list of customers

    }
    public void userDialog(){

        Main.ui.displayMsg("Velkommen til "+this.name);

        //  2) initialize an int variable 'action' with the value of 0 (will hold the user's choice of action)
        int action= 0;
        //  3) create a while loop that will run until action is equal to the value of 7 (the quit action).
        while(action != listOfActions.size()){
            action = Main.ui.promptChoice(listOfActions,"Vælg en af følgende");
            switch (action){
                case 1: //Opret kunde
                    String name = Main.ui.promptText("Kundens navn: ");
                    createCustomer(name,0);
                    // todo:
                    //  6) case 1 :
                    //  a. prompt the user for a customer name
                    //  b create an instance of the Customer class with the name retrieved from the user
                    break;
                case 2: // Se kontooversigt
                    // todo:
                    //  7) case 2 :
                    //  a. display the state of the current customer (defined in the Customer toString method)
                    //System.out.println(currentCustomer);
                    for(Customer c: customers){
                        System.out.println(c);
                    }
                    break;
                case 3: // Se kontoposteringer
                    // todo:
                    //  8) case 3 :
                    //  a. ask the user to choose one of the accounts associated with the current customer
                    //  b. use the user input as an argument in a call to the current customer's getAccountDetails account

                    break;

                case 4: // Indsæt/hæv penge
                    // todo:
                    //  9) case 4 :
                    //  a. ask the user to choose one of the accounts associated with the current customer
                    //  b. ask the user to type the amount
                    //  c. call the deposit method on the current customer instance with the amount as an argument
                    int amount = Main.ui.promptNumeric("Skriv beløb");
                    currentCustomer.deposit(amount);
                    break;
                case 5: // opret kunde
                    // todo:
                    //  10) case 5 :
                    //  a. ask the user to type the name of the new account
                    //  b. call the createAccount method on the current customer instance with the name as an argument

                    break;
                case 6: // Vælg eksisterende
                    // todo:
                    //  11) case 6 :
                    //   a. ask the user to type the id (index number) of the customer
                    //  b. retrieve the customer object from the list of customers and assign it to the currentCustomer attribute of this class
                    int input = Main.ui.promptNumeric("Type your index");
                    currentCustomer = customers.get(input-1);
                    break;




            }
        }
        //  4) inside the while loop, ask the user to choose an action using the promptChoice method of the ui object in Main
        //  5) create a switch-case statement that looks at the action variable and has a case for each of the 6 first actions in the list of actions







    }
    public void writeCustomers() {


        try {
            boolean fileExists = new File("data/customers.csv").exists();
            FileWriter writer = new FileWriter("data/customers.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            if(!fileExists){
                bufferedWriter.write("name,Balance\n");
            }
            for (Customer customer : customers) {

                bufferedWriter.write(customer.getName()+","+ customer.getCurrentAccount().getBalance() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
