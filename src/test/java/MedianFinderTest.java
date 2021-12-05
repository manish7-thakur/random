import org.junit.*;

public class MedianFinderTest {
  MedianFinder mf;
  private double delta;

  @Before
  public void setUp() {
    mf = new MedianFinder();
    delta = 0.1;
  }

  @Test
  public void testFindRunningMedian() {
    mf.addNum(4);
    Assert.assertEquals(4, mf.findMedian(), delta);
    mf.addNum(3);
    Assert.assertEquals(3.5, mf.findMedian(), delta);
    mf.addNum(1);
    Assert.assertEquals(3, mf.findMedian(), delta);
    mf.addNum(0);
    Assert.assertEquals(2, mf.findMedian(), delta);
  }
}
