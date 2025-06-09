package AtvVeiculos;


public class Main {
    public static void main(String[] args) {
       
        Veiculo carro = new Carro("Virtus", 2025);
        carro.alugar();
        ((Carro) carro).abastecer(); 
        System.out.println();

        
        Veiculo moto = new Moto("MT09", 2025);
        moto.alugar();
        ((Moto) moto).abastecer(); 

        
        Veiculo bicicleta = new BicicletaEletrica("KRW", 2022);
        bicicleta.alugar();
       
    }
}