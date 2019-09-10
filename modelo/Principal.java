/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        Gerente objGer01 = new Gerente();
        
        objFunc01.setNome("Marlon");
        objFunc01.setSalario(5000);
        objFunc01.setCpf("111222333");
        
        objGer01.setNome("Thiago");
        objGer01.setSalario(15000);
        objGer01.setCpf("333222111");
        objGer01.setSetor("TI");
        objGer01.setSenha("@7070");
        
        Funcionario objFunc02 = new Gerente();
        //Casting entre objetos (CLASSES)
        //da mesma forma que vimos em tipos PRIMITIVOS
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuicao entre objetos
        //objFunc02 = objGer02;
        //objGer02 = (Gerente) objFunc02;
        
        System.out.println("Func01: "+objFunc01.getNome());
        System.out.println(objFunc01.getInformacao());
        
        System.out.println("\n\nGer01: "+objGer01.getNome());
        System.out.println(objGer01.getInformacao());
        objGer01.getAutenticacao("@707");
        
    }
    
}
