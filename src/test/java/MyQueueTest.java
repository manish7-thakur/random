import org.junit.*;

public class MyQueueTest {
  @Test
  public void queueUsingStack() {
    MyQueue q = new MyQueue();
    Assert.assertTrue(q.isEmpty());
    q.push(4);
    Assert.assertFalse(q.isEmpty());
    int actual = q.pop();
    Assert.assertEquals(4, actual);
    q.push(1);
    q.push(3);
    actual = q.pop();
    Assert.assertEquals(1, actual);
    Assert.assertFalse(q.isEmpty());
    q.push(2);
    actual = q.pop();
    Assert.assertEquals(3, actual);
    q.push(5);
    actual = q.pop();
    Assert.assertEquals(2, actual);
    q.push(7);
    q.push(9);
    actual = q.peek();
    Assert.assertEquals(5, actual);
    actual = q.pop();
    Assert.assertEquals(5, actual);
    actual = q.peek();
    Assert.assertEquals(7, actual);
    actual = q.pop();
    Assert.assertEquals(7, actual);
    actual = q.pop();
    Assert.assertEquals(9, actual);
  }
}
