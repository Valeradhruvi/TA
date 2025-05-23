import student.Student;
import result.Result;

public class Markssheet {

    public static void main(String[] args) {
        
        int [] marks = {25,25,25,25,25};

        Student student = new Student("User user", 101, marks);
        Result result = new Result();

        result.generatesheet(student);
    }   
}
