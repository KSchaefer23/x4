float button1X=280, button1Y=200, button1W=100, button1H=60;
int r,g,b;

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
  float r = random(255);
  float g = random(255);
  float b = random(255);
  fill( r,g,b );
  rect ( x,y, w,h );
}

void mousePressed() {
  if (mousePressed &&
     (mouseX) > (button1X) &&
     (mouseX) < (button1X+button1W) &&
     (mouseY) > (button1Y) &&
     (mouseY) < (button1Y+button1H)) {
       float r = random(255);
       float g = random(255);
       float b = random(255);
       background( r,g,b );
  } else {
    //background(0,200,250); // Resets color if clicked off button
  }
}
