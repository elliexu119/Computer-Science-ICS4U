public class Ghost {
  //class constants
  private static final int STEP_SIZE = 10; 
  //class variables
  //object variables 
  int xLoc = 12;
  int yLoc = 50;

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation(){
  return this.xLoc; 
  }
  
  

  //verbs; things you can do to your class/object

  //toString()

  //.equals()

  public void draw() {
    fill(200,50,50); 
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
