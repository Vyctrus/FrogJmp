
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
    static Stream<Arguments> randomArraySizes(){
        return Stream.of(
          arguments(5),
          arguments(10),
          arguments(12)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected){
        PermMissingElem s=new  PermMissingElem();
        assertTrue((s.solution(A)==expected));
    }


    @ParameterizedTest
    @MethodSource("randomArraySizes")
    public void testOnRandomData(int size){
        PermMissingElem s=new  PermMissingElem();
        //what is A, what is expected
        Random rand = new Random();
        Integer[] arr=new Integer[size];
        int temp= rand.nextInt(size);//0 ,n-1
        for(int i=0;i<size;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Temp: "+temp);

        arr[temp]=size+1;
        List<Integer> intList= Arrays.asList(arr);
        Collections.shuffle(intList);
        int[] result = intList.stream().mapToInt(i->i).toArray();
        int expected=temp+1;

        System.out.println(Arrays.toString(result));
        System.out.println("Expected: "+expected+ "(Expected should be 1 more then Temp)");

        assertTrue((s.solution(result)==expected));
    }
}
