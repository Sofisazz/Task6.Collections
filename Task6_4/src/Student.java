public class Student {

    private String firstName;
    private int group;
    private int course;
    private int[] grades;

    Student(String firstName, int group, int course, int[] grades) {
        this.firstName = firstName;
        this.group = group;
        this.course = course;

        this.grades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }

    public int[] getGrades() {
        return grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
