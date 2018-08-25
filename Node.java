package nubi.datastruct.list;

public class Node<T> {


	//数据域
	private T t;
	//结点域
	private Node<T> next;
	
	public Node(){
		
	}

	public Node(T t){
		this.t = t;
	}
	//打印数据域中的元素值
	public void display(){
		System.out.println(t);
	}
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
