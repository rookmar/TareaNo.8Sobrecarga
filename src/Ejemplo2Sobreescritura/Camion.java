package Ejemplo2Sobreescritura;
// clase Carro que hereda los atributos de la clase vehiculo
public class Camion extends Vehiculo{
    //atriburo exclusivo de la clase carro
    private int ejes;

    /**
     * constructor que hereda los atributos lo ase por medio de super
     * @param marca
     * @param modelo
     */
    public Camion(String marca, int modelo) {
        super(marca, modelo);
        this.ejes=4;
    }

    /**
     * metodo get del nuevo atributo
     * @return
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * metodo set del nuevo atributo
     * @param ejes
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    /**
     *  metodo para mostrar los datos de la clase carro
     */
    public void MostrarDatos(){
        System.out.println("La marca del camion es :"+getMarca());
        System.out.println("El modelo del camion es: "+getModelo());
        System.out.println("El numero de ejes son: "+getEjes());
    }
}
