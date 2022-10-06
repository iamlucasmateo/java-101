package Project.com.enterprise_name.src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class JavaHashMap {
    public static void main(String[] args){
        // The HashMap is sort of a like Python dictionary
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 75);
        examScores.put("Geography", 57);
        examScores.put("English", 58);

        // This prints in random order
        System.out.println(examScores.toString());

        System.out.println(examScores.get("English"));
        
        examScores.putIfAbsent("Economics", 70);

        examScores.put("English", 70);
        System.out.println(examScores.get("English"));
        examScores.replace("English", 100);
        System.out.println(examScores.get("English"));

        System.out.println(examScores.getOrDefault("Sociology", 50));
        System.out.println(examScores.getOrDefault("Economics", 50));

        examScores.remove("Geography");
        System.out.println(examScores);
        System.out.println(examScores.containsKey("Geography"));
        System.out.println(examScores.containsValue(75));
        // same thing with the reference type
        System.out.println(examScores.containsValue(Integer.valueOf(75)));

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " score before");
            System.out.println(score);
            examScores.replace(subject, score + 100);
            String messageAfter = subject + " score after";
            System.out.println(messageAfter);
            System.out.println(examScores.get(subject));
        });

        System.out.println(examScores.size());
        examScores.clear();
        System.out.println(examScores.toString());

        /*
         * **** MAPS ****
         */
        System.out.println("\n**** OTHER TYPES OF MAPS ****\n");
        // This HashMap has not static types
        Map m = new HashMap();
        m.put("time", 5);
        m.put(5, "time");
        // HashMaps are not ordered
        System.out.println(m);

        // TreeMap: sorted
        Map tm = new TreeMap();
        tm.put("john", 8);
        tm.put("that", true);
        System.out.println(tm);

        Map tm2 = new TreeMap();
        tm2.put(8, "john");
        tm2.put(2, "that");
        System.out.println(tm2);

        Map tm3 = new TreeMap();
        tm3.put(8, "john");
        try {
            // this will throw an error; mixing keys data types
            tm3.put("that", 2);
        } catch(Exception exc) {
            System.out.println("Error:" + exc);
        }
        System.out.println(tm3);

        Map lm = new LinkedHashMap<>();

        System.out.println("\n\n***APPLIED EXAMPLE****\n\n");
        String toCount = "this is a long string for which i wan to count occurences";
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        // true
        System.out.println(countMap.get('a') == null);
        
        for (int i = 0; i < toCount.length(); i++) {
            char myChar = toCount.charAt(i);
            if (myChar == ' ') {
                continue;
            } else if (countMap.containsKey(myChar)) {
                countMap.put(myChar, countMap.get(myChar) + 1);
            } else {
                countMap.put(myChar, 1);
            };
        };

        System.out.println(countMap);

    }
}
