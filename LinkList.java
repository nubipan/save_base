package nubi.datastruct.list;


public class LinkList<T> {
	public void setFirst(Node<T> first) {
		this.first = first;
	}
	private Node<T> first;
	
	public LinkList(){
		first = null;
	}
	//ͷ�����
	@SuppressWarnings("unused")
	public boolean addFirst(T t){
		Node<T> temp = new Node<>();
		if(temp == null){
			System.out.println("����ռ�ʧ��");
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
	//β�����
	@SuppressWarnings("unused")
	public boolean addEnd(T t){
		Node<T> tail;
		Node<T> temp = new Node<>();
		if(temp == null){
			System.out.println("����ռ�ʧ��");
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
	//��ȡͷ��Ԫ��
	public Node<? super T> getFirst(){
		return this.first;
	}
	//��ȡβ��Ԫ��
	public Node<? super T> getEnd(){
		Node<T> temp =first;
		if(temp == null){
			return null;
		}else{
			//ѭ����������
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
		}
		return temp;
	}
	//�ڿ���̨��ӡ�б������е�Ԫ��
	public void display(){
		if(first == null){
			System.out.println("���ݱ�տ���Ҳ");
			return;
		}
		while(first != null){
			first.display();
			first = first.getNext();
		}
	}
}
