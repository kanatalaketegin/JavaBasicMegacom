package array;

public class Course {
    int id;
    String name;
    int price;
    int duration;
    Teacher teacher;
    Student[] students;

    public void studentsCount(int count) {

        students = new Student[count];
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }

        }
        return false;
    }
}
