int x,y;
int x1,y1;
boolean wPressed, aPressed, sPressed, dPressed;
boolean upPressed, downPressed, leftPressed, rightPressed;
PImage[] frames;
int current = 0;
int total = 17;
void setup(){
 size(700,700); 
 x =100; y=100;
 x1 =200; y1=200;
 frames = new PImage[total];
  
  // cargamos todas las imágenes
  for (int i = 0; i < total; i++) {
    frames[i] = loadImage("ninja_10KDStudios_run_" + (i+1) + ".png");
  }
}
void draw(){
  background(9);
  image(frames[current], x, y, frames[current].width, frames[current].height);
  move();
  //rect(x,y,80,80);
  //circle(x1,y1,80);
}


/*public void move(){
  if(keyPressed){
    if(key == 'a' | key == 'A' | keyCode == LEFT){
     x-=5; 
    }
    if(key == 'b' | key == 'B' | keyCode == RIGHT){
     x+=5; 
    }
    if(key == 's' | key == 'S' | keyCode == DOWN){
     y+=5; 
    }
    if(key == 'w' | key == 'W' | keyCode == UP){
     y-=5; 
    }
  }
}*/
void move() {
  // Jugador 1 - WASD
  if (aPressed) x1 -= 5;
  if (dPressed) x1 += 5;
  if (wPressed) y1 -= 5;
  if (sPressed) y1 += 5;
  
  // Jugador 2 - Flechas
  if (leftPressed) x -= 5;
  if (rightPressed) {x += 5;
  current+=1;
}
  if (upPressed) y -= 5;
  if (downPressed) y += 5;
  
  x = constrain(x, 0, width - 80);
  y = constrain(y, 0, height- 80);
  x1 = constrain(x1, 40, width- 40);
  y1 = constrain(y1, 40, height- 40);
  if(current > total-1)current=0;
}

void keyPressed() {
  // WASD
  if (key == 'w' || key == 'W') wPressed = true;
  if (key == 'a' || key == 'A') aPressed = true;
  if (key == 's' || key == 'S') sPressed = true;
  if (key == 'd' || key == 'D') dPressed = true;
  
  // Flechas
  if (keyCode == UP) upPressed = true;
  if (keyCode == DOWN) downPressed = true;
  if (keyCode == LEFT) leftPressed = true;
  if (keyCode == RIGHT) rightPressed = true;
}

void keyReleased() {
  // WASD
  if (key == 'w' || key == 'W') wPressed = false;
  if (key == 'a' || key == 'A') aPressed = false;
  if (key == 's' || key == 'S') sPressed = false;
  if (key == 'd' || key == 'D') dPressed = false;
  
  // Flechas
  if (keyCode == UP) upPressed = false;
  if (keyCode == DOWN) downPressed = false;
  if (keyCode == LEFT) leftPressed = false;
  if (keyCode == RIGHT) rightPressed = false;
}