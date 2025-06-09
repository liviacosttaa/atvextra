package AtvBicicleta;


public class Main {
    public static void main(String[] args) {
        
        Bicicleta bicicleta = new Bicicleta(30);
        System.out.println("Estado inicial da bicicleta:");
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Acelerando em 10 km/h:");
        bicicleta.acelerar(10);
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Mudando a marcha para 2:");
        bicicleta.mudarMarcha(2);
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Acelerando em 25 km/h:");
        bicicleta.acelerar(25);
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Freando em 15 km/h:");
        bicicleta.frear(15);
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Acelerando em 20 km/h (deve atingir a velocidade máxima):");
        bicicleta.acelerar(20);
        bicicleta.imprimirEstados();
        System.out.println();
        System.out.println("Freando em 10 km/h:");
        bicicleta.frear(10);
        bicicleta.imprimirEstados();
        System.out.println();
    }
}