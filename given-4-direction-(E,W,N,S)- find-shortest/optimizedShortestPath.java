public class optimizedShortestPath {


    public static double shortestPath(String str){

        int x =0;
        int y =0;

        // string convert to the character the working the loop
        for (char direction : str.toCharArray()){
            switch(direction){

                // find the directon 
                case 'N'-> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
                default ->{ }
            }
        }
        
        return Math.sqrt((x*x) + (y*y));
    }
    

    public static void main(String args[]){
        String str = "WNEENESENNN";

        System.out.println(shortestPath(str));
    }
}
