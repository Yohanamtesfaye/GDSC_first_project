import java.util.*;
public class even {
  public static void main(String[] args) {
    ArrayList<Integer> even = new ArrayList<Integer>();
    for(int i =1;i<20;i++){
      if(i%2==0){
        even.add(i);
      }
    }
    for(int x:even){
      System.out.println(x);
    }
  }
}
