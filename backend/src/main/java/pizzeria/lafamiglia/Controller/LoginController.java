package pizzeria.lafamiglia.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import pizzeria.lafamiglia.UsuarioRepository;
import pizzeria.lafamiglia.Entidad.Usuario;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/api/login")
public ResponseEntity<String> login(@RequestBody Usuario usuario) {
    Usuario usuarioEncontrado = usuarioRepository.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());

    if (usuarioEncontrado != null) {
        return ResponseEntity.ok().build();
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
    }
}
}


/*@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @GetMapping("/api/login/{id}")
public ResponseEntity<Usuario> obtenerUsuario(@PathVariable Long id) {
    Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
    if (optionalUsuario.isPresent()) {
        return ResponseEntity.ok(optionalUsuario.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}

@PutMapping("/api/login/{id}")
public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario nuevoUsuario) {
    Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
    if (optionalUsuario.isPresent()) {
        Usuario usuario = optionalUsuario.get();
        usuario.setEmail(nuevoUsuario.getEmail());
        usuario.setPassword(nuevoUsuario.getPassword());
        usuario.setNombre(nuevoUsuario.getNombre());
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@DeleteMapping("/api/login/{id}")
public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
    Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
    if (optionalUsuario.isPresent()) {
        usuarioRepository.deleteById(id);
        return ResponseEntity.ok().build();
    } else {
        return ResponseEntity.notFound().build();
    }
}


    @PostMapping("/api/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {

        Usuario usuario = usuarioRepository.findByEmailAndPassword(email, password);

        if (usuario != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }}*/

    /*@PostMapping("/api/register")
public ResponseEntity<String> register(@RequestBody Usuario newUser) {
    Usuario existingUser = usuarioRepository.findByEmail(newUser.getEmail());

    if (existingUser != null) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("El correo electrónico ya está registrado");
    } else {
        usuarioRepository.save(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario registrado con éxito");
    }
}
}*/














/*@RestController
@CrossOrigin
@Controller
public class LoginController {

    @Autowired
    private EntityManager entityManager;

    /**
     * @param email
     * @param password
     * @return
     
    @PostMapping("/api/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {

        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(u) FROM Usuario u WHERE u.email = :email AND u.password = :password", Long.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        Long count = query.getSingleResult();

        if (count == 1) {
            return ResponseEntity.ok().build();

        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}*/