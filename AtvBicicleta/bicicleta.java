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