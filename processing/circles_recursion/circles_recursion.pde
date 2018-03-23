void setup() {
  size (600, 600); 
  background (255); 
  stroke(0);
  //noFill(); 
  ellip(0); 
}
void draw() {
}

void ellip(int d) {
  int speed = 2; 
  fill ((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  if (frameCount%5 == 0 && d < 900/speed){
    d = d +5; 
    ellipse(width/2, height/2, d * speed , d  * speed);
    delay(100); 
    ellip(d); 
  } 
  //if (frameCount%10 == 0){
  // ellipse(width/2, height/2, 0,0);  
  //}
  else if (d >899/speed)  {
  }
    //ellipse(width/2, height/2, h, w);
}