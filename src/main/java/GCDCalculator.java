public class GCDCalculator {
    static int euclidCalc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidCalc(b, a % b);
    }
}