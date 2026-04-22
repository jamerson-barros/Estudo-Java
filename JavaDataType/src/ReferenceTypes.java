public class ReferenceTypes {
	
	public static void main(String[] args) {
		
		/*
		TIPOS DE REFERÊNCIA (NÃO PRIMITIVOS):
		Esses tipos armazenam endereços da memória (referências),
		não o valor direto
		*/
				
		// STRINGS: são imutáveis.
		// Ao criar um objeto N e depois N = N + S, a variavel apontará para um novo objeto N
				
		String name = "Jamerson";
		String last_name = "Barros";
		String full_name = name + " " + last_name;
		full_name += " da Silva";
		
		System.out.printf("%n%-20s %s%n", " ", "Exemplo de String");
		System.out.printf("%-15s: %s%n", "Nome Completo", full_name);
  
	}
}