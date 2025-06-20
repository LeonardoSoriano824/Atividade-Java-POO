public class Veiculo {
    private String modelo;
    private int ano;
    private double velocidadeAtual;


    public Veiculo(String modelo, int ano) throws AnoInvalidoException {
        if (ano < 1900) {
            throw new AnoInvalidoException("Ano invalido!");
        }
        
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;

        
    }


    public String getModelo() {
        return modelo;
    }


    public int getAno() {
        return ano;
    }


    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }


    public void acelerar(double incremento) {
        if (incremento < 0.0) {
            throw new IllegalArgumentException("Error! Incremento não pode ser negativo");
        }
        else {
            System.out.println("Acelerado!");
            this.velocidadeAtual += incremento;
        }
    }
    
    
    public void frear(double decremento) {
        if (decremento < 0.0 || decremento > velocidadeAtual) {
            throw new IllegalArgumentException("Erro! Decremento não pode ser negativo.");
        }
        
        if (decremento > velocidadeAtual) {
             throw new IllegalArgumentException("Erro! Decremento maior que a velocidade atual.");
        }
        
        System.out.println("Freando!");
        this.velocidadeAtual -= decremento;
        
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo + "\nAno: " + this.ano + "\nVelocidade atual: " + this.velocidadeAtual);
    }


}
