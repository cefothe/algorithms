package algorithams.calculator.power;

public enum PowerCalculator {
 F;
	public int calculate(int base, int exponets){
		if(exponets< 0){
			throw new IllegalArgumentException("Exponent can't be <0");
		}
		int result= 1;
		for(int i=0; i<exponets;i++){
			result*=base;
		}
		return result;
	}
}
