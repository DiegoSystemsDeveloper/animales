public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un gato");
    }

    @Override
    public void comer() {
        System.out.println("Como como gato");
    }
}
