package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder sb = new StringBuilder();
        string = string.replaceAll(".", " ");
        return string;
    }

    public String loudAndClear(String string) {

        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        StringBuilder sb = new StringBuilder();
        int c;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = c - 'a' + 'A';
            } else if (c >= 'A' && c <= 'Z') {
                c = c - 'A' + 'a';
            }
            sb.append((char)c);
        }
        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        if (string1 == null)
            return string2;
        if (string2 == null)
            return string1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i < string1.length()) {
                sb.append(string1.charAt(i));
                if (i < string2.length()) {
                    sb.append(string2.charAt(i));
                    i++;
                } else {
                    if (i + 1 < string1.length())
                        sb.append(string1.substring(i + 1));
                    break;
                }
            } else {
                if (i < string2.length())
                    sb.append(string2.substring(i));
                else
                    break;
            }
        }

        return sb.toString();

    }
}
