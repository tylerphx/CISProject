import java.util.Scanner;
public class Injection {
	public static void main(String[] args) {
		String studentGrade = null;
		
		//create a new scanner with the double
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number.");
		//check the input before declaring it to avoid injection attacks
		if (input.hasNextDouble())
		{
			//assign the user's input to the double value now that we 
			//confirmed it is a double value
			double studentScores = input.nextDouble();
			if (studentScores >= 90)
				studentGrade = "A";
			else if (studentScores >= 80)
				studentGrade = "B";
			else if (studentScores >= 70)
				studentGrade = "C";
			else if (studentScores >= 60)
				studentGrade = "D";
			else
				studentGrade = "F";
		}
		System.out.println(studentGrade);
		input.close();
	}			
}

	


