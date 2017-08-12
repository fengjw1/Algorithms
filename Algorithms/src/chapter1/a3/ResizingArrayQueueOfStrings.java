package chapter1.a3;

public class ResizingArrayQueueOfStrings {
    private String[] a = new String[1];
    private int N = 0;

    private boolean isEmpty(){
        return N == 0;
    }

    private int size(){
        return N;
    }

    private void resize(int max){
        String[] temp = new String[max];
        for (int i = 0; i < N; i ++){
            temp[i] = a[i];
        }
        a = temp;
    }

    private void enqueue(String item){
        if (N == a.length){
            resize(2 * N);
        }
        a [N ++] = item;
    }

    private String dequeue(){
        String item = a[0];

        for (int i = 0; i < N; i ++){
            a[i] = a[i + 1];
        }
        N --;

        if (N == a.length/4 && N > 0){
            resize(a.length / 2);
        }
        return item;
    }

}
