import java.util.Map;

public class Student {
    private String name;
    private int course;
    private String groupName;
    private Map<String, Integer> marks;
    public float getAverageMark(){
        if(marks.isEmpty())
            return 0;
        int sum = 0;
        int count =0;
        for (Map.Entry<String, Integer> entry: marks.entrySet()) {
            Integer value = entry.getValue();
            sum+=value;
            count+=1;
        }
        return (float) sum /count;
    }


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
}
