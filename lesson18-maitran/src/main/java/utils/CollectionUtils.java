package utils;

import java.util.Collection;

public class CollectionUtils {

    private CollectionUtils() {
    }

    public static <E> void generate(String prefix, Collection<E> elements) {
        System.out.println(prefix + " -> {");
        if (elements == null || elements.isEmpty()) {
            System.out.println("    No elements.");
        } else {
            elements.forEach(e -> System.out.println("    " + e));
        }
        System.out.println("}");
    }
}
