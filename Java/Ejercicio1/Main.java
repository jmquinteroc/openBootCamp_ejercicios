package Ejercicio1;
class Main {
    public static void main(String[] args) {
      miCoche coche = new miCoche();
      //System.out.println("La suma es " + sumar(2,4));
      System.out.println("puertas originales " + coche.getPuertas());
      System.out.println("nuevas puerta "+ coche.setPuertas(1));
      System.out.println(coche.getPuertas());
    }
  
    //static int sumar(int vnum1, int vnum2) {
    //  return vnum1 + vnum2;
    //}
  }
  
  class miCoche {
    int puertas = 4;
    String color = "Azul";
  
    public int getPuertas() {
      return puertas;
    }
  
    public int setPuertas(int vCuantas) {
      puertas= puertas + vCuantas;
      return  puertas;
    }
  }
  