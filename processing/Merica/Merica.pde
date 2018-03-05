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

  // ELECTION RESULTS
  electionResult();
  drawMap();
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
      System.out.println("");
    }

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
    int points, regions;
    String state;
    StringTokenizer token;
    data.nextLine();
    data.nextLine();
    regions = Integer.parseInt(data.nextLine());
    data.nextLine();

    for (int a = 0; a < regions; a++) {
      state = data.nextLine().trim();
      data.nextLine();
      points = Integer.parseInt(data.nextLine());
      beginShape();
      for (int i = 0; i <= points; i ++) {
        token = new StringTokenizer(data.nextLine());
        while (token.hasMoreTokens()) {
          float temp2 = Float.parseFloat(token.nextToken().trim()); 
          vertex((temp2)*(13) +1850, (Float.parseFloat(token.nextToken()))*-16 + 900);
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
      if (colorTrack != -1){
       if (Integer.parseInt(electionResults[colorTrack][1]) > Integer.parseInt(electionResults[colorTrack][2])){
         fill(255,28,21); 
       }
       else{
         fill(71,42,212); 
       }
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
  if ( key >= 'a' && key <= ( 'a' + FILE_NAMES_ELECTIONS.length - 1 )  ) {
    fileName = FILE_NAMES_ELECTIONS[key-'a'];
    print( fileName );
    electionResult();
  }
}