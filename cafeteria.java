/*@author Arturo Hernandez Jimenez*/
public class cafeteria 
{
    String nombre;
    public cafeteria(String nombre)
    {  
        this.nombre=nombre; 
    }
    public void bienvenida()
    {
        System.out.println("                     **************************************");
        System.out.println("                          CAFETERIA : "+nombre);
        System.out.println("                     **************************************");
        System.out.println("        ");
    }
    

    public static void main(String[] args) 
    {
        cafeteria dos= new cafeteria("Los 3 Hermanos");
        dos.bienvenida();
        cliente uno= new cliente("Arturo","Hernandez","Calle Higo #12","Platino");
        uno.agregarcliente(new cliente("Alberto","Gomez","Snta Rosa Calle florita #48","general"));
        uno.agregarcliente(new cliente("Nicolas","Diaz","Pblo Nuevo calle Higuera #34","frecuente"));
        uno.agregarcliente(new cliente("Manuel","Lopez","Sn Martin Calle virgilio #95","Genaral"));
        uno.agregarcliente(new cliente("Carlos","Luis","Odisea calle hinojosa #36","Platino"));
        uno.mostrarclientes();
        uno.actualizarclientes(0);
        uno.mostrarclientes();
        uno.eliminarclientes(1);
        uno.mostrarclientes();
    
        empleado tres= new empleado("Arturo","Hernandez","Calle Higo #12","9515103912");
        tres.agregarempleado(new empleado("Efrain","Mendoza","Guelaguetza calle higo #12","9515103912"));
        tres.agregarempleado(new empleado("Artemio","Hernandez","Reforma calle mejia #15","9515419512"));
        tres.agregarempleado(new empleado("Arturo","Jimenez","Azteca calle baron #91","9511583510"));
        tres.agregarempleado(new empleado("Mariana","Alvarado","Etla calle gijon #65","9511643918"));
        tres.mostrarempleados();
        tres.actualizaremepleado(3);
        tres.mostrarempleados();
        tres.eliminarempleado(1);
        tres.mostrarempleados();
        
    }
    
}
