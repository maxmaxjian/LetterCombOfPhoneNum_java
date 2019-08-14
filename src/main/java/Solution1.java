import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 implements Solution {
    @Override
    public List<String> letterCombinations(String digits) {

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        if (digits.length() == 1) {
            String curr = map.get(digits.charAt(0));
            for (int i = 0; i < curr.length(); i++) {
                result.add(String.valueOf(curr.charAt(i)));
            }
        } else if (digits.length() > 1) {
            List<String> tmp = letterCombinations(digits.substring(1));
            String curr = map.get(digits.charAt(0));
            for (int i = 0; i < curr.length(); i++) {
                for (String s : tmp) {
                    result.add(new StringBuilder().append(curr.charAt(i)).append(s).toString());
                }
            }
        }

        return result;
    }
}
