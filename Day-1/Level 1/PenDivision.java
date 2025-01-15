public class PenDivision {
    public static void main(String[] args) {
	
        // Define total pens and number of students
        int totalPens = 14, students = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens
        int remainingPens = totalPens % students;

        // Print results
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
		
	
    }
}
