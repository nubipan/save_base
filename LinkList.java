package nubi.datastruct.list;


public class LinkList<T> {
	public void setFirst(Node<T> first) {
		this.first = first;
	}
	private Node<T> first;
	
	public LinkList(){
		first = null;
	}
	//头部添加
	@SuppressWarnings("unused")
	public boolean addFirst(T t){
		Node<T> temp = new Node<>();
		if(temp == null){
			System.out.println("分配空间失败");
			return false;
		}else{
			temp.setT(t);
			temp.setNext(null);
		}
		if(first == null){
			first = temp;
		}else{
			temp.setNext(first);
			first = temp;
		}
		
		return true;
	}
	//尾部添加
	@SuppressWarnings("unused")
	public boolean addEnd(T t){
		Node<T> tail;
		Node<T> temp = new Node<>();
		if(temp == null){
			System.out.println("分配空间失败");
			return false;
		}else{
			temp.setT(t);
			temp.setNext(null);
		}
		if(first == null){
			first = temp;
		}else{
			tail = (Node<T>) getEnd();
			tail.setNext(temp);
		}
		return true;
	}
	//获取头部元素
	public Node<? super T> getFirst(){
		return this.first;
	}
	//获取尾部元素
	public Node<? super T> getEnd(){
		Node<T> temp =first;
		if(temp == null){
			return null;
		}else{
			//循环遍历链表
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
		}
		return temp;
	}
	//在控制台打印列表中所有的元素
	public void display(){
		if(first == null){
			System.out.println("数据表空空如也");
			return;
		}
		while(first != null){
			first.display();
			first = first.getNext();
		}
	}
}
