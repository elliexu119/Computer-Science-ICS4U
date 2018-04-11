public class Ghost {
  //class constants
  private static final int STEP_SIZE = 8; 
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
    if (this.xLoc > p.getXLocation() + STEP_SIZE) {
      left();
    } else if (this.xLoc < p.getXLocation() - STEP_SIZE) {
      right();
    } else if (this.yLoc < p.getYLocation() - STEP_SIZE) {
      down();
    } else if (this.yLoc > p.getYLocation() + STEP_SIZE) {
      up();
    }
  }

  public void randomly() {
    //moves the ghost in random directions 
    int marginMutliple = (int) (Math.random()* (5) + 1);
    if (random == 1 && this.xLoc < width - margin * marginMutliple) {
      right();
    } else if (random == 2 && this.xLoc > margin * marginMutliple) {
      left();
    } else if (random == 3 && this.yLoc < height - margin * marginMutliple) {
      down();
    } else if (random == 4 && this.yLoc > margin * marginMutliple) {
      //println(blinky.getYLocation());
      up();
    } else {
      random = (int) (Math.random()*4 + 1);
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
}