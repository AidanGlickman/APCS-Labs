package lab02;

public class TaxCalc {

    final private double[] BRACKETS = {17400, 70700, 142700, 217450};
    final private double[] RATES = {.15, .25, .28, .33};
    final private double BOTTOMRATE = .10;


    public String oldTax(double income){

        int taxCount = BRACKETS.length-1;

        final double EXTRACENT = 0.01; // The extra cent is included in calculations so that the amount of untaxed income for the next calculation will actually be within the tax bracket its calculating for

        double untaxedIncome = income;
        double tax = 0;

        if(income <= BRACKETS[0]){
            return(String.format("$%,.2f", tax)); // if the income is less than the lowest tax bracket, then the tax = 0
        }

        else {
            tax += (BRACKETS[0]-EXTRACENT) * BOTTOMRATE;
            System.out.println(tax);

            for(int i = taxCount; i>=0; i--){
                if (income >= BRACKETS[i]) {
                    tax += (untaxedIncome -  BRACKETS[i] + EXTRACENT) * RATES[i]; // the part of the income getting taxed at this staged is whatever hasn't previously been taxed, minus the limit for the bracket, plus a cent (because really we should be subtracting the floor for the bracket - 1 cent so we only tax the amount of money that is in the bracket.
                    untaxedIncome -= (untaxedIncome - BRACKETS[i] + EXTRACENT);
                }
                System.out.println(tax);
            }

            return(String.format("$%,.2f", tax));
        }
    }

    public String newTax(double income){
        if(income >=BRACKETS[BRACKETS.length-1])
            return(String.format("$%,.2f", income*RATES[RATES.length-1]));

        else
            return(oldTax(income));
    }

    public String taxDifference(double income){
        String newtax = newTax(income);
        String oldtax = oldTax(income);
        newtax = newtax.replace("$", "").replace(",", ""); //We strip away the commas and $ in each tax value so we can parseDouble and do math with it
        oldtax = oldtax.replace("$", "").replace(",", "");
        return(String.format("$%,.2f", Double.parseDouble(newtax) - Double.parseDouble(oldtax)));
    }
}
