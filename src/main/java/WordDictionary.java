public class WordDictionary {
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
    public TrieNode[] getChildren() {
      return children;
    }
    public void setEndOfWord(boolean endOfWord) {
      this.endOfWord = endOfWord;
    }
  }
  private TrieNode root;
  public WordDictionary() {
    root = new TrieNode('\0');
  }

  public void addWord(String word) {
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++) {
      if(curr.getChild(word.charAt(i)) == null) curr.addChild(word.charAt(i));
      curr = curr.getChild(word.charAt(i));
    }
    curr.setEndOfWord(true);
  }

  public boolean search(String word) {
    return searchRec(word, 0, root);
  }
  static boolean searchRec(String word, int start, TrieNode curr) {
    for(int i = start; i < word.length(); i++) {
      if(word.charAt(i) == '.') {
        for(TrieNode n : curr.getChildren()) {
          if(n != null && searchRec(word, i + 1, n)) return true;
          curr = n;
        }
      } else curr = curr.getChild(word.charAt(i));
      if(curr == null) return false;
    }
    return curr.endOfWord;
  }
}
