package maxheap;
import static java.util.Arrays.copyOf;
import java.util.Arrays;
/**
 * @author Benjamin Finotti
 * September 12th, 2018
 * Homework 2, MaxHeap
 * Dr. Whitley
 */
public class MaxHeap {

   protected int [] arr;
   protected int heapsize;
   
   
   /**
    * 
    * @param array 
    */
   public MaxHeap(int [] array){
       this.arr = copyOf(array, array.length);
       this.heapsize = array.length;
           buildMaxHeap(); 
       }
   
/**
 * 
 * @param i
 * @return the parentOf the index
 */
   protected int parentOf(int i){
    if( i == 0 || i >= heapsize){ //There are no indexes beyond the root and end of Heap
        return -1;
    }
    return (i/2)-1;
   }
   /**
    * 
    * @param i
    * @return index of the rightChild
    */
   protected int rightChildOf(int i){
       int right = 2*i+2; //add one to adjust the index to one-indexing
       if(right > heapsize){
           return -1;
       }
      return right-1; //subtract one to adjust the index back
   }
   
   /**
    * 
    * @param i
    * @return index of the leftChild
    */
   protected int leftChildOf(int i){
       int left = 2*i+1; //add one to adjust the index to one-indexing
       if(left >= heapsize){
           return -1;
       }
       return left-1; //subtract one to adjust the index back
   }
   
   protected void maxHeapify(int i){
       int largest = i;
       int left = leftChildOf(i);
       int right = rightChildOf(i);
       if(left > 0 && left < heapsize && arr[left] > arr[i]){//If leftChild is larger than largest
          largest = left;
       }
       if(right > 0 && right < heapsize && arr[right] > arr[largest]){ //If rightChild is larger than largest
           largest = right;
       } if(largest != i){ //If largest isn't the root, swap it
           int swapArr = arr[i];
           arr[i] = arr[largest];
           arr[largest] = swapArr;
           maxHeapify(largest); //Recursivley heapify the tree
       }
   }
   
   protected void buildMaxHeap(){
       for(int i = (heapsize/2)-1; i >= 0; i--){
           maxHeapify(i);
       }
   }
   
   public void heapsort(){
      buildMaxHeap(); //Build the maxHeap
      int backUpCopy = heapsize;
      for(int i = heapsize-1; i >= 1; i--){
          int swap = arr[0];
          arr[0] = arr[i];
          arr[i] = swap;
          heapsize--; //The last old element is the new root
          maxHeapify(0); //Restore the broken maxHeap at the root
      }
      heapsize = backUpCopy; //Restore the original heapsize value
   }
   
   public void printMaxHeap(){
       System.out.println(Arrays.toString(arr));
       }
   
    
}
