/**
 * File: Main.java
 * Author: Pebble
 * Date: Sept 22, 2022
 * Description: Main class for chemistry quiz
 */

package org.chemistry;

import org.chemistry.quiz.ElementQuiz;
import org.chemistry.quiz.Mode;

public class Main {
    public static void main(String[] args) {
        ElementQuiz quiz = new ElementQuiz(10, 2);
        quiz.begin(Mode.SYMBOL);
    }
}