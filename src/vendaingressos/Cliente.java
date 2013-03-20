/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome, cpf, email, senha;
    private double saldo;
    private boolean especial;

    public Cliente(String nome, String cpf, String email,String senha, double saldo, boolean especial){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
        this.especial = especial;
    }

    public boolean isEspecial(){
        if(especial == true){
            System.out.println("especial.");
            return true;
        }
        else
            System.out.println("normal.");
            return false;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    @Override
    public String toString(){
        return "Nome: " + nome + ", CPF: " + cpf + ", Email: " + email + ", Saldo: " + saldo + ", Especial: " + especial;
    }
    
    
    
    
    
}
