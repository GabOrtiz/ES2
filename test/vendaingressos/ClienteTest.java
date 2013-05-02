/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ClienteTest {
    
    public ClienteTest(){
    }
    
    
    @BeforeClass
    public static void setUpClass(){
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }

    @Test
    public void testSomeMethod(){
              
        
//        Cliente c = new Cliente("Maria", "9014871", "emaildamaria@gmail.com", 400, false);
//        System.out.println("Nome: " + c.getNome());
//        
//        c.setNome("Joao");
//    
//        System.out.println("CPF: " + c.getCpf());
//        
//        c.setCpf("900000");
//        
//        System.out.println("Email: " + c.getEmail());
//        
//        c.setEmail("outroemail");
//        
//        System.out.println("Saldo: " + c.getSaldo());
//        
//        c.setSaldo(200);
//        
//        c.setEstudante(true);
//        
//        System.out.println(c.isEstudante());
    }

    /**
     * Test of isEstudante method, of class Cliente.
     */
    //@Test
    public void testIsEspecial(){
        System.out.println("isEspecial");
        //public Cliente(String nome, String cpf, String email,String senha, double saldo, boolean especial) {
        Cliente c = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        boolean expResult = false;
        boolean result = c.isEspecial();
        assertEquals(expResult, result);       
    }

    /**
     * Test of setEstudante method, of class Cliente.
     */
    @Test
    public void testSetEspecial() {
        System.out.println("setEstudante");
        Cliente c1 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        boolean especial = false;
        c1.setEspecial(especial);      
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente c2 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        String expResult = "Maria";
        String result = c2.getNome();
        assertEquals(expResult, result);       
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Josefina";
        Cliente c3 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        c3.setNome(nome);     
    }

    /**
     * Test of getCpf method, of class Cliente.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente c4 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        String expResult = "9014871";
        String result = c4.getCpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCpf method, of class Cliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "9000000";
        Cliente c5 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        c5.setCpf(cpf);
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente c6 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        String expResult = "emaildamaria@gmail.com";
        String result = c6.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "novoemaildamaria@gmail.com";
        Cliente c7 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        c7.setEmail(email);
    }

    /**
     * Test of getSaldo method, of class Cliente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cliente c8 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        double expResult = 400;
        double result = c8.getSaldo();
        assertEquals(expResult, result, 0.0);    
    }

    /**
     * Test of setSaldo method, of class Cliente.
     */
    @Test
    public void testSetSaldo(){
        System.out.println("setSaldo");
        double saldo = 700;
        Cliente c9 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        c9.setSaldo(saldo);       
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente c0 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        String expResult = "Nome: "+c0.getNome()+", CPF: "+c0.getCpf() +", Email: "+ c0.getEmail()+", Saldo: "+ c0.getSaldo()+ ", Especial: "+ c0.isEspecial();
        String result = c0.toString();
        assertEquals(expResult, result);
        
        //return "Nome: " + nome + ", CPF: " + cpf + ", Email: " + email + ", Saldo: " + saldo + ", Especial: " + especial;
    }

    /**
     * Test of getSenha method, of class Cliente.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Cliente c6 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        String expResult = "senhadamaria";
        String result = c6.getSenha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSenha method, of class Cliente.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "novasenhadamaria";
        Cliente c7 = new Cliente("Maria", "9014871", "emaildamaria@gmail.com","senhadamaria", 400, false);
        c7.setSenha(senha);
    }

    
   
    
    
    

    
}
