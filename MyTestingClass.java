public class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 56;
        hash = 4 * hash + id;
        return hash;
    }

}
