package pizzeria.lafamiglia;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    //@Autowired
    //private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        //TestApplication app = new TestApplication();
        //app.crear4();
    }

    /*public void crear(){
        Usuario usuario = new Usuario("John Doe", "john.doe@example.com");
        usuarioRepository.save(usuario);
    }*/

}




