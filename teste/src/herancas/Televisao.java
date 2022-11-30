package herancas;

public class Televisao extends Aparelho{
    private int resolucao = 20;
    private boolean receptorTDT;

    public Televisao() {
    }

    public Televisao(double peso, double preco) {
        super(peso, preco);
    }

    public Televisao(double peso, String cor, char consumoEnergia, double preco, int resolucao, boolean receptorTDT) {
        super(peso, cor, consumoEnergia, preco);
        this.resolucao = resolucao;
        this.receptorTDT = receptorTDT;
    }

    @Override
    public void precoFinal() {
        super.precoFinal();

        double trintaPorCento = (30/100.0) * getPreco();

        if (resolucao > 40 && receptorTDT) {
            setPreco(getPreco() + 500 + trintaPorCento);
        } else if (resolucao > 40) {
            setPreco(trintaPorCento + getPreco());
        } else if (receptorTDT) {
            setPreco(getPreco() + 500);
        }
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isReceptorTDT() {
        return receptorTDT;
    }

    public void setReceptorTDT(boolean receptorTDT) {
        this.receptorTDT = receptorTDT;
    }
}
