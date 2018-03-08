/*
 * 'Merica
 * 2017-18.S2
 */
import java.util.Scanner;
import java.util.StringTokenizer;

final static String[] FILE_NAMES_ELECTIONS = {
  "USA1960.txt", "USA1964.txt", "USA1968.txt", "USA1972.txt", "USA1976.txt", 
  "USA1980.txt", "USA1984.txt", "USA1988.txt", "USA1992.txt", "USA1996.txt", 
  "USA2000.txt", "USA2004.txt", "USA2008.txt", "USA2012.txt", "USA2016.txt"
};

int value = 0, backgroundColor = 210;
String fileName;
String[][] electionResults;

/*
 * SETUP; CALLED ONCE @ STARTUP
 */
void setup() {

  background(backgroundColor); 
  size( 1200, 600 );
  fileName = FILE_NAMES_ELECTIONS[value];
  electionResult();
  drawMap();
  textFont(createFont("Arial", 24, true), 24);
  fill(0);
  int year = 1960 + value*4; 
  text("America: " + year, width - 220, height - 100);
}

/*
 * ELECTION RESULTS
 * - parse election file INTO electionResults[][] 2D-Array, or data structure of your choice.
 */
void electionResult( ) {
  try {

    // ELECTION RESULT DATA
    Scanner data = new Scanner( new File( dataPath("") + "\\" + fileName ) );
    StringTokenizer token;
    electionResults = new String [50][4]; 

    data.nextLine();
    for (int i = 0; i < 50; i++) {
      token = new StringTokenizer(data.nextLine(), ",");
      for (int j = 0; token.hasMoreTokens(); j++) {
        electionResults[i][j] = token.nextToken().trim();
      }
    }

    data.close();
  }
  catch (Exception e ) {
    e.printStackTrace();
  }
}
void draw() {
}
/*
 * DRAW MAP OFF USA w/ Election Results
 */
void drawMap() {
  // MAP
  try {

    // USA MAP DATA
    Scanner data = new Scanner( new File( dataPath("") + "\\USA.txt" ) );
    int points, regions;
    double minLong, minLat, maxLong, maxLat;
    String state;
    StringTokenizer token;
    token = new StringTokenizer(data.nextLine());
    minLong = Math.abs(Double.parseDouble(token.nextToken())); 
    minLat = Math.abs(Double.parseDouble(token.nextToken())); 
    token = new StringTokenizer(data.nextLine());
    maxLong = Math.abs(Double.parseDouble(token.nextToken())); 
    maxLat = Math.abs(Double.parseDouble(token.nextToken())); 
    regions = Integer.parseInt(data.nextLine());
    data.nextLine();

    for (int a = 0; a < regions; a++) {
      state = data.nextLine().trim();
      data.nextLine();
      points = Integer.parseInt(data.nextLine());
      beginShape();
      
      double multiple = (width/ (minLong - maxLong)); //scale the map so that at least the max and min Longitude points are shown 
      //double multiple = (height/ (maxLat - minLat)); //scale the map so that at least the max and min Latitiude points are shown 
      
      float moveLong = (float) ((width-((minLong - maxLong)*(multiple/1)))/2);
      float moveLat = (float) ((height-((maxLat - minLat)*(multiple)))/2);

      for (int i = 0; i <= points; i ++) {
        token = new StringTokenizer(data.nextLine());
        while (token.hasMoreTokens()) {
          stroke(backgroundColor);
          vertex((float) ((minLong + Float.parseFloat(token.nextToken().trim()))*(multiple/1)) + moveLong, (float) ((maxLat - Float.parseFloat(token.nextToken()))*multiple) + moveLat);
        }
      }
      //colour here
      int colorTrack = -1;
      for (int i = 0; i < electionResults.length; i++) {
        if (state.equalsIgnoreCase(electionResults[i][0])) {
          colorTrack = i; 
          break;
        }
      }
      if (colorTrack != -1) {
        int demoniator = Integer.parseInt(electionResults[colorTrack][2])+Integer.parseInt(electionResults[colorTrack][3])+Integer.parseInt(electionResults[colorTrack][1]);
        double top = Integer.parseInt(electionResults[colorTrack][2]);
        int r = (int) ((top/demoniator)*255); 
        top = Integer.parseInt(electionResults[colorTrack][3]);
        int g = (int) ((top/demoniator)*255); 
        top = Integer.parseInt(electionResults[colorTrack][1]);
        int b = (int) ((top/demoniator)*255); 
        fill(r, g, b);
      }

      endShape(CLOSE);
    }
    data.close();
  }
  catch (Exception e ) {
    e.printStackTrace();
  }
}

/*
 * Draw State
 */
void drawState( ) {
}

/*
 */


void keyPressed() {

  if (key == CODED) {
    if (keyCode == RIGHT) {
      value ++; 
      if (value > 14) {
        value = 0;
      }
    }
    if (keyCode == LEFT) {
      value --; 
      if (value < 0) {
        value = 14;
      }
      
    }
    fileName = FILE_NAMES_ELECTIONS[value];
      electionResult();
      drawMap();
      int year = 1960 + value*4; 
      fill(backgroundColor);
      stroke(backgroundColor);
      rect(width-220, height-100, 200, -20); 
      fill(0,0,0); 
      text("America: " + year, width - 220, height - 100);
  }
}