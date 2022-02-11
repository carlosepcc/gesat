package com.example.gesat.controlador;
import java.util.List;
import com.example.gesat.controlador.respuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisor;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.NewReporteTRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.UpReporteTRequest;
import com.example.gesat.servicio.EstadoRevisorService;
import com.example.gesat.servicio.ReporteTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reportetecnico")
@CrossOrigin("*")
public class ReporteTController {
    
    @Autowired
    @Qualifier("IReporteTService")
    private ReporteTService service;
   
   @Autowired
   @Qualifier("IEstadoRevisorService")
   private EstadoRevisorService estadoRevisorservice;
   
    @GetMapping()
    public ResponseEntity<List<ReporteTResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<ReporteTResponse> findByID(Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    @PostMapping
    public ResponseEntity<ReporteTResponse> save(@RequestBody NewReporteTRequest reporteT) {
        return ResponseEntity.ok(service.save(reporteT));
    }
    @PutMapping(path = "/agregarEstadoRevisor")
        public ResponseEntity<ReporteTResponse> agregarEstadoRevisor(@RequestBody AddEstadoRevisor reporteT) {
            return ResponseEntity.ok(estadoRevisorservice.agregarEstadoRevisor(reporteT));
    }
   
    @PutMapping
    public ResponseEntity<ReporteTResponse> edit(@RequestBody UpReporteTRequest reporteT) {
        return ResponseEntity.ok(service.edit(reporteT));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
}
}