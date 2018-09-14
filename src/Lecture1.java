public class Lecture1 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            try {
                f(i);
                System.out.println(i + " - нет исключений");
            } catch (Exception e) {
                System.out.println(i + " - исключене");
            }
        }

    }

    private static void f(int i) throws Exception {
        if (i % 2 == 0)
            throw new Exception();
    }
}
