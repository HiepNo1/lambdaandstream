package oop.homework4.lambda;

import java.util.ArrayList;

public class Retry {
    public static void checkIndex(int index, int size) {
        if (index < 0 || index > size) {
            System.out.println("Danh sach chi có 5 phan tu");
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<Person>(){
            {
                add(new Person("Hiep", 20));
                add(new Person("Thuy", 21));
                add(new Person("Thinh", 22));
                add(new Person("Thang", 23));
                add(new Person("Nam", 24));
            }
        };

        System.out.println("Danh sach ban dau");
        System.out.println(personList);
        EditFunction editFunction = (persons, name, age, index) -> {
            checkIndex(index, persons.size());
            persons.get(index).setName(name);
            persons.get(index).setAge(age);
        };

        System.out.println("Danh sach sau khi sua");
        editFunction.apply(personList, "Hieu", 10, 2);
        System.out.println(personList);


        DeleteFunction deleteFunction = (persons, index) -> {
            checkIndex(index, persons.size());
            persons.remove(index);
        };

        System.out.println("Danh sach sau khi xoa");
        deleteFunction.apply(personList, 2);
        System.out.println(personList);
     }
}
