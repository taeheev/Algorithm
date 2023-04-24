class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = String.valueOf(x);
        String[] result = str.split("");
        int sum = 0;
        for (int i = 0; i<result.length; i++){
            sum += Integer.parseInt(result[i]);
            }if (x % sum == 0){
                answer = true;
            }
        return answer;
    }
}