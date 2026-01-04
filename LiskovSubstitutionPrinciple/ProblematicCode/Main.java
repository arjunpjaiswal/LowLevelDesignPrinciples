package LowLevelDesignPrinciples.LiskovSubstitutionPrinciple.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> Cards =new ArrayList<>();
        for (CreditCard card :Cards){
            if(card instanceof RupayCard)
                card.upiPayment();
        }
    }
}
