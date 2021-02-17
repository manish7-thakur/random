public class GCDCalculator {
    static class Triplets {
        private int d;
        private int x;
        private int y;

        public Triplets(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object other) {
            Triplets o = (Triplets) other;
            return o.d == this.d && o.x == this.x && o.y == this.y;
        }

        @Override
        public String toString() {
            return "[" + d + "," + x + "," + y + "]";
        }
    }

    static int euclidCalc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidCalc(b, a % b);
    }

    static int euclidCalcIter(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static Triplets euclidCoefficients(int a, int b) {
        if (b == 0) {
            return new Triplets(a, 1, 0);
        }
        Triplets t = euclidCoefficients(b, a % b);
        return new Triplets(t.d, t.y, t.x - (int) (Math.floor(a / b) * t.y));
    }
}