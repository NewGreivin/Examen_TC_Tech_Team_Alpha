/**
 * @author Greivin
 */
package Listas;

public interface Lista<T> {
    public Boolean Agregar (T t);
    public Boolean Eliminar (T t);
    public Void Ordenar();
    public T Buscar(Object id);
}
