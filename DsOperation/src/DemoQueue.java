import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(12);
		que.offer(13);
		que.offer(14);
		que.offer(15);
		que.offer(16);
		System.out.println(que);

		System.out.println(que.poll());
		System.out.println(que);
	}

}
