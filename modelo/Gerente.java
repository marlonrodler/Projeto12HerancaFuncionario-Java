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
public class Gerente extends Funcionario{
    
    private String setor;
    private String senha;
   
    
    //CONSTRUTORES - GETTERS E SETTERS
    public Gerente() {
    }

    public Gerente(String setor, String senha, String nome, double salario, String cpf) {
        //palavra reservada SUPER
        //this.nome = nome;
        //this.salario = salario;
        //this.cpf = cpf;
        super(nome, salario, cpf);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Faz a sobreescrita do metodo da classe PAI
    @Override
    public String getInformacao(){
        return "\nGerente: "+this.nome+" recebe "+ this.salario;
    }
    //sobrecarga (OVERRIDE) permite o uso do conceito de 
    //Polimorfismo da Orientação a Objetos usando para isto a anotação @Override
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
    public boolean getAutenticacao(String senha){
        //comparacao Strings usamos o metodo equals
        //comparacao de inteiro ==
        if(this.senha.equals(senha)){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }   
        
    }
    
}
