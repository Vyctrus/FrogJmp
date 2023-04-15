import org.example.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test1 {

    static Stream<Arguments> methodSourceArgs(){
        return Stream.of(
                arguments(10, 85, 30, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int X,int Y,int D, int expected){
        Solution s=new Solution();
        System.out.println("X:"+X+" "+" Y:"+Y+" D="+D);
        assertTrue((s.solution(X,Y,D)==expected));
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void badSolutionTest(int X,int Y,int D, int expected){
        Solution s=new Solution();
        System.out.println("X:"+X+" "+" Y:"+Y+" D="+D);
        assertTrue((s.badSolution(X,Y,D)==expected));
    }

}
