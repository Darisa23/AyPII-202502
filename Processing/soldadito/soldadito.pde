
//  ESTADOS DEL JUEGO:
//    0 = MENÚ
//    1 = JUGANDO
//    2 = FIN

int estado = 1;   // <-- este int ES la máquina de estados del juego
// --- objetos del juego ---
Soldado sol;
//ArrayList<Enemigo> enemigos;

// --- UI del menú ---
int btnX = 250, btnY = 220, btnW = 300, btnH = 60;

// --- puntaje ---
int puntos = 0;

// ---------------------------------------------------------------
void setup() {
  size(800, 500);
  //spriteSheet = loadImage("soldado.png");   // 12 frames horizontales
  //reiniciarJuego();
   sol = new Soldado();
}

// ---------------------------------------------------------------
void draw() {
  background(30);

  // ★ LA MÁQUINA DE ESTADOS: solo preguntamos qué estado hay
  if (estado == 0) dibujarMenu();
  if (estado == 1) {
    background(255,255,255);
    dibujarJuego();
  }
  //if (estado == 2) dibujarFin();
}

// ---------------------------------------------------------------
//  ESTADO 0 — MENÚ
// ---------------------------------------------------------------
void dibujarMenu() {
  textAlign(CENTER, CENTER);

  fill(255);
  textSize(40);
  text("INVASIÓN ESPACIAL", width / 2, 120);

  textSize(16);
  fill(180);
  text("Presiona D para disparar  |  Los enemigos avanzan solos", width / 2, 175);

  // ── botón JUGAR ──────────────────────────────────────────────
  // Detectamos si el mouse está encima → cambia color
  boolean sobreBtn = mouseX > btnX && mouseX < btnX + btnW &&
                     mouseY > btnY && mouseY < btnY + btnH;

  fill(sobreBtn ? color(80, 180, 80) : color(50, 130, 50));
  noStroke();
  rect(btnX, btnY, btnW, btnH, 12);

  fill(255);
  textSize(22);
  text("▶  JUGAR", btnX + btnW / 2, btnY + btnH / 2);
}

// ---------------------------------------------------------------
//  ESTADO 1 — JUGANDO
// ---------------------------------------------------------------
void dibujarJuego() {
  // actualizar y dibujar jugador
  sol.update();
sol.aparece();
}


void keyReleased() {
  if (estado == 1) {
    print("hola");
  }
}
