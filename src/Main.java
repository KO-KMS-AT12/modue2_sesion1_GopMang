public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        duyetMang(gopMang(arr1, arr2));
    }

    static int[] gopMang(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] += arr2[j];
        }
        return arr3;
    }

    static void duyetMang(int[] arr) {
        System.out.print("{ ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.print("}");
    }
}
