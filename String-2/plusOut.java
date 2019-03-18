/*Given a string and a non-empty word string, return a version of the original String where 
all chars have been replaced by pluses ("+"), except for appearances of the word string wh
ich are preserved unchanged.plusOut("12xy34", "xy") → "++xy++"plusOut("12xy34", "1") → "1+
++++"plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/

public String plusOut(String str, String word) {
    StringBuilder newString = new StringBuilder(str.length());
    String[] split = str.split(word);

    for (int i = 0; i < split.length; i++) {
        for (int j = 0; j < split[i].length(); j++)
            newString.append('+');

        if (i != split.length - 1)
            newString.append(word);
    }

    return newString.toString();
}
