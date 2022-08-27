package Ejemplo2Sobreescritura;
// clase Carro que hereda los atributos de la clase vehiculo

public class  Carro extends Vehiculo {
    //atriburo exclusivo de la clase carro
    private int ejes;

    /**
     * constructor que hereda los atributos lo ase por medio de super
     * @param marca
     * @param modelo
     */
    public Carro(String marca, int modelo) {
        super(marca, modelo);
        this.ejes=2;
    }

    /**
     *  metodo set del nuevo atributo
     * @param ejes
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    /**
     *  metodo get del nuevo atributo
     * @return
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * metodo para mostrar los datos de la clase carro
     */
    public void MostrarDatos(){
        System.out.println("la marca del carro es: "+getMarca());
        System.out.println("El modelo del carro es: "+getModelo());
        System.out.println("El numero de ejes son: "+getEjes());

    }
}
