class Solution {
    public String solution(String code) {
        String ret = "";
        boolean flag = false;
        for(int i = 0; i < code.length(); i++) {
            String str = code.substring(i, i+1);
            if(flag == false){
                if(!str.equals("1") && i%2 == 0){
                    ret = ret+str;
                } else if(str.equals("1")){
                    flag = true;
                }
            }
            else if(flag == true){
                if(!str.equals("1") && i%2 == 1){
                    ret = ret+str;
                } else if(str.equals("1")){
                flag = false;
                }
            }
        }
            if(ret.equals("")){
                ret = "EMPTY";
            }
        
        return ret;
    }
}