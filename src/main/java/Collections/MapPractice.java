package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> obj = new ArrayList<Object>();

        for (Object o : map.keySet()){
            if(map.get(o) == value)
                obj.add(o);
        }

        Object[] o = obj.toArray();
        return o;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1, 1, size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        TreeMap<Integer, Integer> crazy = new TreeMap<Integer, Integer>();
        for (int i = 1; i <= size; i++){
            if(i == 1){
                crazy.put(i, first);
            }
            else if(i == 2){
                crazy.put(i, second);
            }
            else {
                Integer sum = crazy.get(i-2) + crazy.get(i-1);
                crazy.put(i, sum);
            }
        }
        return crazy;
    }
}
