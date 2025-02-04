import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
  
  Scene images = new Scene();

  // Tagliatelle image
  ImageFilter tagliatelle = new ImageFilter("tagliatelle.jpeg");

  images.drawImage(tagliatelle, 0, 0, tagliatelle.getWidth());
  
  images.pause(2);

  tagliatelle.applyBlur();

  images.drawImage(tagliatelle, 0, 0, tagliatelle.getWidth());
  
  images.pause(2);

  //Spaghetti squash image
  ImageFilter spaghetti = new ImageFilter("AP-CSA---Spaghetti-Squash.jpg");

  images.drawImage(spaghetti, 0, 0, spaghetti.getWidth());

  images.pause(2);

  spaghetti.threshold(200);

  images.drawImage(spaghetti, 0, 0, spaghetti.getWidth());

  images.pause(2);

  //Raisin bagel image
  ImageFilter bagels = new ImageFilter("AP-CSA---Raisin-Bagels.jpg");

  images.drawImage(bagels, 0, 0, bagels.getWidth());

  images.pause(2);

  bagels.colorShift(60);

  images.drawImage(bagels, 0, 0, bagels.getWidth());

  images.pause(2);

  //Plays the scene
  Theater.playScenes(images);





  }
}