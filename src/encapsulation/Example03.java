package encapsulation;

import java.util.Scanner;

public class Example03 {

	private String name;
	private int id;
	private long salary;	

	public void employee() {
		String name1;
		int xyz;
		long enjoy;
				
		Scanner input = new Scanner(System.in);
		name1 = input.nextLine();
		xyz = input.nextInt();
		enjoy = input.nextLong();
				
		name = name1;
		id = xyz;
		salary = enjoy;
		}

	public void salary() {

		System.out.println("Name- " + name);
		System.out.println("Employee ID- " + id);
		System.out.println("Salary- " + salary);
	}
}
