import org.junit.Assert;
import org.junit.Test;

public class KListMergerTest {
    @Test
    public void mergeSortedLists() {
        Node actual = KListMerger.merge(new Node[]{});
        Assert.assertNull(actual);

        Node head1 = new Node(1, null);
        Node head2 = new Node(1, null);
        actual = KListMerger.merge(new Node[]{head1, head2});
        Assert.assertEquals(1, actual.data);
        Assert.assertEquals(1, actual.next.data);
        Assert.assertNull(actual.next.next);

        head1 = new Node(1, new Node(2, null));
        head2 = new Node(1, new Node(3, null));
        actual = KListMerger.merge(new Node[]{head1, head2});
        Assert.assertEquals(1, actual.data);
        Assert.assertEquals(1, actual.next.data);
        Assert.assertEquals(2, actual.next.next.data);
        Assert.assertEquals(3, actual.next.next.next.data);
        Assert.assertNull(actual.next.next.next.next);

        head1 = new Node(1, new Node(2, null));
        head2 = new Node(1, new Node(3, null));
        Node head3 = new Node(2, new Node(3, null));
        actual = KListMerger.merge(new Node[]{head1, head2, head3});
        Assert.assertEquals(1, actual.data);
        Assert.assertEquals(1, actual.next.data);
        Assert.assertEquals(2, actual.next.next.data);
        Assert.assertEquals(2, actual.next.next.next.data);
        Assert.assertEquals(3, actual.next.next.next.next.data);
        Assert.assertEquals(3, actual.next.next.next.next.next.data);
        Assert.assertNull(actual.next.next.next.next.next.next);

        head1 = new Node(-2, new Node(-1, new Node(-1, new Node(-1, null))));
        actual = KListMerger.merge(new Node[]{head1, null});
        Assert.assertEquals(-2, actual.data);
        Assert.assertEquals(-1, actual.next.data);
        Assert.assertEquals(-1, actual.next.next.data);
        Assert.assertEquals(-1, actual.next.next.next.data);
        Assert.assertNull(actual.next.next.next.next);
    }
}