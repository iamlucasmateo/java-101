package Project.com.enterprise_name.src;

import java.util.HashMap;

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
    }
}
