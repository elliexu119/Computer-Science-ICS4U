/*
 *
 */
package unit1;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import static resources.SOPL.sopl;

/**
 * Movie Review Assignment
 *
 * @author Wm.Muir
 * @version 2017-18.S2
 */
public class MovieReview {

    static double count2 = 0;
    public static void main(String[] args) throws Exception {

        // MOVIE REVIEW FILE
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine().toLowerCase().trim();
        double time = wordCount(search, reviews); 
        sopl("the word " + search + " appears for " + time + " times");
        wordAverage(time );
    }

    /**
     * This method will count the number of reviews that contain the key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the number of reviews that contain the key work at least once.
     */
    public static double wordCount(String search, File reviews) throws Exception {
        Scanner lines = new Scanner(reviews);
        Scanner file = new Scanner(reviews);
        int lineCount = 0;
        String[] sentence;
        while (lines.hasNext()) {
            lineCount++;
            lines.nextLine();
        }
        sentence = new String[lineCount];

        lineCount = 0;
        while (file.hasNext()) {
            sentence[lineCount] = (file.nextLine()).toLowerCase();
            lineCount++;
        }

        String[] rate = new String[5];
        int rateSub;
        for (int i = 0; i < sentence.length; i++) {
            rateSub = Integer.parseInt(Character.toString(sentence[i].charAt(0)));
            rate[rateSub] = sentence[i] + "***" + rate[rateSub];
        }

        double count = 0, time = 0, average = -1;
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] != null && rate[i].indexOf(search) != -1) {
                StringTokenizer token = new StringTokenizer(rate[i], "***");
                while (token.hasMoreTokens()) {
                    if (token.nextToken().indexOf(search) != -1) {
                        count++;
                    }
                }
                time = count + time;
                count2 = i * count + count2;
            }
            count = 0;
        }

        return time;
    }

    /**
     * This method will accumulate the the movie review scores that contain the
     * key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the sum of the scores for reviews that contain the key work at
     * least once.
     */
    public static int wordTotalScore(String word, File reviews) throws Exception {

        return -1;
    }

    /**
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     */
    public static double wordAverage(double time) throws Exception {
        double average = -1; 
        if (time != 0) {
            average = (count2 / time);
        }
        return average;

    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given th specified movie review file.
     */
    public static double sentenceAverage(File wordList, File reviews) throws Exception {

        return -1.0;

    }

}
