package lab02.Code;
public class DiscountCalc {
    public double calculateTheDiscount(int numOfItems, double cost){
        double disc = 0;

        final double SPECIAL = .1;
        final double SUPERSPECIAL = .09;


        if(numOfItems<=5 || numOfItems>=20) // checks if the special discount should be applied
            disc = cost*SPECIAL;
        else if(numOfItems<=10) // checks if the super special discount should be applied
            disc = cost*SUPERSPECIAL;


        disc = ((int)((100*disc)+.5))/100.0; //rounds to 2 decimal places

        return disc;
    }
}
