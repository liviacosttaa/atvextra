public class Bicicleta {
    private int velocidade;
    private int marcha;
    
    public Bicicleta() {
        this.velocidade = 0;
        this.marcha = 0;
    }
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
        }
    }
    public void frear(int decremento) {
        if (decremento > 0) {
            this.velocidade -= decremento;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
        }
    }
    public void imprimirEstados() {
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("Marcha: " + this.marcha);
    }
    public void mudarMarcha(int novaMarcha) {
        if (novaMarcha >= 0) {
            this.marcha = novaMarcha;
        }
    }
}
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