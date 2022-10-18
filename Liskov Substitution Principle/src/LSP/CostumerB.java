package LSP;

import java.util.ArrayList;

public class CostumerB extends CustomerA{
    @Override

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
    @Override
    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
    public void setOffers(ArrayList<Offer> Offers) {
        super.setOffers(Offers);
    }
}
