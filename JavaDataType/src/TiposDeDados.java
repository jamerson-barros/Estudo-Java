public class TiposDeDados {

    public static void main(String[] args) {

        /*
        TIPOS PRIMITIVOS:
            São os tipos basic da memória. Armazena os values retirement na memória.
         */

        // INTEIROS
        byte age = 21; // 8 bits (-128 - 127)
        short house_number = 1087; // 16 bits (-32.768 a 32.767)
        int id = 1; // 32 bits (-2.147.483.647 - 2.147.483.647) - Mais usado
        long person_in_the_world = 83000000000L; // 64 bits (A cima do valor de int) prefixo L

        // DECIMALS (PONTO FLUTUANTE)
        float height = 1.86f; // 32 bits
        double salary = 3500; // 64 bits - Mais usado

        System.out.printf("%-20s %s%n", "", "Exemplos de Inteiros");
        System.out.printf("%-15s: %d%n", "Idade", age);
        System.out.printf("%-15s: %d%n", "Numero da casa", house_number);
        System.out.printf("%-15s: %d%n", "ID", id);
        System.out.printf("%-15s: %d%n", "Pessoas no Mundo", person_in_the_world);

    }
}
