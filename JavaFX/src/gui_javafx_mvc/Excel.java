package gui_javafx_mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {
    private ArrayList<Double> numbers;

    // Constructor to initialize the Excel object with an ArrayList of numbers
    public Excel(ArrayList<Double> numbers) {
        this.numbers = numbers;
    }

    // Constructor to initialize the Excel object with a comma-separated string of numbers
    public Excel(String input) {
        // Split the input string into an array of number strings
        String[] strNumArray = input.split(",");
        // Convert the array into a list and remove any leading/trailing spaces
        List<String> strNumList = Arrays.asList(strNumArray);
        ArrayList<Double> strNumArrayList = new ArrayList<>();
        // Convert each string number to a double and add it to the ArrayList
        strNumList.forEach(str -> strNumArrayList.add(Double.parseDouble(str.trim())));

        // Set the ArrayList of numbers
        this.numbers = strNumArrayList;
    }

    // Calculate the total sum of all numbers in the list
    public double findTotal() {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }

    // Calculate the average by dividing the total by the number of elements
    public double findAvg() {
        double total = findTotal();
        return total / numbers.size();
    }

    // Find the maximum number in the list
    public double findMax() {
        double maximum = Double.MIN_VALUE;
        for (double number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    // Find the minimum number in the list
    public double findMin() {
        double minimum = Double.MAX_VALUE;
        for (double number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
}
