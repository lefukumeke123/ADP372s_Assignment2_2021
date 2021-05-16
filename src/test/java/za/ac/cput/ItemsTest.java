package za.ac.cput;
/**
 * Lefu Kumeke
 *
 * 218147856
 * ADP3 ASSIGNMENT 2
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemsTest {

    Collection carCollection = new HashSet<>();
    Map<String, Integer> nameAndAge = new HashMap<>();
    Set<Integer> numbers = new TreeSet<>();
    List animals = new LinkedList();

    @BeforeEach
    void setUp() {

        //Collection
        carCollection.add("Toyota");
        carCollection.add("BMW");
        carCollection.add("Honda");
        carCollection.add("Tata");

        //Map
        nameAndAge.put("Lefu", 18);
        nameAndAge.put("David", 30);
        nameAndAge.put("John", 54);
        nameAndAge.put("Khanya", 20);
        nameAndAge.put("Zulu", 37);

        //Set
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(100);

        //List
        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Lion");
        animals.add("Shark");
        animals.add("Dog");

    }

    //Everything Testing on Collection
    @Test
    void addtoCollection() {
        carCollection.add("Mercedes-Benz");
        assertEquals(5, carCollection.size());
        System.out.println(carCollection);
    }

    @Test
    void removeFromCollection() {
        carCollection.remove("Tata");
        assertEquals(3, carCollection.size());
        System.out.println(carCollection);
    }

    @Test
    void findOnCollection() {
        System.out.println("Did you find the element");
        assertEquals(true, carCollection.contains("Honda"));
        System.out.println(carCollection.contains("Honda"));


    }

    //Everything Testing On the Map
    @Test
    void addToMap() {
        nameAndAge.put("Sipho", 12);
        assertEquals(6, nameAndAge.size());
        System.out.println(nameAndAge);
    }
    @Test
    void removeFromMap() {
        nameAndAge.remove("Khanya");
        assertEquals(4, nameAndAge.size());
        System.out.println(nameAndAge);
    }
    @Test
    void findOnMap() {
        System.out.println("Did you find the element");
        assertEquals(true, nameAndAge.containsKey("David"));
        System.out.println(nameAndAge.containsKey("David"));
    }



    //Everything Testing on Set
    @Test
    void addtoSet() {
        numbers.add(70);
        assertEquals(6, numbers.size());
        System.out.println(numbers);
    }
    @Test
    void removeFromSet() {
        numbers.remove(9);
        assertEquals(4, numbers.size());
        System.out.println(numbers);
    }
    @Test
    void findOnSet() {
        System.out.println("Did you find the element");
        assertEquals(true, numbers.contains(100));
        System.out.println(numbers.contains(100));
    }


    //Everything Testing on List
    @Test
    void addtoList() {
        animals.add("Sheep");
        assertEquals(6, animals.size());
        System.out.println(animals);
    }

    @Test
    void removeFromList() {
        animals.remove("Dog");
        assertEquals(4, animals.size());
        System.out.println(animals);
    }

    @Test
    void findOnList() {
        System.out.println("Did you find the element");
        assertEquals(true, animals.contains("Lion"));
        System.out.println(animals.contains("Lion"));
    }



}