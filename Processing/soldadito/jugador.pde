//  Clase Jugador
//  Máquina de estados interna:
//    estadoAnim == 0  →  CORRIENDO  (frames 0–5)
//    estadoAnim == 1  →  DISPARANDO (frames 6–11)
class Jugador {

  float x, y;
  float vx = 0;
  float speed = 4;

  // --- sprite ---
  PImage sheet;
  int totalFrames = 12;     // el sheet tiene 12 columnas
  int frameW, frameH;
  int frameActual = 0;
  int ticksFrame = 0;
  int velocidadAnim = 6;    // cuántos draw() por frame

  // ── máquina de estados del jugador ──
  int estadoAnim = 0;       // 0=corriendo  1=disparando

  // ---------------------------------------------------------------
  Jugador(float px, float py, PImage s) {
    x = px;
    y = py;
    sheet = s;
    frameW = sheet.width  / totalFrames;   // ancho de 1 frame
    frameH = sheet.height;
  }

  // ---------------------------------------------------------------
  void update() {
    x += vx;
    x = constrain(x, frameW / 2, width - frameW / 2);

    // ── animación: avanzar frame ──────────────────────────────
    ticksFrame++;
    if (ticksFrame >= velocidadAnim) {
      ticksFrame = 0;
      frameActual++;

      // ★ la máquina de estados decide el rango de frames
      if (estadoAnim == 0) {
        // corriendo: frames 0 a 5
        if (frameActual > 5) frameActual = 0;
      } else {
        // disparando: frames 6 a 11
        if (frameActual > 11) {
          frameActual = 6;
          // ← animación de disparo completa → volvemos a correr
          estadoAnim = 0;
          frameActual = 0;
        }
      }
    }
  }

  // ---------------------------------------------------------------
  void dibujar() {
    // recortamos el frame correcto del sprite sheet
    // frameW * frameActual = posición X dentro del sheet
    PImage frame = sheet.get(frameW * frameActual, 0, frameW, frameH);

    imageMode(CENTER);
    image(frame, x, y);

    // debug: muestra el estado actual (puedes comentar esto)
    fill(255, 200, 0);
    textAlign(CENTER, BOTTOM);
    textSize(12);
    text(estadoAnim == 0 ? "corriendo" : "disparando", x, y - frameH / 2 - 4);
  }

  // ---------------------------------------------------------------
  void teclaPresionada(char k) {
    if (k == CODED) return;

    if (k == 'a' || k == 'A') vx = -speed;
    if (k == 'd' || k == 'D') {
      // ★ TRANSICIÓN: corriendo → disparando
      if (estadoAnim == 0) {
        estadoAnim = 1;
        frameActual = 6;   // empezamos directo en el primer frame de disparo
        ticksFrame = 0;
      }
    }
  }

  void teclaLiberada(char k) {
    if (k == 'a' || k == 'A') vx = 0;
  }
}
