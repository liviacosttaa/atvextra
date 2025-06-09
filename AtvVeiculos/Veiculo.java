package AtvVeiculos;

abstract class Veiculo {
    protected String modelo;
    protected int ano;
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    public abstract void alugar();
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
}

interface Motorizado {
    void abastecer();
}
class Carro extends Veiculo implements Motorizado {
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }
    @Override
    public void alugar() {
        System.out.println("Carro " + modelo + " do ano " + ano + " alugado.");
    }
    @Override
    public void abastecer() {
        System.out.println("Abastecendo o carro " + modelo + ".");
    }
}

class Moto extends Veiculo implements Motorizado {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }
    @Override
    public void alugar() {
        System.out.println("Moto " + modelo + " do ano " + ano + " alugada.");
    }
    @Override
    public void abastecer() {
        System.out.println("Abastecendo a moto " + modelo + ".");
    }
}