public class MinMaxFinder {
	static class Pair {
		int min;
		int max;
		public Pair(int min, int max){
			this.min = min;
			this.max = max;
		}
		@Override
		public boolean equals(Object other) {
			Pair p = (Pair) other;
			return this.min == p.min && this.max == p.max;
		}
		@Override
		public String toString() {
			return "["+this.min+","+this.max+"]";
		}
	}
	static Pair find(int[] arr) {
		int min;
		int max;
		if(arr.length%2 == 0) {
			if(arr[0] < arr[1]) {
				min = arr[0];
				max = arr[1];
			} else {
				min = arr[1];
				max = arr[0];
			}
			for(int i = 2 ; i < arr.length; i+=2) {
				if(arr[i] < arr[i+1]) {
					if(arr[i] < min) {
						min = arr[i];
					}
					if(arr[i+1] > max) {
						max = arr[i+1];
					}
				} else {
					if(arr[i+1] < min) {
						min = arr[i+1];
					}
					if(arr[i] > max) {
						max = arr[i];
					}
				}
			}
		} else {
			min = arr[0];
			max = arr[0];
			for(int i = 1 ; i < arr.length; i+=2) {
				if(arr[i] < arr[i+1]) {
					if(arr[i] < min) {
						min = arr[i];
					}
					if(arr[i+1] > max) {
						max = arr[i+1];
					}
				} else {
					if(arr[i+1] < min) {
						min = arr[i+1];
					}
					if(arr[i] > max) {
						max = arr[i];
					}
				}
			}
		}

		return new Pair(min, max);
	}
}