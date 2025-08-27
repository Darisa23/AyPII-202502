int JUGANDO = 1;
int PAUSA = 2;
int GO=3;
int MENU = 4;
int inicio = 0;
int estadoActual = 0;
boolean tecla =false;
void setup(){
  size(1200,900);
}
void draw(){
  background(0,200,0);
  switch (estadoActual){
    case 0:
      inicio();
    break;
    case 1:
      otra();
    break;
    case 2:
    
    ;
    case 3:
    
    ;
    case 4:
    
    ;
    case 5:
    
    ; 
  }
  
}

void inicio(){
  fill(0);
  rectMode(CENTER);
  circle(width/2+120,height/2,100);
  if(width/2-130 <= mouseX && mouseX <= width/2-30 && height/2-50 <= mouseY &&  mouseY <= height/2+50 && mousePressed){
    print("CLICK EN EL CUADRADO");
    fill(100);
    cambiarEstado(1);
  }
  if((dist(width/2+120,height/2,mouseX,mouseY)<50) && mousePressed){
    print("CLICK EN EL CIRCULO");
    
  }
  square(width/2-80,height/2,100);
  /*if(tecla){
    print("tocó la a");
  }*/
}

void otra(){
  textSize(50);
  text("CAMBIASTE DE PANTALLA", width/2,height/2);
  fill(0);
}

void cambiarEstado(int estado){
  switch(estadoActual){
    case 0:
     estadoActual =estado;     
     break;    
  }
  
}
//CONTROLES:

void mousePressed(){
  
}

/*void keyPressed(){
  switch(estadoActual){
    case 0:
      if(key == 'A' | key == 'a'){
          tecla = true;      
      }
      
    break;
  }
}*/
