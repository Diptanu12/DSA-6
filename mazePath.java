public class mazePath {
    public static void main(String[] args) {
        int n=3,m=3;
//        System.out.println(mazeP(0,0,n,m));
        printPaths("", n, m);
    }

//    public static int mazeP(int i, int j, int n, int m) {
//        if(i==n || j==m){
//            return 0;
//        }
//        if(i==n-1 || j==m-1){
//            return 1;
//        }
//       int downPAth= mazeP(i+1,j,n,m);
//       int rightpath= mazeP(i,j+1,n,m);
//       return downPAth+rightpath;
//    }
    static void printPaths(String process, int i, int j){
      if(i==1 && j==1){
          System.out.println(process);
          return;
      }
      if(i>1){
          printPaths(process+"D",i-1,j);
      }
        if(j>1){
            printPaths(process+"R",i,j-1);
        }
    }
}
