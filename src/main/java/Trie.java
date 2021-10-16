import java.util.*;

public class Trie {
  class TrieNode {
    Character c;
    Map<Character, TrieNode> map;
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
  }

  public boolean search(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      TrieNode node = current.getChild(c);
      if(node == null) {
        return false;
      }
      current = node;
    }
    return true;
  }
}
