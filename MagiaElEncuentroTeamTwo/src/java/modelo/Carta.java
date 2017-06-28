
package modelo;

/**
 *
 * @author Cristóbal
 */
public class Carta {
    private int id;
    private String nombre;
    private int costo;
    private String descripcion;
    
    public Carta(int id, String nombre,int costo,String descripcion){
        setId(id);
        setNombre(nombre);
        setCosto(costo);
        setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        if(id !=0){
            this.id = id;
        }
        else{
            System.out.println("el id debe ser mayor a 0");
        }
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length() !=0){
            this.nombre = nombre;
        }
        else{
            System.out.println("el nombre de la carta debe");
        }
    }

    public void setCosto(int costo) {
        if(costo !=0){
            this.costo = costo;
        }
        else{
            System.out.println("el costo de la carta debe ser mayor a 0");
        }
    }

    public void setDescripcion(String descripcion) {
        if(descripcion.trim().length() !=0){
            this.descripcion = descripcion;
        }
        else{
            System.out.println("La descripcion de la carta debe ser mayor de 1 caracter");
        }
    }
}
