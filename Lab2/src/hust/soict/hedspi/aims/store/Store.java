package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("DVD added to the store: " + dvd.toString());
        } else {
            System.out.println("Cannot add a null DVD to the store.");
        }
    }

    public void removeDVD(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsInStore) {
            if (dvd.getId() == id) {
                itemsInStore.remove(dvd);
                System.out.println("DVD removed from the store: " + dvd.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void printStore() {
        System.out.println("********************STORE********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Available DVDs:");
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd.toString());
            }
        }
        System.out.println("*********************************************");
    }
}
