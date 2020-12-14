/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_array;

/**
 *
 * @author dam
 */
public class Concesionario {
    Empleado [] empleados;
    Comision [] comisiones;
    
    
    public Concesionario(int numeroEmpleados) {
        empleados = new Empleado[numeroEmpleados];
        comisiones = new Comision[5];
        comisiones[0] = new Comision(10000f, 0.05f);
        comisiones[1] = new Comision(10000f, 0.05f);
        comisiones[2] = new Comision(10000f, 0.05f);
        comisiones[3] = new Comision(10000f, 0.05f);
        comisiones[4] = new Comision(10000f, 0.05f);
        
    }
    private void crearEmpleados(){
        
        for(int pos = 0; pos< empleados.length;pos++){
           //empleados[pos] = new Empleado(nombre);
        }
    }
    
    public void pedirNombres(){
        for(int pos = 0; pos < empleados.length; pos++){
            String nombre;
            nombre = Utilidades.Utilidades.pedirPalabra("");
            empleados[pos] = new Empleado(nombre);
            
        }
            
    }
    
    public void informe(){
        System.out.println("Nombre importe de ventas");
        float importecomision;
        for(int pos = 0; pos< empleados.length;pos++){
            System.out.println(empleados[pos].getNombre());
            System.out.println("\t" + empleados[pos].getImporte());
            
            importecomision = empleados[pos].getImporte()*busquedaComision(empleados[pos].getImporte());
            System.out.println("\t"+importecomision);
        }
    }
    
    public void pedirVetnas(){
        int codigoEmpleado;
        float ventas;
        codigoEmpleado = Utilidades.Utilidades.PedirInt("Codigo del vendedor", -1, empleados.length-1);
        while(codigoEmpleado!=-1){
            ventas=  Utilidades.Utilidades.pedirNumeroEntero("Ventas del empleado" + empleados[codigoEmpleado].getNombre(), 0, 2);
        }
    }
    
    public float busquedaComision(float valor){
        
        boolean encontrado = false;
        int posicion = 0;
        while(!encontrado && posicion < comisiones.length){
            if(valor < comisiones[posicion].getImporte())
                encontrado = true;
                        else
                posicion++;
            
        }
        return comisiones[posicion].getComision();
    }
    
    public String mayorComision(){
        int pos = 1;
        int mayor = 0;
        
        for (int pos=1; pos < empleados.length ;pos++){
            if(empleados[pos].getImporte()>empleados[mayor].getImporte())
                mayor=pos;
        }
        return empleados[mayor].getNombre();
    }
    
    public String menorComision(){
        int pos = 1;
        int menor = 0;
        
        for (int pos=1; pos < empleados.length ;pos++){
            if(empleados[pos].getImporte()<empleados[menor].getImporte())
                menor=pos;
        }
        return empleados[menor].getNombre();
    }
}
