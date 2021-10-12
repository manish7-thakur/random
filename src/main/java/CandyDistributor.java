public class CandyDistributor {
  static public int candy(int[] ratings) {
    int res = 0, curr = 1;
    for(int i = 0; i < ratings.length; i++) {
        res++;
        if(i + 1 < ratings.length && ratings[i] > ratings[i + 1]) {
          int level = 0;
          boolean takeRight = i > 0 && ratings[i] == ratings[i - 1];
          while(i + 1 < ratings.length && ratings[i] > ratings[i + 1]) {
            res++;
            res += level;
            level++;
            i++;
          }
          if(takeRight) {
            res += level;
          } else {
            res += curr > level ? curr : level;
          }
          curr = 1;
        } else if(i > 0 && ratings[i] > ratings[i - 1]) {
          res += curr;
          curr++;
        } else {
          curr = 1;
        }
    }
    return res;
  }
}
