package herancas;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Aparelho> lista = Arrays.asList(
                new Televisao(50, 1200), new MaquinaLavarRoupa(20, 2000), new Aparelho(),
                new Televisao(40, 3000), new MaquinaLavarRoupa(), new MaquinaLavarRoupa(),
                new Aparelho(), new Televisao(50, 5000), new Televisao(20, 2000), new Aparelho()
        );

        for (Aparelho a : lista) {
            a.precoFinal();
        }

        for (Aparelho a : lista) {
            System.out.println("Valor final: " + a.getPreco() + ".\nAparelho: " + a);
            System.out.println("\n\n");
        }
    }

}