/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

/**
 *
 * @author Kristy
 * @author Eduardo
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    
    ArrayList<String> filmes = new ArrayList<>();
    public static  Connection connect;
    public static  Statement stmt;   
    public static  ResultSet rs;


  
  public void desconecta()
  {
      try
      {
          stmt.close();
          connect.close();
      }
      catch(Exception e)
      {
          System.out.println("ERROR: "+e.getMessage().toString()+"\n");
      }
  }
  
  public void conecta()
  {
       try {  

           Class.forName("com.mysql.jdbc.Driver");  
  
           
            String serverName = "localhost";    //caminho do servidor do BD

            String mydatabase ="cine";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD      

            String password = "";      //sua senha de acesso

            connect = DriverManager.getConnection(url, username, password);
  
  
            System.out.println("Conexão realizada com sucesso.");  
  
           stmt = connect.createStatement();  
           
       }
       catch (Exception e) {  
             e.printStackTrace();  
        }  


  }
  
  public void buscaFilmes(){
      try { 
          String query = "SELECT * FROM Filmes"; 
          rs = stmt.executeQuery(query); 
          while(rs.next())
          {
             filmes.add(rs.getString("nome"));
          }
          stmt.close();
          
      } catch ( SQLException sqlex )
      {
          
          
      }
  }
  
}

