/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class VendaIngressos{

    /**
     * @param args the command line arguments
     */
    
    
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();  //cadastro de clientes
    public static ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();  //cadastro de ingressos    
         
         
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
         
        
         
         StringBuilder CLI = new StringBuilder();
         StringBuilder ING = new StringBuilder();
        
        
//         ArrayList<Cliente> clientes = new ArrayList<Cliente>();  //cadastro de clientes
//         ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();  //cadastro de ingressos
         
         String valor;
         int val;
                  
         do {
            //menu principal
            valor = JOptionPane.showInputDialog(null, "1 - Cadastrar " + "\n"
                    + "2 - Comprar" + "\n"
                    + "3 - Listar" + "\n"
                    + "0 - Sair");


            val = Integer.parseInt(valor);


            switch (val) {

                //cadastrar cliente e ingresso
                case 1:
                    String valorCadastrar = " ";

                    valorCadastrar = JOptionPane.showInputDialog(null, "1 - Cliente " + "\n"
                    + "2 - Ingressos" + "\n"
                    + "0 - Voltar");
                    val = Integer.parseInt(valorCadastrar);
                    
                    switch (val){
                        case 1: 
                            String n = JOptionPane.showInputDialog("Nome: ");
                            String c = JOptionPane.showInputDialog("CPF: ");
                            String e = JOptionPane.showInputDialog("Email: ");
                            String s = JOptionPane.showInputDialog("Senha: ");
                            double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: "));
                            String est = JOptionPane.showInputDialog("Especial?  S/N ");
                            boolean especial;
                            if(est.equalsIgnoreCase("S")){
                                especial = true;                                
                            }
                            else especial = false;
                            //public Cliente(String nome, String cpf, String email,String senha, double saldo, boolean especial) {
//                            Cliente cli = new Cliente(n, c, e, s, p, especial);
//                            clientes.add(cli);
                            
                            break;
                            
                            
                        case 2:
                            String ni = JOptionPane.showInputDialog("Nome: ");
                            String si = JOptionPane.showInputDialog("Sinopse: ");
                            double pi = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));
                            double du = Double.parseDouble(JOptionPane.showInputDialog(null, "Duração: "));
                            int qtd =  Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
                            int cla =  Integer.parseInt(JOptionPane.showInputDialog("Classificação: "));
                            // public Ingresso(String nome, String sinopse, double valor, double duracao, int quantidade, int classificacao) {
                            //Ingresso ingr = new Ingresso(ni, si, pi, du, qtd, cla);
                            //ingressos.add(ingr);
                            
                            break;
                            
                                    
                    }
                    break;



                //Comprar
                case 2:
                    double preco = 0;
                    String nc = JOptionPane.showInputDialog("Seu nome: ");
                    String ni = JOptionPane.showInputDialog("Ingresso: ");
                    
//                    for(Cliente c: clientes){
//                        if(c.getNome().equalsIgnoreCase(nc)){
//                            
//                        }
//                    }   
                    for(Ingresso i: ingressos){
                        
                        if( i.getNome().equalsIgnoreCase(ni)){
                            preco = i.getValor();
                            i.setQuantidade(i.getQuantidade() -1);
                        }
                    }
                    
//                    for(Cliente c: clientes){
//                        
//                        if (c.getNome().equalsIgnoreCase(nc)) {
//                            if(c.isEspecial()){
//                                c.setSaldo(c.getSaldo() - (preco / 2));
//                            }
//                            else c.setSaldo(c.getSaldo() - preco);
//                        }
//                    }
                    break;
                    

                //Listar
                case 3:
                    String valorListar = "";

                    
                    valorListar = JOptionPane.showInputDialog(null, "1 - Listar Clientes" + "\n"
                            + "2 - Listar Ingressos" + "\n");
                    val = Integer.parseInt(valorListar);
                    switch (val) {
                        //listar Clientes
                        case 1:
                            for(Cliente c: clientes){
                                CLI.append(c.toString()+"\n");
                            }
                                JOptionPane.showMessageDialog(null,CLI);
                                
                                StringBuilder limpa = new StringBuilder();                               
                                CLI = limpa;
                            break;

                        //listar Ingressos
                            
                            
                        case 2:
                            
                            for(Ingresso i: ingressos){
                                ING.append(i.toString()+"\n");
                            }
                            JOptionPane.showMessageDialog(null,ING);
                            
                            StringBuilder limpaIng = new StringBuilder();
                            ING = limpaIng;
                            
                            break;
                            
                    }
                    break;
            }

        } while (val != 0);
 
    }
}
