package Java;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class PhraseOMatic {
    public static void main(String[] args){


        func();


    }


    public static void func(){
        String[] wordListOne = {"empowered","24/7","multi-tiger","B=to=B","24/7","multi-tiger","B=to=B","24/7","multi-tiger","B=to=B","24/7","multi-tiger","B=to=B"};

        String[] wordListTwo = {"1","2","3"};

        String[] wordListThree = {"process","core competency","mission","point","paradigm"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random()*oneLength);
        int rand2 = (int)(Math.random()*twoLength);
        int rand3 = (int)(Math.random());

        while(true){
            double randDouble = Math.random();
            rand2 = (int)(randDouble*twoLength);
            rand2 = (int)(randDouble*twoLength);
        }


    }




}
