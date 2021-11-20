import java.util.*;

public class TripletSum {
    static class Pair {
        int i, j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object other) {
            Pair o = (Pair) other;
            return (this.i == o.i && this.j == o.j) || (this.i == o.j && this.j == o.i);
        }

        public boolean contains(int k) {
            return this.i == k || this.j == k;
        }
    }

    public static int countTriplets(int[] arr, int n) {
        int count = 0;
        Map<Pair, Integer> sMap = new HashMap<>();
        Set<String> tSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < n) {
                    sMap.put(new Pair(i, j), sum);
                }
            }
        }
        for (Map.Entry<Pair, Integer> e : sMap.entrySet()) {
            for (int i = 0; i < arr.length; i++) {
                Pair key = e.getKey();
                String tStr = mkString(key.i, key.j, i);
                if (!key.contains(i) && !tSet.contains(tStr) && e.getValue() + arr[i] < n) {
                    tSet.add(tStr);
                    count++;
                }
            }
        }
        return count;
    }

    private static String mkString(int i, int j, int k) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(i);
        list.add(j);
        list.add(k);
        Collections.sort(list);
        return list.toString();
    }

    static public List<List<Integer>> threeSum(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>(nums.length);
      Set<String> keys = new HashSet<>();
      List<List<Integer>> res = new ArrayList<>();
      for(int i = 0; i < nums.length; i++) {
          map.put(nums[i], i);
      }
      for(int i = 0; i < nums.length; i++) {
          for(int j = i + 1; j < nums.length; j++) {
              Integer index = map.get(-(nums[i] + nums[j]));
              if(index != null && index != i && index != j) {
                  List<Integer> num = List.of(nums[i], nums[j], -(nums[i] + nums[j]));
                  String key = getKey(num);
                  if(!keys.contains(key)) {
                      res.add(num);
                      keys.add(key);
                  }
              }
          }
      }
      return res;
  }

  static private String getKey(List<Integer> nums) {
    int a = nums.get(0);
    int b = nums.get(1);
    int c = nums.get(2);
    if(a <= b && a <= c) {
      if(b <= c) return a+""+b+""+c;
      else return a+""+c+""+b;
    } else if(b <= a && b <= c) {
      if(a <= c) return b+""+a+""+c;
      else return b+""+c+""+a;
    } else {
      if(b <= a) return c+""+b+""+a;
      else return c+""+a+""+b;
    }
  }

}
