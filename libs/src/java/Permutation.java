class Permutation {
  public static <T extends Comparable<? super T>> boolean next(T[] a) {
    for (int idx1 = a.length - 2; idx1 >= 0; --idx1) {
      if (a[idx1].compareTo(a[idx1 + 1]) < 0) {
        int idx2 = upperBound(a, idx1 + 1, a.length, a[idx1]);
        swap(a, idx1, idx2);
        int left = idx1 + 1, right = a.length - 1;
        while (left < right) {
          swap(a, left, right);
          ++left;
          --right;
        }
        return true;
      }
    }
    return false;
  }

  public static boolean next(int[] a) {
    for (int idx1 = a.length - 2; idx1 >= 0; --idx1) {
      if (a[idx1] < a[idx1 + 1]) {
        int idx2 = upperBound(a, idx1 + 1, a.length, a[idx1]);
        swap(a, idx1, idx2);
        int left = idx1 + 1, right = a.length - 1;
        while (left < right) {
          swap(a, left, right);
          ++left;
          --right;
        }
        return true;
      }
    }
    return false;
  }

  public static boolean next(char[] a) {
    for (int idx1 = a.length - 2; idx1 >= 0; --idx1) {
      if (a[idx1] < a[idx1 + 1]) {
        int idx2 = upperBound(a, idx1 + 1, a.length, a[idx1]);
        swap(a, idx1, idx2);
        int left = idx1 + 1, right = a.length - 1;
        while (left < right) {
          swap(a, left, right);
          ++left;
          --right;
        }
        return true;
      }
    }
    return false;
  }

  private static <T extends Comparable<? super T>> int upperBound(T[] a, int fromIndex, int toIndex, T key) {
    while (fromIndex + 1 < toIndex) {
      int mid = fromIndex + (toIndex - fromIndex) / 2;
      if (a[mid].compareTo(key) <= 0) {
        toIndex = mid;
      } else {
        fromIndex = mid;
      }
    }
    return fromIndex;
  }

  private static int upperBound(int[] a, int fromIndex, int toIndex, int key) {
    while (fromIndex + 1 < toIndex) {
      int mid = fromIndex + (toIndex - fromIndex) / 2;
      if (a[mid] <= key) {
        toIndex = mid;
      } else {
        fromIndex = mid;
      }
    }
    return fromIndex;
  }

  private static int upperBound(char[] a, int fromIndex, int toIndex, char key) {
    while (fromIndex + 1 < toIndex) {
      int mid = fromIndex + (toIndex - fromIndex) / 2;
      if (a[mid] <= key) {
        toIndex = mid;
      } else {
        fromIndex = mid;
      }
    }
    return fromIndex;
  }

  private static <T extends Comparable<? super T>> void swap(T[] a, int idx1, int idx2) {
    T tmp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = tmp;
  }

  private static void swap(int[] a, int idx1, int idx2) {
    int tmp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = tmp;
  }

  private static void swap(char[] a, int idx1, int idx2) {
    char tmp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = tmp;
  }
}
