package app;

import model.ConexionDB;
import model.PoolConexion;

public class Main {

    public static void main(String[] args) {

        // Pool máximo de 3 conexiones
        PoolConexion pool = new PoolConexion(3);

        // Solicitud 1
        ConexionDB c1 = pool.obtenerConexion();

        // Solicitud 2
        ConexionDB c2 = pool.obtenerConexion();

        // Solicitud 3
        ConexionDB c3 = pool.obtenerConexion();

        // Solicitud 4 (ya no hay disponibles)
        ConexionDB c4 = pool.obtenerConexion();

        // Liberar una conexión
        pool.liberarConexion(c2);

        // Solicitud 5 (reutiliza la conexión liberada)
        ConexionDB c5 = pool.obtenerConexion();

        // Liberar conexiones
        pool.liberarConexion(c1);
        pool.liberarConexion(c3);
        pool.liberarConexion(c5);

        // Nueva solicitud reutilizando conexiones
        ConexionDB c6 = pool.obtenerConexion();
    }
}