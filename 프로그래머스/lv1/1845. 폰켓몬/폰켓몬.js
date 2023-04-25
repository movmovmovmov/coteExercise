function solution(nums) {
    /* 중복값은 없는 배열을 만들기, 최댓값보다 작다면 배열의 길아*/
    var answer = 0;
    var max = nums.length / 2;

    
    var set = new Set(nums);

    var uniqueArr = [...set];

    if(uniqueArr.length >= max){
        answer = max;
    } else{ answer = uniqueArr.length;}
   
    return answer;
}