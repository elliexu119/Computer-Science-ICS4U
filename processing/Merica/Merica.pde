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

int value;
String fileName;
String[][] electionResults;

/*
 * SETUP; CALLED ONCE @ STARTUP
 */
void setup() {

  size( 1200, 600 );

  // DEFAULT MAP
  fileName = FILE_NAMES_ELECTIONS[0];
  drawMap();
  // ELECTION RESULTS
  //electionResult();
}

/*
 * ELECTION RESULTS
 * - parse election file INTO electionResults[][] 2D-Array, or data structure of your choice.
 */
void electionResult( ) {
  try {

    // ELECTION RESULT DATA
    Scanner data = new Scanner( new File( dataPath("") + "\\" + fileName ) );


    data.close();
  }
  catch (Exception e ) {
    e.printStackTrace();
  }
}

/*
 * DRAW MAP OFF USA w/ Election Results
 */
void drawMap() {
  // MAP
  try {

    // USA MAP DATA
    Scanner data = new Scanner( new File( dataPath("") + "\\USA.txt" ) );
    beginShape();
    String temp;
    int points;
    StringTokenizer token;
    data.nextLine();
    data.nextLine();
    int regions = Integer.parseInt(data.nextLine());


    for (int a = 0; a < regions; a++) {
      data.nextLine();
      data.nextLine();
      data.nextLine();
      points = Integer.parseInt(data.nextLine());
      System.out.println(points);
      for (int i = 0; i <= points; i ++) {
        //System.out.println(i);
        temp = data.nextLine();
        //System.out.println(temp);
        token = new StringTokenizer(temp);
        while (token.hasMoreTokens()) {
          vertex(Float.parseFloat(token.nextToken().trim())+200, Float.parseFloat(token.nextToken())+200);
        }
      }
    }


    endShape(CLOSE);
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
  if ( key >= 'a' && key <= ( 'a' + FILE_NAMES_ELECTIONS.length - 1 )  ) {
    fileName = FILE_NAMES_ELECTIONS[key-'a'];
    print( fileName );
    electionResult();
  }
}