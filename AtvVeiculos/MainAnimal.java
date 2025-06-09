package AtvVeiculos;

public class MainAnimal {
    public static void main(String[] args) {
        
        Animal leao = new Leao();
        System.out.println("Leão:");
        leao.emitirSom();
        leao.alimentar();
        System.out.println();
       
        Animal peixe = new Peixe();
        System.out.println("Peixe:");
        peixe.emitirSom();
        peixe.alimentar();
        ((Peixe) peixe).nadar(); 
    }
}