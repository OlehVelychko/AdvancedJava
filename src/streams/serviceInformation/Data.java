package streams.serviceInformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Data {
    private static Data instance;

    private Data() {
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exist");
        }
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        } else {
            throw new IllegalStateException("Singleton instance already exist");
        }

        return instance;
    }

    /**
     * The method for creating a list of people
     *
     * @return List<Human>
     */
    public List<Human> createHumanData() {
        List<Human> humanList = new ArrayList<>();

        Human human1 = new Human("Alice", 1, Human.Sex.FEMALE);
        Human human2 = new Human("Rita", 35, Human.Sex.FEMALE);
        Human human3 = new Human("Grandma", 83, Human.Sex.FEMALE);
        Human human4 = new Human("Mummy", 62, Human.Sex.FEMALE);
        Human human5 = new Human("Dad", 63, Human.Sex.MALE);
        Human human6 = new Human("Oleh", 34, Human.Sex.MALE);

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);
        humanList.add(human6);

        return humanList;
    }

    /**
     * The method for creating an array of numbers
     *
     * @return int[]
     */
    public int[] createIntArrayData() {
        return new int[]{5, 2, 3, 7, 4, 6, 78, 0, 2, 12, 1, 7, 5, 23};
    }

    /**
     * The method for creating a list of String
     *
     * @return List<String>
     */
    public List<String> createStringData() {
        return new ArrayList<>(Arrays.asList("Alice", "Rita", "Oleh", "Eileen"));
    }

    /**
     * The method for creating a list of Integer
     *
     * @return List<Integer>
     */
    public List<Integer> createIntegerData() {
        return new ArrayList<>(Arrays.asList(5, 2, 12, 8, 0, 9, 1));
    }

    /**
     * The method for creating a TreeSet of String
     *
     * @return TreeSet<String>
     */
    public TreeSet<String> createTreeSetStringData() {
        return new TreeSet<>(Arrays.asList("Alice", "Rita", "Oleh", "Eileen"));
    }
}
