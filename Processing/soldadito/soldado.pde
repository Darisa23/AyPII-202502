//Una clase que será para nuestro jugador, luffy :)
class Soldado{
  //1. defino atributos:
  PImage sheet;
  int w, h;
  int x, y, lx;
  float vx, vy, vmax;
  int sw, sx, sy;
  int px, py;
  float a;
  int salto, ymax,yi;
  boolean sobresuelo;
  int aux=0, aux2=0;
  //Constructor:
  Soldado(){
    sheet = loadImage("soldado.png");
    x=150; y=358; vy=0;sx=1280; sy=853;
    px=50; py=50;
    sobresuelo = true;
    vx=0;vmax=12; a=1;salto=60;
  }
  //
   void aparece(){
    copy(sheet, 3*192, 3*205, sx, sy, x, y, 792, 805);
   //text(scroll,50,50);
  }
  //cambia la posición:
  void update(){
    if (sobresuelo==false) {
        vy += 1; // Gravedad
        y += vy; // Mover al personaje hacia abajo
    }
    //int tileCol = x / 32; // Columna del tile
    //int tileRow = (y + 53) / 32; // Fila del tile en la parte inferior

}
}
