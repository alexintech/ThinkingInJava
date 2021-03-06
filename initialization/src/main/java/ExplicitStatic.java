/**
 * Exercise 13: (1) Verify the statements in the previous paragraph.
 */
import static net.mindview.util.Print.print;

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        print("Cups()");
    }
}

class ExplicitStatic1 {
    public static void main(String[] args) {
        print("Inside main()");
//        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}

class ExplicitStatic2 {
    public static void main(String[] args) {
        print("Inside main()");
//        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();
}

class ExplicitStatic3 {
    public static void main(String[] args) {
        print("Inside main()");
//        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
