public class Pacman {
  //class constants
  private static final int STEP_SIZE = 5; 
  //class variables
  //object variables 
  int xLoc = width/2; //12
  int yLoc = height/2 + 45; //13
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


  private void right() {
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
    if (index == 1 && this.getXLocation() < width - margin && checkColour(15, 0) == false) { //(15, 0)
      right();
    } else if (index == 2 && this.getXLocation() > margin && checkColour(-15, 0) == false) { //(-15, 0)
      left();
    } else  if (index == 3 && this.getYLocation() < height - margin && checkColour(0, 15) == false ) { //(0, 15)
      down();
    } else if (index == 4 && this.getYLocation() > margin && checkColour(0, -15) == false) { //(0, -15
      up();
    }
  }

  void end(int d) {
    fill (#FAE600);
    arc(xLoc, yLoc, 30, 30, a, b - QUARTER_PI * d ); 
    delay(200);
  }

  boolean checkColour(int extraX, int extraY) {
    if (blue(get().pixels[this.getXLocation() + extraX + (this.getYLocation() + extraY) * width]) > 0) {
      //println("BLUE"); 
      return true;
    } else {
      if (extraX != 0 || extraY != 0) {
        if (extraX < 0) {
          extraX ++;
        } else if (extraX > 0) {
          extraX --;
        }
        if (extraY < 0) {
          extraY ++;
        } else if (extraY > 0) {
          extraY --;
        }
        return checkColour(extraX, extraY);
      } else {
        return false;
      }
    }
  }
}