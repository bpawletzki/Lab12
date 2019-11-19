package edu.cscc;

import java.io.File;
import java.util.Set;

/**
 * Lab 12 Finding Unique Words in a Document
 * @author Brian Pawletzki
 * @version 2019-11-17T2147
 * Using TreeSet to make unique and sort in natural order.
 */
public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
