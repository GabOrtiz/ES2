/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ortiz
 */
public class IngressoTest {
    
    public IngressoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Ingresso.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        //public Ingresso(String nome, String sinopse, double valor, double duracao, int quantidade, int classificacao) {
        Ingresso i = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        String expResult = "Star Wars";
        String result = i.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Ingresso.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Star Wars ep6";
        Ingresso i1 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i1.setNome(nome);

    }

    /**
     * Test of getValor method, of class Ingresso.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Ingresso i3 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        double expResult = 15;
        double result = i3.getValor();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setValor method, of class Ingresso.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 12;
        Ingresso i4 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i4.setValor(valor);
    }

    /**
     * Test of toString method, of class Ingresso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ingresso i = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        String expResult = "Filme: "+i.getNome()+", R$: "+i.getValor() +", Classificação: "+i.getClassificacao()+", Duração: "+i.getDuracao()+", Ingressos Disponíveis: "+ i.getQuantidade();
        //return "Filme: "+nome+", R$: "+valor+ " Classificação: "+ classificacao+ "Duração: "+ duracao+ " Ingressos Disponíveis: "+ quantidade;
        String result = i.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getQuantidade method, of class Ingresso.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Ingresso i5 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        int expResult = 100;
        int result = i5.getQuantidade();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuantidade method, of class Ingresso.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 120;
        Ingresso i6 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i6.setQuantidade(quantidade);
    }

    /**
     * Test of getSinopse method, of class Ingresso.
     */
    @Test
    public void testGetSinopse() {
        System.out.println("getSinopse");
        Ingresso i7 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        String expResult = "Luke, i´m your father ";
        String result = i7.getSinopse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSinopse method, of class Ingresso.
     */
    @Test
    public void testSetSinopse() {
        System.out.println("setSinopse");
        String sinopse = "ITS A TRAP!";
        Ingresso i8 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i8.setSinopse(sinopse);
        
    }

    /**
     * Test of getDuracao method, of class Ingresso.
     */
    @Test
    public void testGetDuracao() {
        System.out.println("getDuracao");
        Ingresso i9 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        double expResult = 150;
        double result = i9.getDuracao();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setDuracao method, of class Ingresso.
     */
    @Test
    public void testSetDuracao() {
        System.out.println("setDuracao");
        double duracao = 120;
        Ingresso i10 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i10.setDuracao(duracao);
        
    }

    /**
     * Test of getClassificacao method, of class Ingresso.
     */
    @Test
    public void testGetClassificacao() {
        System.out.println("getClassificacao");
        Ingresso i11 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        int expResult = 16;
        int result = i11.getClassificacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClassificacao method, of class Ingresso.
     */
    @Test
    public void testSetClassificacao() {
        System.out.println("setClassificacao");
        int classificacao = 15;
        Ingresso i12 = new Ingresso("Star Wars","Luke, i´m your father ", 15,150, 100, 16, new Sala());
        i12.setClassificacao(classificacao);
        
    }
}
