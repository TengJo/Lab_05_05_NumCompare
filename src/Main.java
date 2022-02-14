import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
	double numOne;
    double numTwo;
    numOne = 1.4;
    numTwo = 1.4;
        if (numOne == numTwo)
        {
            System.out.println("The numbers are equal.");
        }
        else if (numOne > numTwo)
        {
            System.out.println(+ numOne + " is greater than " + numTwo);
        }
        else if (numOne < numTwo)
        {
            System.out.println(+ numOne + " is less than " + numTwo);
        }
        else
        {
            System.out.println("You have entered an incorrect value for either number. Try again: ");
        }
    }
}
