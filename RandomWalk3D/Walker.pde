import java.util.ArrayList;
class Walker {
  PVector pos;
  PVector[] MOVES;
  ArrayList<PVector> history;
  int hu;
  Walker() {
    pos = new PVector(0, 0, 0);
    MOVES = new PVector[6];
    history = new ArrayList<PVector>();
    hu = floor(random(256));
    MOVES[0] = new PVector(1, 0, 0);
    MOVES[1] = new PVector(0, 1, 0);
    MOVES[4] = new PVector(0, 0, 1);
    MOVES[2] = new PVector(-1, 0, 0);
    MOVES[3] = new PVector(0, -1, 0);
    MOVES[5] = new PVector(0, 0, -1);
  }
  void reset() {
    pos = new PVector(0, 0, 0);
    history = new ArrayList<PVector>();
    hu = floor(random(256));
  }
  void step() {
    PVector move = MOVES[floor(random(MOVES.length))].copy();
    move.mult(scale);
    history.add(pos.copy());
    pos.add(move);
    if (pos.x<-width/2 || pos.x>width/2 || pos.y<-height/2 ||pos.y>height/2 || pos.z<-depth/2 || pos.z>depth/2) {
      reset();
    }
  }
  void show() {
    for (int i = 0; i<history.size()-1; i++) {
      int alpha = floor(map(i, 0, history.size(), 0, 255));
      stroke(hu, 255, 255, alpha);
      PVector a = history.get(i);
      PVector b = history.get(i+1);
      line(a.x, a.y, a.z, b.x, b.y, b.z);
    }
  }
}