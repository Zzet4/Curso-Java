package curso_java.hibernate.basics;

import java.util.List;
import java.util.Scanner;

import curso_java.A3_Utilidades.JpaUtil;
import curso_java.hibernate.basics.entities.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class HibernateResultListWhere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("from Cliente c where c.formaPago=?1", Cliente.class);
        System.out.println("Ingrese una forma de pago: ");
        String pago = scanner.next();
        query.setParameter(1, pago);
//        query.setMaxResults(1);
        List<Cliente> clientes = query.getResultList();
        clientes.forEach(cliente->System.out.println(cliente));
        em.close();
    }
}
