/* 
	public和private 的作用域一般很好理解
	protect的作用域相对复杂

	首先 如果一个类 或者 成员 没有申明 public private protected 他会默认是protected
	protected对于子女、朋友来说，就是public的，可以自由使用，没有任何限制，而对于其他的外部class，protected就变成private。 
	这里的“朋友” 指在同一个包内（同一文件夹下的）的类
*/ 
public class test{
	public static void main(String[] args) {
		test1 b = new test1();
		System.out.println(b.child);

		test2 a = new test2();
		a.child = 3;
		a.show();
	}
}
//没有申明作用域 默认是protect
class test1{
	protected int child;
	protected test1(){
		this.child = 2;
	}
}
//继承自test1 
class test2 extends	test1{
	protected void show(){
		System.out.println(child);  //可以直接访问父类中的protected成员 child
	}
}
