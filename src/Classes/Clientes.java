
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
public class Clientes implements Serializable {

    @Id
    private int id;
    private int codigo_loja;
    private int cpf;
    private String nome_rasao;
    private int cep;
    private String endereco;
    private int numero;
    private String completo;
    private String bairro;
    private String cidade;
    private String estado;
    private Calendar data_criacao;
    private Calendar hora_criacao;
    
    
    
    
}
