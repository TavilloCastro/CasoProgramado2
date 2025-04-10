package casoevaluado2;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    Hotel hotel = new Hotel();

    //Msj Bienvenida
    public void bienvenida() {
        JOptionPane.showMessageDialog(null, "Bienvenid@ al Sistema de Reservaciones \n     Reservapp");
    };
    //Msj para la salida del app
    public void salir() {
        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
    }

    //Metodo del menu principal
    public void menuPrincipal() {
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n\n 1. Ver Habitaciones. \n 2. Estado del Hotel. \n 3. Modificar Informacion. \n 4. Salir."));

        switch (opcion) {
            case 1:
                hotel.verHabitaciones();
                menuPrincipal();
                break;
            case 2:
                hotel.estadoDelHotel();
                menuPrincipal();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"No me dio chance 😭");
                menuPrincipal();
                break;
            case 4:
                salir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida, intente nuevamente.");
                menuPrincipal();
                break;
        }

    }

}
