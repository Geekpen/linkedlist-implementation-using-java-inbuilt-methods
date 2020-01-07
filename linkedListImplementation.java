package LinkedListJavaInbuilrt;
import java.util.LinkedList;
public class linkedListImplementation {
	
	public static void main(String[] args) {
		LinkedList<Integer> qas = new LinkedList<Integer>();
		qas.add(4);
		qas.add(1);
		qas.add(3);
		
		qas.add(0, 6);
		
		qas.addFirst(9);//addFirst(element) = add(0, element)
		
		//get size
		System.out.println("Size of the list is: "+qas.size());
		System.out.println("Last element of the list is: "+ qas.getLast());
		
		
		printList(qas);
		
		sortList(qas);
		
		printList(qas);
		
		
	}
	
	public static void printList(LinkedList<Integer> list) {
		for(int data: list) {
			if(data == list.getFirst()) {
				System.out.print("[ "+ data);
			}
			else if(data != list.getFirst() && data != list.getLast()){
				System.out.print(" , "+ data);
			}
			else {
				System.out.print(" , "+ data+" ]");
			}
			
		}
		System.out.println();
	}
	
	public static void sortList(LinkedList<Integer> list) {
		for(int i = 1; i < list.size(); i++) {
			for(int data: list) {
				int temp = list.get(i);
				if(data > temp) {
					int dataIndex = list.indexOf(data);
					list.set(dataIndex, temp);
					list.set(i, data);
				}
			}
		}
	}

}
