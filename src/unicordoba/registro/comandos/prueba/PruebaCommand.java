/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.comandos.prueba;

import unicordoba.registro.comandos.ICommand;
import unicordoba.registro.principal.Principal;
import unicordoba.registro.ventana.prueba.VentanaPrueba;

/**
 *
 * @author Usuario
 */
public class PruebaCommand implements ICommand{

    @Override
    public void execute() {
        VentanaPrueba prueba = new VentanaPrueba();
        Principal.getSingleton().AddVentana(prueba);
    }
    
}
