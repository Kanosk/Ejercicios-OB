public class Ejerciciotema9{
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Pepe";
        cliente.edad = 38;
        cliente.telefono = 633258852;
        cliente.credito = 420.16;
        System.out.println("soy "+ cliente.nombre + " tengo "+ cliente.edad + " años y me puedes llamar al " + cliente.telefono + ", tengo " + cliente.credito + "€ de credito actualmente" );

        trabajador.nombre = "Juan";
        trabajador.edad = 53;
        trabajador.telefono = 633258853;
        trabajador.salario = 1500.25;
        System.out.println("soy "+ trabajador.nombre + " tengo "+ trabajador.edad + " años y me puedes llamar al " + trabajador.telefono + " y actualmente estoy cobrando " + trabajador.salario + " € al mes" ); 
    }
    }
    class Persona{
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona{
        double credito;
    }
    class Trabajador extends Cliente{
        double salario;
    }
