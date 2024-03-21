package Question_10;

public class student_main {
    public static void main(String[] args) {
        
        student student1 = new student();
        student student2 = new student();
        student student3 = new student();
        student1.setInfo("Senford", 20);
        student2.setInfo("Sania", 22, " Quepem-Goa");
        student3.setInfo("Mary", 12, "Deao - Quepem");
        System.out.println("Student 1:");
        student1.printInfo();
        System.out.println();

        System.out.println("Student 2:");
        student2.printInfo();
        System.out.println();

        System.out.println("Student 3:");
        student3.printInfo();
    }
}