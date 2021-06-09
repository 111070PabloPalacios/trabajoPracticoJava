public class Moto extends Vehiculo{

    private int cilindrada;
    private boolean asientoAcompañante;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isAsientoAcompañante() {
        return asientoAcompañante;
    }

    public void setAsientoAcompañante(boolean asientoAcompañante) {
        this.asientoAcompañante = asientoAcompañante;
    }

    public Moto(String modelo, int kilometraje, String tipo, String patente, boolean usado, String color, String marca, int cilindrada , boolean asientoAcompañante) {
        super(modelo, kilometraje, tipo, patente, usado, color, marca);
        this.cilindrada = cilindrada;
        this.asientoAcompañante = asientoAcompañante;
    }
}
