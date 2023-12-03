import java.util.Scanner;
class mov{
  private String title;
  private String studio;
  private String rating;

public mov(String title, String studio, String rating){
  this.title = title;
  this.studio= studio;
  this.rating = rating;
}
  public void getPG(mov[] mov){
    for(int i=0;i<mov.length;i++ ){
      if(mov[i].rating == "PG"){
        System.out.println(mov[i].title + " " + mov[i].studio +" " +mov[i].rating);
      }
    }
  }
}


public class Movie {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    mov[] mov = new mov[10];
    mov[0] = new mov("abcd", "def", "PG");
    mov[1] = new mov("ebcd", "eef", "AR");
    mov[2] = new mov("fbcd", "fef", "Av");
    mov[3] = new mov("gbcd", "gef", "PG");
    mov movi = new mov("dfd", "hsd", "PG");
    movi.getPG(mov);

  }
}
