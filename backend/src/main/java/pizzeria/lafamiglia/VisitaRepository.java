package pizzeria.lafamiglia;

import org.springframework.data.jpa.repository.JpaRepository;

import pizzeria.lafamiglia.Entidad.Visita;

public interface VisitaRepository extends JpaRepository<Visita, Long> {

}