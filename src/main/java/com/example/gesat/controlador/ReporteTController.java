package com.example.gesat.controlador;
import java.util.List;
import com.example.gesat.controlador.respuesta.ReporteTResponse;
import com.example.gesat.controlador.solicitud.NewReporteTRequest;
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
    @Qualifier("reporteTServiceImplementation")
    private ReporteTService service;

    @GetMapping(path = "/findAll")
    public ResponseEntity<List<ReporteTResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping(path="/findById")
    public ResponseEntity<ReporteTResponse> listarPorId(Integer id) {
        return ResponseEntity.ok(service.listarPorID(id));
    }

    @PostMapping
    public ResponseEntity<ReporteTResponse> save(@RequestBody NewReporteTRequest reporteT) {
        return ResponseEntity.ok(service.save(reporteT));
    }
   
    @PutMapping
    public ResponseEntity<ReporteTResponse> edit(@RequestBody NewReporteTRequest reporteT) {
        return ResponseEntity.ok(service.edit(reporteT));
    }

    @DeleteMapping
    public ResponseEntity<Integer[]> delete(@RequestBody Integer[] ids) {
        service.delete(ids);
        return ResponseEntity.ok(ids);
}
}