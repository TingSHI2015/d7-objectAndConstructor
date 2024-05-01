package secondTry;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed;

    public Car(String brand, String model, String color, int yearOfManufacture){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(String brand, String model, String color, int yearOfManufacture, int speed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public void startCar(){
    //    System.out.println("Hallo, this car is ready for driving now!");
        System.out.println("Hallo! This " + brand + " " + model + " has started!" );
    }

    public void accelerateCar(int newSpeed){
        if (newSpeed > speed){
            speed = newSpeed;
        }
        System.out.println("the new speed of the car:" + speed);
    }

    //GPT:----- Method to accelerate the car--------
/*    public void accelerate(int increase) {
        speed += increase;
        System.out.println("The car has accelerated to " + speed + " km/h.");
    }*/



}
