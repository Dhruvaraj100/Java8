package generalprograms;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ParallelPrograming {
    public static void main(String[] args) {

        long[] l = new long[200000];

        for(int i = 0 ; i< l.length; i++){
            l[i] = i+1;
        }

       long t1 = System.currentTimeMillis();
        long r1 = Arrays.stream(l).parallel()
                .map(ParallelPrograming::m).sum();
        long t2 = System.currentTimeMillis();
        System.out.println("Result with parallel is :" + r1 + "time taken is :" + (t2 -t1));


        long t3 = System.currentTimeMillis();
        long r2 = Arrays.stream(l)
                .map(ParallelPrograming::m).sum();
        long t4 = System.currentTimeMillis();
        System.out.println("Result without parallel is :" + r2 + "time taken is :" + (t4 -t3));


    }

    private static long m(long l) {
        return LongStream.rangeClosed(1, l)
                .reduce(1, (a,b) -> a*b);
    }
}
