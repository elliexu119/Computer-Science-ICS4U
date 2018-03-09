/* 
 * Your majesty 
 * Tuesday, Feb 20, 2018
 * rotten tomatoe scores 
 */
package unit1_nums_strings;

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

    public static void main(String[] args) throws Exception {
        // MOVIE REVIEW FILE
        int option;
        String text, sub;
        boolean end = false;
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");

        //menu
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
                    text = input.nextLine().toLowerCase();
                    wordAverage(text, reviews);
                    sopl("");
                    break;
                case 2:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    File file = new File(text);
                    sentenceAverage(file, reviews);
                    sopl("");
                    break;
                case 3:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    file = new File(text);
                    higestWordRating(file, reviews);
                    sopl("");
                    break;
                case 4:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    file = new File(text);
                    writeTxt(file, reviews);
                    sopl("");
                    break;
                case 5:
                    end = true;
                    break;
                default:
                    sopl("This is not an option... yet. \n");
            }
        }
    }

    /**
     * This method will count the number of reviews that contain the key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the number of reviews that contain the key work at least once.
     * @throws java.lang.Exception
     */
    public static int wordCount(String word, File reviews) throws Exception {
        String[] rate = readFile(reviews);
        int count = 0, time = 0;

        //counts the accumulated ratings of a word and the number of times it appears. 
        word = " " + word + " ";
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] != null && rate[i].contains(word)) {
                StringTokenizer token = new StringTokenizer(rate[i], "***");
                while (token.hasMoreTokens()) {
                    if (token.nextToken().toLowerCase().contains(word)) {
                        count++;
                    }
                }
                time = count + time;
            }
            count = 0;
        }

        sopl("the word " + word.trim() + " appears for " + time + " times");
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
     * @throws java.lang.Exception
     */
    public static int wordTotalScore(String word, File reviews) throws Exception {
        String[] rate = readFile(reviews);
        int count = 0, time = 0, count2 = 0;
        
    //counts the accumulated ratings of a word and the number of times it appears. 
        word = " " + word + " ";
        for (int i = 0; i < rate.length; i++) {
            if (rate[i] != null && rate[i].contains(word)) {
                StringTokenizer token = new StringTokenizer(rate[i], "***");
                while (token.hasMoreTokens()) {
                    if (token.nextToken().toLowerCase().contains(word)) {
                        count++;
                    }
                }
                time = count + time;
                count2 = i * count + count2;
            }
            count = 0;
        }
        sopl("count2: " + count2);
        return count2;
    }

    public static String[] readTxt(File reviews) throws Exception {
        //transfering data from txt file to array
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
            sentence[lineCount] = (file.nextLine()).toLowerCase().trim(); //added .trim()
            lineCount++;
        }
        return sentence;
    }

    public static String[] readFile(File reviews) throws Exception {
        //sorts all reviews by rating
        String[] sentence = readTxt(reviews);
        String[] rate = new String[5];
        int rateSub;
        for (int i = 0; i < sentence.length; i++) {
            rateSub = Integer.parseInt(Character.toString(sentence[i].charAt(0)));
            rate[rateSub] = sentence[i].toLowerCase() + "***" + rate[rateSub];
        }
        return rate;
    }

    /**
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     */
    public static double wordAverage(String word, File reviews) throws Exception {
        //finds the average rating for a word. 
        double time = wordCount(word, reviews), count2 = wordTotalScore(word, reviews);
        double average = -1;
        if (time != 0) {
            average = (count2 / time);
            sopl(word.trim() + "'s average rating is " + average + "\n");
        }
        return average;
    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given th specified movie review file.
     */
    public static double sentenceAverage(File wordList, File reviews) throws Exception {
        //finds the average rating for a sentence. 
        String[] sentence = readTxt(wordList);

        double numerator = 0, rating;
        for (int i = 0; i < sentence.length; i++) {
            double temp = wordAverage(sentence[i], reviews);
            numerator = numerator + temp;
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

    public static void writeTxt(File fileName, File reviews) throws Exception {
        //sorts words in a file into posistive and negative files
        String[] sentence = readTxt(fileName);
        File positive = new File("posistive reviews.txt");
        File negative = new File("negative reviews.txt");
        PrintWriter positiveWriter = new PrintWriter(positive);
        PrintWriter negativeWriter = new PrintWriter(negative);

        for (int i = 0; i < sentence.length; i++) {
            double sub = wordAverage(sentence[i], reviews);
            if (sub < 2 && sub != -1) {
                negativeWriter.write(sentence[i] + " ");
            } else if (sub > 2 && sub != -1) {
                positiveWriter.write(sentence[i] + " ");

            }
        }
        positiveWriter.close();
        negativeWriter.close();
    }

    public static void higestWordRating(File fileName, File reviews) throws Exception { //changed some stuff here 
        String[] sentence = readTxt(fileName);
        double[] ratings = new double[sentence.length];
        double max, min = 100;
        int maxV = 0, minV = 0;

        for (int i = 0; i < sentence.length; i++) {
            ratings[i] = wordAverage(sentence[i], reviews);
        }

        max = ratings[0];
        if (ratings[0] != -1){
           min = ratings[0];
        }
        for (int a = 0; a < 2; a++) {
            for (int i = 1; i < ratings.length; i++) {
                if (a == 0) {
                    if (ratings[i] > max && ratings[i] != 0) {
                        max = ratings[i];
                        maxV = i;
                    }
                } else if (ratings[i] != -1 && ratings[i] < min && ratings[i] != 0) {
                    min = ratings[i];
                    minV = i;
                }
            }
        }

        sopl("-------------------------------");
            sopl("the word with the highest rating is " + sentence[maxV] + ". With a rating of " + ratings[maxV]);
            sopl("the word with the lowest rating is " + sentence[minV] + ". With a rating of " + ratings[minV]);
    }
}
