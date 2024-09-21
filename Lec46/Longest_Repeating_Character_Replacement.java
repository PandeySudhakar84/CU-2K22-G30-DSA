package Lec46;
public class Longest_Repeating_Character_Replacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            int[] freq = new int[256];
            int mostFreqLetter = 0;   // mostFreqLetter hme ye btata h ki ab tak total kitni frequency h
            int left = 0;
            int max = 0;    // Maximum substring length jisme k tak replacements allowed hain

            for (int right = 0; right < s.length(); right++) {
                freq[s.charAt(right)]++; // Current character ki frequency badhao
                mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right)]); // Ab tak ka max freq

                // Calculate karte hain kitne characters ko replace karna h
                int lettersToChange = (right - left + 1) - mostFreqLetter; // (right-left+1) ye hmra window ki size ko bta rha h

                if (lettersToChange > k) {
                    freq[s.charAt(left)]--;
                    left++;
                }

                // agar subString hmara valid h to max varible ko update krege
                max = Math.max(max, right - left + 1);
            }

            return max; // Sabse bada valid window ka size return karo
        }

    }
}
