package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list2.isEmpty())
            return list1;
        list1.addAll(list2);

        // for (int number : list2) {
        //     list1.add(number);
        // }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.isEmpty())
            return sumOfShit(list2);
        else if (list2.isEmpty())
            return sumOfShit(list1);
        else
            return sumOfShit(list1) + sumOfShit(list2);

    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if (original.size() < 2)
            return true;
        HashSet<Character> frontSet = stringToCharSet(original.get(0));
        HashSet<Character> currentSet;
        boolean happy =false;

        for (int i = 1; i < original.size(); i++) {
            currentSet = stringToCharSet(original.get(i));
            happy = false;
            for (char c : currentSet){
                if (frontSet.contains(c)){
                    happy=true;
                    break;
                }
            }
            if (!happy)
                return false;
            else {
                frontSet = currentSet;
            }
        }

        return true;
    }

    public Integer sumOfShit(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public HashSet<Character> stringToCharSet(String str) {
        HashSet<Character> s = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (!s.contains(str.charAt(i)))
                s.add(str.charAt(i));
        }
        return s;
    }

}
