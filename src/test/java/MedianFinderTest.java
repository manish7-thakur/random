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
    Assert.assertEquals(0, mf.findMedian(), delta);
    mf.addNum(4);
    Assert.assertEquals(4, mf.findMedian(), delta);
    // mf.addNum(3);
    // Assert.assertEquals(1.5, mf.findMedian(), delta);
    // mf. addNum(1);
    // Assert.assertEquals(2, mf.findMedian(), delta);
  }
}
