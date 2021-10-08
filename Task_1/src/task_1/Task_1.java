


package task_1;

/* @author sujoy */

public class Task_1 {

    public static void main(String[] args) {

        
        Smartphone  phone1 = new Smartphone();
        Smartphone  phone2 = new Smartphone("5.5 inch", "Exynos 9611",4500);
        Smartphone  phone3 = new Smartphone("6.5 inch", "Mediatek helio G95", 6000);

        System.out.println("This Phone has " + phone1.display + " IPS Display.");
        System.out.println("This Phone has " + phone1.processor + " Processor.");
        System.out.println("This Phone has " + phone1.battery + " Battery.\n----------------------------\n");


        System.out.println("Welcome to Samsung" + "\nModel: Galaxy M31.\n");
        System.out.println("This Phone has " + phone2.display + " AMOLED Display.");
        System.out.println("This Phone has " + phone2.processor + " Processor.");
        System.out.println("This Phone has " + phone2.battery + " Battery.\n----------------------------\n");


        System.out.println("Welcome to Xiaomi \nModel: Redmi note 10.\n");
        System.out.println("This Phone has " + phone3.display + " IPS Display.");
        System.out.println("This Phone has " + phone3.processor + " Processor.");
        System.out.println("This Phone has " + phone3.battery + " Battery.\n----------------------------\n");

    }
}
