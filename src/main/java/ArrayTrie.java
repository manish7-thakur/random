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
    for(int i = 0; i < word.length(); i++) {
      TrieNode child = curr.getChild(word.charAt(i));
      if(child == null) child = curr.addChild(word.charAt(i));
      curr = child;
    }
    curr.setEndOfWord(true);
  }

  public boolean search(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++) {
      curr = curr.getChild(word.charAt(i));
      if(curr == null) return false;
    }
    return curr.endOfWord;
  }

  public boolean startsWith(String prefix) {
    TrieNode curr = root;
    for(int i = 0; i < prefix.length(); i++) {
      curr = curr.getChild(prefix.charAt(i));
      if(curr == null) return false;
    }
    return true;
  }
}
