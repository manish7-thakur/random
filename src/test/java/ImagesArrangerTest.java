import org.junit.*;
import java.util.*;
import java.time.*;

public class ImagesArrangerTest {
  @Test
  public void sequenceImages() {
    LocalDateTime d1 = LocalDateTime.parse("2014-03-01T23:11:34");
    var actual = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", "")));
    ImagesArranger.assignSeq(actual);
    var expected = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", "1")));
    Assert.assertEquals("1", actual.get("warsaw").get(d1).getSeq());

    var iMap = Map.of(LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""),
    LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""),
    LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", ""));
    actual = Map.of("warsaw", iMap);
    ImagesArranger.assignSeq(actual);
    expected = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", "1")));
    List<String> str = iMap.entrySet().stream().map(info -> info.getValue().getSeq()).toList();
    Assert.assertEquals(List.of("01", "02", "03", "04", "05", "06", "07", "08", "09", "10"), str);
  }
  @Test
  public void createImageInfos() {
    String images = "photo.jpg, Warsaw, 2013-09-05 14:08:15\njohn.png, London, 2015-06-20 15:13:22";
    var actual = ImagesArranger.createInfo(images);
    Assert.assertEquals(".jpg", actual.get("Warsaw").get(LocalDateTime.parse("2013-09-05T14:08:15")).getExt());
    Assert.assertEquals(".png", actual.get("London").get(LocalDateTime.parse("2015-06-20T15:13:22")).getExt());
  }
}
