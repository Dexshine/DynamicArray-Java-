public class Main {

    public static void main(String[] args) {
        //test case 1
        /*DynamicArray var = new DynamicArray(2);
        var.printStructure();
        var.pushBack(5);
        var.pushBack(6);
        var.printStructure();
        var.pushBack(7);
        var.printStructure();
        var.pushBack(8);
        var.printStructure();
        var.pushBack(9);
        var.printStructure();*/
        
        //test case 2
        /*DynamicArray var = new DynamicArray(3);
        var.printStructure();
        var.popBack();
        var.pushBack(11);
        var.pushBack(12);
        var.popBack();
        var.printStructure();*/
        
        //test case 3
        /*DynamicArray var = new DynamicArray(2);
        for (int i=0; i<10; i++){
            var.pushBack(i*i + 1);
        }
        var.printStructure();
        System.out.println(var.get(3));
        var.set(3, 555);
        System.out.println(var.get(3));
        var.remove(3);
        var.printStructure();*/
        
        //test case 4
        DynamicArray var = new DynamicArray(2);
        for (int i=0; i<10; i++){
            var.pushBack(i*i + 1);
        }
        var.printStructure();
        System.out.println(var.get(10));
        var.set(10, 555);
        var.remove(10);
        var.printStructure();

    }
    
}
