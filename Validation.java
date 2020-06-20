// Marco Marchetti 20/06/2020

// Implement the various validations

public class RegularegAmmountValidator {
    
    public boolean isValid(RegularAmmount regAm) {
        String insertedAmnt = regAm.getAmount();
        boolean autoValidAmnt = ( insertedAmnt == null || regAm.getFrequency() == null || insertedAmnt.length() == 0); // Describe the null case
		
        if(autoValidAmnts) { // null case
            return true;
        }
		// Implement a switch statement with all the possible frequency of payment
		switch(regAm.getFrequency()) {
		case Frequency.TWO_WEEK:
            double amount = Double.parseDouble(insertedAmnt); // returns a double given a string
            return ((amount / 2) % 2 == 0); // if the amount inserted by a used is dividable by 2 and the rest is 0, then it is a valid amount
			
		case Frequency.FOUR_WEEK:
            double amount = Double.parseDouble(insertedAmnt);
            return ((amount / 4) % 2 == 0);
			
		case Frequency.MONTH:
			double amount = Double.parseDouble(insertedAmnt);
			return ((amount / 12) % 2 == 0);
		
		case Frequency.QUARTER:
            double amount = Double.parseDouble(insertedAmnt);
            return ((amount / 13) % 2 == 0); // quarterly means every 13 weeks
			
		case Frequency.YEAR:
            double amount = Double.parseDouble(insertedAmnt);
            return ((amount / 52) % 2 == 0);
			
        Default: // Any other unknown case
        return true;
    }
}