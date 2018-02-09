package com.company.Question_4;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.List;

public class Main {

//        List<String> arrayList = new ArrayList();
static ArrayList list = new ArrayList();
    Main main = new Main();




    public static void main(String[] args) {

        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
        System.out.println("Dungeons and Dragons Classes");
        list.add("Wizard");
        list.add("Ranger");
        list.add("Fighter");
        list.add("Cleric");
        list.add("Barbarian");
        list.add("Rogue");




    }
    int position = 1;

    public void displayArray(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(position + ". " + list.get(i));
            position++;






        }

    }
}
