public class Ghost {
  //class constants
  private static final int STEP_SIZE = 5; 
  //class variables
  //object variables 
  int xLoc = width/2 + 100;
  int yLoc = height - 50;

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation() {
    return this.xLoc;
  }

  public int getYLocation() {
    return this.yLoc;
  }

  public void draw() {
    noStroke();
    fill(200, 50, 50); 
    ellipse(xLoc + 15, yLoc, 30, 30); 
    rect(xLoc, yLoc, 30, 30);
    fill(255);
    ellipse(xLoc + 8, yLoc, 10,15); 
    ellipse(xLoc + 22, yLoc, 10,15); 
    fill(#0040C6); 
    ellipse(xLoc + 8, yLoc+2.5, 10,10); 
    ellipse(xLoc + 22, yLoc+2.5, 10,10); 
    
  }
  public void move() {
    this.xLoc = this.xLoc + STEP_SIZE;
  }

  public void move2() {
    this.xLoc = this.xLoc - STEP_SIZE;
  }

  public void move3() {
    this.yLoc = this.yLoc + STEP_SIZE;
  }

  public void move4() {
    this.yLoc = this.yLoc - STEP_SIZE;
  }
}
