package Patryk.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        List<String> people = new ArrayList<>();

            for (Map.Entry<String, String[]> entry : hobbies.entrySet()){
                for (String s: entry.getValue()){
                    if (s.equals(hobby)) {
                        people.add(entry.getKey());
                    }
                }
            }




        return people;
    }

    public String wordAppend(String[] strings) {
        Map<String, String> stringMap = new HashMap<String, String>();
        String returnString="";

        for (int i=0; i<strings.length; i++){
            if (stringMap.containsKey(strings[i])){
                stringMap.replace(strings[i],
                        stringMap.get(strings[i])+strings[i]);
            }else {
                stringMap.put(strings[i], strings[i]);
            }
        }



        for (String s: stringMap.values()) {
            returnString += s;
        }

        return returnString;
    }

}
