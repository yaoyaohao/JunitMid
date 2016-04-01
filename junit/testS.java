import static org.junit.Assert.*;

import org.junit.Test;


public class testS {
	public int[] a; 
	Sorting sorting = new Sorting();

	@Test
	public void test() {
		int[] a1 = new int[] {2,1};
		assertEquals(false,sorting.isSorted(a1));
		sorting.insertionSort(a1);
		assertEquals(true,sorting.isSorted(a1));
		
		int[] a3 = new int[] {1,3,2};
		assertEquals(false,sorting.isSorted(a3));
		sorting.quicksort(a3);
		assertEquals(true,sorting.isSorted(a3));
		
		int[] a4 = new int[] {4,3};
		int[] a5 = new int[] {3,4};
		sorting.swap(a4,0,1);
		assertArrayEquals(a5, a4);
		
		Object object1 = new Object();
		Object object2 = new Object();
		Object[] arrForSwapReference = new Object[]{object1,object2};
		Sorting.swapReferences(arrForSwapReference, 0, 1);
		assertArrayEquals(new Object[]{object2, object1},arrForSwapReference);
		
	
		
		
		
		
		
		
	}

}