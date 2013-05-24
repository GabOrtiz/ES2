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
    private String nome, cpf, email, senha,login,estudante;
    private double saldo;
   

    public Cliente(){
    }

    public String isEspecial(){
        if(estudante == "S"){
            System.out.println("especial.");
            return estudante;
        }
        else
            System.out.println("normal.");
            return estudante;
    }

    public void setEspecial(String especial) {
        this.estudante = especial;
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
    
    
    public void verificaUsuarioLogado(){
        
        String sql = "SELECT * FROM cine.clientes WHERE "
        
    }
    
}
