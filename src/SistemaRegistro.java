import java.util.HashMap;
import java.util.Map;

public class SistemaRegistro <T extends Producto> {
    private Map<Integer, T> productos;

    public SistemaRegistro(){
        this.productos = new HashMap<>();
    }

    public void agregarProducto(T producto){
        productos.put(producto.getId(), producto);
    }

    public void eliminarProducto(T producto){
        productos.remove(producto.getId(), producto);
    }

    public Producto obtenerProducto(int id) {
        return productos.get(id);
    }

    public void agregarAlCarrito(){

    }

    public void eliminarDelCarrito(){

    }

    public String listarProductos(){

        StringBuilder retorno = new StringBuilder();

        for(T producto : productos.values()){
            retorno.append(producto.toString());
            retorno.append("---------------------------------------");
        }

        return retorno.toString();
    }


}
