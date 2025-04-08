// Dependency
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // scanner source
        Scanner sc = new Scanner(System.in);

        // Patient Info
        // Name
        System.out.println("Patient's name: ");
        String name = sc.nextLine();

        // Age
        System.out.println("Patient's age: ");
        int age = sc.nextInt();

        // Buffer
        sc.nextLine();

        // Record
        System.out.println("Patient's record number: ");
        String record = sc.nextLine();


        // Variable
        Patient patient = new Patient();
        patient.name = name;
        patient.age = age;
        patient.record = record;

        patient.showInformation();


        sc.close();

    }
}
