package AtvVeiculos;

abstract class Animal {
    public abstract void emitirSom();
    public abstract void alimentar();
}

interface Aquatico {
    void nadar();
}

class Leao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O leão ruge!");
    }
    @Override
    public void alimentar() {
        System.out.println("O leão está se alimentando de carne.");
    }
}

class Peixe extends Animal implements Aquatico {
    @Override
    public void emitirSom() {
        System.out.println("O peixe faz bolhas!");
    }
    @Override
    public void alimentar() {
        System.out.println("O peixe está se alimentando de flocos.");
    }
    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}