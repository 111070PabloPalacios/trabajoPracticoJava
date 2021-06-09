public class Vehiculo {

    private String modelo;
    private int Kilometraje;
    private String Tipo;
    private String Patente;
    private boolean Usado;
    private String Color;
    private String Marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public boolean isUsado() {
        return Usado;
    }

    public void setUsado(boolean usado) {
        Usado = usado;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Vehiculo(String modelo, int kilometraje, String tipo, String patente, boolean usado, String color, String marca) {
    }
}
