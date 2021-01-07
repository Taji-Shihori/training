package chap16;

class ReverseArray2 {

	static void swap(int[] a, int idx1, int idx2) {
		try {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("メソッドswap内で不正なインデックスを検出しました。");
			System.out.println("プログラムを終了します。");
			System.exit(1);
		}

	}

}
