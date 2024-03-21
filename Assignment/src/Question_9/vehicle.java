package Question_9;

class vehicle {
    private int horsepower;
    public vehicle(int horsepower) {
        this.horsepower = horsepower;
    }
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}
class Car extends vehicle {
    private String make;
    private int horsepower;
    public Car(int horsepower, String make) {
        super(horsepower); 
        this.make = make;
        this.horsepower = 80; 
    }
    @Override
    public void drive() {
        super.drive(); 
        System.out.println("Car is being driven.");
    }
}
