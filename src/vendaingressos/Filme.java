/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static vendaingressos.Conexao.rs;
import static vendaingressos.Conexao.stmt;

/**
 *
 * @author aluno
 */
public class Filme {

	String nome ;
	String descricao;
	double valor;
	double duracao ;
	Integer classificacao;
	String imagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
    public void cadastrar(){
            Conexao c = new Conexao();
        
            try {
                String query = "INSERT INTO cine.filmes (nome,descricao,valor,duracao,classificacao) VALUES"
                       + "('"+this.getNome()+"','"+this.getDescricao()+ "','" + this.getValor()+"','"+this.getDuracao()+"','"+ this.getClassificacao() + "')";
                
                c.stmt.executeUpdate(query); 
                c.stmt.close();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        
    }
}
