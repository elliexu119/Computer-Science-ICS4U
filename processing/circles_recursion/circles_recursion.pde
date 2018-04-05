void setup() {
  size (600, 600); 
  background (0); 
  ellip(0); 
}
void draw() {
  clear(); 
  //background ((int) (Math.random()*255));
  ellip(0); 
  //delay(100);
}

void ellip(int d) {
  int speed = mouseX/60; 
  //stroke(255); 
  stroke ((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255)); 
  d ++; 
  noFill();
  if (d < width*3) {
    if (d% (int)(Math.random()*200 + 1) == 0){
          ellipse(mouseX + d, mouseY, d * speed, d  * speed);
          ellipse(mouseX - d, mouseY, d * speed, d  * speed);
          ellipse(mouseX, mouseY + d, d * speed, d  * speed);
          ellipse(mouseX, mouseY - d, d * speed, d  * speed);
    }
    ellip(d);
  }
}

void mouseMoved(){
   //fill(0, 0, 0, 63); 
   //rect(0, 0, width, height); 

}
