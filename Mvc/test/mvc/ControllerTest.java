/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter
 */
public class ControllerTest 
{
    
    public ControllerTest(){       
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
     * Test of setAlbumName method, of class Controller.
     */
    @Test
    public void testSetAlbumName() {
        System.out.println("setAlbumName");
        String albumName = "Christoph Alex";
        Controller instance = new Controller(new Model(), new View());
        instance.setAlbumName(albumName);
        assertEquals(instance.getAlbumName(), albumName);
    }

    /**
     * Test of setArtistName method, of class Controller.
     */
    @Test
    public void testSetArtistName() {
        System.out.println("setArtistName");
        String artistName = "Favorite";
        Controller instance = new Controller(new Model(), new View());
        instance.setArtistName(artistName);
        assertEquals(instance.getArtistName(), artistName);
    }

    /**
     * Test of setSelectedGenre method, of class Controller.
     */
    @Test
    public void testSetSelectedGenre() {
        System.out.println("setSelectedGenre");
        String genre = "Rap";
        Controller instance = new Controller(new Model(), new View());
        instance.setSelectedGenre(genre);
        assertEquals(instance.getSelectedGenre(), genre);
    }
    
    
    /**
     * Test of getAlbumName method, of class Controller.
     */
    @Test
    public void testGetAlbumName() {
        System.out.println("getAlbumName");
        Controller instance = new Controller(new Model(), new View());
        String expResult = "Christoph Alex";
        instance.setAlbumName("Christoph Alex");
        String result = instance.getAlbumName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getArtistName method, of class Controller.
     */
    @Test
    public void testGetArtistName() {
        System.out.println("getArtistName");
        Controller instance = new Controller(new Model(), new View());
        String expResult = "Favorite";
        instance.setArtistName("Favorite");
        String result = instance.getArtistName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSelectedGenre method, of class Controller.
     */
    @Test
    public void testGetSelectedGenre() {
        System.out.println("getSelectedGenre");
        Controller instance = new Controller(new Model(), new View());
        String expResult = "Rap";
        instance.setSelectedGenre("Rap");
        String result = instance.getSelectedGenre();
        assertEquals(expResult, result);
    }   

    
}
