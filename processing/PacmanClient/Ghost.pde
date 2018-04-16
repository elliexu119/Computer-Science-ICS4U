public class Ghost {
  //class constants
  private static final int STEP_SIZE = 6; 
  //class variables
  //object variables 
  private int xLoc = width/2-200;
  private int yLoc = height/2;

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
    //rect(xLoc, yLoc, 30, 15);
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
  boolean left = false; 
  public void follow() {
    //follows pacman
    if (this.xLoc > p.getXLocation() + STEP_SIZE && !checkColour(-15, 0)) {
      left();
    } else if (this.xLoc < p.getXLocation() - STEP_SIZE && !checkColour(15, 0) && !left) {
      right();
      left = false;
    } else if (this.yLoc < p.getYLocation() - STEP_SIZE && !checkColour(0, 30)) {
      down();
    } else if (this.yLoc > p.getYLocation() + STEP_SIZE && !checkColour(0, -15)) {
      up();
    } else {
      while (!checkColour(-30, 0)) { 
        left();
        left = true;
      }
    }
  }
  
  
  boolean direction[] = new boolean [5]; 
  boolean sub[] = new boolean [4]; 
  public void randomly() {
    //moves the ghost in random directions 
    //int marginMutliple = (int) (Math.random()* (7) + 1);
    if (checkColour(5, 0) ) { //right
      direction[0] = true;
      
    } else {
      direction[0] = false;
    }
    if (checkColour(-5, 0)) { //left
      direction[1] = true;
    } else {
      direction[1] = false;
    }
    if (checkColour(0, -20)) { //up
      direction[3] = true;
    } else {
      direction[3] = false;
    }
    if (checkColour(0, 20)) { //down
      direction[2] = true;
    } else {
      direction[2] = false;
    }
    boolean neww = false;
    for (int i = 0; i < sub.length; i++){
      if (sub[i] != direction[i]){
       neww = true;  
      }
    }
    if (neww || direction[4] == false) {
      random = (int) (Math.random()* 4 + 1);
    }
    direction[4] = false; 
    //println(random + " " + frameCount);    
println(direction); 

    switch(random) {
    case 1: 
      if (direction[0] == true && checkColour(5, 0)) {
        right();
        direction[4] = true;
      }
      break;
    case 2: 
      if (direction[1] == true && checkColour(-5, 0)) {
        left();
        direction[4] = true;
      }
      break;
    case 3: 
      if (direction[2] == true && checkColour(0, 20)) {
        down();
        direction[4] = true;
      }
      break;
    case 4: 
      if (direction[3] == true && checkColour(0, -20)) {
        up();
        direction[4] = true;
      }
      break;
    }
    for (int i = 0; i < sub.length; i++){
     sub[i] = direction[i];  
    }


    //if (!checkColour(15, 0) || !checkColour (-15, 0)) { // 
    //  if (random == 3 || random == 4 || random == 0){
    //    random = (int) (Math.random()*2 + 1);
    //  }
    //  //!checkColour(0, -15) || !checkColour (0, 30) || 
    //} else if (!checkColour(0, -15) || !checkColour (0, 30)){
    //   random = (int) (Math.random()*2 + 3);  
    //  }

    //if (random == 1 && this.xLoc < width - margin * marginMutliple && !checkColour(15, 0)) {
    //  right();
    //} else if (random == 2 && this.xLoc > margin * marginMutliple && !checkColour(-15, 0)) {
    //  left();
    //} else if (random == 3 && this.yLoc < height - margin * marginMutliple && !checkColour(0, 30)) {
    //  down();
    //} else if (random == 4 && this.yLoc > margin * marginMutliple && !checkColour(0, -15)) {
    //  up();
    //}


    //if (random == 1 && this.xLoc < width - margin * marginMutliple && !checkColour(15, 0)) {
    //  right();
    //} else if (random == 2 && this.xLoc > margin * marginMutliple && !checkColour(-15, 0)) {
    //  left();
    //} else if (random == 3 && this.yLoc < height - margin * marginMutliple && !checkColour(0, 30)) {
    //  down();
    //} else if (random == 4 && this.yLoc > margin * marginMutliple && !checkColour(0, -15)) {
    //  up();
    //} 
    //else if (!checkColour(0, -15) || !checkColour (0, 30) || !checkColour(15, 0) || !checkColour (-15, 0)) { // 
    //  random = (int) (Math.random()*4 + 1);
    //}
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
    int x = this.getXLocation() + extraX; //adding the extraX gives it a blue reading even when it's black //??????? needs to be solved 
    println(x); 
    if (blue(get().pixels[x + (this.getYLocation() + extraY) * width]) > 0) {
     
      println(blue(get().pixels[x + (this.getYLocation() + extraY) * width]));
       return false;
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
      //  return true;
      //}
      return true;
    }
  }
}