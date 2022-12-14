package day20_Arrays;



public class Vježba2 {

    public static void main(String[] args) {

    }
    public static void nameOfADay(int number){

        String day="";

        if(number>0 || number<=7){
           day = (number==1)?"mon" :(number==2)?"tue":(number==3)?"wen":(number==4)?"thu":(number==5)?"fri"
                    :(number==6)?"sat":"sun";
        }else{
            day= "invalid day!";
        } System.out.println("day = " + day);
    }


    }



