/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

/**
 *
 * @author gayatri
 */
public class timetoeord {
    
    static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};
    
    public static String timeToWord(int H, int M) {
        if (M == 0) {
            return numbers[H] + " o' clock";
        } else if (M == 15) {
            return "quarter past " + numbers[H];
        } else if (M == 30) {
            return "half past " + numbers[H];
        } else if (M == 45) {
            return "quarter to " + numbers[H + 1];
        } else if (M < 30) {
            if (M == 1) {
                return numbers[M] + " minute past " + numbers[H];
            } else if (M <= 20) {
                return numbers[M] + " minutes past " + numbers[H];
            } else {
                return tens[M / 10] + " " + numbers[M % 10] + " minutes past " + numbers[H];
            }
        } else {
            int remainingMinutes = 60 - M;
            if (remainingMinutes == 1) {
                return numbers[remainingMinutes] + " minute to " + numbers[H + 1];
            } else if (remainingMinutes <= 20) {
                return numbers[remainingMinutes] + " minutes to " + numbers[H + 1];
            } else {
                return tens[remainingMinutes / 10] + " " + numbers[remainingMinutes % 10] + " minutes to " + numbers[H + 1];
            }
        }
    }

    public static void main(String[] args) {
        int H = 6, M = 47;
        System.out.println(timeToWord(H, M));  // Output: thirteen minutes to seven
    }
}


