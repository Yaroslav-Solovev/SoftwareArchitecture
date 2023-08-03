package task_1;

interface InterSum{
	default int sum(int a, int b){
		return sumAll(a, b);
	}
	
    private int sumAll(int... values){
        int result = 0;
		for(int n : values){
			result += n;
		}
		return result;
    }
}
