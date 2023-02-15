public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    public void pasear() {
        System.out.println("Estoy paseando");
    }

    @Override
    public void hacerRuido() {
        System.out.printf("guau");
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy don perro");
    }

    @Override
    public void comer() {
        System.out.println("Como como perro");
    }
}
