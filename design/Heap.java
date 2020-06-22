package design;

class Heap {

    int[] H ;
    int capacity = 10 ;
    int size;

    public Heap (int capacity) {

        this.capacity = capacity;
        H = new int[this.capacity];
        size = 0;
    }

    public Heap() {

    }

    public void addKey (int key) {

        H[size++] = key;

        heapifyUp(size -1);

    }

    public int extractMin () {

        int min = H[0];
        H[0] =H[size-1];
        size--;
        heapifyDown(0);
        return min;


    }

    public void changeKeyValue (int key, int value) {


        //TODO
    }


    public void buildHeap(int[] A) {
        H = new int[A.length];
        for (int i = 0; i < A.length ; i++) {
            addKey(A[i]);
        }

    }




    private void heapifyUp(int i) {
        while (i > 1 &&  ( H[i] < H[parent(i)])) {
            swap(i, parent(i));
            i = parent(i);

        }

    }

    private void heapifyDown(int i) {
        int n = size-1;
        int j;
        while((leftChild(i)<n && (H[i] > H[leftChild(i)])) || (rightChild(i)<n && (H[i] > H[rightChild(i)]))){

            if(H[leftChild(i)]<H[rightChild(i)]){
                j =leftChild(i);
            }else{
                j=rightChild(i);
            }
            swap(i,j);
            i =j;
        }


    }



    private int parent(int index) {
        if(index > 0)
            return (index-1) /2 ;
        return index ;
    }

    private int leftChild(int index) {
        return (2*index) + 1 ;
    }

    private int rightChild(int index) {
        return (2*index) + 2;
    }

    private void swap(int i, int j) {
        int temp = H[i];
        H[i] = H[j];
        H[j] = temp;
    }

    public void printHeap(){
        for(int i =0;i<size;i++) {
            System.out.println(H[i]);
        }
    }


}

class Test {

    public static void main (String args[]) {

        Heap heap = new Heap();

        int a[] = {10,20,2,3};

        heap.buildHeap(a);

     //   heap.printHeap();

        System.out.println("Min "+ heap.extractMin());

        heap.printHeap();

    }
}




