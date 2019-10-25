public class Log {

    static Boolean is_debug = false;


    static void debug(String message) {
        if (is_debug) {
            System.out.println(message);
        }
    }

    static void info(String message) {
        System.out.println(message);
    }
}
