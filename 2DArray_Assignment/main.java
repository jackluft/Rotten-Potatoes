

public class main
{
    // rows are the movies
    
   public static void main(String [] args){
       int[][] ratings = {
        {4,6,2,5},
        {7,9,4,8},
        {6,9,3,7}
        
        
    };
    //System.out.println("---------"+ratings[0].length);
        int ans = movieAvgRating(ratings,0);
        int ans2 = reviewerAvgRating(ratings,1);
        int ans3 = avgRating2018(ratings);
        //hardestRater2018(ratings);
        
       //System.out.println("1. "+ans);
       //System.out.println("2. "+ans2);
       System.out.println(+ans3);
       
    }
    
    public static int movieAvgRating(int[][] r, int movie){
        //Question 1
        int sum =0;
        for(int i =0; i < r.length; i++){
            sum += r[i][0];
            
            
        }
        
        // divied it but r[0].length then it is DONE
        
    
    
        return sum;
    
    }
    
    
    
    
    
    
    
    public static int reviewerAvgRating(int[][] r, int re){
        //Question 2
        int sum = 0;
        for(int i =0; i<=r.length; i++){
            sum+= r[re][i];
            
            
        }
        //Done
        
        return sum;
        
        
    }
    public static int avgRating2018(int[][] r){
        //Question 3
        int sum = 0;
        for(int i = 0; i < r.length;i++){
            
            for(int j = 0; j < r[i].length; j++){
                sum += r[i][j];
                
                
            }
            
            
            
        }
        
        
        return sum/12;
        
        
        
        
    }
    public static void worstMovie2018(int[][] r){
        //Question 4 
        //Done
        double[] stat = new double[4];
        
        int sum = 0;
        for(int j = 0; j < r[0].length; j++){
            sum = 0;
        for(int i = 0; i< r.length; i++){
            // goes throw one reveiwer!!!
            sum+=r[i][j];
            System.out.println(r[i][j]);
            
            
        }
        double avg = (double) sum/(r.length*10);
        stat[j] = avg;
        System.out.println("Reveiwer ["+j+"]"+" has a average at: "+avg);
    }
    double low = stat[0];
    int at = 0;
    for(int x = 0; x< stat.length; x++){
        if(stat[x] < low){
            at = x;
            low = stat[x];
            
        }
        
        
        
        
        
    }
    System.out.println("The hardest Reveiwer["+at+"]"+" at a average: "+low);
        
        
        
        
        
        
        
        
    }
    
    
    
    
    public static int hardestRater2018(int[][] r){
        //Question 5
        //Done
        double[] stat = new double[3];
        int sum = 0;
        for(int j = 0; j < r.length; j++){
            
            sum =0;
            for(int i = 0; i < r[0].length; i++){
                sum+=r[j][i];
                System.out.println("------");
                
                
                
                
            }
            stat[j] = (double) sum/40;
            System.out.println("Note: "+stat[j]);
            
            
            
        }
        double c = stat[0];
        int index = 0;
        for(int x = 0; x < stat.length; x++){
            
            if(stat[x] < c){
                c = stat[x];
                index = x;
                
            }
            
            
        }
        System.out.println("The Hardest rating average is: "+c);
        return index;
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
