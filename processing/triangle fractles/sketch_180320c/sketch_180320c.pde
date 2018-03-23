void setup() {
  size (600, 600); 
  background(255); 

  int sl = width; 
  int h = (int) Math. sqrt((sl) * sl - sl/2 * sl/2); 

  fill ((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  fractureTriangle(width/2, 0, width);
}

void fractureTriangle(int x, int y, int sl) {
  int h = (int) Math. sqrt((sl) * sl - sl/2 * sl/2); 
  triangle(
    x, y, 
    x - sl/2, h, 
    x + (sl/2), h);

  if (sl > 2) {
    int newH = (int) Math. sqrt((sl/2) * sl/2 - sl/4 * sl/4); 
    fractureTriangle(x, y, newH);
    fractureTriangle(x- h/4, y + newH, newH);
  }
}