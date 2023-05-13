package LLD.ATM_design;

import LLD.ATM_design.ATM_states.ATMstate;
import LLD.ATM_design.ATM_states.IdleState;


public class ATM{

    private static ATM atmObj = new ATM(); //singleton eager initialization

    private ATM(){}

    private ATMstate currentATMState;
    private int atmBlalance;
    private int noOfTwoThousandNote;
    private int noOfFiveHunderdNote;
    private int noOfOneHunderdNote;

    public static ATM getATMObject() {
        atmObj.setCurrentATMState(new IdleState());
        return atmObj;
    }

    public void setCurrentATMState(ATMstate currentATMState) {
        this.currentATMState = currentATMState;
    }

    public void setATMBalance(int noOfTwoThousandNote, int noOfFiveHunderdNote, int noOfOneHunderdNote) {
        this.noOfTwoThousandNote = noOfTwoThousandNote;
        this.noOfFiveHunderdNote = noOfFiveHunderdNote;
        this.noOfOneHunderdNote = noOfOneHunderdNote;
        this.atmBlalance = (2000*noOfTwoThousandNote)+(500*noOfFiveHunderdNote)+(100*noOfOneHunderdNote);
    }

    public ATMstate getCurrentATMState() {
        return currentATMState;
    }

    public int getATMBalance() {
        return this.atmBlalance;
    }
    public int getNoOfTwoThousandNote() {
        return this.noOfTwoThousandNote;
    }
    public int getNoOfFiveHunderdNote() {
        return this.noOfFiveHunderdNote;
    }
    public int getNoOfOneHunderedNote() {
        return this.noOfOneHunderdNote;
    }

    public void deductATMBalance(int amount) {
        atmBlalance -= amount;
    }
    public void deductNoOfTwoThousandNote(int count) {
        noOfTwoThousandNote -= count;
    }
    public void deductNoOfFiveHunderedNote(int count) {
        noOfFiveHunderdNote -= count;
    }
    public void deductNoOfOneHunderedNote(int count) {
        noOfOneHunderdNote -= count;
    }

    public void printATMCurrentStatus() {
        System.out.println("ATM balance :"+ atmBlalance);
        System.out.println("No of 2000 notes :"+ noOfTwoThousandNote);
        System.out.println("No of 500 notes :"+ noOfFiveHunderdNote);
        System.out.println("No of 100 notes :"+ noOfOneHunderdNote);
    }

}
