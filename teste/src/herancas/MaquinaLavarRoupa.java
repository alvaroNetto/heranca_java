package herancas;

public class MaquinaLavarRoupa extends Aparelho{
    private double capacidade = 5;

    public MaquinaLavarRoupa() {
    }

    public MaquinaLavarRoupa(double peso, double preco) {
        super(peso, preco);
    }

    public MaquinaLavarRoupa(double peso, String cor, char consumoEnergia, double preco, double capacidade) {
        super(peso, cor, consumoEnergia, preco);
        this.capacidade = capacidade;
    }

    @Override
    public void precoFinal() {
        super.precoFinal();
        if (capacidade > 30) {
            setPreco(getPreco()+500);
        }
    }

    public double getCapacidade() {
        return capacidade;
    }
}
