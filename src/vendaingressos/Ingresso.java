/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

/**
 *
 * @author aluno
 */
public class Ingresso {
    private String nome, sinopse;
    private double valor, duracao;
    private int quantidade, classificacao;

    public Ingresso(String nome, String sinopse, double valor, double duracao, int quantidade, int classificacao) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.valor = valor;
        this.duracao = duracao;
        this.quantidade = quantidade;
        this.classificacao = classificacao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    

    @Override
    public String toString() {
        return "Filme: "+nome+", R$: "+valor+ " Classificação: "+ classificacao+ "Duração: "+ duracao+ " Ingressos Disponíveis: "+ quantidade;
    }
    
    
    
   
    
    
    
    
    
}
