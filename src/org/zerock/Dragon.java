package org.zerock;

public class Dragon {

    private boolean hungry;

    public Dragon(){
        hungry = true;
    }

    public boolean isHungry() {
        return hungry;
    }


    public void makeFire(){
        if(hungry){
            System.out.println("배고파.. 못하겠어..");
            return;
        }

        System.out.println("불을 뿜는다");
        hungry = true;
    }

    public void eatFood() {
        if(hungry == false){
            System.out.println("괜찮아. 나 배 안고파");
            return;
        }
        System.out.println("Yam Yam Yam");
        hungry = false;
    }


}



