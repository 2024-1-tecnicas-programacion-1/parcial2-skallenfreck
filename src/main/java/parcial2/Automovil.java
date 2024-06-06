package parcial2;

public class Automovil extends Vehiculo{
   int numeroPuertas;
   TipoCombustible tipoCombustible;

   /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public Automovil(String marca, String modelo, int año,int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
   
    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
   @Override
   public String imprimirInformacion(){
        return marca+" "+modelo+" "+año+", "+numeroPuertas+" puertas, combustión a "+tipoCombustible;    
    }

   /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
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
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
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
