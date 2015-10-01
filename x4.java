float button1X=280, button1Y=200, button1W=100, button1H=60;

void setup() {
  size( 640,480 );
  background( 0,200,250 );
}

void draw() {
  showButton( button1X, button1Y, button1W, button1H );
  fill(0,0,0);
  text( "CLICK ME", button1X+button1W/5, button1Y+button1H*5/8 );
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
