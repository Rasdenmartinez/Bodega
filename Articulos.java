package BodegaListas;

public class Articulos {
    String nombre="";
    String codigoBarras="";
    double precio=0.0;
    int existencia=0;
    public Articulos() {
    }
    public Articulos(String nombre, String codigoBarras, double precio, int existencia) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.existencia = existencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    @Override
    public String toString() {
        return "Articulos [codigoBarras=" + codigoBarras + ", existencia=" + existencia + ", nombre=" + nombre
                + ", precio=" + precio + "]";
    }
    
    
}
