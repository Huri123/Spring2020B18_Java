package day07_IfStatements;

/*
Warmup task:
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
	Write a program that declares three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements
 */
public class ValidTriangle {
    public static void main(String[] args) {
        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 100;

        int sumOfAngles = angle1 + angle2 + angle3;

        /*boolean validTriangle = sumOfAngles == 180;
        if (validTriangle) {
            System.out.println("The shape is triangle");
        }
        if (!validTriangle) {
            System.out.println("The shape is not triangle");
        }
         */
        if (sumOfAngles == 180) {
            System.out.println("The shape is a triangle");
        }
        if (sumOfAngles != 180) {
            System.out.println("The shape is not triangle");
        }
    }
}


