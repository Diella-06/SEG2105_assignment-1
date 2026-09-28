/**
 * 
 * Vehicle
 * Abstract base class for all vehicles
 * Implements Movable and enforces type reporting through getVehicleType()
 */
public abstract class Vehicle implements Movable {
    /** Tracks total number of vehicles created */
    public static int numberOfVehicles = 0;

    /** Name of the vehicle */
    private String name;

    /**
     * Default constructor
     */
    public Vehicle(){
        numberOfVehicles++;
        System.out.println("Vehicle Constructor called");
        this.name = "Unnamed Vehicle";
    }

    /** @param name Name of the vehicle */
    public Vehicle(String name){
        numberOfVehicles++;
        System.out.println("Vehicle Constructor with name called");
        this.name = name;
    }

    public abstract String getVehicleType();

    public String getName(){
        return this.name;
    }

    public void describe(){
        System.out.println(name + "is a" + getVehicleType());
    }

    public static int getNumberOfVehicles(){
        return numberOfVehicles;
    }
}