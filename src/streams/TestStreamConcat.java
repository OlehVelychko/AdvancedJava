package streams;

import java.util.stream.Stream;

public class TestStreamConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 4, 5, 6);
        Stream<Integer> stream2 = Stream.of(7, 8, 9);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
    }
}
