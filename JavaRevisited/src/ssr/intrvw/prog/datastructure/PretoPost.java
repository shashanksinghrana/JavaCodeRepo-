package ssr.intrvw.prog.datastructure;

import java.util.LinkedList;


public class PretoPost {

	static int index = 0;
	public static Integer[] output;
	public static LinkedList<Integer> list = new LinkedList<Integer>();

	public static void main(String args[]) {

		int inOrder[] = { 4, 2, 5, 1, 3, 6 };
		int preOrder[] = { 1, 2, 4, 5, 3, 6 };
		int n = inOrder.length;
		printPostOrder(inOrder, preOrder, n);
	}

	public static int findRoot(int start, int end, int arr[], int root) {
		for (int i = start; i <= end; i++)
			if (arr[i] == root)
				return i;
		return -1;
	}
	
	static void printPostOrder(int in[], int pre[], int n){
		
		int start = 0;
		int end = in.length - 1;		
		output = Find_PostOrder(start,end, in, pre).toArray(new Integer[]{});
		for(int i: output)
		System.out.print(i+",");
		
	}

	// Prints postorder traversal from given inorder and preorder traversals
	public static LinkedList<Integer> Find_PostOrder(int start, int end, int in[],int pre[]) {
		if (start > end)
			return list;

		if (start == end) {
			
			//System.out.print(pre[index++] + " ");
			list.add(pre[index++]);
			return list;
		}

		int newIndex = findRoot(start, end, in, pre[index++]);
		Find_PostOrder(start, newIndex - 1, in, pre);
		Find_PostOrder(newIndex + 1, end, in, pre);
		//System.out.print(in[newIndex] + " ");
		list.add(in[newIndex]);
		return list;
	}

}
