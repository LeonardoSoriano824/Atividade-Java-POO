public class TestaVeiculos {
    
    public static void main(String[] args) {
        Carro carro1 = null;
        Moto moto1 = null;

        try {
            carro1 = new Carro("Sedan", 2025, 4);
        } catch (AnoInvalidoException e) {
            System.err.println(e.getMessage());
        }
        
        try {
            moto1 = new Moto("Esportiva", 2024, 600);
        } catch (AnoInvalidoException e) {
            System.err.println(e.getMessage());
        }
        
        System.out.println("---Carro---");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("---Moto---");
        moto1.exibirInformacoes();
        System.out.println();
        
        System.out.println("---Acelerando Carro---");
        
        try {
        carro1.acelerar(30);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println();
        System.out.println("---Acelerando Moto---");
        
        try {
            moto1.acelerar(50);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println();
        
        System.out.println("---Carro---");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("---Moto---");
        moto1.exibirInformacoes();
        System.out.println();
        
        System.out.println("---Freando Carro---");
        
        try {
            carro1.frear(50);
        
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();
        System.out.println("---Freando Moto---");
        
        try {
            moto1.frear(20);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println();
        
        System.out.println("---Carro---");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("---Moto---");
        moto1.exibirInformacoes();
        System.out.println();
        
        System.out.println("---Carro abrindo porta---");
        carro1.abrirPorta();
        System.out.println();
        System.out.println("---Moto empinando---");
        moto1.empinar();
        System.out.println();
        
        
        SimuladorViagem simuladorCarro = new SimuladorViagem(carro1);
        SimuladorViagem simuladorMoto = new SimuladorViagem(moto1); 

        
        Thread threadCarro = new Thread(simuladorCarro);
        Thread threadMoto = new Thread(simuladorMoto);

        threadCarro.start();
        threadMoto.start();
        
        try {
            threadCarro.join();
            threadMoto.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrompida");
        }
        
    }

}
