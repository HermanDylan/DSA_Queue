class Queue {
    int size = 5;
    int cap, front, back;
    int arr[] = new int [size];
    Queue() {
        front = -1;
        back = -1;
        }
    boolean checkFull () {
        if  (front == 0 && back == size -1) {
            return true;
        }
        return false;
    }
    boolean checkEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enqueuer(int var) {
            if (checkFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1)
                    front = 0;
                back++;
                arr[back] = var;
                System.out.println("Pushed -> "+ var);
            }
    }

    int dequeuer(){
            int var;
            if(checkEmpty()){
                System.out.println("Queue is empty");
                return(-1);
            }else {
                var = arr[front];
                if(front >= back ) {
                    front = -1;
                    back = -1;
                } else {
                    front++;
                }
                System.out.println("Poped -> " + var);
                return(var);
            }
    }
    void printQueue() {
        int i;
        if(checkEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("\nThe Index of Front is " + front);
            System.out.println("Item:");
            for (i = front; i <= back; i++)
                System.out.print(arr[i]+ " ");
            System.out.println("\nThe Index of back is " + back);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Queue Q = new Queue();
        Q.dequeuer();
        Q.enqueuer(2);
        Q.enqueuer(5);
        Q.enqueuer(3);
        Q.enqueuer(9);

        Q.printQueue();

        Q.dequeuer();

        Q.printQueue();
    }
}
