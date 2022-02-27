package com.example.gesat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.NewArtefactoRequest;
import com.example.gesat.controlador.solicitud.ArtefactoSolicitud.UpArtefactoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.NewHallazgoRequest;
import com.example.gesat.controlador.solicitud.HallazgoSolicitud.UpHallazgoRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.AddEstadoRevisorRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.NewReporteTRequest;
import com.example.gesat.controlador.solicitud.ReporteTecnicoSolicitud.UpReporteTRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.NewUsuarioRequest;
import com.example.gesat.controlador.solicitud.UsuarioSolicitud.UpUsuarioRequest;
import com.example.gesat.repositorio.entidad.Users;
import com.example.gesat.servicio.ArtefactService;
import com.example.gesat.servicio.EstadoRevisorService;
import com.example.gesat.servicio.HallazgoTService;
import com.example.gesat.servicio.ReporteTService;
import com.example.gesat.servicio.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class GesatApplicationTests {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    private UserService service;

    @Test
    public void crearUsuarioTest() throws Exception {
        NewUsuarioRequest us = new NewUsuarioRequest();
        us.setNombre("Tester");
        us.setApellidos("Tester");
        List<Users.Rol> l = new ArrayList<Users.Rol>();
        l.add(Users.Rol.Administrador);
        us.setRoles(l);
        us.setUsername("test1");
        us.setPass(encoder.encode("1234"));
        service.save(us);
    }

    @Test
    public void modificarUsuarioTest() {
        UpUsuarioRequest us = new UpUsuarioRequest();
        us.setId(1);
        us.setNombre("Test Modificado");
        us.setApellidos("Tester Modificado");
        List<Users.Rol> l = new ArrayList<Users.Rol>();
        l.add(Users.Rol.Administrador);
        us.setRoles(l);
        us.setUsername("test1");
        us.setPass(encoder.encode("1234"));
        service.edit(us);
    }

    @Test
    public void eliminarUsuario() {
        service.delete(new Integer[] { 1, 2 });
    }

    @Autowired
    private ReporteTService reporteService;

    @Test
    public void crearReporteTest() throws Exception {
        NewReporteTRequest reporte = new NewReporteTRequest();
        reporte.setNombre("repTest1");
        reporte.setDescripcion("descripcion");
        reporte.setFechaI(LocalDate.now());
        reporte.setFechaC(LocalDate.now());
        reporteService.save(reporte);
    }

    @Test
    public void modificarReporteTest() {
        UpReporteTRequest reporte = new UpReporteTRequest();
        reporte.setId(1);
        reporte.setNombre("repTest");
        reporte.setDescripcion("descripcionTest");
        reporte.setFechaI(LocalDate.now());
        reporte.setFechaC(LocalDate.now());
        reporteService.edit(reporte);

    }

    @Autowired
    private EstadoRevisorService estadoRevisorService;

    @Test
    public void AgregarEstadoRevisorTest() {
        AddEstadoRevisorRequest reporte = new AddEstadoRevisorRequest();
        reporte.setId(2);
        reporte.setEstado("Revisado");
        reporte.setRevisor(service.getByUsuario("admin"));
        estadoRevisorService.agregarEstadoRevisor(reporte);
    }

    @Autowired
    private HallazgoTService hallazgoTService;

    @Test
    public void crearHallazgo() {
        NewHallazgoRequest hallazgo = new NewHallazgoRequest();
        hallazgo.setDescripcion("descripcionTest");
        hallazgo.setImpacto("impactotest");
        hallazgo.setProductoAf("productoAfTest");
        hallazgo.setTipo("Test");
        hallazgo.setUbicacion("ubicacion");
        hallazgoTService.save(hallazgo);
    }

    @Test
    public void modificarHallazgoTest() {
        UpHallazgoRequest hallazgo = new UpHallazgoRequest();
        hallazgo.setDescripcion("descripcionTest");
        hallazgo.setId(1);
        hallazgo.setImpacto("impactotest");
        hallazgo.setProductoAf("productoAfTest");
        hallazgo.setTipo("Test");
        hallazgo.setUbicacion("ubicacion");
        hallazgo.setFecha(LocalDate.now());
        hallazgoTService.edit(hallazgo);
    }

    @Autowired
    private ArtefactService artefactService;

    @Test
    public void crearArtefactoTest() throws Exception {
        NewArtefactoRequest artefacto = new NewArtefactoRequest();
        artefacto.setNombre("nombre");
        artefacto.setDescripcion("descripcion");
        artefacto.setDisciplina("pruebas");
        artefacto.setFase("inicio");
        artefactService.save(artefacto);
    }

    @Test
    public void modificarArtefactoTest() throws Exception {
        UpArtefactoRequest artefacto = new UpArtefactoRequest();
        artefacto.setId(1);
        artefacto.setNombre("nombreTest");
        artefacto.setDescripcion("descripcion");
        artefacto.setDisciplina("pruebas");
        artefacto.setFase("inicio");
        artefactService.edit(artefacto);
     }

 }
