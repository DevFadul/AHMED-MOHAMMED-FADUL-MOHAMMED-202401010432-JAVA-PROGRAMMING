package week_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a single quiz question and provides a bank of sample questions.
 */
public class Questions {

    private String question;
    private String[] options;
    private int correctIndex; // index into options[] that is correct

    public Questions(String question, String[] options, int correctIndex) {
        this.question = question;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public boolean isCorrect(int chosenIndex) {
        return chosenIndex == correctIndex;
    }

    /**
     * Returns a shuffled list of sample questions for the quiz battle.
     */
    public static List<Questions> loadSampleQuestions() {
        List<Questions> bank = new ArrayList<>();

        bank.add(new Questions(
                "What is encapsulation in OOP?",
                new String[]{"Hiding data and exposing it through methods", "Creating multiple objects from one class", "Inheriting from a parent class", "Overriding methods in a subclass"},
                0));

        bank.add(new Questions(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"implements", "extends", "inherits", "super"},
                1));

        bank.add(new Questions(
                "What is polymorphism?",
                new String[]{"Bundling data and methods together", "One interface, many implementations", "Restricting access to class members", "Creating a single instance of a class"},
                1));

        bank.add(new Questions(
                "Which access modifier allows visibility only within the same package?",
                new String[]{"private", "protected", "default (no modifier)", "public"},
                2));

        bank.add(new Questions(
                "What does the 'super' keyword refer to in Java?",
                new String[]{"The current object", "The parent class", "A static method", "An interface"},
                1));

        bank.add(new Questions(
                "Which OOP principle allows a subclass to provide a specific implementation of a method defined in its parent?",
                new String[]{"Encapsulation", "Abstraction", "Method overriding", "Method overloading"},
                2));

        bank.add(new Questions(
                "What is an abstract class?",
                new String[]{"A class that cannot be instantiated", "A class with only static methods", "A class with no fields", "A class that implements multiple interfaces"},
                0));

        bank.add(new Questions(
                "What is the difference between an interface and an abstract class in Java?",
                new String[]{"Interfaces can have constructors", "A class can implement multiple interfaces but extend only one class", "Abstract classes cannot have methods", "Interfaces must be instantiated directly"},
                1));

        bank.add(new Questions(
                "Which keyword prevents a class from being subclassed?",
                new String[]{"static", "final", "private", "abstract"},
                1));

        bank.add(new Questions(
                "What is method overloading?",
                new String[]{"Redefining a method in a subclass", "Multiple methods with the same name but different parameters", "Calling a parent class constructor", "Hiding instance variables"},
                1));

        Collections.shuffle(bank);
        return bank;
    }
}