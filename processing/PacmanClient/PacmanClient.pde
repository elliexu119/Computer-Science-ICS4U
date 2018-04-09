Pacman p;
Ghost g; 
boolean back = false; 
void setup(){
  size (600, 600); 
  p = new Pacman(); 
  g = new Ghost(); 
}
void draw(){
  clear(); 
  p.draw(); 
  g.draw(); 

  if (back == false && g.getXLocation() < width - 40){
   //p.move(); 
   g.move();
  }
  else if (back == false) {
    g.yLoc = g.yLoc + 50;
    back = true; 
  }
  if (back == true && g.getXLocation() > 40){
    g.move2();
  }
  else if (back == true){
   back = false;  
   g.yLoc = g.yLoc + 50;
  }
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == RIGHT) {
      println("right"); 
      clear(); 
      p.move(); 
    }
    if (keyCode == LEFT) {
      println("right"); 
      clear(); 
      p.move2(); 
    }
    if (keyCode == DOWN) {
      println("right"); 
      clear(); 
      p.move3(); 
    }
    if (keyCode == UP) {
      println("right"); 
      clear(); 
      p.move4(); 
    }
  }
}
