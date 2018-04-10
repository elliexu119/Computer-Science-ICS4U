Pacman p;
Ghost g; 
int index = 0; 
int margin = 40; 
boolean back = false; 
void setup() {
  size (600, 600); 
  p = new Pacman(); 
  g = new Ghost();
}

void draw() {
  if (p.getXLocation() >= g.getXLocation() - 10 && p.getXLocation() <= g.getXLocation() + 10*4 && p.getYLocation() >= g.getYLocation()- 10 && p.getYLocation() <= g.getYLocation()+ 10*4 ) {
    //clear();
    textSize(32);
    fill(255);
    text("GAME OVER", width/2, height/2);
  } else {

    clear(); 
    p.draw(); 
    g.draw(); 

    int random = (int) (Math.random()*5); 
    switch (random) {
    case 1: 
      if (g.getXLocation() < width - margin) {
        g.move();
      }
      break;
    case 2: 
      if (g.getXLocation() > margin) {
        g.move2();
      }
      break;
    case 3: 
      if (g.getYLocation() < height - margin ) {
        g.move3();
      }
      break;
    case 4:
      if (g.getYLocation() > margin) {
        println(g.getYLocation());
        g.move4();
      }
    }


    //if (back == false && g.getXLocation() < width - margin) {
    //  //p.move(); 
    //  g.move();
    //} else if (back == false) {
    //  g.yLoc = g.yLoc + 50;
    //  back = true;
    //}
    //if (back == true && g.getXLocation() > margin) {
    //  g.move2();
    //} else if (back == true) {
    //  back = false;  
    //  g.yLoc = g.yLoc + 50;
    //}

    //PACMAN
    switch (index) {
    case 1: 
      if (p.getXLocation() < width - margin) {
        p.move();
        //g.move();
      }
      break;
    case 2: 
      if (p.getXLocation() > margin) {
        p.move2();
        //g.move2();
      }
      break;
    case 3: 
      if (p.getYLocation() < height - margin ) {
        p.move3();
        //g.move3();
      }
      break;
    case 4:
      if (p.getYLocation() > margin) {
        println(p.getYLocation());
        p.move4();
        //g.move4();
      }
    }
  }
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == RIGHT) {
      index = 1;
    }
    if (keyCode == LEFT) {
      index = 2;
    }
    if (keyCode == DOWN) {
      index = 3;
    }
    if (keyCode == UP) {
      index = 4;
    }
  }
}
