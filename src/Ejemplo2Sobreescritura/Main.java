package Ejemplo2Sobreescritura;

public class Main {
    public static void main(String[] args) {
//crear el obejo no. 1 mandar a llamar el costructor de la clase carro
    Carro carro1 = new Carro("Mazda",2020);
    carro1.MostrarDatos();
    //crear el objeto no. 2 mandar a llamar el constructor de la clase camion
    Camion camion1 = new Camion("Hino",2000);
    camion1.MostrarDatos();

    }

}
