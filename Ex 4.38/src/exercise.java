// exercise.java
// 4.38

import java.util.Scanner;

public class exercise
{
    public static void main(String[] args)
    {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        
        Scanner input = new Scanner(System.in);
        
        // Input digits. Only accept digits < 10.
        for (int i = 0; i < arrayA.length - 1; i++)
        {
            System.out.printf("Input SINGLE digit #%d: ", i + 1);
            arrayA[i] = input.nextInt();
            while(arrayA[i] >= 10)
            {
            	System.out.print("Input must be < 10:");
                arrayA[i] = input.nextInt();
            }
        }
    
        method myMethod = new method();     
        arrayB = myMethod.process(arrayA);
        myMethod.reverse(arrayB);
    }
}