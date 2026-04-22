public class PrimitiveTypes {

    public static void main(String[] args) {

        /*
        TIPOS PRIMITIVOS:
            São os tipos básicos da memória. Armazena os values retirement na memória.
         */

        // INTEIROS
        byte age = 21; // 8 bits (-128 - 127)
        short house_number = 1087; // 16 bits (-32.768 a 32.767)
        int id = 1; // 32 bits (-2.147.483.647 - 2.147.483.647) - Mais usado
        long person_in_the_world = 83000000000L; // 64 bits (A cima do valor de int) prefixo L
        
        System.out.printf("%-20s %s%n", "", "Exemplos de Inteiros");
        System.out.printf("%-15s: %d%n", "Idade", age);
        System.out.printf("%-15s: %d%n", "Numero da casa", house_number);
        System.out.printf("%-15s: %d%n", "ID", id);
        System.out.printf("%-15s: %d%n", "Pessoas no Mundo", person_in_the_world);
        
        // DECIMALS (PONTO FLUTUANTE)
        float height = 1.86f; // 32 bits
        double salary = 3500; // 64 bits - Mais usado
        
        System.out.printf("%n%-20s %s%n", "", "Exemplos de Decimais");
        System.out.printf("%-15s: %.2f%n", "Altura", height);
        System.out.printf("%-15s: %.2f%n", "Salário", salary);
        
        // CHAR (CHARACTER)
        char gender = 'M';
        System.out.printf("%n%-20s %s%n", "", "Exemplos de Character");
        System.out.printf("%-15s: %c%n", "Sexo", gender);
        
        // BOOBLEAN 
        boolean employee = true;
        
        System.out.printf("%n%-20s %s%n", "", "Exemplos de boolean");
        System.out.printf("%-15s: %b%n", "Empregado", employee);
    }
}
