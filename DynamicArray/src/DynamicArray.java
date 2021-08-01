public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1
    
    public DynamicArray(int cap){ // Class Constructor
        this.arr = new int[cap];
        this.capacity = cap;
        this.size = 0;
    }
    
    public void pushBack(int data){
        if(this.size >= this.capacity){ //if array is full
            int[] tempArray = new int[this.capacity * 2];//make temporary array that have 2x capacity of current array.
            for(int i = 0; i < this.size; i++ ){//copy data from old array to temporary array.
                tempArray[i] = this.arr[i];
            }
            this.arr = tempArray;//old variable point to where temporary pointed.
            this.capacity *= 2;//change capacity
        }
        arr[size] = data;
        this.size++;
    }
    public int popBack(){
        if(this.size == 0){// if array is empty.
            System.out.println("ERROR");
            return 0;
        }else{
            int backValue = this.arr[size - 1];//create new variable and point to last value in array.
            this.size--;//decrease array size.
            return backValue;//return last value in array.
        }
    }

    public int get(int i){
        if(i > this.size - 1 || i < 0){//if i > last index(that have value) or i is negative number.
            System.out.println("ERROR");
            return 0;
        }else{
            return this.arr[i];//return value of index i.
        }      
    }
    public void set(int i, int value){
        if(i > this.size - 1 || i < 0){//if i > last index(that have value) or i is negative number.
            System.out.println("ERROR");
        }else{
            this.arr[i] = value;//set value of index i with new value.
        }
    }
    
    public void remove(int i){
        if(i > this.size - 1 || i < 0){//if i > last index(that have value) or i is negative number.
            System.out.println("ERROR");
        }else{
            for(int j = i; j < this.size - 1; j++){
                this.arr[j] = this.arr[j + 1];// set value of index j with value of next index.
            }
            this.size--;//decrease array size.
        }
    }
    
    public boolean isEmpty(){
        return size == 0;//if array is empty, return true.
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void printStructure(){
        System.out.print("Size = " + this.size + ", Cap = " + this.capacity + ", arr = [ ");
        for(int i = 0; i < this.size; i++){
            System.out.print(this.arr[i]);
            if(i < this.size - 1) System.out.print(", ");
        }
        if(this.size == 0) System.out.print("]");
        else System.out.print(" ]");
        System.out.println("");
    }
}
