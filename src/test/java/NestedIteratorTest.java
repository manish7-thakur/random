import org.junit.*;
import java.util.*;

public class NestedIteratorTest {
  @Test
  public void iteratorForNestedListForIntegers() {
    NestedIterator iter = new NestedIterator(List.of());
    Assert.assertFalse(iter.hasNext());

    NestedInteger one = new NestedInteger(){

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
    };
    NestedInteger two = new NestedInteger(){

      @Override
      public boolean isInteger() {
        return true;
      }

      @Override
      public Integer getInteger() {
        return 2;
      }

      @Override
      public List<NestedInteger> getList() {
        return List.of();
      }
    };
    iter = new NestedIterator(List.of(one));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    iter = new NestedIterator(List.of(new NestedInteger(){

      @Override
      public boolean isInteger() {
        return false;
      }

      @Override
      public Integer getInteger() {
        return null;
      }

      @Override
      public List<NestedInteger> getList() {
        return List.of(one, two);
      }
    }));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertEquals(2, iter.next().intValue());

    iter = new NestedIterator(List.of(new NestedInteger(){

      @Override
      public boolean isInteger() {
        return false;
      }

      @Override
      public Integer getInteger() {
        return null;
      }

      @Override
      public List<NestedInteger> getList() {
        return List.of(one, two);
      }
    }, two));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertFalse(iter.hasNext());

    NestedInteger intList = new NestedInteger(){

      @Override
      public boolean isInteger() {
        return false;
      }

      @Override
      public Integer getInteger() {
        return null;
      }

      @Override
      public List<NestedInteger> getList() {
        return List.of(one, two, one, new NestedInteger(){

          @Override
          public boolean isInteger() {
            return false;
          }

          @Override
          public Integer getInteger() {
            return null;
          }

          @Override
          public List<NestedInteger> getList() {
            return List.of(one, two);
          }
        });
      }
    };

    iter = new NestedIterator(List.of(one, intList, two));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertFalse(iter.hasNext());

    iter = new NestedIterator(List.of(intList, intList));
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(1, iter.next().intValue());
    Assert.assertTrue(iter.hasNext());
    Assert.assertEquals(2, iter.next().intValue());
  }
}
