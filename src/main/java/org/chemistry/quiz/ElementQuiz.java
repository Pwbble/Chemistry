/**
 * File: ElementQuiz.java
 * Author: Pebble
 * Date: Sept 22, 2022
 * Description: Logic for chemistry quiz
 */

package org.chemistry.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ElementQuiz {

    private final List<Element> elements = new ArrayList<>(Arrays.asList(Element.values()));
    private final int rounds, maxAttempts;

    public ElementQuiz(int rounds, int maxAttempts) {
        this.rounds = rounds;
        this.maxAttempts = maxAttempts;
    }

    public void begin(Mode mode) {
        if (!(1 <= maxAttempts && maxAttempts <= 5)) // 1 <= tries <= 5
            throw new IllegalArgumentException("Invalid range for max tries, must be between 1 and 5.");
        if (!(3 <= rounds && rounds <= elements.size()))
            throw new IllegalArgumentException("Invalid range for number of rounds, must be between 3 and " + elements.size() + ".");

        Random random         = new Random(); // Generates random numbers
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long start;
        float score;
        int correct = rounds;

        start = System.currentTimeMillis();
        for (int a = 0; a < rounds; a++) {
            Element element = elements.get(random.nextInt(elements.size()));
            String answer = null, message = null;
            int attempt = 1;

            // Initialize message and answer
            switch (mode) {
                case ELEMENT: // Asks question with ELEMENT name
                    message = "Type the symbol for the element " + element.getName() + ": ";
                    answer = element.getSymbol();
                    break;
                case SYMBOL: // Asks question with SYMBOL
                    message = "Type the element for the symbol " + element.getSymbol() + ": ";
                    answer = element.getName();
                    break;
                case MIXED:
                    // Expected answer is a symbol
                    if (random.nextBoolean()) {
                        message = "Type the symbol for the element " + element.getName() + ": ";
                        answer = element.getSymbol();
                    } else { // Expected answer is an element
                        message = "Type the element for the symbol " + element.getSymbol() + ": ";
                        answer = element.getName();
                    }
                    break;
            }
            System.out.print(message);
            try {
                // Answer is incorrect
                while (!reader.readLine().equalsIgnoreCase(answer)) {
                    attempt++;
                    if (attempt > maxAttempts) {
                        correct--;
                        System.out.println("Sorry, that answer was incorrect. The correct answer was: '" + answer + "'.");
                        break;
                    }
                    // If there are remaining turns
                    System.out.print("Try again (" + attempt + "/" + maxAttempts + "): ");
                }
            } catch (IOException io) { /* Ignored */ }
            elements.remove(element); // To avoid repeated elements
        }

        if ((score = 100 * ((float) correct / rounds)) >= 70)
            System.out.println("Congratulations, you completed the quiz with a score of: " + score + "%.");
        else
            System.out.println("Congratulations, unfortunately, you completed the quiz with a failing score of: " + score + "%.");
        System.out.println("You completed the quiz in: " + ((System.currentTimeMillis() - start) / 1000F) + " seconds.");
    }
}