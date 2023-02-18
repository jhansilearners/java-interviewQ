package com.app.hrank;

class Solution {
	
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.solution(9736));
	}
	
    int solution(int N) {
        int largest = N;
        int shift = 0;
        int temp = N;
        for (int i = 1; i < 30; ++i) {
            int index = (temp & 1);
            temp = ((temp >> 1) | (index << 29));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }
}