
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ijij][rdrdrdr]]
    public static void main(String[] args_) {

        String[] args = {"add" ,"20", "1" };
        System.out.println("Iniciado");
        if (Objects.nonNull(args) && args.length > 0) {
            
            if ("soma".equals(args[0])) {
                soma(args);
            } else if ("add".equals(args[0])) {
                listagem(args);
              }
            else {
                informar(args);
            }
        }
        else {
            informar(args);
        } 
        explica();
    }

    private static void soma(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) { // i = i + 1
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("O resultado da soma e: " + soma);
    }
    private static void listagem (String[] args) {
        "add".equals(args[0]);
        List<String> compras = new ArrayList<>();
        Integer i = 1;
        while (i < args.length) {
            compras.add(args[i]);
            ++i; //explicar
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }
    private static void informar (String[] args) {
        for (String item : args) { // trasforme para metodo
            System.out.println("voce informou: " + item);
        }
    }
    private static void explica () {
        Integer x = 0;
        Integer y = 0;
        System.out.printf("\nTemos duas variáveis x e y iniciando em 0.");
        System.out.printf("\n++i serve para incrementar o valor de índice e retornar um valor já incrementado. Por exemplo: %d (++y)", ++y);
        System.out.printf("\nEnquanto i++ retorna o valor do índice primeiro e depois incrementa: %d (x++)", x++);
    }
}        