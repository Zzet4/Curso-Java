package curso_java.hibernate.basics;

import java.util.Scanner;

import curso_java.A3_Utilidades.JpaUtil;
import curso_java.hibernate.basics.entities.Cliente;
import jakarta.persistence.EntityManager;

public class HibernatePorId {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id: ");
        Long id = scanner.nextLong();
        
        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        System.out.println(cliente);

//        Cliente cliente2 = em.find(Cliente.class, id);
//        System.out.println(cliente2);

        em.close();
    }
}
