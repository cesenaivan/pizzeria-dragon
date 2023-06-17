package pizzeria.lafamiglia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pizzeria.lafamiglia.UsuarioRepository;
import pizzeria.lafamiglia.Entidad.Usuario;


@RestController
@CrossOrigin
public class UsuarioController {
   
@Autowired
UsuarioRepository ur;

    
@CrossOrigin
@GetMapping ("/api/Usuario")
public List<Usuario> getApp(){
    return ur.findAll();
}
@GetMapping("/api/Usuario/existe-email")
    public Map<String, Boolean> existeEmail(@RequestParam String email) {
        boolean existe = ur.existsByEmail(email);
        Map<String, Boolean> response = new HashMap<>();
        response.put("existeEmail", existe);
        return response;
    }

@PostMapping ("/api/Usuario")
public Usuario cru(@RequestBody Usuario nwu){
    return ur.saveAndFlush(nwu);
}

@DeleteMapping("/api/Usuario/{id}")
public void deleteUser(@PathVariable Long id) {
    ur.deleteById(id);
}

@PutMapping("/api/Usuario")
public int updateUser(@RequestBody Usuario u){
    if (ur.existsById(u.getId())){
        ur.saveAndFlush(u);
        return 1;
    }
    return 0;
}

}
