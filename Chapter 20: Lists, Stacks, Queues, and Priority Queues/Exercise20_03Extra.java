import java.util.*;

public class Exercise20_03Extra {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter integers for priority queue1: ");
    String line = input.nextLine();
    PriorityQueue<Integer> queue1 = storedToPriorityQueue(line);
    
    System.out.print("Enter integers for priority queue2: ");
    line = input.nextLine();
    PriorityQueue<Integer> queue2 = storedToPriorityQueue(line);
    
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(queue1);
    for (int q : queue2)
        queue.offer(q);

    System.out.println("The union of the two priority queues is " + 
      increasingOrder(queue));

    queue = new PriorityQueue<Integer>(queue1);
    for (int q : queue1){
        if (queue2.contains(q))
            queue.remove(q);
    }

    System.out.println("The difference of the two priority queues is " + 
      increasingOrder(queue));

    queue = new PriorityQueue<Integer>(queue1);
    for (int q : queue1){
        if (!queue2.contains(q))
            queue.remove(q);
    }

    System.out.println("The intersection of the two priority queues is "
      + increasingOrder(queue));
  }
  
  // Add integers in line to a priority queue and return the queue
  private static PriorityQueue<Integer> 
      storedToPriorityQueue(String line) {
    // Implement it
    PriorityQueue<Integer> que = new PriorityQueue<>();
    for(String in : line.split(" ")){
      que.offer(Integer.parseInt(in));
    }
    
    return que;
  }
  
  // Return a string that contains the integers in the priority queue 
  // in increasing order
  private static String increasingOrder(PriorityQueue<Integer> queue) {
    // Implement it    
    PriorityQueue<Integer> que = new PriorityQueue<>();
    
    for(int i = 0; i < queue.size()*16; i++){
      que.offer(queue.poll());
    }
    
    return que.toString();
  }
}
