void setup(){
 size (600, 600); 
 background(255); 
 
 rectMode(CENTER);
 fill(200,20,10); 
 fractureSquare(width/2, height/2, 200, 200);
 
 //fill(0); 
 //triangle(width/2+100, height/2 + 100, width/2-100, height/2 + 100, width/2, height/2); 
 //fill(0); 
 //triangle(width/2+100, height/2 - 100, width/2-100, height/2 - 100, width/2, height/2); 
}
void fractureSquare(int x, int y, int w, int h){
  if ( w / 3 > 2){
   fractureSquare(x-w/2, y-h/2, w/2, h/2); 
   fractureSquare(x+w/2, y-h/2, w/2, h/2);
   fractureSquare(x-w/2, y+h/2, w/2, h/2);
   fractureSquare(x+w/2, y+h/2, w/2, h/2);
  }
  fill ((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x, y, w, h); 
}