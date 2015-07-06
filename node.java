package array_sorting;

public class node {
	char item; 
	node next; 

	public node(){
		item = '-'; 
		next = null; 
	}
	public node(char alpha){
		item = alpha;
		next = new node();
	}
	
	public node getTail(){
		node cur = this; 
		while(cur.next.item != '-'){
			cur = cur.next;
		}
		return cur;		
	}	
}
