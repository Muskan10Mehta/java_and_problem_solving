public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int n1 = A.size();
        int n2 = B.size();

        int i = 0;
        int j = 0;

        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        int res = 0;
        int xr, yr;

        if(n1 != n2){
           System.out.println("invalid input");
        } 

        if(n1 == 1 || n1 == 0){
            return 0;
        }

        while((i < n1 && j < n2) && ((i + 1) < n1 && (j + 1 ) < n2)){
            
            x1 = A.get(i);
            x2 = (i + 1) < n1? A.get(i + 1): 0;
            y1 = B.get(j);
            y2 = (j + 1) < n2? B.get(j + 1): 0;

            xr = Math.abs(x1 - x2);
            yr = Math.abs(y1 - y2);

            if(xr > yr){
                res += xr;
            }
            else {
                res += yr;
            }

            i++;
            j++;
        }

        return res;
    }

      
}

