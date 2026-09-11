class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        HashMap<Integer, Integer> map  = new HashMap<>();

        for(int i=0; i<digits.length; i++){
          if(!map.containsKey(digits[i])){
            map.put(digits[i],0);
          }
          map.put(digits[i],map.get(digits[i])+1);
        }
     for(int i=100; i<=998; i=i+2){
        HashMap<Integer, Integer> checker = new HashMap<>(map);
        int num = i;
        while(num>0){
            int digit = num%10;
            if(checker.containsKey(digit)){
                if(checker.get(digit)>0){
                    checker.put(digit , checker.get(digit)-1);
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
            num = num/10;   
        }
        if(num==0){
            System.out.println(i);
            count++;
        }
     }
     System.out.println(map);
     return count;
    }
}