public class Ejerciciotema3 {
    public static void main(String[] args) {
        //valores de la suma
        suma(5, 19, 50);

        Coche MiCoche = new Coche();
        MiCoche.Sumarpuerta();
        System.out.println(MiCoche.puertas + " este es el numero de puertas del coche");

    }
    private static int suma(int a, int b, int c ) {
        System.out.println(a + b + c +" resultado de la suma");
        return a + b + c;
    }
    //la clase coche con la función de sumar brazo, la tuve que poner como static
    //ya que me daba problemas y fue la solución que me ofreció el programa
    static class Coche{
        public int puertas = 4;
        //función para incrementar numero de puertas
        public void Sumarpuerta() {
            this.puertas++;
        }
    }
    
}
