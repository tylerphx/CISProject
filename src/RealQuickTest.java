import java.util.Scanner;

public class RealQuickTest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int studentScores = input.nextInt();
        char studentGrade;
        if (studentScores > 90)
            studentGrade = 'A';
        else
            studentGrade = 'F';
    }
}
