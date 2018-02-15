/*
 *
 */
package unit1;

import java.io.File;
import java.io.PrintWriter;
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

        int option;
        String text, sub;
        boolean end = false;
        while (end == false) {
            option = 0;
            sopl("What would you like to do? ");
            sopl("1: Get the score of a word.");
            sopl("2: Get the average score of words in a file (one word per line).");
            sopl("3: Find the highest/lowest scoring words in a file.");
            sopl("4: Sort words from a file into posistive.txt and negative.txt");
            sopl("5: Exit the program.");

            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    sopl("Enter a word ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");
                    double wordCount = wordCount(text, reviews);
                    System.out.println( "Word Average: " + wordAverage(wordCount, text));
                    sopl("");
                    break;
                case 2:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    sentenceAverage(text);
                    sopl("");
                    break;
                case 3:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    higestWordRating(text);
                    sopl("");
                    break;
                case 4:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    writeTxt(text);
                    sopl("");
                    break;
                case 5:
                    end = true;
                    break;
                default:
                    sopl("This is not an option... yet. \n");
            }
            count2 = 0; 
        }
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
        double time = wordTotalScore(rate, search);
        sopl("the word " + search.trim() + " appears for " + time + " times");
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
    public static double wordTotalScore(String rate[], String search) throws Exception {
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
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     */
    public static double wordAverage(double time, String search) throws Exception {
        double average = -1;
        if (time != 0) {
            average = (count2 / time);
            sopl(search.trim() + "'s average is " + average + "\n");
        }
        
        return average;
    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given th specified movie review file.
     */
    public static double sentenceAverage(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");
        double numerator = 0, rating;
        for (int i = 0; i < sentence.length; i++) {
            numerator = numerator + wordAverage(wordCount(sentence[i], reviews), sentence[i]);
        }        
        
        sopl(numerator);
        rating = numerator / sentence.length;
        sopl(rating);
        sopl("-------------------------------");

        if (rating < 2) {
            sopl("the overal sentiment of the review is negative");
        } else if (rating > 2) {
            sopl("the overal sentiment of the review is positive");
        } else {
            sopl("the overal sentiment of the review is neutral");
        }
        return rating;
    }

    public static void higestWordRating(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        double[] ratings = new double[sentence.length];
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");

        for (int i = 0; i < sentence.length; i++) {
            double wordCount = wordCount(sentence[i], reviews);
            ratings[i] = wordAverage(wordCount, sentence[i]);
        }

        double max, min;
        int maxV = -1, minV = -1;
        max = ratings[0];
        min = ratings[0];
        for (int a = 0; a < 2; a++) {
            for (int i = 1; i < ratings.length; i++) {
                if (a == 0) {
                    if (ratings[i] > max) {
                        max = ratings[i];
                        maxV = i;
                    }
                } else if (ratings[i] < min) {
                    min = ratings[i];
                    minV = i;
                }
            }
        }

        sopl("-------------------------------");
        if (maxV != -1) {
            sopl("the word with the highest rating is " + sentence[maxV] + ". With a rating of " + ratings[maxV]);
        }
        if (minV != -1) {
            sopl("the word with the lowest rating is " + sentence[minV] + ". With a rating of " + ratings[minV]);
        }
    }

    public static void writeTxt(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        File positive = new File("posistive reviews.txt");
        File negative = new File("negative reviews.txt");
        PrintWriter positiveWriter = new PrintWriter(positive);
        PrintWriter negativeWriter = new PrintWriter(negative);
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");

        for (int i = 0; i < sentence.length; i++) {
            //sopl(wordAverage(wordCount(sentence[i], reviews)));
            if (wordAverage(wordCount(sentence[i], reviews), sentence[i]) < 2) {
                negativeWriter.write(sentence[i] + " ");
            } else if (wordAverage(wordCount(sentence[i], reviews), sentence[i]) > 2) {
                positiveWriter.write(sentence[i] + " ");

            }
            count2 = 0; 
        }
        positiveWriter.close();
        negativeWriter.close();
    }

    public static String[] readTxt(String fileName) throws Exception {
        //transfering data from txt file to array
        File reviews = new File(fileName);
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
        return sentence;
    }
}
