package javaIntro;

public class ComparisonOperators{
	public static void main(String[] args){
	//== Equals
	boolean isEqual=12==13;
	System.out.println(isEqual);

	boolean isOddNumber = (101%2)==1;
	System.out.println(isOddNumber);

	//!= Not equal
	int num1=25;
	int num2=10;
	boolean isNotEquals=num1!=num2;
	System.out.println(num1!=num2);//true
	System.out.println(true!=true);//false
	System.out.println(isNotEquals);//true

	//greater than '>' or less than '<'
	int num3 =100;
	int num4 = 1000;

	System.out.println(num3<num4);//true
	System.out.println(num3>num4);//false

	// greater than or equals '>='
	System.out.println(num3>=num4);

	// less than or equals '<='
	System.out.println(num3<=num4);




	}
}