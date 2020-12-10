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
public class EmpresaInformatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa miEmpresa = new Empresa(4);
        int codigo;
        codigo = miEmpresa.pedirCodigo();
        
        while(codigo != -1){
             codigo = miEmpresa.pedirCodigo();
        }
        
        
    }
    
}
