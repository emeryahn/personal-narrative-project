import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
  /*
   * 2D arrays storing image files,
   * names of each image,
   * and storing sound files
   */
  String[][] imageFiles = {{"tagliatelle.jpeg", "AP-CSA---Spaghetti-Squash.jpg",
                            "AP-CSA---Raisin-Bagels.jpg", "AP-CSA---Baked-Pear.jpg"}};
    
  String[][] foodNames = {{"Tomahawk Steak Alfredo Tagliatelle", "Beef Sausage Marinara Spaghetti Squash", 
                           "Yogurt Blueberry Raisin Bagels", "Blue Cheese and Honey Baked Pear"}};

  String[][] foodReviews = {{"Dad: The sauce was exquisite!", "Mom: Super yummy.",
                             "Sister: Tastes too healthy.", "Grandparents: This tasted lovely."}};
    
  String[][] soundFiles = {{"HeavyRain-VEED.wav", "doormove-VEED.wav",
                            "SuperSheepWhoosh-VEED.wav", "campfire-VEED.wav"}};

  // Plays scene in the theater

  MyStory scene = new MyStory(imageFiles, foodNames, foodReviews, soundFiles);

  scene.displayScene();
    
  Theater.playScenes(scene);



  }
}