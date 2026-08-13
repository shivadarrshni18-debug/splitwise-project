public class Main {
    int add(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int a=10;
        int b=7;
        int addvalue = main.add(a,b);
        System.out.println(addvalue);

    }
}