 // @author allan
 
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which Multiplication Table do you want?: ");
        
        int num = s.nextInt();
        for (int i = 1; i <= 10; ++i){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }   
    }
}
