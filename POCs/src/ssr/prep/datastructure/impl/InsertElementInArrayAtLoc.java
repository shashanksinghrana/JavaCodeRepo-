/**
 * 
 */
package ssr.prep.datastructure.impl;

/**
 * @author shashankr
 *
 */
public class InsertElementInArrayAtLoc {
	
	int[] arr =  new int[10];
	int currSize = 5;
	
	public void initArray(){
		int num = 1;
		for(int i = 0; i<currSize; i++){
			arr[i] = num ++;
		}
	}
	
	public void printArray(){
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public void insertElement(int element, int position){
		
		if(position<arr.length && position>=0){
			for(int i=0; i<arr.length; i++){
				if(i == position){
					for(int j = currSize+1; j>i; j--){
						arr[j] = arr[j-1];
					}
					arr[i] = element;
				}
			}
		}else
			System.out.print("\nPosition "+position+" doesn't Exist");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertElementInArrayAtLoc arrOp = new InsertElementInArrayAtLoc();
		arrOp.initArray();
		arrOp.printArray();
		arrOp.insertElement(7, 3);
		System.out.println("\n*******************");
		arrOp.printArray();
		
		arrOp.insertElement(7, -1);
		System.out.println("\n*******************");
		arrOp.printArray();

	}

}
