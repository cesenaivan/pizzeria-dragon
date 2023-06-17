package pizzeria.lafamiglia.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pizzeria.lafamiglia.VisitaRepository;
import pizzeria.lafamiglia.Entidad.Visita;
@CrossOrigin
@RestController
public class VisitaController {

    @Autowired
    private VisitaRepository visitaRepository;

    @PostMapping("api/visitas")
    public Visita crearVisita(@RequestBody Visita visita) {
        return visitaRepository.save(visita);
    }

    @GetMapping("api/visitas")
    public List<Visita> obtenerVisitas() {
        return visitaRepository.findAll();
    }

    @PutMapping("api/visitas/{id}")
    public Visita actualizarVisita(@PathVariable Long id, @RequestBody Visita visitaActualizada) {
        Visita visitaExistente = visitaRepository.findById(id).orElse(null);
        if (visitaExistente != null) {
            visitaExistente.setFecha(visitaActualizada.getFecha());
            // Actualizar otros atributos de la visita según sea necesario
            return visitaRepository.save(visitaExistente);
        } else {
            return null;
        }
    }

    @DeleteMapping("api/visitas/{id}")
    public void eliminarVisita(@PathVariable Long id) {
        visitaRepository.deleteById(id);
    }
}

