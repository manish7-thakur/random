import org.junit.*;
import java.util.*;
import java.time.*;

public class ImagesArrangerTest {
  @Test
  public void ImagesArrangerTest() {
    LocalDateTime d1 = LocalDateTime.parse("2014-03-01T23:11:34");
    var actual = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", d1, "")));
    ImagesArranger.assignSeq(actual);
    var expected = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", d1, "1")));
    Assert.assertEquals("1", actual.get("warsaw").get(d1).getSeq());

    var iMap = Map.of(LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""),
    LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""),
    LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".png", d1, ""), LocalDateTime.now(), new ImagesArranger.ImageInfo(".jpg", d1, ""));
    actual = Map.of("warsaw", iMap);
    ImagesArranger.assignSeq(actual);
    expected = Map.of("warsaw", Map.of(d1, new ImagesArranger.ImageInfo(".jpg", d1, "1")));
    List<String> str = iMap.entrySet().stream().map(info -> info.getValue().getSeq()).toList();
    Assert.assertEquals(List.of("01", "02", "03", "04", "05", "06", "07", "08", "09", "10"), str);
  }
}
