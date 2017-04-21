package Classes;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DANILO
 */
@Entity
public class lojas implements Serializable {
    @Id
    private int id;
    private int codigo_loja;
    private String descricao;
    private String rasao_social;
    
}
