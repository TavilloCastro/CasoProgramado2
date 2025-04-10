package casoevaluado2;

import javax.swing.JOptionPane;

public class Hotel {

    private Habitacion habitaciones[][] = new Habitacion[5][5];

    public Hotel() {

        Habitaciones();
    }
    
    //Metodo para guardar info de habitaciones
    private void Habitaciones() {

        habitaciones[0] = new Habitacion[]{
            new Habitacion(101, "Ocupada", "Simple", 30),
            new Habitacion(102, "Libre", "Doble", 30),
            new Habitacion(103, "Ocupada", "Simple", 30),
            new Habitacion(104, "Libre", "Doble", 30),
            new Habitacion(105, "Sucio", "Simple", 40)
        };
        habitaciones[1] = new Habitacion[]{
            new Habitacion(201, "Libre", "Simple", 30),
            new Habitacion(202, "Ocupada", "Doble", 30),
            new Habitacion(203, "Libre", "Simple", 30),
            new Habitacion(204, "Libre", "Doble", 30),
            new Habitacion(205, "Sucio", "Simple", 40)

        };
        habitaciones[2] = new Habitacion[]{
            new Habitacion(301, "Libre", "Simple", 30),
            new Habitacion(302, "Ocupada", "Doble", 30),
            new Habitacion(303, "Ocupada", "Simple", 30),
            new Habitacion(304, "Libre", "Doble", 30),
            new Habitacion(305, "Sucio", "Simple", 40)
        };
        habitaciones[3] = new Habitacion[]{
            new Habitacion(401, "Libre", "Simple", 30),
            new Habitacion(402, "Libre", "Doble", 30),
            new Habitacion(403, "Libre", "Simple", 30),
            new Habitacion(404, "Libre", "Doble", 30),
            new Habitacion(405, "Sucio", "Simple", 40)
        };
        habitaciones[4] = new Habitacion[]{
            new Habitacion(501, "Ocupada", "Simple", 30),
            new Habitacion(502, "Ocupada", "Doble", 700),
            new Habitacion(503, "Ocupada", "Simple", 60),
            new Habitacion(504, "Ocupada", "Doble", 90),
            new Habitacion(505, "Ocupada", "Simple", 80)
        };
    }
    
    
/*public void verHabitaciones() {
    
    String tabla = "Numero         Estado     Tipo                Precio\n"
                + "-----------------------------------------------------------\n";
    for (Habitacion[] : habitaciones){
        tabla += habitaciones.
    }
}*/
    
    //Metodo para ver las habitaciones
    public void verHabitaciones() {
        JOptionPane.showMessageDialog(null, "Perdon, no logre hacer el cuadro  👎");
        for (int i = 0; i < habitaciones.length; i++) {
            JOptionPane.showMessageDialog(null, "Piso " + (i + 1));
            for (Habitacion j : habitaciones[i]) {
                JOptionPane.showMessageDialog(null, "Habitación " + j.getNumero() + ": " + j.getEstado() + " - " + j.getTipo() + " - $" + j.getPrecio());
            }
        }
    }

    //Metodo para ver info del hotel
    public void estadoDelHotel() {
        int libres = 0, ocupadas = 0, sucias = 0;
        double ganancia = 0.0;

        for (Habitacion[] piso : habitaciones) {
            for (Habitacion i : piso) {
                switch (i.getEstado()) {
                    case "Libre":
                        libres++;
                        break;
                    case "Ocupada":
                        ocupadas++;
                        ganancia += i.getPrecio();
                        break;
                    case "Sucio":
                        sucias++;
                        break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Total de habitaciones libres: " + libres + "\n"
                + "Total de habitaciones ocupadas: " + ocupadas + "\n"
                + "Total de habitaciones sucias: " + sucias + "\n"
                + "Ganancia actual: $" + ganancia);
    }
}
