/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresainformatico;

/**
 *
 * @author dam
 */
public class Empresa {
    
    Trabajador [] trabajadores;

    public Empresa(int nTrabajadores) {
        trabajadores = new Trabajador[nTrabajadores];
    }
    
    public int pedirCodigo(){
        
        int codigo;
        
        codigo = Utilidades.Utilidades.PedirInt("Especifique el numero del trabajador", -1, trabajadores.length -1);
        
        return codigo;
    }
    
    
    
}
