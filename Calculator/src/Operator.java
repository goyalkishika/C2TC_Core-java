import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		char operator;
		int number1,number2,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose operator: + - * / or % ");
		operator=sc.next().charAt(0);
		System.out.println("Enter 1st no.: ");
		number1=sc.nextInt();
		System.out.println("Enter 2nd no.: ");
		number2=sc.nextInt();
		switch(operator) {
		case'+':
			result=number1+number2;
			System.out.println(number1+"+"+number2+"="+result);
			break;
		case'-':
			result=number1-number2;
			System.out.println(number1+"-"+number2+"="+result);
			break;
		case'*':
			result=number1*number2;
			System.out.println(number1+"*"+number2+"="+result);
			break;
		case'/':
			result=number1/number2;
			System.out.println(number1+"/"+number2+"="+result);
			break;
		case'%':
			System.out.println(number1+"%"+number2+"="+number1%number2);
			break;
		default:
			System.out.println("Choose a proper Operator");
	      }

	}

}
