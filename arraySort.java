package array_sorting;

public class arraySort {
	node hash_table[];
	
	public arraySort(int table_size){
		hash_table = new node[table_size];
		for(int i = 0; i < table_size; i++){
			hash_table[i] = new node();
		}
	}
	
	public int hash(char ch, int table_size){
		int index = 0;
		if(ch == ' '){
			return -1;
		}
		else{
			// find out char's ascii number
			// ascii 'a' is 97;
			// for reference ascii 'A' is 65
			int asc = (int) ch - 97;
			return asc % table_size; 
		}
	}
	
	public void insert(char ch, int key){
		if(hash_table[key].item == '-'){
			hash_table[key] = new node(ch);
		}
		else{
			node target = hash_table[key];
			target = target.getTail();
			target.next = new node(ch);
		}
	}
	
	public void printAll(){
		node n = null;
		for(int i = 0; i < hash_table.length; i++){
			n = hash_table[i];
			System.out.println("Table #"+ i);
			printLinkedList(n);
		}
	}
	
	public void printLinkedList(node n){
		while(n.item != '-'){
			System.out.println("\t"+n.item);
			n = n.next;
		}
	}
	
}
