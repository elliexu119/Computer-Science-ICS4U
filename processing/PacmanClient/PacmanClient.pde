Pacman p;
boolean back = false; 
void setup(){
  size (600, 600); 
  p = new Pacman(); 
}
void draw(){
  p.draw(); 
  
  //if (back == false && p.getXLocation() < width - 40){
  // p.move(); 
  //}
  //else if (back == false) {
  //  p.yLoc = p.yLoc + 50;
  //  back = true; 
  //}
  //if (back == true && p.getXLocation() > 40){
  //  p.move2();
  //}
  //else if (back == true){
  // back = false;  
  // p.yLoc = p.yLoc + 50;
  //}
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
