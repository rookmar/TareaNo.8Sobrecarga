package Ejemplo1;

public class Vehiculo {
    // atributos
    private String marca;
    private String modelo;
//sobre carga de constructores

    /**
     * constructor con parametros
     * @param marca
     * @param modelo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * constructor sin paramestos
     */
    public Vehiculo(){

    }
    //sobre carga de metodos en este caso son 2 que es DatosDelVehiculo

    /**
     * metodo que imprime los dotos de los atributos marca y modelo
     */
    public void DatosDelVehiculo(){
        System.out.println("La marca del Vehiculo es:  "+marca);
        System.out.println("El modelo del Vehiculo es: "+modelo);
    }

    /**
     * metdo que ingrese un kilometraje como numero entero
     * @param kilometraje
     */
    public void DatosDelVehiculo(int kilometraje){
        System.out.println("El kilometraje del Vehiculo es "+kilometraje);

    }
}
