package day24;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(0);//1 will be removed from the list
		list.remove(Integer.valueOf(5));//the value of 5 will be removed
		System.out.println(list);//{1,2,3,4}
		
		//offer method will work as FIFO model
		list.offer(1);
		list.offer(2);
		list.offer(3);
		list.offer(4);
		
		System.out.println(list.poll());//1
		System.out.println(list.poll());//2
		System.out.println(list.poll());//3
		System.out.println(list.poll());//4
	System.out.println();
		//push method will work as LIFO
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		
		System.out.println(list.pop());//4
		System.out.println(list.pop());//3
		System.out.println(list.poll());//2
		System.out.println(list.poll());//1
		
		

	}

}
