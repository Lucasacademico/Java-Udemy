package convert_hora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class hora_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Chamando fuso horario do horario do meu PC
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		
		// Usando formatos prontos do Java (conforme link do site)
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		// Modos de chamada
		System.out.println("D01 = " + d01.format(fmt1)); // Insere data no formato que customizamos
		System.out.println("D01 = " + fmt1.format(d01));
		System.out.println("D01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		System.out.println("D02 = " + d02.format(fmt1));
		System.out.println("D02 = " + d02.format(fmt2));
		System.out.println("D02 = " + d02.format(fmt4)); // Chamado formato pr�-configurado ISO_DATE_TIME.
		System.out.println();
		System.out.println("D03 = " + fmt3.format(d03));
		System.out.println("D03 = " + fmt5.format(d03)); // Chamado formato pr�-configurado ISO_INSTANT.
	}

}
