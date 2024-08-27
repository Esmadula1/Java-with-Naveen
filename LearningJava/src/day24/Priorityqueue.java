package day24;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		//the PriorityQueue will print the smallest number first.
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(4);
		queue.offer(0);
		queue.offer(1);
		//it will print 1 and then value 4 because the elements are retrieved in a ascending order
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		PriorityQueue<UserProfile> Usersqueue = new PriorityQueue<>();
		Usersqueue.offer(new Usersqueue(20));
		
	}
	static class UserProfile{
		private final Integer age;
		public UserProfile(Integer age) {
			this.age = age;
		}
		public Integer getAge() {
			return age;
		}
	}

}
