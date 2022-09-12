package Java.SimpleGame;

public class SimpleDotCom {
    
    private int[] location;
    private int hitNum;

    public SimpleDotCom(int size){
        location = new int[3];
        hitNum = 3;
        int randomLocation = (int)(Math.random()*size);

        if(randomLocation > size-3){randomLocation = size-3;}

        location[0] = randomLocation;
        location[1] = randomLocation+1;
        location[2] = randomLocation+2;

    }

    public int getHitNum(){
        return hitNum;
    }

    public void setHitNum(int hit){
        hitNum++;
    }

    public int[] getLocation(){
        return location;
    }


    public boolean checkHit(int index){
        for (int i =0; i<location.length;i++) {
            if(location[i]==index){
                
                location[i]=-1;
                hitNum--;
                return true;
            }
        }

        return false;
    }


}
