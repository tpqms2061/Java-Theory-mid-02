package collection.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<Object, Object> stuentMap = new HashMap<>();

        //학생 데이터 추가
        stuentMap.put("studentA", 90);
        System.out.println(stuentMap);

        stuentMap.put("studentA", 100);  //같은 키로 저장시 기존 값 교체
        System.out.println(stuentMap);

        boolean containsKey = stuentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        stuentMap.remove("studentA");
        System.out.println(stuentMap);
    }
}
