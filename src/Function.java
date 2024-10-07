public class Function {
    public static void main(String[] args){
        satHello();
        int result = add(3,7);
        System.out.println("결과" + result);
    }

    public static void satHello(){
        System.out.println("Hello, World!");
    }

    public static int add(int a, int b){
        return a + b;
    }
}
