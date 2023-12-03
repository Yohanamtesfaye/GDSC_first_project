import java.util.Scanner;
class check{
  public int year;
  public String name;
  public String address;
  public double salary;
  public String display(){
    return name +" " + year + " " + address + " "  + salary;
  } 
}
public class employee {
public static void main(String[] args) {

  // Employee e1 = new Employee();
  // e1.name= "Abebe";
  // e1.address= "Addis";
  // e1.salary = 200.0;
  // e1.year = 11;
  // e1.display();

  
  check emp[] = new check[3];
  Scanner cin = new Scanner(System.in);
  for(int i =0;i<3;i++){
    emp[i] = new check();
    System.out.println("enter name: ");
    emp[i].name =   cin.next();
    System.out.println("enter year: ");
    emp[i].year = cin.nextInt();
    System.out.println("enter address: ");
    emp[i].address = cin.next();
    System.out.println("enter salary: ");
    emp[i].salary = cin.nextDouble();
  }
  for(int i =0; i<3; i++){
    System.out.println(emp[i].display());
  }

  

}
  
  
}
