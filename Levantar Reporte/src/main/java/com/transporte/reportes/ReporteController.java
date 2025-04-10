package com.transporte.reportes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(origins = "*") // Permitir conexión desde tu formulario HTML
public class ReporteController {

    @Autowired
    private ReporteRepository reporteRepository;

    @PostMapping
    public Reporte crearReporte(@RequestBody Reporte reporte) {
        return reporteRepository.save(reporte);
    }
}
