package br.com.caelum.financas.teste;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteConta {

    public static void main(String[] args) {

         Conta conta = new Conta();//criação da conta
         conta.setTitular("Rafael");
         conta.setAgencia("123");
         conta.setBanco("Bradesco");
         conta.setNumero("1234");



        EntityManager em = new JPAUtil().getEntityManager();

        em.getTransaction().begin();// abre a transação
        em.persist(conta); // cria o persiste mas antes tem que ter uma transação aberta
        em.getTransaction().commit();

        em.close();





    }
}
