package maxheap;
import java.util.Arrays;
/**
 * @author Benjamin Finotti
 * September 12th, 2018
 * Homework 2, MaxHeap
 * Dr. Whitley
 */
public class HeapDriver {
    public static void main(String[] args) {
        System.out.println("Heap1: ");
        int testArray1[] = {6, 7, 5, 4, 3, 2, 1};
        MaxHeap heap = new MaxHeap(testArray1);
        System.out.println(Arrays.toString(testArray1));
        heap.printMaxHeap();
        heap.heapsort();
        heap.printMaxHeap();
        System.out.println();
        
        System.out.println("Heap2: ");
        int testArray2[] = {1, 3, 2, 4, 5, 7, 6, 8, 10, 9};
        MaxHeap heap2 = new MaxHeap(testArray2);
        System.out.println(Arrays.toString(testArray2));
        heap2.printMaxHeap();
        heap2.heapsort();
        heap2.printMaxHeap();
        System.out.println();
        
        int testArray3[] = {15, 2, 5, 7, 17, 22, 13, 1, 11, 62};
        System.out.println("Heap3: ");
        MaxHeap heap3 = new MaxHeap(testArray2);
        System.out.println(Arrays.toString(testArray3));
        heap3.printMaxHeap();
        heap3.heapsort();
        heap3.printMaxHeap();
        System.out.println();
        
        System.out.println("Heap4: ");
        int testArray4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        MaxHeap heap4 = new MaxHeap(testArray4);
        System.out.println(Arrays.toString(testArray4));
        heap4.printMaxHeap();
        heap4.heapsort();
        heap4.printMaxHeap();
        System.out.println();
        
        
        System.out.println("Heap5: ");
        int testArray5[] = {4, 2, 4, 2, 4, 2, 5, 10, 3, 4, 2};
        MaxHeap heap5 = new MaxHeap(testArray5);
        System.out.println(Arrays.toString(testArray5));
        heap5.printMaxHeap();
        heap5.heapsort();
        heap5.printMaxHeap();
        System.out.println();
        
        
        
        
        
    }
}
