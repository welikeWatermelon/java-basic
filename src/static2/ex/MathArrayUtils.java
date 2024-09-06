package static2.ex;
import java.util.Collections;
import java.util.Arrays;

public class MathArrayUtils {

    static public int sum(int[] values){
        int result=0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    static public int average(int[] values){
        return sum(values)/values.length;
    }

    static public int min(int[] values){
        return Arrays.stream(values).min().getAsInt();
    }

    static public int max(int[] values){
        return Arrays.stream(values).max().getAsInt();
    }

}
