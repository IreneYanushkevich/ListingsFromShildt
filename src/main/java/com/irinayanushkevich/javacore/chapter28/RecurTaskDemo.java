package main.java.com.irinayanushkevich.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum3 extends RecursiveTask<Double> {
    final int seqThreshold = 500;
    double[] data;
    int start, end;

    Sum3(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum3 subTaskA = new Sum3(data, start, middle);
            Sum3 subTaskB = new Sum3(data, middle, end);
            subTaskA.fork();
            subTaskB.fork();
            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}


class RecurTaskDemo {

    public static void main(String[] args) {

        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        }
        Sum3 task = new Sum3(nums, 0, nums.length);
        double summation = fjp.invoke(task);
        System.out.println("Sum = " + summation);
    }
}
