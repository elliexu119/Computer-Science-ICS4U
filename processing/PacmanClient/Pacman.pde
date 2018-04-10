boolean mov = false;
public class Pacman {
  //class constants
  private static final int STEP_SIZE = 10; 
  //class variables
  //object variables 
  int xLoc = 300; //12
  int yLoc = 300; //13

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation(){
  return this.xLoc; 
  }
  
  public int getYLocation(){
  return this.yLoc; 
  }

  //verbs; things you can do to your class/object

  //toString()

  //.equals()

  public void draw() {
    fill(#FAE600); 
    arc(xLoc, yLoc, 30, 30, 7, 12); 
    if (mov == true){
      mouth();
      mov = false; 
    }
    
  }
  
  
  public void move() {
    mov = true; 
    this.xLoc = this.xLoc + STEP_SIZE;
  }
  
  public void move2() {
    mov = true; 
    this.xLoc = this.xLoc - STEP_SIZE;
  }
  
  public void move3() {
    mov = true; 
    this.yLoc = this.yLoc + STEP_SIZE;
    
  }
 
  public void move4() {
    mov = true; 
    this.yLoc = this.yLoc - STEP_SIZE;
  }
  
  public void mouth(){
    fill(#FAE600); 
   if (frameCount%20 < 5 ){
      ellipse(xLoc, yLoc, 30, 30);
    } 
    else {
    arc(xLoc, yLoc, 30, 30, 7, 12); 
    }
  }
}
