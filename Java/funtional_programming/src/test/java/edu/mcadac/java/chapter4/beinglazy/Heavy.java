package edu.mcadac.java.chapter4.beinglazy;

/**
 * Class to simulate lazy process
 */
public class Heavy {

    public Heavy(){
        System.out.printf("Heavy created");
    }


    @Override
    public String toString(){
        return "quite heavy";
    }

}
