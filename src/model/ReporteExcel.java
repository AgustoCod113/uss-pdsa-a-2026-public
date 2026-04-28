package model;

import java.util.List;

public class ReporteExcel implements Reporte {

    @Override
    public void exportar(List<String> datos) {
        System.out.println("Exportando en Excel"+datos);  
    }
    
}
