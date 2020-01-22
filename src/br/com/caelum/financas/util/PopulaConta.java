package br.com.caelum.financas.util;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;

    public class PopulaConta {

        public static void main(String[] args) {

            EntityManager manager = new JPAUtil().getEntityManager();

            manager.getTransaction().begin();

            Conta conta1 = new Conta();
            Conta conta2 = new Conta();
            Conta conta3 = new Conta();
            Conta conta4 = new Conta();
            Conta conta5 = new Conta();
            Conta conta6 = new Conta();
            Conta conta7 = new Conta();
            Conta conta8 = new Conta();
            Conta conta9 = new Conta();
            Conta conta10 = new Conta();
            Conta conta11 = new Conta();
            Conta conta12= new Conta();


            conta1.setBanco("121 - BANCO DO BRASIL");
            conta1.setNumero("16947-8");
            conta1.setAgencia("6543");
            conta1.setTitular("Joao dos Santos");

            conta2.setBanco("237 - BANCO BRADESCO");
            conta2.setNumero("86759-1");
            conta2.setAgencia("1745");
            conta2.setTitular("Sebas Roberto Souza");

            conta3.setBanco("234 - BANCO ITAU UNIBANCO");
            conta3.setNumero("46346-3");
            conta3.setAgencia("4606");
            conta3.setTitular("Antonio Duraes");

            conta4.setBanco("122 - BANCO SANTANDER");
            conta4.setNumero("12345-6");
            conta4.setAgencia("9876");
            conta4.setTitular("Leandra Marques");

            conta5.setBanco("666 - CAIXA ECONOMICA FEDERAL");
            conta5.setNumero("98654-3");
            conta5.setAgencia("1234");
            conta5.setTitular("Alexandre Duarte");

            conta6.setBanco("425 - CAIXA ECONOMICA FEDERAL");
            conta6.setNumero("98654-3");
            conta6.setAgencia("1234");
            conta6.setTitular("Alexandre Duarte");

            conta7.setBanco("1233 - CAIXA ECONOMICA FEDERAL");
            conta7.setNumero("98654-3");
            conta7.setAgencia("1234");
            conta7.setTitular("Alexandre Duarte");

            conta8.setBanco("124 - CAIXA ECONOMICA FEDERAL");
            conta8.setNumero("98654-3");
            conta8.setAgencia("1234");
            conta8.setTitular("Alexandre Duarte");

            conta9.setBanco("125 - CAIXA ECONOMICA FEDERAL");
            conta9.setNumero("98654-3");
            conta9.setAgencia("1234");
            conta9.setTitular("Alexandre Duarte");

            conta10.setBanco("126 - CAIXA ECONOMICA FEDERAL");
            conta10.setNumero("98654-3");
            conta10.setAgencia("1234");
            conta10.setTitular("Alexandre Duarte");

            conta11.setBanco("127 - CAIXA ECONOMICA FEDERAL");
            conta11.setNumero("98654-3");
            conta11.setAgencia("1234");
            conta11.setTitular("Alexandre Duarte");

            conta12.setBanco("128 - CAIXA ECONOMICA FEDERAL");
            conta12.setNumero("98654-3");
            conta12.setAgencia("1234");
            conta12.setTitular("Alexandre Duarte");

            // persistindo as contas
            manager.persist(conta1);
            manager.persist(conta2);
            manager.persist(conta3);
            manager.persist(conta4);
            manager.persist(conta5);
            manager.persist(conta6);
            manager.persist(conta8);
            manager.persist(conta9);
            manager.persist(conta10);
            manager.persist(conta11);
            manager.persist(conta12);


            manager.getTransaction().commit();

            manager.close();

        }
    }

