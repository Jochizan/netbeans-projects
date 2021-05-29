import java.util.Map;
import java.util.HashMap;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    Map<Character, Integer> map = new HashMap<>();
    text = text.toLowerCase();
    char[] lt = text.toCharArray();
    
    for (int i = 0; i < lt.length; ++i) {
      if (map.get(lt[i]) == null) {
        map.put(lt[i], 1);
      } else {
        int value = map.get(lt[i]);
        map.put(lt[i], ++value);
      }
    }
    
    int answer = 0;
    for(Map.Entry<Character, Integer> entry: map.entrySet())
      if (entry.getValue() > 1)
        answer++;

    return answer;
  }
}

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
