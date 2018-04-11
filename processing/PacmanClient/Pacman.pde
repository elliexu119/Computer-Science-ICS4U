public class Pacman {
  //class constants
  private static final int STEP_SIZE = 10; 
  //class variables
  //object variables 
  int xLoc = width/2; //12
  int yLoc = height/2; //13
  private int a = 7; 
  private int b = a + 5;
  boolean mov = false;

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation() {
    return this.xLoc;
  }

  public int getYLocation() {
    return this.yLoc;
  }

  //verbs; things you can do to your class/object

  //toString()

  //.equals()

  public void draw() {
    fill(#FAE600); 
    b = a + 5; 
    arc(xLoc, yLoc, 30, 30, a, b); 
  }


  public void right() {
    a = 7; 
    mouth(); 
    this.xLoc = this.xLoc + STEP_SIZE;
  }

  public void left() {
    a = 29; 
    mouth(); 
    this.xLoc = this.xLoc - STEP_SIZE;
  }

  public void down() {
    a = 65; 
    mouth();    
    this.yLoc = this.yLoc + STEP_SIZE;
  }

  public void up() {
    a = 43;
    mouth();    
    this.yLoc = this.yLoc - STEP_SIZE;
  }

  public void mouth() {
    fill(#FAE600); 
    if (frameCount%20 < 5 ) {
      ellipse(xLoc, yLoc, 30, 30);
    } else {
      arc(xLoc, yLoc, 30, 30, a, b);
    }
  }
  
  void pacman() {
  //PACMAN
  if (index == 1 && p.getXLocation() < width - margin) {
    right();
  } else if (index == 2 && p.getXLocation() > margin) {
    left();
  } else  if (index == 3 && p.getYLocation() < height - margin ) {
    down();
  } else if (index == 4 && p.getYLocation() > margin) {
    up();
  }
}

void end(int d){
 clear(); 
 fill (#FAE600);
 arc(xLoc, yLoc, 30, 30, a, b - QUARTER_PI * d ); 
 delay(200); 
}
}