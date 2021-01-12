/*
Merge 3 sorted arrays preventing duplicates
*/
public class ArrayMerger {
    public static int[] merge(int[] a, int[] b, int[] c) {
        int[] res = new int[a.length + b.length + c.length];
        int a1 = 0, b1 = 0, c1 = 0, r = -1;
        while (a1 < a.length && b1 < b.length && c1 < c.length) {
            if (a[a1] <= b[b1] && a[a1] <= c[c1]) {
                if (r == -1 || res[r] != a[a1]) {
                    r++;
                    res[r] = a[a1];
                }
                a1++;
            } else if (b[b1] <= a[a1] && b[b1] <= c[c1]) {
                if (r == -1 || res[r] != b[b1]) {
                    r++;
                    res[r] = b[b1];
                }
                b1++;
            } else {
                if (r == -1 || res[r] != c[c1]) {
                    r++;
                    res[r] = c[c1];
                }
                c1++;
            }
        }
        while (a1 < a.length && b1 < b.length) {
            if (a[a1] < b[b1]) {
                if (r == -1 || res[r] != a[a1]) {
                    r++;
                    res[r] = a[a1];
                }
                a1++;
            } else {
                if (r == -1 || res[r] != b[b1]) {
                    r++;
                    res[r] = b[b1];
                }
                b1++;
            }
        }
        while (a1 < a.length && c1 < c.length) {
            if (a[a1] < c[c1]) {
                if (r == -1 || res[r] != a[a1]) {
                    r++;
                    res[r] = a[a1];
                }
                a1++;
            } else {
                if (r == -1 || res[r] != c[c1]) {
                    r++;
                    res[r] = c[c1];
                }
                c1++;
            }

        }
        while (b1 < b.length && c1 < c.length) {
            if (b[b1] < c[c1]) {
                if (r == -1 || res[r] != b[b1]) {
                    r++;
                    res[r] = b[b1];
                }
                b1++;
            } else {
                if (r == -1 || res[r] != c[c1]) {
                    r++;
                    res[r] = c[c1];
                }
                c1++;
            }
        }
        while (a1 < a.length) {
            if (r == -1 || res[r] != a[a1]) {
                r++;
                res[r] = a[a1];
            }
            a1++;
        }
        while (b1 < b.length) {
            if (r == -1 || res[r] != b[b1]) {
                r++;
                res[r] = b[b1];
            }
            b1++;
        }
        while (c1 < c.length) {
            if (r == -1 || res[r] != c[c1]) {
                r++;
                res[r] = c[c1];
            }
            c1++;
        }
        return res;
    }
}