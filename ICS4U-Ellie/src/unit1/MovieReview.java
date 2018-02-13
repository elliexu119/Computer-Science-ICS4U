/*
 *
 */
package unit1;

import java.io.File;

/**
 * Movie Review Assignment
 *
 * @author Wm.Muir
 * @version 2017-18.S2
 */
public class MovieReview {

    public static void main( String[] args ) throws Exception {

        // MOVIE REVIEW FILE
        File reviews = new File( ".\\data\\movie.review\\MovieReviews.txt" );


    }

    /**
     * This method will count the number of reviews that contain the key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the number of reviews that contain the key work at least once.
     */
    public static int wordCount( String word, File reviews ) throws Exception {

       return -1;
       
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
    public static int wordTotalScore( String word, File reviews ) throws Exception {

        return -1;
    }

    /**
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     */
    public static double wordAverage( String word, File reviews ) throws Exception {

       return -1.0;
       
    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given th specified movie review file.
     */
    public static double sentenceAverage( File wordList, File reviews ) throws Exception {

        return -1.0;

    }

}
