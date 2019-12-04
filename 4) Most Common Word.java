class Solution {

 public String mostCommonWord(String paragraph, String[] banned) {
 
 String[] words = paragraph.split("[^a-zA-Z]+");
 
for(int i=0; i<words.length; i++)
   {
    words[i] = words[i].toLowerCase();
    System.out.print(words[i] + " ");
    }
 
 HashMap map = new HashMap<String, Integer>();
 Set<String> ban = new HashSet<String>();
 
 for (int i=0; i<banned.length; i++)
        ban.add(banned[i]);
 
 for(int i=0; i<words.length; i++)
  {
  if(ban.contains(words[i]))
    continue;
 
  if(!map.containsKey(words[i]))
  {
  map.put(words[i], 1);
  }
  else
  {
  int count = (int) map.get(words[i]);
  count+=1;
  map.put(words[i], count);
  }
 }

 int max=-1;
 String ans="";

  for(int i=0; i< words.length;i++)
  {
   if(map.containsKey(words[i]))
     {
      int count =(int) map.get(words[i]);
      if(count > max)
      {
        ans = words[i];
        max=count;
      }
    }
  }
 
  return ans;
 
 }
}
