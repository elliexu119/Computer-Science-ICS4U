void setup() {
  size (600, 600); 
  background (0); 
}
void draw() {
  ellip(0); 
   
}

void ellip(int d) {
  int speed = 1; 
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
    fill(0); 
   rect(0, 0, width, height); 
}