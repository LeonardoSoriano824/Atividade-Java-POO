public class TestaVeiculos {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Sedan", 2023, 4);
        Moto moto1 = new Moto("Esportiva", 2024, 600);
        
        System.out.println("---Carro---");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("---Moto---");
        moto1.exibirInformacoes();
        System.out.println();
        
        System.out.println("---Acelerando Carro---");
        carro1.acelerar(30);
        System.out.println();
        System.out.println("---Acelerando Moto---");
        moto1.acelerar(50);
        System.out.println();
        
        System.out.println("---Carro---");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("---Moto---");
        moto1.exibirInformacoes();
        System.out.println();
        
        System.out.println("---Freando Carro---");
        carro1.frear(50);
        System.out.println();
        System.out.println("---Freando Moto---");
        moto1.frear(20);
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
        
    }
}
