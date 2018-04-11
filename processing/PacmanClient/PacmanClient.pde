Pacman p;
Ghost g; 
int index = 0; 
int margin = 40; 
int random = 1; 
int life = 3; 
void setup() {
  size (600, 600); 
  p = new Pacman(); 
  g = new Ghost();
}

void draw() {
  if (p.getXLocation() >= g.getXLocation() - 10 && p.getXLocation() <= g.getXLocation() + 10*4 && p.getYLocation() >= g.getYLocation()- 10 && p.getYLocation() <= g.getYLocation()+ 10*4 ) {
    textSize(32);
    fill((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    text("GAME OVER", width/2-100, height/2);
    delay(100);
    if (keyPressed && life > 1) {
      clear();
      size (600, 600); 
      p = new Pacman(); 
      g = new Ghost();
      index = 0;
      life --;
    } else if (life == 1) {
      life = 0;
    }
  } else {
    clear(); 
    p.draw(); 
    g.draw(); 

    pacman(); 
    //randomly(); 
    follow();
  }
  textSize(20); 
  fill(255); 
  text("LIFES LEFT: " + life, margin, margin);
}



void follow() {
  //follows pacman
  if (g.getXLocation() > p.getXLocation()) {
    g.move2();
  } else if (g.getXLocation() < p.getXLocation()) {
    g.move();
  } else if (g.getYLocation() < p.getYLocation()) {
    g.move3();
  } else if (g.getYLocation() > p.getYLocation()) {
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
