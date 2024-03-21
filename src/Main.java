import java.util.*;

public class Main {
        public static Scanner console = new Scanner(System.in);

    public static void main(String[] args){
        makeStudent();

        Student student1 = new Student("Albert", "Bohr", 45, 1.4, true);
        Student student2 = new Student("Olaf", "Jorgen", 180, 2.1, false);
        Student student3 = new Student("Hans", "Petersen", 14, 1.72, true);
        
        Student[] students = {student1, student2, student3};

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void makeStudent(){

    }
}
