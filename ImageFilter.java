import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image that contains multiple filters
 */
public class ImageFilter extends ImagePlus {

  /*
   * Calls the superclass constructor to intialize the 2D array
   */
  public ImageFilter(String filename) {
    super(filename);
  }

  /*
   * Shifts color of image pixels
   */
  public void colorShift(int value) {
    Pixel[][] pixels = getPixelsFromImage();

    for(int row = 0; row < pixels.length; row++) {
      for(int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int currentRed = currentPixel.getRed();
        int currentGreen = currentPixel.getGreen();
        int currentBlue = currentPixel.getBlue();

        int newRed = Math.min(255, Math.max(0, currentRed + value));
        int newGreen = Math.min(255, Math.max(0, currentGreen + value));
        int newBlue = Math.min(255, Math.max(0, currentBlue + value));

        currentPixel.setRed(newRed);
        currentPixel.setBlue(newBlue);
        currentPixel.setGreen(newGreen);
        
      }
    }



    
  }

  /*
   * Blurs image pixels
   */
  public void applyBlur() {
    Pixel[][] pixels = getPixelsFromImage();

    for (int row = 1; row < pixels.length - 1; row++) {
        for (int col = 1; col < pixels[0].length - 1; col++) {
            
          int averageRed = calcWeightedRed(pixels, row, col);
            int averageGreen = calcWeightedGreen(pixels, row, col);
            int averageBlue = calcWeightedBlue(pixels, row, col);

            pixels[row][col].setRed(averageRed);
            pixels[row][col].setGreen(averageGreen);
            pixels[row][col].setBlue(averageBlue);
        }
    }



    
  }

  /*
   * Returns a weighted red average of the pixels around the specified row and col
   */
  public int calcWeightedRed(Pixel[][] pixels, int row, int col) {
    int avgRed = (pixels[row-1][col-1].getRed() + pixels[row-1][col].getRed() + pixels[row-1][col+1].getRed() +
                  pixels[row][col-1].getRed() + pixels[row][col].getRed() + pixels[row][col+1].getRed() +
                  pixels[row+1][col-1].getRed() + pixels[row+1][col].getRed() + pixels[row+1][col+1].getRed()) / 9;
    return avgRed;
  }

  /*
   * Returns a weighted green average of the pixels around the specified row and col 
   */
  public int calcWeightedGreen(Pixel[][] pixels, int row, int col) {
    int avgGreen = (pixels[row-1][col-1].getGreen() + pixels[row-1][col].getGreen() + pixels[row-1][col+1].getGreen() +
                    pixels[row][col-1].getGreen() + pixels[row][col].getGreen() + pixels[row][col+1].getGreen() +
                    pixels[row+1][col-1].getGreen() + pixels[row+1][col].getGreen() + pixels[row+1][col+1].getGreen()) / 9;
    return avgGreen;
  }

  /*
   * Returns a weighted blue average of the pixels around the specified row and col
   */
  public int calcWeightedBlue(Pixel[][] pixels, int row, int col) {
    int avgBlue = (pixels[row-1][col-1].getBlue() + pixels[row-1][col].getBlue() + pixels[row-1][col+1].getBlue() +
                   pixels[row][col-1].getBlue() + pixels[row][col].getBlue() + pixels[row][col+1].getBlue() +
                   pixels[row+1][col-1].getBlue() + pixels[row+1][col].getBlue() + pixels[row+1][col+1].getBlue()) / 9;
    return avgBlue;
  }

  /*
   * Converts image to black and white
   */
  public void threshold(int value) {
    
    Pixel[][] pixels = getPixelsFromImage();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        
        int red = pixels[row][col].getRed();
        int green = pixels[row][col].getGreen();
        int blue = pixels[row][col].getBlue();

        int average = (red + green + blue) / 3;

        if (average < value) {
          pixels[row][col].setRed(0);
          pixels[row][col].setGreen(0);
          pixels[row][col].setBlue(0);
        } 
        else {
          pixels[row][col].setRed(255);
          pixels[row][col].setGreen(255);
          pixels[row][col].setBlue(255);
        }
      }
    }



    
  }
  
}
  