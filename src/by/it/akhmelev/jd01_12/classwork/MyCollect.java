package by.it.akhmelev.jd01_12.classwork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollect {
    static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>(b);
        //первый способ
        res.addAll(a);

        //второй способ
        //        for (Integer value:a){
        //            if (!b.contains(value))
        //                res.add(value);
        //        }
        return res;
    }

    static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>();
        //первый способ
        res.addAll(a);
        res.retainAll(b);
        //второй способ
        //        for (Integer value : a) {
        //            if (b.contains(value))
        //                res.add(value);
        //        }
        return res;
    }


}
