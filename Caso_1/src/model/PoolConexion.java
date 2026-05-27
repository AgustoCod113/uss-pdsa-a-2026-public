package model;

import java.util.ArrayList;
import java.util.List;

public class PoolConexion {

    private List<ConexionDB> conexiones = new ArrayList<>();
    private int maximo;

    public PoolConexion(int maximo) {

        this.maximo = maximo;

        // Crear máximo de conexiones
        for (int i = 1; i <= maximo; i++) {
            conexiones.add(new ConexionDB(i));
        }
    }

    // Obtener conexión disponible
    public ConexionDB obtenerConexion() {

        for (ConexionDB conexion : conexiones) {

            if (conexion.estaDisponible()) {

                conexion.abrir();

                System.out.println("Conexion "
                        + conexion.getId()
                        + " asignada");

                return conexion;
            }
        }

        // Si todas están ocupadas
        System.out.println("No hay conexiones disponibles");
        return null;
    }

    // Liberar conexión
    public void liberarConexion(ConexionDB conexion) {

        if (conexion != null) {

            conexion.cerrar();

            System.out.println("Conexion "
                    + conexion.getId()
                    + " liberada");
        }
    }
}