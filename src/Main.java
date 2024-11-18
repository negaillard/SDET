import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("anton", 2);
        Student s2 = new Student("alena", 2);
        Student s3 = new Student("eugene", 2);
        Student s4 = new Student("egor", 2);
        Student s5 = new Student("oleg", 3);
        Student s6 = new Student("alex", 5);

        List<Student> ss = new ArrayList<Student>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);
        ss.add(s5);
        ss.add(s6);
        printStudents(ss, 2);

        Group group = new Group("Pibd");

        Map<String, Integer> s1marks = Map.of(
                "a", 4,
                "c", 5,
                "d", 3,
                "e", 3
        );
        Map<String, Integer> s2marks = Map.of(
                "a", 2,
                "c", 2,
                "d", 3,
                "e", 2
        );
        Map<String, Integer> s3marks = Map.of(
                "a", 3,
                "c", 3,
                "d", 4,
                "e", 3
        );
        s1.setMarks(s1marks);
        s2.setMarks(s2marks);
        s3.setMarks(s3marks);
        s4.setMarks(s1marks);

        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);

        group.deleteStudents();
        group.transferStudents();
        System.out.println("__________________________________");
        printStudents(ss, 3);
    }

    public static void printStudents(List<Student> students, int course){
        for (Student student: students
        ) {
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}