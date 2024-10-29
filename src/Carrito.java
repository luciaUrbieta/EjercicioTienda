import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrito<T extends Producto> {

    private Map<Producto, Integer> productos;

    public Carrito(){
        productos=new HashMap<>();
    }

    public void agregarProducto(T producto, int cantidad){
        if(productos.containsKey(producto)){
            int nuevaCantidad = productos.get(producto)+cantidad;
            productos.put(producto, nuevaCantidad);
        }
        else{
            productos.put(producto, cantidad);
        }
    }
    public void eliminarProducto(T producto, int cantidad){
        if(productos.containsKey(producto)){
            int nuevaCantidad = productos.get(producto)-cantidad;
            productos.put(producto, nuevaCantidad);
            if(nuevaCantidad==0){
                productos.remove(producto);
            }
        }
    }

    public String listarProductos() {

        StringBuilder retorno = new StringBuilder();

        retorno.append("-----------PRODUCTOS DEL CARRITO-----------");

        for(T producto : productos){
            retorno.append("---------------------------------------");
            retorno.append(producto.toString());
            retorno.append("---------------------------------------");
        }

        return retorno.toString();
    }



}
