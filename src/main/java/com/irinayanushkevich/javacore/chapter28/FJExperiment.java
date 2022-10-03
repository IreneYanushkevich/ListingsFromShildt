package main.java.com.irinayanushkevich.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform2 extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start, end;

    Transform2(double[] vals, int s, int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }

    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new Transform2(data, start, middle, seqThreshold), new Transform2(data, middle, end, seqThreshold));
        }
    }
}

class FJExperiment {

    public static void main(String[] args) {

        int pLevel;
        int threshold;

       /* if (args.length != 2) {
            System.out.println("Using: FJExperiment parallelism threshold ");
            return;
        }*/
        pLevel = 8; //Integer.parseInt(args[0]);
        threshold = 1000; //Integer.parseInt(args[1]);

        long beginT;
        long endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        Transform2 task = new Transform2(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();
         fjp.execute(task);//fjp.invoke(task);
        while (!task.isDone()) {
            System.out.println(fjp);
        }
        endT = System.nanoTime();

        System.out.println("Parallelism level: " + pLevel);
        System.out.println("Sequential processing threshold: " + threshold);
        System.out.println("Elapsed time: " + (endT - beginT) + " ns");
        System.out.println();
    }
}
