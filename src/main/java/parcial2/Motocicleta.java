package parcial2;

public class Motocicleta extends Vehiculo{
    TipoMotocicleta tipoMotocicleta;

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public String imprimirInformacion(){
        return marca+" "+modelo+" "+año+", tipo de motocicleta: "+tipoMotocicleta;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public String getMarca() {
        return marca;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public String getModelo() {
        return modelo;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public int getAño() {
        return año;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    @Override
    public void setAño(int año) {
        this.año = año;
    }
    
}