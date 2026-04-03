public class sum {
    
    public static void main(Stringtest arg[]){
    System.out.println(digisum(17060809, 0));

    }

    public static int digisum(int n, int count){
  
        if(n/10==0){
            return count;
        }
        if(n%10==0){
            ++count;
        }
          return digisum(n/10, count);
        
        }

    }

