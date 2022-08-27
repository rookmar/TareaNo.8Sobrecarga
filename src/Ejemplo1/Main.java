package Ejemplo1;

public class Main {

    public static void main(String[] args) {
    // crea el objeto manda a llamar el constructor con parametros de la clase vehiculo
        Vehiculo carro1 = new Vehiculo("Honda","2020");
        carro1.DatosDelVehiculo();//llama el metod DatosDelVehiculo
        //crea un objeto y llama al constructor sim parametros.
        Vehiculo carro2 = new Vehiculo();
        carro2.DatosDelVehiculo(10000);//llama al metodo y le manda el kilometraje
    }
}
