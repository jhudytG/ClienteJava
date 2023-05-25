/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import ws.WsOperaciones;
import ws.WsOperaciones_Service;

/**
 *
 * @author jhudy
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WsOperaciones_Service servicio = new WsOperaciones_Service();
        WsOperaciones cliente = servicio.getWsOperacionesPort();
        
        
        if(cliente.login("Jhudyt", "123")){
            System.out.println("Credenciales correctas");
        }else{
            System.out.println("Credenciales incorrectas");
        }
        
        if(cliente.procesarPago(5000, 500)!=1){
            System.out.println("Pago realizado con éxito\n"
            +"Su vuelto es " +cliente.procesarPago(5000, 500));
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    
}
