import org.example.Arrows;
import org.example.PermMissingElem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestArrow {

    static Stream<Arguments> methodSourceArgs(){
        return Stream.of(
                arguments("^vv<v",2),
                arguments("v>>>vv",3),
                arguments("<<<",0)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(String N, int expected){
        Arrows s=new  Arrows();
        assertTrue((s.solution(N)==expected));
    }
}
