import org.example.PermMissingElem;
import org.example.TapeEquilibrium;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestTapeEquilibrium {


    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(new int[]{3, 1, 2, 4, 3}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected) {
        TapeEquilibrium s = new TapeEquilibrium();
        assertTrue((s.solution(A)==expected));
    }
}
