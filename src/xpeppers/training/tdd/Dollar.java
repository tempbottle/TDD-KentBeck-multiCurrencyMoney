package xpeppers.training.tdd;

public class Dollar extends Money{
	
	protected Dollar(int amount){
		this.amount = amount;
	}
	
	protected Money times(int multiplier){
		return new Dollar(amount * multiplier);
	}
}
