package Project;
import java.util.ArrayList;

public class Propiedad {
    
    //Atributos de la clase Propiedad
    private String dirrecion;
    private String telefono;
    private String ciudad;
    private String tipo;
    private String tamano;
    private String ambiente;
    private ArrayList<Cuarto> lista_cuartos = new ArrayList<>();
    
    //Funciones Get
    
    public String getDireccion()
    {
        return this.dirrecion;
    }
    
    public String getTelefono()
    {
        return this.telefono;
    }
    
    public String getCiudad()
    {
        return this.ciudad;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public String getTamano()
    {
        return this.tamano;
    }
    
    public String getAmbiente()
    {
        return this.ambiente;
    }
    
    public ArrayList getCuarto()
    {
        return this.lista_cuartos;
    }
    
    //Funciones Set
    public void setDirecion(String direccion)
    {
        this.dirrecion = direccion;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public void setTamaño(String tamano)
    {
        this.tamano = tamano;
    }
    
    public void setAmbiente(String ambiente)
    {
        this.ambiente = ambiente;
    }
    
    public void setLista_cuartos(ArrayList lista_cuartos)
    {
        this.lista_cuartos = lista_cuartos;
    }
    
    //Funcion toString()
    
    @Override
    public String toString()
    {
        return "\nDirección: " + this.getDireccion() +
                "\nTeléfono: " + this.getTelefono() +
                "\nCiudad: " + this.getCiudad() +
                "\nTipo: " + this.getTipo() +
                "\nTamano: " + this.getTamano() +
                "\nAmbiente: " + this.getAmbiente();
    }
    
    //Constructores de la clase propieda
    
    Propiedad(String new_direccion,  String new_telefono, String new_ciudad, String new_tipo, String new_tamano, String new_ambiente)
    {
        this.setDirecion(new_direccion);
        this.setTelefono(new_telefono);
        this.setCiudad(new_ciudad);
        this.setTipo(new_tipo);
        this.setTamaño(new_tamano);
        this.setAmbiente(new_ambiente);
    }
    
}
