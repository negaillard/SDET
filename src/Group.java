import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students = new ArrayList<Student>();
    public Group(String groupName) {
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void deleteStudents(){
        if(students !=null){
            students.removeIf(student -> student.getAverageMark() < 3);
        }
    }
    public void transferStudents(){
        if(students !=null){
            for (Student student: students) {
                if(student.getAverageMark()>=3){
                    student.setCourse(student.getCourse()+1);
                }
            }
        }
    }

    public void addStudent(Student student){
        students.add(student);
        student.setGroupName(groupName);
    }

    public List<Student> getStudents() {
        return students;
    }
}
