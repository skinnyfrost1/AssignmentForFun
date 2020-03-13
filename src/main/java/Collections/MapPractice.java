package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> keys = new ArrayList<Object>();
        for (Object obj : map.keySet()) {
            if (map.get(obj).equals(value)) {
                keys.add(obj);
            }
        }
        return keys.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (size == 0)
            return map;
        map.put(1, 1);
        if (size == 1)
            return map;

        map.put(2, 1);
        if (size == 2)
            return map;

        int temp;
        for (int i = 3; i <= size; i++) {
            temp = map.get(i - 1) + map.get(i - 2);
            map.put(i, temp);
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        if (size == 0)
            return map;
        map.put(1, first);
        if (size == 1)
            return map;
        map.put(2, second);
        if (size == 2)
            return map;
        for (int i = 3; i <= size; i++) {
            map.put(i, (map.get(i - 1) + map.get(i - 2)));
        }

        return map;
    }
}
