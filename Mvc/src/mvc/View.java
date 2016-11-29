/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 * MVC View Class, CUI
 * @author Peter
 */
public class View
{
    /**
     * Prints out all the attributes
     * @param album
     * @param artist
     * @param genre 
     */
    public void printMusicDetails(String album, String artist, String genre)
    {
        System.out.println("Album: " + album);
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
    }
}
