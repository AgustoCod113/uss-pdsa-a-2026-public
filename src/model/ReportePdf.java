package model;

import java.util.List;

public class ReportePdf implements Reporte {

    @Override
    public void exportar(List<String> datos) {
        System.out.println("Exportando en Pdf"+datos);  
    }
    
}
