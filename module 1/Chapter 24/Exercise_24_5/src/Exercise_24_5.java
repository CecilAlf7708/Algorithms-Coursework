
public class Exercise_24_5 {
	public static void main(String[] args) {
		GenericQueue<String> queue = new GenericQueue<>();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		queue.enqueue("5");
		System.out.print(queue.toString());
		System.out.println("");
		
		queue.dequeue();
		queue.dequeue();
		System.out.print(queue.toString());
	}
}
