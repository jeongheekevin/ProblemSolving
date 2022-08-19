import java.util.HashSet;

public class lesson4_2 {
	class Solution {
		public int solution(int[] A) {
			// write your code in Java SE 8

			// N is an integer within the range [1..100,000];
			// each element of array A is an integer within the range [1..1,000,000,000].
			// permutation is a sequence containing each element from 1 to N once,
			// returns 1 if array A is a permutation and 0 if it is not.
			HashSet<Integer> hs = new HashSet<>();
			int N = A.length;

			for (int i = 0; i < N; ++i) {
				hs.add(A[i]);
			}

			for (int i = 1; i <= N; ++i) {
				if (!hs.contains(i)) {
					return 0;
				}
			}

			return 1;

		}
	}
}
