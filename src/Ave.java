public class Ave extends Animal implements Volar{

    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.printf("Pio");
    }

    @Override
    public void saludar() {
        System.out.printf("Hola soy un ave");
    }

    @Override
    public void comer() {
        System.out.printf("Como como ave");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como ave");
    }
}
