/*@author allan*/

import java.util.Scanner;

public class javLab2Exercices 
{
    public static void main(String[] args) 
    {
        /*Runintegers runInt = new Runintegers();
        runInt.runintegers();*/
        
        Echo ec = new Echo();
        ec.main(args);
    }
}

class Runintegers 
{
    public static void runintegers()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Start: ");
        int start = scan.nextInt();
        //System.out.println(start);
        
        int end = scan.nextInt();
        System.out.println("End: " + end);

        if(start < end)
            for(int i = start; i <= end; i++)
            System.out.print(i + " ");

        else if(start > end)
            for(int i = start; i >= end; i--)
            System.out.print(i + " "); 

    }
}


class SumofIntengers 
{
	
    public int sum(int n) 
    {
	int result = 0; 
	for (int x = 1; x <= n; x++)
            result += SumOfIntengers(x);
	
		return result;
    }
	
    public int SumOfIntengers(int x)
    {
        int sum = 0;
	while (x != 0)
        {
            sum += x % 10;
            x = x / 10;
        }
            return sum;
    }
	
    public void main(String args[])
    {
	int n = 328;
	System.out.println("Sum of digits in numbers" +" from 1 to " + n + " is " + sum(n));
    }
}



class Echo{
  public void main(String[] args){
    System.out.println("Enter word:");
    Scanner input=new Scanner(System.in);
    
    String word=input.next();
    
    int len=word.length();
    System.out.println();
    
    for(int i=0;i<len;i++){
         System.out.println(word);
        }
    }
}


class AddingIntegers
{
    public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
         
        int count; 
        int num; 
        int sum;
                
        System.out.println("How many integers will be added?: ");
        count = scan.nextInt();
              
        while (count > 0) 
        {
        System.out.println("Enter an integer: ");
        num = scan.nextInt();
        count = count - 1;        
        }
         
    }
}
