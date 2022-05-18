public class Main {
    public static void main(String[] args) {
        suma (1,2, 3);//Llamamos a la función suma en el main y le damos valores
        Coche miCoche = new Coche();//creamos el objeto coche
        miCoche.sumapuertas();//le sumamos una puerta al objeto coche
        System.out.println(miCoche.puertas);//motramos el número de puertas que tiene el objeto coche
    }
    //primera parte del ejercicio
    public static void suma (int a, int b, int c) {//Creamos una función con tres parámetros que son números y se suman entre sí
       int result = a + b + c;//declaramos la variable result que almacenará el valor de los valores de la función suma
    }
    //segunda parte de ejercicio
    public static class Coche{//declaramos la variable coche
        public int puertas = 0;//declaramos la variable puertas
        public void sumapuertas(){//funcion que suma las puertas a el coche
            this.puertas++;
        }
    }
}