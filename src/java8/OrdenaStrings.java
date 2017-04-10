package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("Casa do Código");
		palavras.add("Caelum");
		palavras.add("Alura ensino e inovação");

		palavras.sort(String.CASE_INSENSITIVE_ORDER);

//		palavras.replaceAll(str -> str.replace("a", "t"));

//		palavras.removeIf(t -> t.contains("l"));

		palavras.forEach(System.out::println);
		
//		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}