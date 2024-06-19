class Static {
    static int x;
    static int y;

    // Static block
    static {
         x = 10;
         y = 20;
    }

    // Static variable
    static int counter = 0;
    // Instance variable
    int instanceCounter = 0;

    public Static() {
        counter++;
        instanceCounter++;

    }

    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        System.out.println("Static counter: " + Static.counter); // Output: 2
        System.out.println("Instance counter (obj1): " + obj1.instanceCounter); // Output: 1
        System.out.println("Instance counter (obj2): " + obj2.instanceCounter); // Output: 1
        System.out.println(obj1.add(3, 5));
        System.out.println(x + y);
    }
}