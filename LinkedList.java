package LinkedList;


/*
 * 二叉树的简单实现
 * 1.存储数据类型为整数
 * 2.
 */
public class LinkedList{
	
	/*
	 * 节点
	 */
	public class Node {
		Integer ID;
		Node parent = null;
		Node child = null;
		

		// Constructor of Node 
		public Node(){};
		public Node(Integer ID){
			this.ID = ID;			
		}
		public String toString(){
	        StringBuilder builder = new StringBuilder();
	        builder.append(this.ID).append(", ").append("\n");    
	        return builder.toString();
		}
	}
	
	/*
	 * 指针
	 */
	public Node root;
//	public Node current = root;
	public Node tail;
	
	
	
	/*
	 * 属性
	 */
	public Integer size = 0;
	
	/*
	 * 方法
	 */
	//constructor
	public LinkedList(){
		
		 tail = new Node();
		 root = tail;
	}
	
	/* 添加元素
	 * 1.根节点是否为空
	 * 		是，根
	 * 		否，比较，小左，大右
	 * 2.重复以上算法
	 */
//	public void add(Node subRoot, Node node){
//		if(subRoot.ID == null){
//			subRoot.ID = node.ID;
//			subRoot.child = next;
//			
//		}else{
//			add(next,node);
//		}
//	}
	public void add(Node subRoot, Node node){
//		find(subRoot).ID = node.ID;
		if(subRoot == tail){
			subRoot = node;
			subRoot.child = tail;
		}else{
			add(subRoot.child,node);
		}
	}
	
	/*
	 * find right insertor
	 */
	
	public Node find(Node node){
		if(node.child == tail){
			return node;
	//		node = tail;
		}else{
			return find(node.child);
		}
	}
	
	
	
	
	public void add(Integer ID){
		
		Node node = new Node(ID);
		this.add(root, node);
	}
	
	
	
	/*
	 * 输出
	 * 打印算法
	 */
	public void print(){
		Node point = root;
		
			while(point != null){
			System.out.print(point.toString());
			point = point.child;
			}
			
		

	}
}
