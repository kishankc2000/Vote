import java.util.Scanner;


public class IfElse {
	public static void main(String[]args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter You age:");
		int age = scanner.nextInt();
		if (age>=18){
			System.out.println("you can vote");
		}
		else{
			System.out.println("you cannot vote");
		}
	}

}
