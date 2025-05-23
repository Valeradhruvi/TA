package result;

import student.Student;

public class Result {

    public void generatesheet(Student student) {
        System.out.println("Marksheet for: " + student.name);
        System.out.println("Roll No: " + student.rollNo);
        
        int[] marks = student.marks;
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            total += marks[i];
        }

        double average = total / (double) marks.length;
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: "+average);

        System.out.println();
        
        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
