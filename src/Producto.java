public class Producto {
    private static int generadorId = 0;
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(){
    }

    public Producto(String nombre, double precio, int cantidad){
        id=generadorId++;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public static int getGeneradorId() {
        return generadorId;
    }

    public static void setGeneradorId(int generadorId) {
        Producto.generadorId = generadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString(){
        return "\nId: " + id + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad;
    }
}
