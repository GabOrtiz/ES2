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
    String nome, cpf, email, senha,estudante;
    double saldo;
   

    public Cliente(){
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

 public String cadastrarUsuario()
    {
       
        String sql = "INSERT INTO cine.usuarios (nome,login,senha,cpf,saldo) values ('"+getNome()+"','"+getEmail()+"','"+getSenha()+"','"+getSaldo()+"')";
               
        return sql;
    }
   
    
    
  

}
