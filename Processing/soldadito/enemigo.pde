
class Enemigo {

  float x, y;
  float vx = 2.5;        // velocidad horizontal
  float bajada = 30;     // cuántos px baja al rebotar
  float radio = 20;

  // colores para dar variedad
  color col;

  // ---------------------------------------------------------------
  Enemigo(float px, float py) {
    x = px;
    y = py;
    // color aleatorio entre rojos y naranjas
    col = color(random(180, 255), random(30, 100), 40);
  }

  // ---------------------------------------------------------------
  void update() {
    x += vx;

    // rebote en bordes + bajada
    if (x > width - radio || x < radio) {
      vx *= -1;
      y += bajada;
    }
  }

  // ---------------------------------------------------------------
  void dibujar() {
    // cuerpo
    fill(col);
    noStroke();
    ellipse(x, y, radio * 2, radio * 2);

    // "ojos" para que parezca un bicho
    fill(255);
    ellipse(x - 6, y - 4, 8, 8);
    ellipse(x + 6, y - 4, 8, 8);
    fill(0);
    ellipse(x - 5, y - 4, 4, 4);
    ellipse(x + 7, y - 4, 4, 4);
  }
}
