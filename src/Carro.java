public class Carro extends Veiculo {
    private int numeroPortas;
    
    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getnumeroPortas() {
        return numeroPortas;
    }

    public void abrirPorta() {
        System.out.println("Porta aberta!");
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + this.numeroPortas);
    }
}
