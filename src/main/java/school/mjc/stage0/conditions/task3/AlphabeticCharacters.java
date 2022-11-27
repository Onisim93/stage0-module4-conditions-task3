package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char upperCaseChar = Character.toUpperCase(character);
        List<Character> vowelChars = List.of('A', 'E', 'I','O','U','Y');
                ;
        if (upperCaseChar >= 65 && upperCaseChar <= 90) {
            if (vowelChars.contains(upperCaseChar)) System.out.println("Vowel");
            else System.out.println("Consonant");
        }
        else System.out.println("wrong alphabet!");
    }
}
