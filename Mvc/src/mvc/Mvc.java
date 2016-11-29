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
public class Mvc
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Model model = new Model();      
      View view = new View();
      Controller controller = new Controller(model, view);

      //Update the model data
      controller.setAlbumName("One");
      controller.setArtistName("Kool Savas");
      controller.setSelectedGenre("Rap");

      controller.updateView();        
    }        
}