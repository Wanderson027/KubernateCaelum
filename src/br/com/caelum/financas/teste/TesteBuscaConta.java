package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.EntityManager;


public class TesteBuscaConta {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class, 1);

         conta.setTitular("Wanderson Rafael da Silva");
         conta.setAgencia("0804");
         conta.setNumero("88330-6");
         conta.setBanco("CAIXA ECONOMICA FEDERAL");

        System.out.println(conta.getTitular());


        em.getTransaction().commit();
        em.close();


        EntityManager em2 = new JPAUtil().getEntityManager();
        em2.getTransaction().begin();

        conta.setTitular("Leonardo");
        em2.persist(conta);


        em2.getTransaction().commit();
        em2.close();

    }
}
