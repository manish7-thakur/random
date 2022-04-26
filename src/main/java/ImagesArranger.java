import java.util.*;
import java.time.*;

public class ImagesArranger {
  static class ImageInfo {
    String ext;
    String seq;
    public ImageInfo(String ext, String seq) {
      this.ext = ext;
      this.seq = seq;
    }
    public String getSeq() {
      return seq;
    }
    public void setSeq(String seq) {
      this.seq = seq;
    }
    public String getExt() {
      return ext;
    }
  }
  static Map<String, Map<LocalDateTime, ImageInfo>> createInfo(String images) {
    String[] imgStr = images.split("\n");
    Map<String, Map<LocalDateTime, ImageInfo>> map = new HashMap<>();
    for(String str: imgStr) {
      String[] imgInfo = str.split(",");
      String ext = imgInfo[0].substring(imgInfo[0].indexOf('.'));
      String city = imgInfo[1].trim();
      LocalDateTime dateTime = LocalDateTime.parse(imgInfo[2].trim().replace(' ', 'T'));
      map.putIfAbsent(city, new TreeMap<LocalDateTime, ImageInfo>());
      map.get(city).put(dateTime, new ImageInfo(ext, ""));
    }
    return map;
  }
  static void assignSeq(Map<String, Map<LocalDateTime, ImageInfo>> map) {
    for(var iMap : map.entrySet()) {
      int count = 1;
      int len = String.valueOf(iMap.getValue().size()).length();
      String format = "%0"+len+"d";
      for(var imgInfo: iMap.getValue().entrySet()) {
        imgInfo.getValue().setSeq(String.format(format, count++));
      }
    }
  }
}
