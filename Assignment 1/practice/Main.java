public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10, 11};

        double median = findMedian(arr1, arr2);
        System.out.println(median);
    }

    public static double findMedian(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }

        int x = arr1.length;
        int y = arr2.length;

        int low = 0;
        int high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : arr1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : arr2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((x + y) % 2 == 0) {
                    return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}