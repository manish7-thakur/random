public class CandyDistributor {
  static public int candy(int[] ratings) {
    int res = 0;
    int curr = 1;
    for(int i = 0; i < ratings.length; i++) {
        res++;
        if(i + 1 < ratings.length && ratings[i] > ratings[i+1] || i - 1 >= 0 && ratings[i] > ratings[i - 1]) {
          res += curr;
          curr++;
        } else curr = 1;
    }
    return res;
  }
}