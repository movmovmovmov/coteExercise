class Solution{
	public int solution(int n, int m, int k, int[] arr){
	
Integer[] sortArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(tmp, Comparator.reverseOrder()); 

int answer = 0;
int first = sortArr[0];
int second = sortArr[1];
int j = 0;
	for(int i=0; i < m; i++){
	if ( j < k ) {
		answer += first;	
	} else {
		answer += second;
	j == 0;
}

}
