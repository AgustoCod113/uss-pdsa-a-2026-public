package model;

public class ConexionDB {

    private int id;
    private boolean disponible;

    public ConexionDB(int id) {
        this.id = id;
        this.disponible = true;
    }

    // Abrir conexión
    public void abrir() {
        disponible = false;
        System.out.println("Conexion " + id + " abierta");
    }

    // Cerrar conexión
    public void cerrar() {
        disponible = true;
        System.out.println("Conexion " + id + " cerrada");
    }

    // Verificar disponibilidad
    public boolean estaDisponible() {
        return disponible;
    }

    public int getId() {
        return id;
    }
}