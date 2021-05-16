package za.ac.cput;

/**
 * Lefu Kumeke
 *
 * 218147856
 * ADP3 ASSIGNMENT 2
 *
 */

//all the Tests are in the test class

import java.util.*;

public class Items {


    public static void main(String[] args) {

        System.out.println("********************EVERYTHING ON COLLECTION***********************");
        //Concerning Map adding,removing and finding (all the tests are in the test class)

        Collection CarCollection = new HashSet<>();
        CarCollection.add("Toyota");
        CarCollection.add("BMW");
        CarCollection.add("Honda");
        CarCollection.add("Tata");

        System.out.println("Initial COLLECTION "+ CarCollection);

        //adding
        CarCollection.add("Mercedes-Benz");
        System.out.println("COLLECTION after adding  " + CarCollection);
        //removing
        CarCollection.remove("Tata");
        System.out.println("COLLECTION after removing an item " + CarCollection);
        //finding
        System.out.println("Did you find element ? ");
        System.out.println(CarCollection.contains("BMW"));




//Concerning Map adding,removing and finding (all the tests are in the test class)
        System.out.println("***********************EVERYTHING ON MAP**************************");

        Map<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Lefu", 18);
        nameAndAge.put("David", 30);
        nameAndAge.put("John", 54);
        nameAndAge.put("Khanya", 20);

        System.out.println("Initial MAP "+ nameAndAge);

        //adding
        nameAndAge.put("Zulu", 37);
        System.out.println("Map after adding  " + nameAndAge);
        //removing
        nameAndAge.remove("David");
        System.out.println("Map after removing an item " + nameAndAge);
        //finding
        System.out.println("Did you find element ? ");
        System.out.println(nameAndAge.containsKey("John"));


        System.out.println("***********************EVERYTHING ON SET**************************");
        //Concerning Set adding,removing and finding (all the tests are in the test class)

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(100);

        System.out.println("Initial SET "+ numbers);

        //adding
        numbers.add(37);
        System.out.println("Set after adding  " + numbers);
        //removing
        numbers.remove(1);
        System.out.println("Set after removing an item  " + numbers);
        //finding
        System.out.println("Did you find element ? ");
        System.out.println(numbers.contains(9));



        System.out.println("***********************EVERYTHING ON LIST**************************");
        //Concerning LIST adding,removing and finding (all the tests are in the test class)

        List animals = new LinkedList();
        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Lion");
        animals.add("Shark");
        animals.add("Dog");

        System.out.println("Initial LIST "+ animals);

        //adding
        animals.add("Mice");
        System.out.println("Set after adding  " + animals);
        //removing
        animals.remove("Shark");
        System.out.println("Set after removing an item " + animals);
        //finding
        System.out.println("Did you find element ? ");
        System.out.println(animals.contains("Dog"));




    }
}
