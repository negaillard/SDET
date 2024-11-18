import java.util.List;

public class Course {
    private int number;
    private List<Group> groups;
    public Course(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
