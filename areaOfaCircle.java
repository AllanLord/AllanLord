 //@author allan

import java.util.Scanner;

public class areaOfaCircle {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius' Circle:");
        
        double radius = s.nextDouble();
        double area = (Math.PI * radius * radius);
        
        System.out.println("Area = " + area);
        }
}
