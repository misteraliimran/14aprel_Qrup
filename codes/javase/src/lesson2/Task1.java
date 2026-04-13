package lesson2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String daxil et: ");
		String input = sc.nextLine();

		boolean result = input.matches("[0-9]+");

		System.out.println(result);
	}
}