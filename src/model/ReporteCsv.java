package model;

import java.util.List;

public class ReporteCsv implements Reporte {

    @Override
    public void exportar(List<String> datos) {
        System.out.println("Exportando en Csv"+datos);  
    }
    
}
