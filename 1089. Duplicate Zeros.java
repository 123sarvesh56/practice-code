static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Traversing the array.
            if (arr[i] == 0) {
                for (int j = n - 2; j >= i; j--) {
                    arr[j + 1] = arr[j]; // Shifting The elements
                }
                i++; // incrementing i by 1
            }
        }
    }