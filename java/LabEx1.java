// L2_Yetnaye_lakew && Yohana_Mekuria 
import java.util.Scanner;
class student{
  int id;
  String name;
  double grade;
  // a default constractor
  public student(int id, String name, double grade){
    this.id = id;
    this.name=name;
    this.grade=grade;
  }
  // display
  public static void display( student stu){
    System.out.println(stu.name + " " + stu.id + " " + stu.grade);
  }
  //modify
  public static void modify(student stu){
  Scanner cin = new Scanner(System.in);
  System.out.println("Enter the grade: "); 
  stu.grade = cin.nextDouble();   
  }
  // calculate and print avarage
  public static void avarage(double[] stu){
    double ava, sum =0;
    for(int i =0; i<stu.length;i++){
      sum+=stu[i];
    }
    ava = sum/stu.length;
    System.out.println("avarage grade is: " + ava);
  }
}

public class LabEx1 {
  public static void main(String[] args) {
    student stud = new student(1,"abc",4.0);
    student stud2 = new student(2,"def",3.9);
    student stud3 = new student(3,"ghi",3.8);
     double[] grades = {stud.grade, stud2.grade, stud3.grade};
    student.display(stud);
    student.display(stud2);
    student.display(stud3);
    Scanner cin = new Scanner(System.in);
    System.out.println("enter the id: ");
    int x = cin.nextInt();
    if(x==stud.id){
      student.modify(stud);
      student.display(stud);
    }
    else if(x==stud2.id){
      student.modify(stud2);
      student.display(stud2);
    }
    else if(x==stud3.id){
      student.modify(stud3);
      student.display(stud3);
    }
    else{
      System.out.println("id not find");
    }
    student.avarage(grades);

  }
}
