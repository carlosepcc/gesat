package com.example.gesat.repositorio;
import com.example.gesat.repositorio.entidad.Minuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMinutaRepository extends JpaRepository<Minuta,Integer> {
}
