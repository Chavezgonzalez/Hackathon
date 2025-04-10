package com.transporte.reportes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "reportes")
public class Reporte {
    @Id
    private String id;

    private String nombreReportante;
    private String telefono;
    private String placaCamion;
    private String descripcionFalla;
}
