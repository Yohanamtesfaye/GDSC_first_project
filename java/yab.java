import java.util.Scanner;
class Area{
  double x,y;
  void setDim(double length, double width){
    x=length;
    y=width;
  }
  double getArea(){
    return x*y;
  }

}
public class yab{
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    System.out.println("enter width and length: ");
    double x = cin.nextDouble();
    System.out.println("enter width and length: ");
    double y = cin.nextDouble();
  Area myarea = new Area();
  myarea.setDim(x,y);
  System.out.println(myarea.getArea());

}

}