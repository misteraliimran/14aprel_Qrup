package lesson2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tarix daxil et: ");
		String date = sc.nextLine();

		boolean result = date.matches("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}");

		System.out.println(result);
	}
}