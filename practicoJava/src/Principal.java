import java.util.Scanner;

public class
Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String vehiculo;
        Auto auto = new Auto();
        Moto moto = new Moto();

        System.out.println("Ingrese el tipo de Vehiculo (Auto - Moto):");
        vehiculo = sc.next();


        if(vehiculo.equalsIgnoreCase("Auto"))
        {
            System.out.println("Ingrese el modelo: ");
            auto.setModelo(sc.next());
            System.out.println("Ingrese el kilometraje: ");
            auto.setKilometraje(sc.nextInt());
            System.out.println("Ingrese el tipo de vehiculo (Deportivo o Familiar):");
            auto.setTipo(sc.next());
            System.out.println("Ingrese la patente:");
            auto.setPatente(sc.next());
            System.out.println("¿El auto es usado? (SI - NO): ");
            String usado = sc.next();
            if(usado.equalsIgnoreCase("Si"))
            {
                auto.setUsado(true);
            }
            else
            {
                auto.setUsado(false);
            }
            System.out.println("Ingrese el color: ");
            auto.setColor(sc.next());
            System.out.println("Ingrese la marca: ");
            auto.setMarca(sc.next());
            System.out.println("¿El auto tiene estereo (SI - NO): ?");
            String estereo = sc.next();
            if(estereo.equalsIgnoreCase("Si"))
            {
                auto.setEstereo(true);
            }
            else
            {
                auto.setEstereo(false);
            }
            System.out.println("Ingrese la cantidad de puertas: ");
            auto.setCantidadPuertas(sc.nextInt());
            System.out.println("Ingrese la traccion EJ (2000): ");
            auto.setTraccion(sc.nextInt());
            System.out.println(auto.toString());
        }
        else
        {
            System.out.println("Ingrese el modelo: ");
            moto.setModelo(sc.next());
            System.out.println("Ingrese el kilometraje: ");
            moto.setKilometraje(sc.nextInt());
            System.out.println("Ingrese el tipo de moto (Deportivo o Familiar):");
            moto.setTipo(sc.next());
            System.out.println("Ingrese la patente:");
            moto.setPatente(sc.next());
            System.out.println("¿La moto es usada? (SI - NO): ");
            String usado = sc.next();
            if(usado.equalsIgnoreCase("Si"))
            {
                moto.setUsado(true);
            }
            else
            {
                moto.setUsado(false);
            }
            System.out.println("Ingrese el color: ");
            moto.setColor(sc.next());
            System.out.println("Ingrese la marca: ");
            moto.setMarca(sc.next());
            System.out.println("¿Es cilindrada? (SI-NO):");
            String cilindrada = sc.next();
            if(cilindrada.equalsIgnoreCase("si"))
            {
                moto.setCilindrada(1);
            }
            else
            {
                moto.setCilindrada(2);
            }
            System.out.println("¿Tiene asiento acompañanante? (SI-NO): ");
            String asientoAcompanante = sc.next();
            if(asientoAcompanante.equalsIgnoreCase("si"))
            {
                moto.setAsientoAcompañante(true);
            }
            else
            {
                moto.setAsientoAcompañante(false);
            }
            System.out.println(moto.toString());
        }


    }
}
