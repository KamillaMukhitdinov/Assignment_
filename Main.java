import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        for (int i = 0; i < 10000; i++) {
            int id = (int) (Math.random() * 10000);
            MyTestingClass key = new MyTestingClass(id);
            Student value = new Student("Student" + id, (int) (Math.random() * 100));
            table.put(key, value);
        }




        List<Integer> bucketSizes = table.getBucketSizes();
        for (int i = 0; i < bucketSizes.size(); i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes.get(i));
        }




        BST<Integer, String> bst = new BST<>();
        bst.put(1, "1");
        bst.put(2, "2");
        bst.put(3, "3");



        for (var elem : bst.iterator()) {
            System.out.println("Key = " + elem.getKey() + " value = " + elem.getValue());
        }



    }
}

