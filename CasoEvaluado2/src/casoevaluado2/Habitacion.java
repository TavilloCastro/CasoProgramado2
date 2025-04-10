package casoevaluado2;

import javax.swing.JOptionPane;

public class Habitacion {

    int numero; //Numero del cuarto
    String estado; //Indica si el cuarto esta ocupado, limpio, sucio, etc
    String tipo; //indica si es doble o simple
    int precio; //costo del cuarto

    public Habitacion(int numero, String estado, String tipo, int precio) {
        this.numero = numero;
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
