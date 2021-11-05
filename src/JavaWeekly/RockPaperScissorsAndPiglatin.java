package JavaWeekly;

import java.io.*;
import java.util.Scanner;

public class RockPaperScissorsAndPiglatin {

	public static void main(String[] args) throws IOException {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Player 1, what is your move?");
        String p1 = myInput.nextLine();
        System.out.println("Player 2, what is your move?");
        String p2 = myInput.nextLine();
        System.out.println(Exercises.rockPaperScissors(p1,p2));
        
        System.out.println("What would you like to convert into piglatin?");
        String text = myInput.nextLine();
        System.out.println(Exercises.toPigLatin(text));
    }
}

class Exercises {
    public static String rockPaperScissors(String s1, String s2) {
        String winner = "No one wins!";
        System.out.println(s1 + " thrown against " + s2 + "!");
        
        if (s1.equals(s2)) {
            return "Oh no! Players have tied!";
        }
        
        if (s1.equals("rock")) {
            if (s2.equals("paper")) {
                winner = "Player 2";
            }
            if (s2.equals("scissors")) {
                winner = "Player 1";
            }
        } else if (s1.equals("paper")) {
            if (s2.equals("rock")) {
                winner = "Player 1";
            }
            if (s2.equals("scissors")) {
                winner = "Player 2";
            }
        } else if (s1.equals("scissors")) {
            if (s2.equals("rock")) {
                winner = "Player 2";
            }
            if (s2.equals("paper")) {
                winner = "Player 1";
            }
        }
        return winner + " wins!";
    }

    public static String toPigLatin(String text) {
        String[] split = text.split(" ");
        char punctuation = split[split.length - 1].charAt(split[split.length - 1].length() - 1);
        
        if ((int) punctuation < 65) {
            split[split.length - 1] = split[split.length - 1].substring(0, split[split.length - 1].length() - 1);
        } else {
            punctuation = Character.MIN_VALUE;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < split.length; i++) {
            char initial = Character.toLowerCase(split[i].charAt(0));
            
            if (initial == 'a' || initial == 'e' || initial == 'i' || initial == 'o' || initial == 'u') {
                split[i] = split[i] + "way";
            } else {
                split[i] = split[i].substring(1) + initial + "ay";
            }
            
            if (i == split.length - 1) {
                sb.append(split[i] + punctuation);
            } else if(i == 0){
                sb.append(split[i].substring(0,1).toUpperCase()+split[i].substring(1)+ " ");
            } else {
                sb.append(split[i] + " ");
            }
        }
        return sb.toString();
    }
}
