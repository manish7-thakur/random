import org.junit.*;
import java.util.*;

public class ArrayMania5Test {
  @Test
  public void findDuplicatesFilesInAFileSystem() {
    List<List<String>> actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd)"});
    List<List<String>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd)", "root/c 3.txt(abcd)"});
    expected = List.of(List.of("root/a/1.txt","root/c/3.txt"));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania5.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"});
    expected = List.of(List.of("root/a/1.txt","root/c/3.txt"), List.of("root/a/2.txt", "root/c/d/4.txt"));
    Assert.assertEquals(expected, actual);
  }
}
