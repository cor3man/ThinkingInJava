package test;

public class CountRep {
	public static void main(String[] args) {
		Integer[] a = new Integer[]{1,1,1,1,3,3,3,3,3,5,5,5,7,7,7,7,7,7,7,7,7,0};
		int max = 0;
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (((i+1) < a.length)&&(a[i]) == a[i+1]){
				count++;
			}else {
				if(max < count) max = count;
				count = 1;
			}
		}
		System.out.println(max);
		
	}
}
