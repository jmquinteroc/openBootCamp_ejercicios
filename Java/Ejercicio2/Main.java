package Ejercicio2;
public class Main {
    public static void main(String[] args) {
        numberCheck();
        numberWhile();
        numberDoWhile();
        numberFor();
        estaciones();
        
    }

    public static void numberCheck() {
        System.out.println("Ingresa un numero");
        int numeroIf = Integer.parseInt(System.console().readLine());
        if (numeroIf>0){
            System.out.println("Es un numero positivo");
        }else if (numeroIf==0){
            System.out.println("Es un numero igual a cero");
        }else{
            System.out.println("Es un numero negativo");
        }
    } 

    public static void numberWhile(){
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println("numero While vale: "+numeroWhile);
            numeroWhile++;
        }
    }

    public static void numberDoWhile(){
        int numeroDoWhile=1;
            do{
                System.out.println("numero doWhile vale: "+numeroDoWhile);
                numeroDoWhile++;
            }
            while(numeroDoWhile==3);

    }

    public static void numberFor(){
        int numeroFor=0;
            for(numeroFor=0; numeroFor<=3; numeroFor++)
            {
                System.out.println("numero For vale: "+numeroFor);
            }

    }

    public static void estaciones(){
        String msj="", estacion="";
        System.out.println("Ingresa una estacion");
        estacion = System.console().readLine();
        switch(estacion.toLowerCase()){
            case "invierno": msj="Estamos en Invierno";
                break;
            case "verano": msj="Estamos en Verano";
                break;
            case "otono": msj="Estamos en Otono";
                break;
            default: msj="Estamos en Primavera";
                break;
        }
        System.out.println(msj);
    }
    
}
