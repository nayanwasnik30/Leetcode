class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length();
        int peak = findPeak(arr);

        int befor = BinaryBefor(arr, 0, peak, target);
        if (befor != -1) return befor;

        int after = BinaryAfter(arr, peak + 1, n - 1, target);
        return after;
    }

    public int findPeak(MountainArray arr) {
        int left = 1, right = arr.length() - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1)) {
                return mid;
            } else if (arr.get(mid - 1) < arr.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Ascending binary search
    public int BinaryBefor(MountainArray arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // fixed
    }

    // Descending binary search
    public int BinaryAfter(MountainArray arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            else if (val > target) left = mid + 1; // flipped
            else right = mid - 1;
        }
        return -1; // fixed
    }
}
