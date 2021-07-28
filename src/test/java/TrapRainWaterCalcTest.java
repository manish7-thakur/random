import org.junit.*;

public class TrapRainWaterCalcTest {
  @Test
  public void calcTrappedRainWater() {
   int actual = TrapRainWaterCalc.calc(new int[] {});
   int expected = 0;
   Assert.assertEquals(expected, actual);

   actual = TrapRainWaterCalc.calc(new int[] {1, 0, 1});
   expected = 1;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc(new int[] {2, 1, 0, 2});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc(new int[] {4,2,0,3,2,5});
    expected = 9;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calcDp(new int[] {});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calcDp(new int[] {1, 0, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calcDp(new int[] {2, 1, 0, 2});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calcDp(new int[] {4,2,0,3,2,5});
    expected = 9;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calcDp(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {1, 0, 1});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {2, 1, 0, 2});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {4,2,0,3,2,5});
    expected = 9;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {5,5,1,7,1,1,5,2,7,6});
    expected = 23;
    Assert.assertEquals(expected, actual);

    actual = TrapRainWaterCalc.calc2Pointer(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    expected = 6;
    Assert.assertEquals(expected, actual);
  }
}
