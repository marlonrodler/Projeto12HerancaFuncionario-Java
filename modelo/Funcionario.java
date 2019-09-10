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
public class Funcionario {
    
    //Inicialmente os ATR serao PRIVATE
    protected String nome;
    protected double salario;
    protected String cpf;

    
    //CONSTRUTORES - GETTERS E SETTERS
    
    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getInformacao(){
        return "\nFuncionario: "+this.nome+" recebe "+ this.salario;
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    
}
