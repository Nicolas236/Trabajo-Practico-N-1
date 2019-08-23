package Clases.Clase_6;

public class Principal {

    public static void main(String[] args) {

        Abuelo abu = new Abuelo ("Osvaldo", "m", 67);
        Padre papa = new Padre("Juan", "m",40);
        Hijo hij = new Hijo("Luis", "m",20  );

        System.out.println(papa.nada());
    }
}
