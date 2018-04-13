public class Ghost {
  //class constants
  private static final int STEP_SIZE = 2; 
  //class variables
  //object variables 
  private int xLoc = width/2 + 100;
  private int yLoc = height - 50;

  //three constructors: empty, primary key, secondary key

  //getters and setters
  public int getXLocation() {
    return this.xLoc;
  }

  public int getYLocation() {
    return this.yLoc;
  }

  public void draw(color col) {
    noStroke();
    fill(col); 
    ellipse(xLoc + 15, yLoc, 30, 30); 
    rect(xLoc, yLoc, 30, 30);
    fill(255);
    ellipse(xLoc + 8, yLoc, 10, 15); 
    ellipse(xLoc + 22, yLoc, 10, 15); 

    //ghosts' eyes follow pacman 
    fill(#0040C6); 
    if (this.yLoc < p.getYLocation() - STEP_SIZE) {
      ellipse(xLoc + 8, yLoc + 2.5, 10, 10); 
      ellipse(xLoc + 22, yLoc + 2.5, 10, 10);
    } else if (this.yLoc > p.getYLocation() + STEP_SIZE) {
      ellipse(xLoc + 8, yLoc - 2.5, 10, 10); 
      ellipse(xLoc + 22, yLoc - 2.5, 10, 10);
    } else {
      ellipse(xLoc + 8, yLoc, 10, 10); 
      ellipse(xLoc + 22, yLoc, 10, 10);
    }
  }
  public void right() {
    this.xLoc = this.xLoc + STEP_SIZE;
  }

  public void left() {
    this.xLoc = this.xLoc - STEP_SIZE;
  }

  public void down() {
    this.yLoc = this.yLoc + STEP_SIZE;
  }

  public void up() {
    this.yLoc = this.yLoc - STEP_SIZE;
  }

  public void follow() {
    //follows pacman
    if (this.xLoc > p.getXLocation() + STEP_SIZE && !checkColour(-15, 0)) {
      left();
    } else if (this.xLoc < p.getXLocation() - STEP_SIZE && !checkColour(15, 0)) {
      right();
    } else if (this.yLoc < p.getYLocation() - STEP_SIZE && !checkColour(0, 15)) {
      down();
    } else if (this.yLoc > p.getYLocation() + STEP_SIZE && !checkColour(0, -15)) {
      up();
    }
    else {
      randomly(); 
    }
  }
boolean ran = false;
  public void randomly() {
    //moves the ghost in random directions 
    int marginMutliple = (int) (Math.random()* (10) + 1);
    
    if (random == 1 && this.xLoc < width - margin * marginMutliple && !checkColour(15, 0)) {
      right();
    } else if (random == 2 && this.xLoc > margin * marginMutliple && !checkColour(-15, 0)) {
      left();
    } else if (random == 3 && this.yLoc < height - margin * marginMutliple && !checkColour(0, 15)) {
      down();
    } else if (random == 4 && this.yLoc > margin * marginMutliple && !checkColour(0, -15)) {
      up();
    } else {
      if (!checkColour(15, 0) || !checkColour (-15, 0) && !ran){
      random = (int) (Math.random()*2 + 1);
      ran = true; 
      println("sideways"); 
    }
    if ((!checkColour(0, -15) || !checkColour (0, 15)) && ran){ // 
      random = (int) (Math.random()*4 + 3);
      ran = false;
      println("up");
    }
    
    }
  }

  public void ambush() {
    //ambushes pacman  
    if (index == 0) { 
      randomly();
    } else if (index == 1 || index == 2) { 
      if (index == 1 && this.xLoc < p.getXLocation() + 100 && this.xLoc < width - margin) {
        right();
      } else 
      if (index == 2 && this.xLoc > p.getXLocation() - 100 && this.xLoc > margin) {
        left();
      } else if (this.yLoc < p.getYLocation()) {
        down();
      } else if (this.yLoc > p.getYLocation()) {
        up();
      }
    } else if (index == 3 || index == 4) {
      if (index == 4 && this.yLoc > p.getYLocation() - 100 && this.yLoc > margin) {
        up();
      } else if (index == 3 && this.yLoc < p.getYLocation() + 100 && this.yLoc < height - margin) {
        down();
      } else if (this.xLoc < p.getXLocation()) {
        right();
      } else if (this.xLoc > p.getXLocation()) {
        left();
      }
    }
  }
  
   boolean checkColour(int extraX, int extraY) {
    if (blue(get().pixels[this.getXLocation() + extraX + (this.getYLocation() + extraY) * width]) > 0) {
      return true;
    } else {
      //if (extraX != 0 || extraY != 0) {
      //  if (extraX < 0) {
      //    extraX ++;
      //  } else if (extraX > 0) {
      //    extraX --;
      //  }
      //  if (extraY < 0) {
      //    extraY ++;
      //  } else if (extraY > 0) {
      //    extraY --;
      //  }
      //  return checkColour(extraX, extraY);
      //} else {
      //  return false;
      //}
      return false; 
    }
  }
}