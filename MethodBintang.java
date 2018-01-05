import java.lang.Math;

public class MethodBintang{

    public static void BilGenap(Integer i, Integer j){
       for(int bil=i; bil <=j; bil++){
            if(bil % 2 == 0){
            System.out.print(bil+" ");                                   
            }
        }
    }

    public static void Bintang(Integer j,Integer k, Integer m){
        for(int i = j; i <= k ; i++){
            for(int l=m; l < i; l++){
                System.out.print("*");
                
            }
            System.out.println(" ");
        }

    }
                                 
    public static void Bintang1(Integer j,Integer k, Integer l, Integer n){
        for(int i = j; i <= l ; i++){
            for(int m=(0+k); m < n; m++){
                System.out.print("*");
      
            }
            System.out.println(" ");
        k--;
        k--;    
        }

    }
  
    public static void SegitigaAngka(Integer j,Integer k){
        for(int i = j; i <=k ; i++){
            for(int l=k; l >=i; l--){
                System.out.print(l);
                
            }
            System.out.println(" ");
        }

    }

      public static void Matriks(Integer j,Integer k,Integer m, Integer n){
        for(int i = j; i <k ; i++){
            for(int l=m; l <= n; l++)
            {
                if((i%2)!=1){
                System.out.print(i*l + "\t");
                }else{
                    System.out.print(Math.pow(i,l)+"\t");
                }
            }
            System.out.println(" ");
        }


    }
}