package ssr.intrvw.prog.datastructure;


public class CopyOfPretoPost {

	static int index = 0;

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
		Find_PostOrder(start,end, in, pre);
		
	}

	// Prints postorder traversal from given inorder and preorder traversals
	public static void Find_PostOrder(int start, int end, int in[],int pre[]) {
		if (start > end)
			return;

		if (start == end) {
			
			System.out.print(pre[index++] + " ");
			return;
		}

		int newIndex = findRoot(start, end, in, pre[index++]);
		Find_PostOrder(start, newIndex - 1, in, pre);
		Find_PostOrder(newIndex + 1, end, in, pre);
		System.out.print(in[newIndex] + " ");
	}

}
