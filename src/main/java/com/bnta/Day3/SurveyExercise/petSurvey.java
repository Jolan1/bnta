// Create a program that asks a user a survey with n number of questions and stores the answers with the
// corresponding question in a file. if possible also prints out the answers
package com.bnta.Day3.SurveyExercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class petSurvey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] questions = {
                "What kind of pet you have?\n",
                "What is your pets name?\n",
                "What is your pets favorite food?\n",
                "What is your pets favorite hobby\n",
                "How old is your pet?\n"
        };

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userInput = scanner.nextLine();
            try {
                File surveyAnswers = new File("src/survey/surveyAnswers.txt");
                FileWriter myWriter = new FileWriter("surveyAnswers.txt", true);
                myWriter.write(questions[i] + "\n");
                myWriter.write(userInput + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An Error has occurred");
                e.printStackTrace();
            }
        }
    }

}