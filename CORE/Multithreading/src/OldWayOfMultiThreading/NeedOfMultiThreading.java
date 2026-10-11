package OldWayOfMultiThreading;

class sequence {
    static void main() {
        long start = System.currentTimeMillis();
        // task 1
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* task completed");
        // task 2
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        System.out.println("\n@ task completed");
        // task 3
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n$ task completed");
        long end = System.currentTimeMillis();
        System.out.printf("Total time: %d ms", end - start);
    }}// single thread --> under utilization of resources