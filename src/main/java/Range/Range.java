package Range;

import java.util.ArrayList;
import java.util.List;

public class Range {
    private String text;

    public Range(String text) {
        this.text = text;
        ArrayList<String> bucket = this.firstAndLastCharacter(text);
        String subStringNum = this.removeFirstandLast(text);
        String[] number = subStringNum.split(",");
        Integer firstNum = Integer.parseInt(number[0]);
        Integer lastNum = Integer.parseInt(number[1]);

    }

    public ArrayList<String> firstAndLastCharacter(String str) {
        ArrayList<String> result = new ArrayList<String>();
        int n = str.length();
        String first = Character.toString(str.charAt(0));
        String last = Character.toString(str.charAt(n - 1));
        result.add(first);
        result.add(last);
        return result;
    }

    public String removeFirstandLast(String str)
    {
        str = str.substring(1, str.length() - 1);
        return str;
    }

    public boolean isStartWithInclusive() {
        return this.text.startsWith("[");
    }

    public boolean isEndWithInclusive() {
        return this.text.endsWith("]");
    }
}
