import org.junit.*;
import java.util.*;

public class NestedIteratorTest {
  @Test
  public void iteratorForNestedListForIntegers() {
    NestedIterator iter = new NestedIterator(List.of());
    Assert.assertFalse(iter.hasNext());

    iter = new NestedIterator(List.of(new NestedInteger(){

      @Override
      public boolean isInteger() {
        return true;
      }

      @Override
      public Integer getInteger() {
        return 1;
      }

      @Override
      public List<NestedInteger> getList() {
        return List.of();
      }
    }));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
  }
}
