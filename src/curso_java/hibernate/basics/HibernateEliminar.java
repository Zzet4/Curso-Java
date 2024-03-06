package curso_java.hibernate.basics;



import java.util.Scanner;

import curso_java.A3_Utilidades.JpaUtil;
import curso_java.hibernate.basics.entities.Cliente;
import jakarta.persistence.EntityManager;

public class HibernateEliminar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el id del cliente a eliminar:");
        Long id = scan.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        
        
    //PARA ELIMINAR UNO O VARIOS REGISTROS.
        try {
            Cliente cliente = em.find(Cliente.class, id);
            //Cliente cliente1 = new Cliente();
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
