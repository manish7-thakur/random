public class ArrayTrie {
  class TrieNode {
    char c;
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord;

    TrieNode getChild(char c) {
      return children[c - 'a'];
    }
    void addChild(char c) {
      children[c - 'a'] = new TrieNode(c);
    }
    public TrieNode(char c) {
      this.c  = c;
      this.children = new TrieNode[26];
    }
  }

  private TrieNode root = new TrieNode('\0');

  public void insert(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      if(current.getChild(c) == null) current.addChild(c);
      current = current.getChild(c);
    }
    current.endOfWord = true;
  }
  public boolean search(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      current = current.getChild(c);
      if(current == null) return false;
    }
    return current.endOfWord;
  }

  public boolean startsWith(String prefix) {
    TrieNode current = root;
    for(char c : prefix.toCharArray()) {
      current = current.getChild(c);
      if(current == null) return false;
    }
    return true;
  }
}
