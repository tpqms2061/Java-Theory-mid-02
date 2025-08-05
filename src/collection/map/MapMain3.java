package collection.map;

import java.util.HashMap;

public class MapMain3 {

    public static void main(String[] args) {
        HashMap<Object, Object> stuentMap = new HashMap<>();

        //학생 데이터 추가
        stuentMap.put("studentA", 50);
        System.out.println(stuentMap);

        //학생이 없는 경우에만 데이터 추가 1
        if (!stuentMap.containsKey("studentA")) {
            stuentMap.put("studentA", 100);
        }
        System.out.println(stuentMap);

        //학생이 없는 경우에만 추가1

        stuentMap.putIfAbsent("studentA", 100);
        stuentMap.putIfAbsent("studentB", 100);
        System.out.println(stuentMap);
    }
}
