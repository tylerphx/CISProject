import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileValidation {

    public FileValidation() { }

    public ArrayList<Student> readFileInsecure(String file) throws FileNotFoundException {
        ArrayList<Student> roster = new ArrayList<Student>();
        Scanner fileScan = new Scanner(new File(file));
        while (fileScan.hasNextLine()) {
            roster.add(new Student(fileScan.nextInt(), fileScan.nextDouble()));
        }
        fileScan.close();
        return roster;
        }

    public ArrayList<Student> readFileSecured(String file) {
        ArrayList<Student> roster = new ArrayList<>();
        Scanner fileScan = GetFileScan(file);

        //If the file exists
        if(fileScan != null) {

            //while the file is not empty and has lines to parse it scans each line and saves it as a value.
            while (fileScan.hasNextLine()) {
                String currentLine = fileScan.nextLine();

                //splits each line of a file by its commas so we can parse the different values
                String[] currentLineInfo = currentLine.split(", ");

                //If file line contains 2 or more values it parses and adds them as a student(with ID/GPA) to the list
                if(currentLineInfo.length >= 2) {
                    try {
                        //These parse functions check to see if it is an integer/double and throws an exception if not
                        int studentID = Integer.parseInt(currentLineInfo[0]);
                        double studentGPA = Double.parseDouble(currentLineInfo[1]);

                        //Creates a student with ID/GPA and adds it to the list
                        roster.add(new Student(studentID, studentGPA));
                        continue; }

                    //If the Integer.parseInt or Double.parseDouble are unable to find an integer/double it catches
                    //the exception
                    catch (NumberFormatException e) { }
                }
                System.out.println("Invalid Data detected. Line has been skipped");
            }
            fileScan.close();
        }
        return roster;
    }
    //Gets file by name("StudentData.txt" in this case) and creates a scanner and passes the file into the scanner
    private Scanner GetFileScan(String fileName) {
        try
        {
            return new Scanner(new File(fileName));
        }
        //If no file is found catches the exception
        catch (Exception e)
        {
            System.out.println("Error: No file was found.");
            return null;
        }
    }
}
