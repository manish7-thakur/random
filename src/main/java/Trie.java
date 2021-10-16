import java.util.*;

public class Trie {
  class TrieNode {
    Character c;
    Map<Character, TrieNode> map;
    boolean endOfWord;
    public TrieNode(Character c) {
      this.c = c;
      this.map = new HashMap<>();
    }
    TrieNode getChild(char c) {
      return map.get(c);
    }
    void addChild(char c) {
      map.put(c, new TrieNode(c));
    }
  }
  private TrieNode root = new TrieNode(' ');
  public void insert(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      if(current.getChild(c) == null) {
        current.addChild(c);
      }
      current = current.getChild(c);
    }
    current.endOfWord = true;
  }

  public boolean search(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      current = current.getChild(c);
      if(current == null) {
        return false;
      }
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
