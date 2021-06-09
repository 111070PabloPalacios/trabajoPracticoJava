
public class Auto extends Vehiculo{

    private boolean estereo;
    private int cantidadPuertas;
    private int traccion;

    public Auto(){

    }

    public Auto(String Modelo, int Kilometraje, String Tipo, String Patente, boolean Usado, String Color, String Marca ,boolean estereo, int cantidadPuertas, int traccion) {
        super(Modelo, Kilometraje, Tipo, Patente, Usado, Color, Marca);
        this.estereo = estereo;
        this.cantidadPuertas = cantidadPuertas;
        this.traccion = traccion;

    }

    public boolean isEstereo() {
        return estereo;

    }

    public void setEstereo(boolean estereo) {
        this.estereo = estereo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }

    /*public String booleanoAString(boolean parametro)
    {
        if(parametro == true)
        {
            return "Si";
        }
        else
        {
            return "No";
        }
    }*/

    @Override
    public String toString() {
        return "Auto: " + "\n" +
         "Modelo: " + this.getModelo() + "\n" +
         "Kilometraje: " + this.getKilometraje() + "\n" +
         "Tipo: " + this.getTipo() + "\n" +
                "Patente: " + this.getPatente() + "\n" +
                "Usado: " + booleanoAString(this.isUsado()) + "\n" +
                "Color: " + this.getColor() + "\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Estereo: " + booleanoAString(this.isEstereo()) + "\n" +
                "Cantidad de Puertas: " + this.cantidadPuertas + "\n" +
                "Traccion: " + this.getTraccion();

        /*return "Auto{" +
                "estereo=" + estereo +
                ", cantidadPuertas=" + cantidadPuertas +
                ", traccion=" + traccion +
                '}';*/
    }
}
