import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileValidationMain {
    public static void main(String[] args) {
        FileValidation fileValidator = new FileValidation();
        ArrayList<Student> studentList = fileValidator.readFileSecured("StudentData.txt");
        //for each student in studentList it prints their ID/GPA
        for (Student student: studentList)
        {
            System.out.println("ID: " + student.GetID() + ", GPA: " + student.GetGPA());
        }
    }

}
