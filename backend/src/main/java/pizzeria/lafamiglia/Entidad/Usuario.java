package pizzeria.lafamiglia.Entidad;

import java.sql.Date;

import jakarta.persistence.Entity;
//import javax.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
// @Table(name = "usuarios")
public class Usuario {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String nombre ;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String direccion;
    @Getter
    @Setter
    private String rol;
    public void setLastLogin(Date date) {
    }

    
}
