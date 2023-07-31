package com.company;

import java.util.Arrays;

public class Program {
  public static void main(String[] args) {

    //System.out.println("Print the following words in reverse order.");

    String[] wordList = {
      "airports",
      "sind",
      "doof",
      "oh",
      "nana",
      "what"
    };

    // Challenge 1 - reverse string

    //ReverseStringArray(wordList);

    //Challenge 2 - get word at certain position
    /*printWordAtPosition(wordList, 3);
    printWordAtPosition(wordList, 6);
    printWordAtPosition(wordList, 7);
    printWordAtPosition(wordList, -4);*/

    //Challenge 3 - find word occurrance count (case insensitive - wurscht ob groß oder klein geschrieben + auch wenn es innerhalb eines anderen wortes vorkommt)
    System.out.println("How often does the word \"hello\" occur in the following sentence? ");
    String sentence = "Hello my name is joshie and I like to say hello to all my joshies and hellosis.";
    System.out.println(sentence);
    String searchedWord = "Hello";

    var occurences = countWordOccurrence(sentence, searchedWord);
    System.out.printf("Es kommt %d mal vor.", occurences);

  }

  private static int countWordOccurrence(String sentence, String searchedWord) {
    int counter = 0;
    String[] arraySearchedWord = sentence.split(" ");

    for (int i = 0; i < arraySearchedWord.length; i++) {
      if (arraySearchedWord[i].toLowerCase().contains(searchedWord.toLowerCase())) {
        counter++;
      }
    }
    System.out.println(searchedWord + " kommt " + counter + " mal vor.");

    return counter;
  }

  private static void printWordAtPosition(String[] wordList, int position) {

    //ODER SO
    if ((position >= 0) && (position < wordList.length)) {
      String wordAtAPosition = wordList[position - 1];
      System.out.println(wordAtAPosition);

    } else if (position <= -1) {
      System.out.println("Too low position. Current Position: " + position);
    } else if (position > wordList.length - 1) {
      System.out.println("To high position. Current Position: " + position);
    }
  }

  private static void ReverseStringArray(String[] wordList) {
    int listLength = wordList.length;
    // listLength = 3       -1  = 2.
    for (int i = listLength - 1; i >= 0; i--) {
      System.out.print(wordList[i] + " ");

    }
  }
}