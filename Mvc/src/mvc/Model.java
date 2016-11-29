/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 * MVC Model Class
 * @author Peter
 */
public class Model
{
    
   private String album;
   private String artist;
   private String genre;

   /**
    * 
    * @return album String
    */ 
    public String getAlbum()
    {
        return this.album;
    }

   /**
    * 
    * @return artist String
    */
    public String getArtist()
    {
        return this.artist;
    }

    /**
     * 
     * @return genre String
     */
    public String getGenre()
    {
        return this.genre;
    }

   /**
    * 
    * @param album sets album String
    */
    public void setAlbum(String album)
    {
        this.album = album;
    }

    /**
     * 
     * @param artist sets artist String
     */
    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    /**
     * 
     * @param genre sets genre String
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
   
}