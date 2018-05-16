import java.util.ArrayList;

public class cliente 
{
    String nombre, apellido_paterno, direccion, tipo_cliente;
    
     ArrayList<cliente> cafeteria = new ArrayList<cliente>();
    
    public cliente(String nombre, String apellido_paterno, String direccion, String tipo_cliente)
    {
        this.nombre=nombre;
        this.apellido_paterno=apellido_paterno;
        this.direccion=direccion;
        this.tipo_cliente=tipo_cliente;        
    }
    public void agregarcliente(cliente persona)
    {
      System.out.println("Se a agregado un nuevo cliente");
      cafeteria.add(persona);
    }
    public void mostrarclientes()
    {
          System.out.println(" ");
          System.out.println("   _______________________________________________________________________________________");
          System.out.println("     INDICE   NOMBRE     APELLIDO              DIRECCION                   TIPO CLIENTE");
          for (int i =0;i<cafeteria.size();i++ ) 
          {
          System.out.println("        "+(i+1)+"     "+ cafeteria.get(i).nombre+"      "+cafeteria.get(i).apellido_paterno+
                  "        "+cafeteria.get(i).direccion+"           "+cafeteria.get(i).tipo_cliente);
          }
          System.out.println("   _______________________________________________________________________________________");
          System.out.println(" ");
    }
    public void actualizarclientes(int posision)
    {
        System.out.println(" Se ha actualizado datos del cliente "+cafeteria.get(posision).nombre+" "+ cafeteria.get(posision).apellido_paterno);
        cafeteria.get(posision).nombre = "Jesus";
    }
    public void eliminarclientes(int posision)
    {
       System.out.println("se ha eliminado el cliente "+ cafeteria.get(posision).nombre+" "+cafeteria.get(posision).apellido_paterno);
       cafeteria.remove(posision);
    }
}
