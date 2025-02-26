package UD_8.Coleccion_Ejercicios_Java_2ºExam;

public class Vehiculos_Y_Motos {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo(4, 100);
        Vehiculo v2 = new Vehiculo(4, 100);
        Vehiculo v3 = new Vehiculo(4, 20);

        System.out.println(v1.esIgual(v2));
        System.out.println(v1.esIgual(v3));
        v1.copia(v3);
        System.out.println(v1.getVelocidad());
        System.out.println(v1.esIgual(v3));

        v3.acelerar(60);
        System.out.println(v3.getVelocidad());
        v3.frenar(40);
        System.out.println(v3.getVelocidad());
        v3.frenar(40);
        System.out.println(v3.getVelocidad());
        v3.frenar(40);
        System.out.println(v3.getVelocidad());

        Moto moto1 = new Moto(2,100,10); 
        moto1.repostar(10);
        System.out.println(moto1.getGasolina());
        moto1.repostar(10);
        System.out.println(moto1.getGasolina());
        moto1.repostar(10);
        System.out.println(moto1.getGasolina());
        moto1.consumir(20);
        System.out.println(moto1.getGasolina());
        moto1.consumir(20);
        System.out.println(moto1.getGasolina());

        Moto HalconCallejero = new Moto(2,10,30);
        HalconCallejero.acelerar(90);
        HalconCallejero.consumir(20);
        HalconCallejero.frenar(40);
        System.out.println("Al Halcon le queda "+HalconCallejero.getGasolina()+" litros de gasolina");
        HalconCallejero.acelerar(30);
        HalconCallejero.consumir(5);
        HalconCallejero.frenar(100);
        HalconCallejero.repostar(20);
        System.out.println("Al Halcon le queda "+HalconCallejero.getGasolina()+" litros de gasolina");


    }
}
/*
    1. Crea una clase llamada Vehículo:
    • Con los atributos privados numeroRuedas, velocidadMaxima, velocidadActual y
    * peso.
*/
class Vehiculo {
    private int numeroRuedas;
    private int velocidad;
    

/*
    • La clase dispondrá de un constructor que necesitará como parámetros los valores
    iniciales para todos sus atributos.
*/
    Vehiculo(){}
    Vehiculo(int numeroRuedas, int velocidad){
        this.numeroRuedas = numeroRuedas;
        this.velocidad = velocidad;
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

    int getVelocidad(){
        return velocidad;
    }
    void setVelocidadMaxima(int velocidad){
        this.velocidad=velocidad;
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
            this.velocidad==vehiculo.velocidad) {
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
        this.velocidad = vehiculo.velocidad;
    }

/*
    • void acelerar (int mas): Acelera la cantidad “mas” siempre que la velocidad
    resultante sea inferior a 120
*/
    void acelerar (int mas){
        System.out.println(getClass().getSimpleName()+": va a acelerar");
        if (this.velocidad < 120) {
            this.velocidad += mas;
            if (this.velocidad > 120) {
                this.velocidad = 120;
            }

        }
    }
/*
    • void frenar (int menos) : Reduce la velocidad la cantidad “menos” siempre que la
    velocidad resultante no sea negativa.
*/
    void frenar (int menos){
        this.velocidad -= menos;
        if (this.velocidad <= 0) {
            System.out.println(getClass().getSimpleName()+": Hemos parado");
            this.velocidad = 0;
        } else {
            System.out.println(getClass().getSimpleName()+": va a frenar");
            
        }
    }
/*
    Estos métodos deben informar por pantalla que pertenecen a la clase Vehiculo.
    Y si quiero tambien saber el nombre del objeto?(pregunta mia)
*/

}

class Moto extends Vehiculo {
    private int gasolina;

    Moto(){}
    Moto(int numeroRuedas, int velocidad, int gasolina){
        super(numeroRuedas,velocidad);
        this.gasolina=gasolina;

    }

    int getGasolina(){
        return gasolina;
    }

    void repostar(int mas){
        System.out.println(getClass().getSimpleName()+"Repostando... "+ mas+" litros.");
        if (this.gasolina < 30) {
            this.gasolina += mas;
            if (this.gasolina > 30) {
                this.gasolina = 30;
            }
        }
    }

    void llenar(){
        this.gasolina=30;
    }

    void consumir (int menos){        
        if (this.gasolina - menos <= 0) {
            System.out.println("No puedes consumir tanto en este trayecto, te quedarás tirado");
        } else {
            System.out.println(getClass().getSimpleName()+": consumiendo en el trayecto");
            this.gasolina -= menos;
        }
    }
}
