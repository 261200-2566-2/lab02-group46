import java.util.Random;
public class AirPurifier {
    // Instance Variables
    private String brand;
    private String model;
    private String color;
    private String filter_type;
    private String power;
    private int filter_life;
    private int airquality;

    //Class variables
    private static int modelCount;

    // Instance Methods
    void turnOn() {power = "on";
        generateRandomAirquality();
        System.out.println("The Air Purifier is Now Turned On.");}
    void turnOff() {power = "off";
        System.out.println("The Air Purifier is Now Turned Off.");}

    public AirPurifier() {
        power = "off";
        airquality = 0;
        modelCount = generateRandomModelCount();
    }

    void setMode(String mode) {
        switch (mode.toLowerCase()) {
            case "low" -> System.out.println("Current mode: Low-Power Mode");
            case "medium" -> System.out.println("Current mode: Medium-Power Mode");
            case "high" -> System.out.println("Current mode: High-Power Mode");
            case "off" -> System.out.println("Current mode: Off");
            default -> System.out.println("Invalid mode");
        }
    }

    AirPurifier(String brand,String model,String color,String filter_type,int filter_life,String power){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.filter_type = filter_type;
        this.filter_life = filter_life;
        this.power = power;

        if (power.equals("off")) {
            this.airquality = 0;
        } else {
            generateRandomAirquality();
        }
        modelCount = generateRandomModelCount();
    }

    private void generateRandomAirquality() {
        Random rand = new Random();
        this.airquality = rand.nextInt(100);
    }

    private int generateRandomModelCount() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public void display() {
        System.out.println("════════════════════");
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("filter type = " + filter_type);
        System.out.println("filter life = " + filter_life + " %");
        System.out.println("Airquality: " + airquality + " %");
        System.out.println("════════════════════");
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilter_type(String filter_type){
        this.filter_type = filter_type;
    }
    public void setFilter_life(int filter_life){
        this.filter_life = 100;
    }

    // Class Methods
    public static int getModelCount() {
        return modelCount;
    }
    public static String mostPopularModel() {
        return "AX-37495";
    }

}