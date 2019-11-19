package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

/**
 * Utility to process a document to into sorted set of unique words
 * @author Brian Pawletzki
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     * @param myfile input file
     * @return sorted set of unique words
     */

    static Scanner input = null;

    public static Set<String> processDocument(File myfile) {
        // Implement this method to read the file one line at a time
        // and return a Set of sorted unique words. Choose the correct Collection
        // type to handle a sorted unique set of words. You will need to make use
        // of the tokenize() method below.
        TreeSet ts = new TreeSet();

        try {
            input = new Scanner(myfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            for (String s : tokenize(input.nextLine())) {
                ts.add(s);
            }
        }

        return ts;
    }

    /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     * @param str initial non-null String
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }
}
