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

    public Moto()
    {

    }

    public Moto(String modelo, int kilometraje, String tipo, String patente, boolean usado, String color, String marca, int cilindrada , boolean asientoAcompañante) {
        super(modelo, kilometraje, tipo, patente, usado, color, marca);
        this.cilindrada = cilindrada;
        this.asientoAcompañante = asientoAcompañante;
    }

    public String intAString(int numero)
    {
        if(numero == 1)
        {
            return "Si";
        }
        else
        {
            return "No";
        }
    }

    @Override
    public String toString() {
      return   "Moto " + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Kilometraje: " + this.getKilometraje() + "\n" +
                "Tipo: " + this.getTipo() + "\n" +
                "Patente: " + this.getPatente() + "\n" +
                "Usado: " + booleanoAString(this.isUsado()) + "\n" +
                "Color: " + this.getColor() + "\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Cilindrada: " + intAString(this.getCilindrada()) + "\n" +
                "Asiento Acompañante: " + booleanoAString(this.isAsientoAcompañante());

       // return "Moto{" +
        //        "cilindrada=" + cilindrada +
        //        ", asientoAcompañante=" + asientoAcompañante +
         //       '}';
    }
}
