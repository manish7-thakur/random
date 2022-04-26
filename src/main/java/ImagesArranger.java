import java.util.*;
import java.time.*;
import java.util.stream.IntStream;

public class ImagesArranger {
  static String arrangeImages(String images) {
    var map = createInfo(images);
    assignSeq(map);
    String[] imgStr = images.split("\n");
    StringBuilder b = new StringBuilder();
    for(String str: imgStr) {
      String[] imgInfo = str.split(",");
      String city = imgInfo[1].trim();
      LocalDateTime dateTime = LocalDateTime.parse(imgInfo[2].trim().replace(' ', 'T'));
      String seq = map.get(city).get(dateTime);
      b.append(city + seq + imgInfo[0].substring(imgInfo[0].indexOf(".")));
      b.append('\n');
    }
    return b.toString();
  }
  static Map<String, Map<LocalDateTime, String>> createInfo(String images) {
    String[] imgStr = images.split("\n");
    Map<String, Map<LocalDateTime, String>> map = new HashMap<>();
    for(String str: imgStr) {
      String[] imgInfo = str.split(",");
      String ext = imgInfo[0].substring(imgInfo[0].indexOf('.'));
      String city = imgInfo[1].trim();
      LocalDateTime dateTime = LocalDateTime.parse(imgInfo[2].trim().replace(' ', 'T'));
      map.putIfAbsent(city, new TreeMap<LocalDateTime, String>());
      map.get(city).put(dateTime, "");
    }
    return map;
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
