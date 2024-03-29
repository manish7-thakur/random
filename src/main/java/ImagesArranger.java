import java.util.*;
import java.time.*;
import static java.util.stream.Collectors.*;

public class ImagesArranger {
  static String arrangeImages(String images) {
    String[] imgStr = images.split("\n");
    String[][] imgInfo = new String[imgStr.length][3];
    for(int i = 0; i < imgStr.length; i++) {
      String[] info = imgStr[i].split(",");
      imgInfo[i][0] = info[0].substring(info[0].indexOf("."));
      imgInfo[i][1] = info[1].trim();
      imgInfo[i][2] = info[2].trim().replace(' ', 'T');
    }
    Map<String, Map<LocalDateTime, String>> map = Arrays.stream(imgInfo).collect(groupingBy(arr -> arr[1],
            toMap(arr -> LocalDateTime.parse(arr[2]), str -> "",
                    (str1, str2) -> str1 /*executed to resolve duplicate key, how to merge previous & newer */, TreeMap::new)));
    assignSeq(map);
    StringBuilder b = new StringBuilder();
    for(String[] info: imgInfo) {
      String city = info[1];
      LocalDateTime dateTime = LocalDateTime.parse(info[2]);
      String seq = map.get(city).get(dateTime);
      b.append(city).append(seq).append(info[0]);
      b.append('\n');
    }
    return b.toString();
  }
  static void assignSeq(Map<String, Map<LocalDateTime, String>> map) {
    map.forEach((k, iMap) -> {
      int count = 1;
      int len = String.valueOf(iMap.size()).length();
      String format = "%0"+len+"d";
      for(Map.Entry<LocalDateTime, String> e : iMap.entrySet()) {
        iMap.put(e.getKey(), String.format(format, count++));
      }
    });
  }
}
