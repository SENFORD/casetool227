package Question_10;

public class student {
    private String name;
    private int age;
    private String address;

    public student() {
        this.name = "Senford";
        this.age = 20;
        this.address = "Quepen";
    }
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    } 
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }  
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
