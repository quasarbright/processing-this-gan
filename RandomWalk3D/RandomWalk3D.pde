import peasy.*;

int popsize = 5;
int scale = 15;
int depth = 1000;
Walker[] walkers;
PeasyCam peasy;
void setup() {
  //size(1000, 1000, P3D);
  fullScreen(P3D);
  colorMode(HSB);
  strokeWeight(5);
  background(0);
  lights();
  peasy = new PeasyCam(this,depth+100);
  walkers = new Walker[popsize];
  for (int i = 0; i<popsize; i++) {
    walkers[i] = new Walker();
  }
}
void draw() {
  fill(0, 2);
  background(0);
  for (Walker walker : walkers) {
    walker.step();
    walker.show();
  }
}