

package task_1;

/* @author sujoy */

public class Smartphone {
    String display , processor;
    int battery;

    Smartphone()
    {
        System.out.println("Welcome to My-Phone\nModel: V-ONE.\n");
        display = "6.3 inch";
        processor = "Qualcomm Snapdragon";
        battery = 5000;
    }

    Smartphone(String display, String processor, int battery)
    {
        this.display = display;
        this.processor = processor;
        this.battery = battery;
    }
}
