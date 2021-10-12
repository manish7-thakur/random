public class CandyDistributor {
  static public int candy(int[] ratings) {
    int res = 0, leftLevel = 1;
    for(int i = 0; i < ratings.length; i++) {
        res++;
        if(i + 1 < ratings.length && ratings[i] > ratings[i + 1]) {
          int rightLevel = 0;
          boolean takeRight = i > 0 && ratings[i] <= ratings[i - 1];
          while(i + 1 < ratings.length && ratings[i] > ratings[i + 1]) {
            res++;
            res += rightLevel;
            rightLevel++;
            i++;
          }
          if(takeRight) res += rightLevel;
          else res += leftLevel > rightLevel ? leftLevel : rightLevel;
          leftLevel = 1;
        } else if(i > 0 && ratings[i] > ratings[i - 1]) {
          res += leftLevel;
          leftLevel++;
        } else {
          leftLevel = 1;
        }
      }
    return res;
  }
}
