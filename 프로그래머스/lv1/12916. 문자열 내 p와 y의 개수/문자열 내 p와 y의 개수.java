class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] arr = s.toLowerCase().split("");
        
        for (int i = 0; i<arr.length; i++){
           if("p".equals(arr[i])){
               p++;
           }else if("y".equals(arr[i])){
               y++;
           }
        }
        if (p != y){
            answer = false;
        }
        return answer;
    }
}