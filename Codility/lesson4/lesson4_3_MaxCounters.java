package lesson4_CountingElements;

public class lesson4_3_MaxCounters {
	class Solution {
		public int[] solution(int N, int[] A) {
			// write your code in Java SE 8
			// N length counter
			// M operation, M = A.length
			// N,M ==> [1..100,000]
			// A[k] ==> [1..N + 1].

			// A[K] = X, such that 1 ¡Â X ¡Â N, then operation K is increase(X),
			// if A[K] = N + 1 then operation K is max counter.
			int[] counter = new int[N];
			int M = A.length;
			int maxVal = 0;
			int[] maxTiming = new int[2];

			for (int i = 0; i < M; ++i) {
				// A[K] = X, such that 1 ¡Â X ¡Â N, then operation K is increase(X),
				if (A[i] >= 1 && A[i] <= N) {

					if (counter[A[i] - 1] < maxTiming[1]) {
						counter[A[i] - 1] = maxTiming[1];
					}
					counter[A[i] - 1]++;

					if (counter[A[i] - 1] > maxVal) {
						maxVal = counter[A[i] - 1];
					}

				} else if (A[i] == N + 1) {
					maxTiming[0] = i;
					maxTiming[1] = maxVal;
				}

				// if A[K] = N + 1 then operation K is max counter.
			}
			for (int i = 0; i < N; ++i) {
				if (counter[i] < maxTiming[1]) {
					counter[i] = maxTiming[1];
				}
			}

			return counter;

		}

	}
}


//class Solution {
//	public int[] solution(int N, int[] A) {
//		// write your code in Java SE 8
//		// N length counter
//		// M operation, M = A.length
//		// N,M ==> [1..100,000]
//		// A[k] ==> [1..N + 1].
//
//		// A[K] = X, such that 1 ¡Â X ¡Â N, then operation K is increase(X),
//		// if A[K] = N + 1 then operation K is max counter.
//		int[] counter = new int[N];
//		int maxVal = 0;
//		int[] maxTiming = new int[2];
//		for (int i = 0; i < A.length; ++i) {
//			// A[K] = X, such that 1 ¡Â X ¡Â N, then operation K is increase(X),
//			if (A[i] >= 1 && A[i] <= N) {
//				counter[A[i] - 1]++;
//
//				if (counter[A[i] - 1] > maxVal) {
//					maxVal = counter[A[i] - 1];
//				}
//
//			}
//
//			// if A[K] = N + 1 then operation K is max counter.
//			else if (A[i] == N + 1) {
//				maxTiming[0] = i;
//				maxTiming[1] = maxVal;
////				for (int j = 0; j < N; ++j) {
////					counter[j] = maxVal;
////				}
//			}
//
//		}
//		if( maxTiming[0] != 0){
//			for(int i=0; i<N; ++i){
//				counter[i] = maxTiming[1];
//			}
//		}
//		
//		for(int i = maxTiming[0]; i < A.length; ++i){
//			if (A[i] >= 1 && A[i] <= N) {
//				counter[A[i] - 1]++;
//			}
//		}
//
//		return counter;
//
//	}
//
//}
