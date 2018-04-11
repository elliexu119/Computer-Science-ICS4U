Pacman p;
Ghost g; 
int index = 0; 
int margin = 40; 
boolean back = false; 
int random = 1; 
void setup() {
  size (600, 600); 
  p = new Pacman(); 
  g = new Ghost();
}

void draw() {
  if (p.getXLocation() >= g.getXLocation() - 10 && p.getXLocation() <= g.getXLocation() + 10*4 && p.getYLocation() >= g.getYLocation()- 10 && p.getYLocation() <= g.getYLocation()+ 10*4 ) {
    //clear();
    textSize(32);
    fill((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    text("GAME OVER", width/2-100, height/2);
    delay(100);
  } else {
    clear(); 
    p.draw(); 
    g.draw(); 

    pacman(); 
    //randomly(); 
    follow();
  }
}



void follow() {
  //follows pacman
  if (g.getXLocation() > p.getXLocation()) {
    g.move2();
  } else if (g.getXLocation() < p.getXLocation()) {
    g.move();
  } else if (g.getYLocation() < p.getYLocation()) {
    g.move3();
  } else {
    g.move4();
  }
}

void pacman() {
  //PACMAN
  if (index == 1 && p.getXLocation() < width - margin) {
    p.move();
  } else if (index == 2 && p.getXLocation() > margin) {
    p.move2();
  } else  if (index == 3 && p.getYLocation() < height - margin ) {
    p.move3();
  } else if (index == 4 && p.getYLocation() > margin) {
    p.move4();
  }
}

void randomly() {
  //moves the ghost in random directions 
  if (random == 1 && g.getXLocation() < width - margin) {
    g.move();
  } else if (random == 2 && g.getXLocation() > margin) {
    g.move2();
  } else if (random == 3 && g.getYLocation() < height - margin ) {
    g.move3();
  } else if (random == 4 && g.getYLocation() > margin) {
    println(g.getYLocation());
    g.move4();
  } else {
    random = (int) (Math.random()*4 + 1);
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