package UD_8.Coleccion_Ejercicios_Java_2ºExam;

public class Vehiculos_Y_Motos {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo(4, 100, 60, 550.5);
        Vehiculo v2 = new Vehiculo(4, 100, 60, 550.5);
        Vehiculo v3 = new Vehiculo(4, 200, 60, 550.5);

        System.out.println(v1.esIgual(v2));
        System.out.println(v1.esIgual(v3));
        v1.copia(v3);
        System.out.println(v1.getVelocidadMaxima());
        System.out.println(v1.esIgual(v3));

        
    }
}
/*
    1. Crea una clase llamada Vehículo:
    • Con los atributos privados numeroRuedas, velocidadMaxima, velocidadActual y
    * peso.
*/
class Vehiculo {
    private int numeroRuedas;
    private int velocidadMaxima;
    private int velocidadActual;
    private double peso;

/*
    • La clase dispondrá de un constructor que necesitará como parámetros los valores
    iniciales para todos sus atributos.
*/

    Vehiculo(int numeroRuedas, int velocidadMaxima, int velocidadActual, double peso){
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.peso = peso;
    }

/* 
    • Implementa los métodos necesarios para acceder a estos atributos de manera pública
    (getters y setters).
*/

    int getNumeroRuedas() {
        return numeroRuedas;
    }
    void setNumeroRuedas(int numeroRuedas){
        this.numeroRuedas=numeroRuedas;
    }

    int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }

    int getVelocidadActual(){
        return velocidadActual;
    }
    void setVelocidadActual(int velocidadActual){
        this.velocidadActual=velocidadActual;
    }

    double getPeso(){
        return peso;
    }
    void setPeso(double peso){
        this.peso=peso;
    }

/*
    • Crea un método público que devuelva boolean, llamado esIgual(Vehiculo vehiculo)
    que sirva para comparar dos vehículos, de manera que devuelva true o false
    dependiendo de si son iguales o no (se consideran iguales si el valor de todos sus
    atributos es el mismo). El método recibirá como argumento un objeto de la clase
    Vehículo.
*/

    public boolean esIgual(Vehiculo vehiculo){
        if (this.numeroRuedas==vehiculo.numeroRuedas &&
            this.velocidadMaxima==vehiculo.velocidadMaxima && 
            this.velocidadActual==vehiculo.velocidadActual && 
            this.peso==vehiculo.peso) {
                return true;
        } else {
                return false;
        }
        
    }

/*
    • Crea un método público que devuelva void llamado copia(Vehiculo vehiculo) que
    copiará los atributos de un vehículo en otro. El método recibirá como parámetro un
    objeto de la clase Vehículo del cual se copiarán sus valores.
*/
    void copia(Vehiculo vehiculo){
        this.numeroRuedas = vehiculo.numeroRuedas;
        this.velocidadMaxima = vehiculo.velocidadMaxima;
        this.velocidadActual = vehiculo.velocidadActual;
        this.peso = vehiculo.peso;
    }



}
