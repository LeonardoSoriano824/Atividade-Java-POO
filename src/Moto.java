public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String modelo, int ano, int cilindradas) throws AnoInvalidoException{
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void empinar() {
        System.out.println("Empinando a moto!");
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}

