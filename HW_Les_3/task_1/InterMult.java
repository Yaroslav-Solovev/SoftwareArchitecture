package task_1;

interface InterMult{
	default int mult(int a, int b){
		return multAll(a, b);
	}
	
	private int multAll(int... values){
		int result = 1;
		for(int n : values){
			result *= n;
		}
		return result;
	}
}
