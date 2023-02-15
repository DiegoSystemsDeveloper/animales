public class Humano extends Animal implements Volar{
    private String id;
    private String eps;

    public Humano(String nombre, String id, String eps) {
        super(nombre);
        this.id = id;
        this.eps = eps;
    }

    public void trabajar() {
        System.out.printf("Estoy trabajando");
    }

@Override
    public void volar() {
    System.out.printf("Vuelo en avion");
    }

    @Override
    public void hacerRuido() {
        System.out.printf("Bla bla bla");
    }

    @Override
    public void saludar() {
        System.out.println("Hola mundo");
    }

    @Override
    public void comer() {
        System.out.printf("Como como humano");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
}
