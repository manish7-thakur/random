import org.junit.*;
public class MedianFinderTest {
  @Test
  public void findRunningMedian() {
    MedianFinder finder = new MedianFinder();
    finder.addNum(5);
    Assert.assertEquals(5, finder.findMedian(), 0.1);
    finder.addNum(1);
    Assert.assertEquals(3, finder.findMedian(), 0.1);
    finder.addNum(2);
    Assert.assertEquals(2, finder.findMedian(), 0.1);
    finder.addNum(8);
    Assert.assertEquals(3.5, finder.findMedian(), 0.1);
    finder.addNum(-4);
    Assert.assertEquals(2, finder.findMedian(), 0.1);
    finder.addNum(0);
    Assert.assertEquals(1.5, finder.findMedian(), 0.1);
  }
}
