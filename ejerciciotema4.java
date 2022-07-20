public class ejerciciotema4 {

    public static void main (String [] aStrings){
        // esta es la primera parte (Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.)
        int numeroif = 0;

        if (numeroif<0){
            System.out.println(numeroif + " es negativo (ejercicio if/else)");
        }else if (numeroif>0){
            System.out.println(numeroif + " es positivo (ejercicio if/else)");
        }else {
            System.out.println(numeroif + " es el numero que habia (ejercicio if/else)");
        }
        //while (Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle)
        int numerowhile = 0;
        while (numerowhile < 3) {
           numerowhile = numerowhile + 1;
           System.out.println(numerowhile + " es el valor tras incrementar y es lo que vale ahora (ejercicio while)");
        }
        // do while (Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.)
        int numerodo = 2;
        do{
           numerodo++ ;
           System.out.println("el " + numerodo + " es el ejemplo de do while que solo se muestra una vez (ejercicio DoWhile)");
        } while (numerodo <= 2);

        //for Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3
        // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for ( int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Behold this example of a for loop " + numeroFor);
        }//lo puse en ingles porque me aburria ya 
        
        //Switch de estaciones
        String estacion = "Verano";
        switch(estacion){
            case "Primavera":
                System.out.println("Estamos en Primavera asi que quedate en casa y juega, que hay polen fuera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano asi que enciende el aire y quedate en casa y juega, que hace calor fuera");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño y como hace fresco quedate en casa y juega");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno y como hace fresco quedate en casa y juega");
                break;
            case default:
                System.out.println("Esta estación no me la enseñaron en la escuela");

        }
    } 
}   
