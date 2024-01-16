import java.util.List;
import java.util.ArrayList;

class RandomizedSet {
    private List<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (list.contains(val)) {
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }

    public int getRandom() {
        int random = (int) (Math.random() * list.size());
        return list.get(random);
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        // Instantiate the RandomizedSet object
        RandomizedSet randomizedSet = new RandomizedSet();

        // Insert elements and print the result
        System.out.println("Insert 1: " + randomizedSet.insert(1)); // true
        System.out.println("Insert 2: " + randomizedSet.insert(2)); // true
        System.out.println("Insert 2 (already present): " + randomizedSet.insert(2)); // false

        // Remove elements and print the result
        System.out.println("Remove 1: " + randomizedSet.remove(1)); // true
        System.out.println("Remove 3 (not present): " + randomizedSet.remove(3)); // false

        // Get a random element and print the result
        System.out.println("Get Random Element: " + randomizedSet.getRandom());

        // Insert more elements
        System.out.println("Insert 3: " + randomizedSet.insert(3)); // true
        System.out.println("Insert 4: " + randomizedSet.insert(4)); // true

        // Get a random element and print the result
        System.out.println("Get Random Element: " + randomizedSet.getRandom());

        // Display the final list of elements
        System.out.println("Final List of Elements: " + randomizedSet.getList());
    }
}


