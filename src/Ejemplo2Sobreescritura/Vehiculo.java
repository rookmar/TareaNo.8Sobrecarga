package Ejemplo2Sobreescritura;
// vehiculo sera nuestra superclase
public class Vehiculo {
    //atributos

    private String marca;
    private int modelo;

    /**primer constructor que recibe por parametros los atributos
     *
     * @param marca
     * @param modelo
     */
    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * metodo seter que recibe los datos en marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * metodo geter que mando los datos de modelo
     * @param modelo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * metodo seter que recibe los datos en marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *  metodo geter que mando los datos de modelo
     * @return
     */
    public int getModelo() {
        return modelo;
    }
}
