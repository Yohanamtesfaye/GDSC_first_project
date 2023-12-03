//L2_Yetnayet_lakew && Yohana_mekuria
import java.util.ArrayList;
class Course {
    String code;
    String name;
    int maxStud;
    StudentC[] students; 
  //constractor 
    public Course(String code, String name, int maxStud) {
        this.code = code;
        this.name = name;
        this.maxStud = maxStud;
        this.students = new StudentC[maxStud]; 
    }
    //enroll method
    public void enroll(StudentC stu) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = stu;
                return;
            }
        }
        System.out.println("full");
    }

    public String getcode() {
        return code;
    }
    //display list of student method
    public void display() {
        for (StudentC s : students) {
            if (s != null) {
                s.display();
            }
        }
    }
    //display courses
    public void displayCouers() {
        System.out.println(code + "\t" + name + "\t" + maxStud + "\t" + countStudents());
    }

    private int countStudents() {
        int count = 0;
        for (StudentC s : students) {
            if (s != null) {
                count++;
            }
        }
        return count;
    }
}
// student class
class StudentC {
    private int id;
    private String name;

    public StudentC(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + "\t" + name);
    }
}
//school class
class School {
    private Course[] courses;
    private StudentC[] students; 
//constractor for school class
    public School(Course[] courses, StudentC[] students) {
        this.courses = courses;
        this.students = students;
    }

    public School() {
        this.courses = new Course[10]; // Initialize the array
        this.students = new StudentC[10]; // Initialize the  array
    }

    public void display() {
        for (Course co : courses) {
            if (co != null) {
                co.displayCouers();
                co.display();
            }
        }
    }

    public void addCoures(Course cou) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = cou;
                return;
            }
        }
    }

    public void enroll(StudentC stu) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = stu;
                return;
            }
        }
    }

    public void enroll(StudentC stu, String CourseC) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getcode().equalsIgnoreCase(CourseC)) {
                courses[i].enroll(stu);
                return;
            }
        }
    }
}

public class LabEx2 {
    public static void main(String[] args) {
        // Example usage
        School school = new School();

        Course course1 = new Course("123", "oop", 3);
        Course course2 = new Course("456", "COA", 5);

        school.addCoures(course1);
        school.addCoures(course2);

        StudentC student1 = new StudentC("yetenayet lakew", 1);
        StudentC student2 = new StudentC("yohana mekuria", 2);

        school.enroll(student1);
        school.enroll(student2);

        school.enroll(student1, "CSE101");

        school.display();
    }
}
