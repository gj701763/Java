public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0)
            return ans;

        int sum = 0;

        if (k > 0) {
            // initial window: sum of first k elements after index 0
            for (int i = 0; i < k; i++) {
                sum += code[i];
            }

            for (int i = 0; i < n; i++) {
                sum = sum + code[(i + k) % n] - code[i];
                ans[i] = sum;
            }
        } else {
            k = -k; 
            for (int i = 0; i < k; i++)
                sum += code[(n - i) % n];

            for (int i = 0; i < n; i++) {
                sum = sum + code[(n - k + i) % n]-code[i];
                ans[i] = sum ;
            }
        }
        return ans;
    }