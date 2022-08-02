
public class ActivitySelection {


   static public void maxActivity(int[] start, int[] finish, int n) {
       int i,j;

       i = 0;

       System.out.println(i+ " ");

        for ( j = 1; j < n; j++) {

            if(start[j]>=finish[i])
            {
                System.out.println(j+" ");
                i = j;
            }


        }


    }


    public static void main(String[] args) {
       int[] start = {0,2,3,5,6,1,10};
       int[] finish = {3,4,7,8,9,11,12};

       int length = start.length;

       maxActivity(start,finish,length);



    }
}
