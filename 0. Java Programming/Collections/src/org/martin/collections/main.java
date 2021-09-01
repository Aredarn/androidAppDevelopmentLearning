package org.martin.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Martin");
        names.add("Tom");
        System.out.println(names.get(1));
        System.out.println(names.size());
        //names.clear();

        //names.remove("Martin");
        System.out.println(names.get(0));

        System.out.println(names.contains("Martin"));

        System.out.println(names.isEmpty());

        System.out.println(names.indexOf("Tom"));

        for (int i = 0;i<names.size();i++){
            System.out.println(names.get(i));

        }
        System.out.println();

        //************MAPS************//

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Martin", "Martin@face.com");
        emailList.put("Tom", "tom986@gmail.com");

        System.out.println(emailList.get("Martin"));
        System.out.println(emailList.size());
        emailList.remove("Tom");

        System.out.println(emailList.containsKey("Brad"));
        System.out.println(emailList.containsValue("Martin@face.com"));

        System.out.println();
        //******************//

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Martin", 15));
        students.add(new Student("Sarah", 18));

        for (Student s: students){
            System.out.println(s.getName());
        }

    }
}
