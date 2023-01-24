/*
 * Ellie 
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
 *
 * @author 1xuell
 */
public class RottenTomatoes {

    /**
     * @param args the command line arguments
     */
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
                    wordAverage(text);
                    sopl("");
                    break;
                case 2:
                    sopl("Enter file name: ");
                    sub = input.nextLine();
                    text = input.nextLine();
                    sentenceRating(text);
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
        }

        //writeTxt("rotten tomatoes testing data.txt");
    }

    public static double wordAverage(String search) throws Exception {
        String[] sentence = readTxt(".\\data\\movie.review\\MovieReviews.txt");

        //sorting the reviews by their ratings 
        String[] rate = new String[5];
        int rateSub;
        for (int i = 0; i < sentence.length; i++) {
            rateSub = Integer.parseInt(Character.toString(sentence[i].charAt(0)));
            rate[rateSub] = sentence[i] + "***" + rate[rateSub];
        }

        //here is when the user inputs in the word
        search = " " + search.toLowerCase().trim() + " ";

        double count = 0, time = 0, average = -1, count2 = 0;
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
        sopl("the word " + search.trim() + " appears for " + time + " times");

        if (time != 0) {
            average = (count2 / time);
            sopl(search.trim() + "'s average is " + average + "\n");
        }
        return average;
    }

    public static double sentenceRating(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        double numerator = 0, rating;
        for (int i = 0; i < sentence.length; i++) {
            numerator = numerator + wordAverage(sentence[i]);
        }
        rating = numerator / sentence.length;

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

    public static void writeTxt(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        File positive = new File("posistive reviews.txt");
        File negative = new File("negative reviews.txt");
        PrintWriter positiveWriter = new PrintWriter(positive);
        PrintWriter negativeWriter = new PrintWriter(negative);

        for (int i = 0; i < sentence.length; i++) {
            if (wordAverage(sentence[i]) < 2) {
                negativeWriter.write(sentence[i]);
            } else if (wordAverage(sentence[i]) > 2) {
                positiveWriter.write(sentence[i]);

            }
        }
        positiveWriter.close();
        negativeWriter.close();
    }

    public static void higestWordRating(String fileName) throws Exception {
        String[] sentence = readTxt(fileName);
        double[] ratings = new double[sentence.length];

        for (int i = 0; i < sentence.length; i++) {
            ratings[i] = wordAverage(sentence[i]);
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
