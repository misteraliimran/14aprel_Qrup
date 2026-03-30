package lesson2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainClass {
	public static void main(String[] args) {

		LocalDateTime zamanMelumati = LocalDateTime.now();

		DateTimeFormatter tarixFormati = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formatlanmisZaman = zamanMelumati.format(tarixFormati);

		System.out.println("Formatlanmis tarix: " + formatlanmisZaman);
	}
}