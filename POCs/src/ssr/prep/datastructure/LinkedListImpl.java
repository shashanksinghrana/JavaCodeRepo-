package ssr.prep.datastructure;


class LinkedListImpl {
	
	LinkedListNode head;
	LinkedListNode tail;
	LinkedListNode current;

		
		public void get(int index){
			int length = this.size();
			current = head;
			for(int i = 0; i< length; i++){
				if(i == index){
					System.out.println("Element at index "+ index+" is: "+current.data);
					break;
				}
				current = current.next;
			}
		}
		public int size(){
			current = head;
			int len = 0;
			while(current !=null){
				len++;
				current = current.next;
			}
			return len;
		}
		public void remove(int index){
			
			
		}
		
		public void add(int data){
			LinkedListNode newNode =  new LinkedListNode(data);
			if(head == null){
				head = newNode;
				tail =  newNode;
			}else{
				tail.next = newNode;
				tail = newNode;
			}
		}

		public void print(){
			
			current = head;
			System.out.print("List element(s): ");
			while(current!= null){
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
	
}
