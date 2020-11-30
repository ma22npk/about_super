package about_super;

// 親クラスの SuperClass を継承
class SubClass extends SuperClass {
    public SubClass() { // コンストラクタ 定義
        super(200000); // super を使用して int型の 引数を指定。
    }
}
