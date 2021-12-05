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
    mf.addNum(10);
    Assert.assertEquals(3, mf.findMedian(), delta);
    mf.addNum(11);
    Assert.assertEquals(3.5, mf.findMedian(), delta);
  }

  @Test
  public void testFindRunningMedianDuplicates() {
    mf.addNum(10);
    Assert.assertEquals(10, mf.findMedian(), delta);
    mf.addNum(10);
    Assert.assertEquals(10, mf.findMedian(), delta);
    mf.addNum(10);
    Assert.assertEquals(10, mf.findMedian(), delta);
    mf.addNum(10);
    Assert.assertEquals(10, mf.findMedian(), delta);
  }

  @Test
  public void testSortedListRunningMedian() {
    mf.addNumS(4);
    Assert.assertEquals(4, mf.findMedianS(), delta);
    mf.addNumS(3);
    Assert.assertEquals(3.5, mf.findMedianS(), delta);
    mf.addNumS(1);
    Assert.assertEquals(3, mf.findMedianS(), delta);
    mf.addNumS(1);
    Assert.assertEquals(2, mf.findMedianS(), delta);
    mf.addNumS(1);
    Assert.assertEquals(1, mf.findMedianS(), delta);
    mf.addNumS(0);
    Assert.assertEquals(1, mf.findMedianS(), delta);
    mf.addNumS(2);
    Assert.assertEquals(1, mf.findMedianS(), delta);
    mf.addNumS(4);
    Assert.assertEquals(1.5, mf.findMedianS(), delta);
  }

  @Test
  public void testSortedListRunningMedianDuplicates() {
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
    mf.addNumS(14);
    Assert.assertEquals(14, mf.findMedianS(), delta);
  }
}
