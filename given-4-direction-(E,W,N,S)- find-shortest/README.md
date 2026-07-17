this code provide the brote force approach even brute is best also because this question brute force approach is also the best approach because time complexity - O(n) and space complexity is - O(1) there is great 


public class shortestPath {
    public static double sortestPath(String str){
        int x =0;
        int y =0;

        for(int i =0; i<str.length(); i++){
            char directon = str.charAt(i);

            if(directon == 'N'){
                y++;
            }else if (directon == 'S'){
                y--;
            }else if(directon == 'E'){
                x++;
            }else if(directon == 'W'){
                x--;
            }
        }

        double shortesDistance = Math.sqrt((x*x) + (y*y));

        return shortesDistance;
    }


    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(sortestPath(str));
    }
}
