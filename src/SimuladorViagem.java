public class SimuladorViagem implements Runnable {
    private Veiculo veiculo;

    public SimuladorViagem(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void run() {
        System.out.println("Veiculo: " + veiculo.getModelo() + " começou a viagem!");
        
        for (int i = 0; i < 5; i++) {
            int acelerarando = (int) (Math.random() * 11) + 5;
            veiculo.acelerar(acelerarando);

            System.out.println("Velocidade atual: " + veiculo.getVelocidadeAtual());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrompida: " + e.getMessage());
            }
        }
        double freando = veiculo.getVelocidadeAtual();

        veiculo.frear(freando);
        System.out.println("A viagem do veículo foi finalizada!");
    }

    
}
