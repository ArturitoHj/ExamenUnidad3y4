import java.util.*;
public class empleado 
{
    String nombre, apellido_paterno, direccion, telefono;
    private double salario_mensual=5000;
    
    ArrayList<empleado> cafeteria = new ArrayList<empleado>();
    
    public empleado(String nombre, String apellido_paterno, String direccion, String telefono)
    {
        this.nombre=nombre;
        this.apellido_paterno=apellido_paterno;
        this.direccion=direccion;
        this.telefono=telefono;           
    }
    public void agregarempleado(empleado persona)
    {
      System.out.println("Se a agregado un nuevo empleado");
      cafeteria.add(persona);
    }
    public void mostrarempleados()
    {
        System.out.println(" ");
         System.out.println("     _________________________________________________________________________________________________________");
          System.out.println("     INDICE    NOMBRE    APELLIDO             DIRECCION                   TELEFONO          SALARIO MENSUAL");
          for (int i =0;i<cafeteria.size();i++ ) 
          {
          System.out.println("       "+(i+1)+"      "+ cafeteria.get(i).nombre+"     "+cafeteria.get(i).apellido_paterno+
                  "        "+cafeteria.get(i).direccion+"           "+cafeteria.get(i).telefono+"           "+salario_mensual);
          }
          System.out.println("     ________________________________________________________________________________________________________");
            System.out.println(" ");
    } 
    public void actualizaremepleado(int posision)
    {
        System.out.println(" Se ha actualizado datos del empleado "+cafeteria.get(posision).nombre+" "+ cafeteria.get(posision).apellido_paterno);
        cafeteria.get(posision).nombre = "Jesus";
    }
    public void eliminarempleado(int posision)
    {
       System.out.println("se ha eliminado el empleado "+ cafeteria.get(posision).nombre+" "+cafeteria.get(posision).apellido_paterno);
       cafeteria.remove(posision);
    }
}
