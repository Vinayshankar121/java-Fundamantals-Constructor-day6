class Constructor {
    /* defalut constructor */
    Constructor() {
        System.out.println("Default Constrouctor");
    }
    /* paramterised constructor */
     Constructor(int x) {
        System.out.println(" x value is" + x);
    }
}
class Main {
    public static void main(String[]args) {
        Constructor ob=new Constructor();
        Constructor ob1=new Constructor(10);

    }
}