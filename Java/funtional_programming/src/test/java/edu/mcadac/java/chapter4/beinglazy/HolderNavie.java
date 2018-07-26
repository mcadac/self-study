package edu.mcadac.java.chapter4.beinglazy;

public class HolderNavie {

    private Heavy heavy;

    public HolderNavie(){
        System.out.println("Holder created");
    }

    public Heavy getHeavy() {

        if(heavy == null){
            heavy = new Heavy();
        }

        return heavy;
    }
}
