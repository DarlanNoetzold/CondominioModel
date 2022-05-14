
import br.edu.ifsul.condominiomodel.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darla
 */
public class TestePessoa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Condominio-PWPU");
        EntityManager em = emf.createEntityManager();
        Pessoa e = new Pessoa();
        e.setNome("Darlan");
        e.setCpf("asdasd");
        e.setEmail("Sadasd");
        e.setTelefone("sdasd");
        

        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
