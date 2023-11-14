import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    setSize(700, 700);
    
  }
  /**
   * to set the background
   */
   public void setup() {
    background(210, 255, 173);
  }

/**
 * to draw stuff on the window
 */
  public void draw() {
	 
    int valuexy = valueXY(25,2);
    for(int i = 50; i<=650;i+=100){
      drawBullEye(i, 400, valuexy);
    }

    drawHouse(100,100,250,0,0,153,153,153);
    drawHouse(300,100,250,0,0,153,153,153);
    drawHouse(500,100,250,0,0,153,153,153);
    drawHouse(100,250,250,0,0,153,153,153);
    drawHouse(300,250,250,0,0,153,153,153);
    drawHouse(500,250,250,0,0,153,153,153);
    drawHouse(100,550,250,0,0,153,153,153);
    drawHouse(300,550,250,0,0,153,153,153);
    drawHouse(500,550,250,0,0,153,153,153);
    
  }
  
  /**
   * To draw and color bulleyes
   * @param circleX the x coordinate of the circle
   * @param circleY the y coordinate of the circle
   * @param circleDiameter the diameter of circle
   */
  void drawBullEye(float circleX, float circleY, float circleDiameter) {
    fill(255, 0, 0);
    ellipse(circleX, circleY, circleDiameter*3, circleDiameter*3);
    fill(0, 0, 0);
    ellipse(circleX, circleY, circleDiameter*2, circleDiameter*2);
    fill(255, 0, 0);
    ellipse(circleX, circleY, circleDiameter, circleDiameter);
    fill(0,0,0);
    ellipse(circleX, circleY, circleDiameter/2, circleDiameter/2);
  }
/**
 * To draw and color houses at different location on the window
 * @param houseX the x coordinate of the house
 * @param houseY the y coordinate of the house
 * @param colorOne the first color code for the roof
 * @param colorTwo the second color code for the roof
 * @param colorThree the third color code for the roof
 * @param colorFour the first color code for the house body
 * @param colorFive the second color code for the house body
 * @param colorSix the third color code for the house body
 */
  void drawHouse(int houseX, int houseY, int colorOne ,int colorTwo,int colorThree, int colorFour, int colorFive, int colorSix){
    fill(colorOne ,colorTwo,colorThree);
    triangle(houseX-30, houseY-30, houseX+30, houseY-30, houseX, houseY-60);
    fill( colorFour, colorFive, colorSix);
    rect(houseX-30, houseY-30, 60,50);
    
  }
   /**
    * To use valueX and valueY in a calculation and return the result
    * @param valueX the x value
    * @param valueY the y value
    * @return to return the results produce from the calculation
   */
   public int valueXY(int valueX, int valueY){
    int valuexy =valueX*valueY;
    return valuexy;
    }
   
  }
