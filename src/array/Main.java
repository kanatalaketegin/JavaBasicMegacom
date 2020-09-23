package array;

public class Main {
    public static void main (String[] args) {
        Student student = new Student("Aibek", "996555999090");
        Student student1 = new Student("Bogdan", "996555999091");
        Student student2 = new Student("Alina", "996555999091");
        Student student3 = new Student("Kanat", "996705686686");
        Student student4 = new Student("Tilek", "996700112233");
        Student student5 = new Student("Sultan", "996700112234");
        Student student6 = new Student("Katya", "996700112235");
        Student student7 = new Student("Gulzat", "996700112255");
        Teacher teacher = new Teacher("Bakdoolot", 1000);
        Course javaBasic = new Course();
        javaBasic.name = "Java";
        System.out.println("имя учителя - " + teacher.fio + ", курс обучения: " + javaBasic.name);
        javaBasic.studentsCount(15);
        javaBasic.addStudent(student);
        javaBasic.addStudent(student1);
        javaBasic.addStudent(student2);
        javaBasic.addStudent(student3);
        javaBasic.addStudent(student4);
        javaBasic.addStudent(student5);
        javaBasic.addStudent(student6);
        javaBasic.addStudent(student7);
        for (Student stud: javaBasic.students) {
            if (stud != null) {
                if (stud.phone == "996700112255" || stud.phone == "996700112234") {
                    stud = null;
                } else {
                    System.out.println("имя студента - " + stud.name + ", тел: " + stud.phone);
                }
            }
        }
    }
}
