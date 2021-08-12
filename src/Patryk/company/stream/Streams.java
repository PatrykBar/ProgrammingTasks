package Patryk.company.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    List<String> names = Arrays.asList("Tomek", "Kasia", "Eustachy", "Marta", "Mateusz", "Marta");

    public void namesPrinterStreams(){

        System.out.println("Filter streams");
        names.stream().
                filter(n->n.endsWith("a")).
                forEach(System.out::println);
        System.out.println("--------------------------------------");

        List<String> names2 = names.stream().collect(Collectors.toList());
        System.out.println(names2);
        Set<String> names3 = names.stream().collect(Collectors.toSet());
        System.out.println(names3);
        System.out.println("--------------------------------------");

        List<User> userList = names.stream().
                map(string -> new User(string, new Random().nextInt(70))).
                collect(Collectors.toList());
        System.out.println(userList);

        System.out.println("--------------------------------------");

        List<User> userList2 = names.stream().
                map(string -> new User(string, new Random().nextInt(70))).
                sorted(Comparator.comparing(User::getName)).
                collect(Collectors.toList());
        System.out.println(userList2);

        System.out.println("--------------------------------------");
    }

}

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
