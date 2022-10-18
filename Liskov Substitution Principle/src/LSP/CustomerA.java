package LSP;

import java.util.ArrayList;

public abstract class CustomerA {
    protected ArrayList<Offer> offers = null;

    public CustomerA(){
        offers = new ArrayList<>();
    }
public void setOffers(ArrayList<Offer>Offers){

    for (Offer offer : this.offers = Offers) {
        
    }

}
    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    public abstract void addOffers(Offer offer);
}
