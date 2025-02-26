import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {
  
  // 2D array variables
  String[][] images;
  String[][] names;
  String[][] reviews;
  String[][] sounds;

  // parameterized constructor
  public MyStory(String[][] images, String[][] names, String[][] reviews, String[][] sounds) {
    this.images = images;
    this.names = names;
    this.reviews = reviews;
    this.sounds = sounds;
  }

  /*
   * Displays all images, texts, and sounds
   */
  public void displayScene() {
    displayTagliatelle();
    displaySpaghetti();
    displayBagel();
    displayPear();
  }

  /*
   * Method to call first image, name, and review
   * from the 2D array from TheaterRunner
   */
  public void displayTagliatelle() {
    ImageFilter tagliatelleImage = new ImageFilter(images[0][0]);
    drawImage(tagliatelleImage, 0, 0, getWidth(), getHeight(), 0);
    drawText(names[0][0], 10, 30);
    drawText(reviews[0][0], 10, 380);
    pause(2);
    
    playSound(sounds[0][0]);
    tagliatelleImage.colorShift(70);
    drawImage(tagliatelleImage, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
   * Method to call second image, name, and review
   * from the 2D array from TheaterRunner
   */
  public void displaySpaghetti() {
    ImageFilter displaySpaghetti = new ImageFilter(images[0][1]);
    drawImage(displaySpaghetti, 0, 0, getWidth(), getHeight(), 0);
    drawText(names[0][1], 10, 30);
    drawText(reviews[0][1], 10, 380);
    pause(2);
    
    playSound(sounds[0][1]);
    displaySpaghetti.applyBlur();
    drawImage(displaySpaghetti, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
   * Method to call third image, name, and review
   * from the 2D array from TheaterRunner
   */
  public void displayBagel() {
    ImageFilter displayBagel = new ImageFilter(images[0][2]);
    drawImage(displayBagel, 0, 0, getWidth(), getHeight(), 0);
    drawText(names[0][2], 10, 30);
    drawText(reviews[0][2], 10, 380);
    pause(2);
    
    playSound(sounds[0][2]);
    displayBagel.threshold(70);
    drawImage(displayBagel, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
   * Method to call fourth image, name, and review
   * from the 2D array from TheaterRunner
   */
  public void displayPear() {
    ImageFilter displayPear = new ImageFilter(images[0][3]);
    drawImage(displayPear, 0, 0, getWidth(), getHeight(), 0);
    drawText(names[0][3], 10, 30);
    drawText(reviews[0][3], 10, 380);
    pause(2);
    
    playSound(sounds[0][3]);
    displayPear.applySepia();
    drawImage(displayPear, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  
}