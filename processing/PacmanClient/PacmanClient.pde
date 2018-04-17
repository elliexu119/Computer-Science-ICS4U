import processing.sound.*;
SoundFile file; 

Pacman p;
Ghost blinky, clyde, pinky, inky; 
PImage img; 
int index = 0, margin = 10, random = 1, life = 3000, inkyMove = 1, counter = 0; 
void setup() {
  //file = new SoundFile (this, "G:\\ICS4U-Ellie\\processing\\PacManFever.mp3");
  //file.play(); 
  
  size (500, 600); 
  p = new Pacman(); 
  p.a = 7; 
  blinky = new Ghost();
  clyde = new Ghost(); 
  pinky = new Ghost(); 
  inky = new Ghost();
 img = loadImage("G:\\ICS4U-Ellie\\processing\\Originalpacmaze.png");
 img.resize(width, height); 
}

void draw() {
  if (crash(blinky) || crash(clyde) || crash(pinky) || crash(inky)) {
    end(); 
  } else {
    image(img, 0,0); 
    //clear(); 
    p.draw(); 
    //blinky.draw(#FF0D00); 
    clyde.draw(#FFAF00); 
    //pinky.draw(#FF6FEC); 
    //inky.draw(#0AFFE0); 

    p.pacman(); 
    //blinky.follow();
    clyde.randomly();
    //if (frameCount % 50 == 0) {
    //  inkyMove = (int) (Math.random()*2 + 1);
    //}
    //if (inkyMove == 1) {
    //  inky.randomly();
    //} else {
    //  inky.follow();
    //}
    //pinky.ambush();
  }
  
  textSize(20); 
  fill(255); 
  text("LIFES LEFT: " + life, margin, margin);
}

boolean crash(Ghost g) {
  if (p.getXLocation() >= g.getXLocation() - 10 && p.getXLocation() <= g.getXLocation() + 10*4 && p.getYLocation() >= g.getYLocation()- 10 && p.getYLocation() <= g.getYLocation()+ 10*4 ) {
    return true;
  } else {
    return false;
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

void end(){
  textSize(32);
    fill((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    text("GAME OVER", width/2-100, height/2);
    if (counter < 8) {
      image(img, 0,0); 
      p.end(counter);
      blinky.draw(#FF0D00); 
      clyde.draw(#FFAF00); 
      pinky.draw(#FF6FEC); 
      inky.draw(#0AFFE0); 
      counter++;
    }
    delay(100); 
    if (keyPressed && life > 1) {
      image(img, 0,0); 
      setup(); 
      index = 0;
      life --;
      counter = 0;
    } else if (life == 1) {
      life = 0;
    }
}
