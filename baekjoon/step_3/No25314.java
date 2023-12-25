import java.util.Scanner;

public class No25314 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String _int = "int";
      String _longInt = "";
      int _byte = sc.nextInt();
      
      for(int i=0; i<(_byte/4); i++){
        _longInt += "long ";
      }
      System.out.print(_longInt+_int); 
    }
}