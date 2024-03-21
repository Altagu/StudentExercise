import java.sql.SQLOutput;

public class Student {
    String firstName;
    String lastName;
    int age;
    double height;
    boolean gender;

    Student (String firstName, String lastName, int age, double height, boolean gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.gender = gender;

}
    //https://github.com/SabuCay/ExStudentObject.git

    public String toString(){
        String sGender;
            if(gender == true){
                sGender = "male";
            }else{
                sGender = "dishwasher";
            }

            return "The name of the student is " + this.firstName + " " + this.lastName + "\nThe age of the student is " + this.age + "\nThe height of the student is " + this.height + "\nGender " + sGender;
    }
}