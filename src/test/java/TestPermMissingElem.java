
import org.example.PermMissingElem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestPermMissingElem {

    static Stream<Arguments> methodSourceArgs(){
        return Stream.of(
                arguments(new int[]{2,3,1,5},4)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected){
        PermMissingElem s=new  PermMissingElem();
        assertTrue((s.solution(A)==expected));
    }


    private int[] generateTroubles(int N){
        Random rand = new Random();
        Integer[] arr=new Integer[N];
        int temp= rand.nextInt(N);
        temp+=1;
        for(int i=0;i<N;i++){
            arr[i]=i;
        }
        arr[temp]=N+1;
        List<Integer> intList= Arrays.asList(arr);
        Collections.shuffle(intList);
        int[] result = intList.stream().mapToInt(i->i).toArray();
        return result;
    }
}
