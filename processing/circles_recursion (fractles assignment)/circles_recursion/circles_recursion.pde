int speed = 1; 
void setup() {
  size (600, 600); 
  ellip(0); 
}
void draw() {
  clear(); 
  background(#00385A); 
  //background ((int) (Math.random()*255));
  ellip(0); 
}

void ellip(int d) {
  int shape = mouseX/60 + 1; //(int) (Math.random()*10) mouseX/60 + 1
  //println(speed); 
  //stroke(255); 
  strokeWeight(5);
  stroke ((int) (Math.random()*150+100), (int) (Math.random()*150+100), (int) (Math.random()*150+100)); 
  d ++; 
  noFill();
  if (d < width*3) {
    if (d% (int)(Math.random()*250+ 1) == 0) //the frequency at which the patterns appear
    {
          delay(speed); 
          ellipse(mouseX + d, mouseY, d * shape, d  * shape);
          ellipse(mouseX - d, mouseY, d * shape, d  * shape);
          ellipse(mouseX, mouseY + d, d * shape, d  * shape);
          ellipse(mouseX, mouseY - d, d * shape, d  * shape);
    }
    ellip(d);
  }
}

void mouseMoved(){
   //fill(0, 0, 0, 63); 
   //rect(0, 0, width, height); 

}