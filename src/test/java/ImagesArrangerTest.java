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

  @Test
  public void arrangeImagesInOrder() {
    String input = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
            "john.png, London, 2015-06-20 15:13:22\n" +
            "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
            "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
            "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
            "BOB.jpg, London, 2015-08-05 00:02:03\n" +
            "notredame.png, Paris, 2015-09-01 12:00:00\n" +
            "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
            "a.png, Warsaw, 2016-02-13 13:33:50\n" +
            "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
            "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
            "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
            "e.png, Warsaw, 2016-01-02 09:49:09\n" +
            "f.png, Warsaw, 2016-01-02 10:55:32\n" +
            "g.jpg, Warsaw, 2016-02-29 22:13:11";
    var actual = ImagesArranger.arrangeImages(input);
    Assert.assertEquals("Warsaw02.jpg\nLondon1.png\nWarsaw01.png\nParis2.jpg\nParis1.jpg\nLondon2.jpg\nParis3.png\nWarsaw03.jpg\nWarsaw09.png\nWarsaw07.jpg\nWarsaw06.jpg\nWarsaw08.jpg\n" +
    "Warsaw04.png\nWarsaw05.png\nWarsaw10.jpg\n", actual);
  }
}
