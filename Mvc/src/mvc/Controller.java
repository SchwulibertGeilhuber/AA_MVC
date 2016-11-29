/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Peter
 */
public class Controller 
{
   private Model model;
   private View view;

   /**
    * 
    * @param model
    * @param view 
    */
   public Controller(Model model, View view)
   {
      this.model = model;
      this.view = view;
   }   
   
   /**
    * 
    * @return Album name
    */
   public String getAlbumName()
   {
       return model.getAlbum();
   }
   
   /**
    * 
    * @return Artist name
    */
   public String getArtistName()
   {
       return model.getArtist();
   }
   
  /**
   * 
   * @return Music genre
   */
   public String getSelectedGenre()
   {
       return model.getGenre();
   }
   
   /**
    * sets the Album name
    * @param name 
    */
   public void setAlbumName(String name)
   {
       model.setAlbum(name);
   }
   
   /**
    * sets the Artist name
    * @param name 
    */
   public void setArtistName(String name)
   {
       model.setArtist(name);
   }
   
   /**
    * sets the genre
    * @param genre 
    */
   public void setSelectedGenre(String genre)
   {
       model.setGenre(genre);
   }
    
   
   /**
    * In order to update the view, all Strings get printed
    */
    public void updateView()
    {				
        view.printMusicDetails(model.getAlbum(), model.getArtist(), model.getGenre());
    }

}