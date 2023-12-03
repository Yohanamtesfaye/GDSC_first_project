class person{
  String name;
  int age;
  public person(String name, int age){
    this.name = name;
    this.age = age;
  }
}
class student{
  person pers;
  int Id;
  public student(int Id, person pers){
    this.Id =Id;
    this.pers=pers;
  }
  public void printEmployeeDetails(){
    System.out.println(pers.name+ " " + pers.age+ " " + Id );
  }
}
public class ex {

  public static void main(String[] args) {
    person per = new person("yohana", 20);
    student stud = new student(1, per);
    stud.printEmployeeDetails();
    

    
  }
}