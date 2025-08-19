PImage img;
float x,y;
void setup(){
// INIT PHASE: Se ejecuta una vez
  // Configuración de memoria, recursos, estado inicial
  size(700,700);
  img=loadImage("nombreImagen.extención");
  x = width/2;
  y = height/2;
}
void draw(){
  // UPDATE + RENDER PHASE:
  // Lógica + renderizado cada frame
  background(0); //Sin esto, obtenemos persistence de píxeles entre frames.
  stroke(255); //color del borde
  strokeWeight(30); //grosor del borde
  fill(0,0,200);
  circle(mouseX,mouseY,90);
  if ((keyPressed==true) && ((keyCode==LEFT)|(key=='a'))){
    x-=5;
  }
  if ((keyPressed==true) && (keyCode==UP)|(key=='w')){
    y-=5;
  }
  if ((keyPressed==true) && (key=='s')){
    y+=5;
  }
  if ((keyPressed==true) && (key=='d')){
    x+=5;
  }
  image(img,x,y,200,280);
}
