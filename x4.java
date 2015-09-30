
float button1X=280, button1Y=200, button1W=100, button1H=60;
int counter=0;

void setup() {
  size( 640,480 );
}

void draw() {
  background( 0,200,250 );
  showButton( button1X, button1Y, button1W, button1H );
}

void showButton( float x, float y, float w, float h ) {
  fill( 0,255,0 );
  rect ( x,y, w,h );
}

void mousePressed() {
  if ((mouseX) > (button1X) &&
     (mouseX) < (button1X+button1W) &&
     (mouseY) > (button1Y) &&
     (mouseY) < (button1Y+button1H)); {
       background( 255,0,0 );
     }
}
