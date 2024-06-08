import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> combinations = solution.letterCombinations("23");
        System.out.println(combinations);
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty())
            return result;
        ansCombo("923", 0, "", result);
        return result;
    }

    public static String[] keypad = {".","abc", "def", "ghi", "jkl", "mno", "pqrs", "tvu", "wxyz"};

    public void ansCombo(String digits, int idx, String combination, List<String> result){
        if(idx == digits.length()){
            result.add(combination);
            return;
        }

        char curr = digits.charAt(idx);
        String mapping = keypad[curr - '0' - 1]; // Adjusting index as keypad starts from 2, not 1
        for(int i = 0; i < mapping.length(); i++){
            ansCombo(digits, idx + 1, combination + mapping.charAt(i), result);
        }
    }
}
