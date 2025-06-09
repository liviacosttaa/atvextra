package AtvBicicleta;


public class Main {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();
        System.out.println("Estado inicial da bicicleta:");
        bike.imprimirEstados();
        System.out.println();
        System.out.println("Acelerando em 10 km/h:");
        bike.acelerar(10);
        bike.imprimirEstados();
        System.out.println();
        System.out.println("Mudando a marcha para 2:");
        bike.mudarMarcha(2);
        bike.imprimirEstados();
        System.out.println();
        System.out.println("Acelerando em 15 km/h:");
        bike.acelerar(15);
        bike.imprimirEstados();
        System.out.println();
        System.out.println("Freando em 20 km/h:");
        bike.frear(20);
        bike.imprimirEstados();
        System.out.println();
        System.out.println("Freando em 10 km/h:");
        bike.frear(10);
        bike.imprimirEstados();
        System.out.println();
    }
}