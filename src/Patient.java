// Class
import java.util.Scanner;

public class Patient {
    //Attributes
    String name;
    int age;
    String record;

    // Method to print information
    public void showInformation(){
        // Information to print
        System.out.println("\n--- Patient's information ---" +
                "\n Patient's name: " + name + "\n Patient's age: " + age +
                "\n Patient's records: " + record);
    }

}