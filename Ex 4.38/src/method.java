// method.java
// 4.38
import java.util.Arrays;

public class method
{
    private int[] arrayC = new int[5];
    private int add_component = 7;
    private int div_component = 10;
    
    public method()
    {
        Arrays.fill(arrayC, 0);
    }
    
    public int[] process(int[] arrayA)
    {
        for (int i = 0; i < arrayA.length; i++)
        {
            arrayC[i] = (arrayA[i] + add_component) % div_component;
            System.out.println(arrayC[i]);
        }
        
        arrayC[4] = arrayC[2];    // Temporarily store 3rd digit
        arrayC[2] = arrayC[0];    // Swap 1st digit into place #3
        arrayC[0] = arrayC[4];    // Swap 3rd digit into place #1
        arrayC[4] = arrayC[3];    // Temporarily store 4th digit
        arrayC[3] = arrayC[1];    // Swap 2nd digit into place #4
        arrayC[1] = arrayC[4];    // Swap 4th digit into place #2
        
        System.out.println("The encoded number:");
        System.out.printf("%d-%d-%d-%d\n", arrayC[0], arrayC[1], arrayC[2], arrayC[3]);
        return arrayC;
    }

    public void reverse(int[] arrayB)
    {
        arrayC[0] = arrayB[2];    // Set 3th digit to place #1
        arrayC[1] = arrayB[3];    // Set 4th digit to place #2
        arrayC[2] = arrayB[0];    // Set 1st digit to place #3
        arrayC[3] = arrayB[1];    // Set 2nd digit to place #4

        for (int i = 0; i < arrayC.length; i++)
        {
            System.out.println(arrayC[i]);
        	if(arrayC[i] < add_component)
            {
        		arrayC[i] = (((arrayC[i] / div_component) + 1) * 10) - add_component;
            	System.out.println(arrayC[i]);
            }
            else
            {
            	arrayC[i] = ((arrayC[i] / div_component) * 10) - add_component;
            	System.out.println(arrayC[i]);
            }
            System.out.println("arrayC is: " + arrayC[i]);
        }
    
        System.out.println("The decoded number:");
        System.out.printf("%d-%d-%d-%d\n", arrayC[0], arrayC[1], arrayC[2], arrayC[3]);        
        // return arrayC;        
    }
}