public class Test0831{
	public static void main(String[] args){

		char numA = 'A';
		char numZ = 'Z';
		int count = (int)numZ - numA + 1;
		int num = (int) numA;
	
		char[] a = new char[count];

		for(int i=0; i< count ; i++){
			a[i] = (char)num;
			System.out.print(a[i] + " ");
			num++;
		}

		System.out.println();
	}
}