import java.util.*;
import java.time.*;

public class ImagesArranger {
  static class ImageInfo {
    String ext;
    LocalDateTime date;
    String seq;
    public ImageInfo(String ext, LocalDateTime date, String seq) {
      this.ext = ext;
      this.date = date;
      this.seq = seq;
    }
    public String getSeq() {
      return seq;
    }
    public void setSeq(String seq) {
      this.seq = seq;
    }
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
