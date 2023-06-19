package Multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


class InvalidDeptException extends Exception{
	
}
public class Input {
	public static void InputValidator(int empid, String name, String dept,int managerid, int sal)
			throws InvalidDeptException {
		if (dept.equalsIgnoreCase("HR") || dept.equalsIgnoreCase("sales") ||
				dept.equalsIgnoreCase("it") || dept.equalsIgnoreCase("marketing"))
		{
			Employee employee = new Employee(empid, name, dept, managerid, sal);
		}
		else {
			throw new InvalidDeptException();	
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Emp Id: ");
		int empid = sc.nextInt();
		System.out.println();
		System.out.print("Enter Emp name: ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("Enter Emp department: ");
		String dept = sc.nextLine();
		System.out.println();
		System.out.print("Enter Emp's manager Id: ");
		int managerid = sc.nextInt();
		System.out.println();
		System.out.print("Enter Emp salary: ");
		int sal = sc.nextInt();
		System.out.println();
		sc.close();
		
		
		try {
			FileOutputStream fout=new FileOutputStream("error.log",true);
				PrintStream out=new PrintStream(fout);
				System.setErr(out);
				
			
			try {
				InputValidator(empid, name, dept, managerid, sal);
			} catch (InvalidDeptException e) {
				InvalidDeptException id=new  InvalidDeptException();
				System.err.println(id);	
//				throw id; 

			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}
}
