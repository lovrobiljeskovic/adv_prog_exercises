public class Main {

    public static void main(String[] args) {
        User user = new User();

        user.compute('+', 100);
        user.compute('-', 50);
        user.compute('*', 10);
        user.compute('/', 2);

        user.undo(4);

        user.redo(3);
    }
}
