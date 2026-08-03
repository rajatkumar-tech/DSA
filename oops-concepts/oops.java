public class oops{

    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Orange";
        System.out.println(p1.color);

        p1.tip = 7;
        System.out.println(p1.tip);
    }


    
}

class Pen {
        String color;
        int tip;

        void setcolor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }
    }
