class Queue{

    int queue[] = new int[10];
    int front = -1, rear = -1;

    void insert(int x) {
        if(rear == 9)
            System.out.println("Queue Overflow");
        else {
            if(front == -1)
                front = 0;

            queue[++rear] = x;
        }
    }

    void delete() {
        if(front == -1 || front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted: " + queue[front++]);
    }

    void display() {
        for(int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        QueueDemo q = new QueueDemo();

        q.insert(10);
        q.insert(20);
        q.insert(30);

        q.display();

        q.delete();
        q.display();
    }
}
