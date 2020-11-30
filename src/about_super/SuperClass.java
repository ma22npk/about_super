package about_super;

class SuperClass {

    public SuperClass() {
        System.out.println("Super_Const");
    }

    public SuperClass(String str) {
        System.out.println("文字列型の引数: " + str);
    }

    // int型の場合のメソッド
    public SuperClass(int num) {
        System.out.println("int型の引数: " + num);
    }
}
