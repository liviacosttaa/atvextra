package AtvBicicleta;

public class Bicicleta {
    private int velocidade;
    private int marcha;
    private int velocidadeMaxima;
    
    public Bicicleta(int velocidadeMaxima) {
        this.velocidade = 0; 
        this.marcha = 0;     
        this.velocidadeMaxima = velocidadeMaxima; 
    }
    
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
            if (this.velocidade > velocidadeMaxima) {
                this.velocidade = velocidadeMaxima; 
            }
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
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
    }
   
    public void mudarMarcha(int novaMarcha) {
        if (novaMarcha >= 0) {
            this.marcha = novaMarcha;
        }
    }
}
