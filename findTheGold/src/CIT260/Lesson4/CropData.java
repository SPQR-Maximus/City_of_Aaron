/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Lesson4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kol24
 */
class CropData implements Serializable{
    private int year;
    private int popuation;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int peopleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;

    public CropData (int year, int popuation, int acresOwned, int cropYield, int wheatInStore, int numberWhoDied, int newPeople, int harvest, int harvestAfterOffering, int offering, int offeringBushels, int peopleFed, int acresPlanted, int numStarved, int eatenByRats, int wheatForPeople){
       
        this.year = year;
        this.popuation = popuation;
        this.acresOwned = acresOwned;
        this.cropYield = cropYield;
        this.wheatInStore = wheatInStore;
        this.numberWhoDied = numberWhoDied;
        this.newPeople = newPeople;
        this.harvest = harvest;
        this.harvestAfterOffering = harvestAfterOffering;
        this.offering = offering;
        this.offeringBushels = offeringBushels;
        this.peopleFed = peopleFed;
        this.acresPlanted = acresPlanted;
        this.numStarved = numStarved;
        this.eatenByRats = eatenByRats;
        this.wheatForPeople = wheatForPeople;
    }

    
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopuation() {
        return popuation;
    }

    public void setPopuation(int popuation) {
        this.popuation = popuation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public int getOfferingBushels() {
        return offeringBushels;
    }

    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.year;
        hash = 19 * hash + this.popuation;
        hash = 19 * hash + this.acresOwned;
        hash = 19 * hash + this.cropYield;
        hash = 19 * hash + this.wheatInStore;
        hash = 19 * hash + this.numberWhoDied;
        hash = 19 * hash + this.newPeople;
        hash = 19 * hash + this.harvest;
        hash = 19 * hash + this.harvestAfterOffering;
        hash = 19 * hash + this.offering;
        hash = 19 * hash + this.offeringBushels;
        hash = 19 * hash + this.peopleFed;
        hash = 19 * hash + this.acresPlanted;
        hash = 19 * hash + this.numStarved;
        hash = 19 * hash + this.eatenByRats;
        hash = 19 * hash + this.wheatForPeople;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CropData other = (CropData) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.popuation != other.popuation) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.cropYield != other.cropYield) {
            return false;
        }
        if (this.wheatInStore != other.wheatInStore) {
            return false;
        }
        if (this.numberWhoDied != other.numberWhoDied) {
            return false;
        }
        if (this.newPeople != other.newPeople) {
            return false;
        }
        if (this.harvest != other.harvest) {
            return false;
        }
        if (this.harvestAfterOffering != other.harvestAfterOffering) {
            return false;
        }
        if (this.offering != other.offering) {
            return false;
        }
        if (this.offeringBushels != other.offeringBushels) {
            return false;
        }
        if (this.peopleFed != other.peopleFed) {
            return false;
        }
        if (this.acresPlanted != other.acresPlanted) {
            return false;
        }
        if (this.numStarved != other.numStarved) {
            return false;
        }
        if (this.eatenByRats != other.eatenByRats) {
            return false;
        }
        if (this.wheatForPeople != other.wheatForPeople) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CropData{" + "year=" + year + ", popuation=" + popuation + ", acresOwned=" + acresOwned + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", harvestAfterOffering=" + harvestAfterOffering + ", offering=" + offering + ", offeringBushels=" + offeringBushels + ", peopleFed=" + peopleFed + ", acresPlanted=" + acresPlanted + ", numStarved=" + numStarved + ", eatenByRats=" + eatenByRats + ", wheatForPeople=" + wheatForPeople + '}';
    }
    
}
