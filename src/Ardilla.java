public class Ardilla extends Animal implements Volar{

    public Ardilla(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println("gui gui");
    }

    @Override
    public void saludar() {
        System.out.println("Soy una ardilla");
    }

    @Override
    public void comer() {
        System.out.println("Como como ardilla");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como ardilla");
    }
}

