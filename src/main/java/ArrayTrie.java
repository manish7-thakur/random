public class ArrayTrie {
  class TrieNode {
    private char node;
    private TrieNode[] children;
    private boolean endOfWord;

    public TrieNode(char c) {
      this.node = c;
      children = new TrieNode[26];
    }
    public void addChild(char c) {
      children[c - 'a'] = new TrieNode(c);
    }
    public TrieNode getChild(char c) {
      return children[c - 'a'];
    }
    public void setEndOfWord(boolean endOfWord) {
      this.endOfWord = endOfWord;
    }
  }
  private TrieNode root;
  public ArrayTrie() {
    root = new TrieNode('\0');
  }

  public void insert(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++) {
      if(curr.getChild(word.charAt(i)) == null) curr.addChild(word.charAt(i));
      curr = curr.getChild(word.charAt(i));
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
