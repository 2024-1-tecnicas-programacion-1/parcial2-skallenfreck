package parcial2;

public class Vehiculo {
    String marca;
    String modelo;
    int año;

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public String imprimirInformacion(){
        return marca+" "+modelo+" "+año;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public String getMarca() {
        return marca;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public String getModelo() {
        return modelo;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public int getAño() {
        return año;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public void setAño(int año) {
        this.año = año;
    }
}
