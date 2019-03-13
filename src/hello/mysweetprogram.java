package hello;

import java.util.Scanner;

public class mysweetprogram {

	public static void main(String[] args) {
		System.out.println("whoa there, what is your name?");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
				
		System.out.println("hello" + name);
	}

}
