package DansDilemma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return solutionSet(input1, input2).size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        HashSet<Double> set = new HashSet<Double>();
        Double[] args = { input1, input2, input3 };
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++)
                set.addAll(solutionSet(args[i], args[j]));
        }
        return set.size();
    }

    public Integer dilemmaOfN(Double... args) {
        HashSet<Double> set = new HashSet<Double>();
        // List<Double> lst = new ArrayList<Double>();
        // //sorting the argument
        // for (Double d : args){
        //     lst.add(d);
        // }
        // Collections.sort(lst);
        // //remove the triplicate number
        // boolean flag = false;
        // Double temp = null;
        // for(Double d : lst){
        //     if (d!=temp){
        //         temp = d;
        //         flag = false;
        //     }
        //     else if (!flag){
        //         flag=true;
        //     }
        //     else {
        //         lst.remove(d);
        //     }
        // }
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++)
                set.addAll(solutionSet(args[i], args[j]));
                // set.addAll(solutionSet(lst.get(i), lst.get(j)));

        }
        return set.size();
    }

    public HashSet<Double> solutionSet(Double input1, Double input2) {
        HashSet<Double> set = new HashSet<Double>();
        set.add(input1 + input2);
        set.add(input1 * input2);
        set.add(input2 - input1);
        set.add(input1 - input2);
        if (input2 != 0)
            set.add(input1 / input2);
        if (input1 != 0)
            set.add(input2 / input1);
        return set;
    }

}
