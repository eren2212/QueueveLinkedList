
import java.util.LinkedList;
import java.util.Queue;


public class Main {

   
    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<String>();
        
        
        //offer ile kuyruğa eleman ekliyoruz.
        queue.offer("eren");
        queue.offer("veli");
        queue.offer("ümit");
        queue.offer("Mehmet");
        
        for(String s:queue){
            System.out.println(s);
        }
        
        System.out.println("********************************");
        
        //poll ilede kuyruktan eleman çıkarılıyor
        //emty de içi boş mu dolu mu true false döndürüyor.
        while (!queue.isEmpty()) {            
            System.out.println("Elemanlar çıkarılıyor:"+queue.poll());
        }
       
        System.out.println(queue.isEmpty());
    }
    
}
