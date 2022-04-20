public class ArrayTrie {
  class TrieNode {
    private TrieNode[] nodes = new TrieNode[26];
    private boolean endOfWord;
    public TrieNode(char c) {

    }
    public TrieNode addChild(char c) {
      TrieNode t = new TrieNode(c);
      nodes[c - 'a'] = t;
      return t;
    }
    public TrieNode getChild(char c) {
      return nodes[c - 'a'];
    }
    public void setEndOfWord(boolean endOfWord) {
      this.endOfWord = endOfWord;
    }

  }
  private TrieNode root = new TrieNode(' ');

  public void insert(String word) {
    TrieNode curr = root;
    curr = curr.addChild(word.charAt(0));
    curr.setEndOfWord(true);
  }

  public boolean search(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++) {
      curr = curr.getChild(word.charAt(i));
    }
    return curr.endOfWord;
  }
}
