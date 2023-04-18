public class App {

    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main(String[] args) throws Exception {

        // precondition
        assert iwillReview == true : "di ako nakapagrebyu ya";

        // study implementation
        exam();
        // postcondition
        assert iwillNotFail == true : "bagsak ka boy";

    }

    static void exam() {
        iwillNotFail = false;
    }
}