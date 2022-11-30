package herancas;
import java.util.Arrays;
import java.util.List;

public class Aparelho {
    private final List<Character> letras = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');

    private double peso = 5;
    String cor = "branco";
    private char consumoEnergia = letras.get(letras.size() - 1);
    private double preco = 1000;

    Aparelho() {
        validarConsumoDeEnergia();
    }

    public Aparelho(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;

        validarConsumoDeEnergia();
    }

    public Aparelho(double peso, String cor, char consumoEnergia, double preco) {
        this.peso = peso;
        this.cor = cor;
        this.consumoEnergia = consumoEnergia;
        this.preco = preco;

        validarConsumoDeEnergia();
    }

    public void precoFinal() {
        switch (consumoEnergia) {
            case 'A':
                preco += 1000;
                break;
            case 'B':
                preco += 800;
                break;
            case 'C':
                preco += 600;
                break;
            case 'D':
                preco += 500;
                break;
            case 'E':
                preco += 300;
                break;
            case 'F':
                preco += 100;
                break;
        }
    }

    private void validarConsumoDeEnergia() {
        for(char l : letras) {
            if (consumoEnergia != l) {
                consumoEnergia = 'F';
            }
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
