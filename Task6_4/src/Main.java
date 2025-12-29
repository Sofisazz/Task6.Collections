import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){

        var students = new ArrayList<Student>();

        Student student1 = new Student("Мария", 225487, 3, new int[] {1, 5, 2, 5});
        Student student2 = new Student("Владислав", 479521, 1, new int[] {3, 4, 4, 5});
        Student student3 = new Student("Иван", 146523, 1, new int[] {1, 2, 1, 3});
        Student student4 = new Student("Ксения", 746852, 3, new int[] {5, 5, 5, 5});
        Student student5 = new Student("Даниил", 124778, 2, new int[] {3, 4, 2, 2});

        Collections.addAll(students, student1, student2, student3, student4, student5);

        students = removeStudents(students);

        printStudents(students, 4);
    }

    public static ArrayList<Student> removeStudents(ArrayList<Student> students) {
        var newStudents = new ArrayList<Student>();

        for (Student student : students) {
            int sum = 0, count = 0;

            for (int grade : student.getGrades()) {
                sum += grade;
                count++;
            }

            if (sum/count >= 3) {
                student.setCourse(student.getCourse() + 1);
                newStudents.add(student);
            }
        }

        return newStudents;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.printf("Студенты, обучающиеся на %d курсе:", course);
        System.out.println();

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getFirstName());
            }
        }
    }
}