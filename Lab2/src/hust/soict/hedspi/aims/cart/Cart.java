package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(this.qtyOrdered < MAX_NUMBERS_ORDERED){
            this.itemsOrdered[this.qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else System.out.println("The hust.soict.dsai.aims.cart is almost full");
    }

    public void addDigitalVideodisc(DigitalVideoDisc[] dvdList) {
        int newqty = qtyOrdered + dvdList.length;
        if(newqty < MAX_NUMBERS_ORDERED){
            for(DigitalVideoDisc disc:dvdList){
                this.itemsOrdered[this.qtyOrdered] = disc;
                qtyOrdered++;
            }
            System.out.println("The DVD list has been added");
        }
        else System.out.println("The hust.soict.dsai.aims.cart is almost full");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        int newQty = qtyOrdered + dvds.length;

        if (newQty <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc dvd : dvds) {
                this.itemsOrdered[this.qtyOrdered] = dvd;
                qtyOrdered++;
            }
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The hust.soict.dsai.aims.cart is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        int newqty = qtyOrdered + 2;

        if(newqty < MAX_NUMBERS_ORDERED){
            this.itemsOrdered[this.qtyOrdered] = dvd1;
            qtyOrdered++;
            this.itemsOrdered[this.qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else System.out.println("The hust.soict.dsai.aims.cart is almost full");
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<qtyOrdered;i++){
            if(itemsOrdered[i].equals(disc)){
                for(int j=i;j<qtyOrdered-1;j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
            }
        }
    }
    public float totalCost(){
        float total = 0;
        for(int i=0;i<qtyOrdered;i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public int getqtyOrdered(){
        return qtyOrdered;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String keywords) {
        boolean found = false;

        System.out.println("Searching for DVDs with keywords: \"" + keywords + "\"");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keywords)) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No DVD found matching the keywords: \"" + keywords + "\"");
        }
    }


}
