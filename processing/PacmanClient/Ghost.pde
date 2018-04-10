public class Ghost {
  //class constants
  private static final int STEP_SIZE = 5; 
  //class variables
  //object variables 
  int xLoc = width/2 + 100;
  int yLoc = height/2 + 100;

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation(){
  return this.xLoc; 
  }
  
    public int getYLocation(){
  return this.yLoc; 
  }

  public void draw() {
    fill(200,50,50); 
    noStroke();
    ellipse(xLoc+15, yLoc, 30, 30); 
    
    rect(xLoc, yLoc, 30, 30);
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
