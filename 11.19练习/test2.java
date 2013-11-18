/* 对继承的一点小实验
	1. 
	父类中申明了的 static 方法  ,子类中不能将该方法覆盖为 实例化方法 
	如
	class Father{
		static walk(){

		}
	}
	class Child entends Father{
		walk(){  //error

		}
	}
	上面这样是不允许的，同样 父类为实例化方法，子类也不能变成 static 方法

	2.父类中的静态方法 是不能被继承的，被继承的只能是实例化方法

	3.如果子类的构造函数里面没有申明要调用父类的哪种构造函数，会调用默认父类构造函数
	（即不带任何参数的构造函数，如果没有申明默认构造器，编译器会报错），所以必须明确
	地编写对基础类的调用代码


	4.父类和子类中有相同的构造函数时 ，先调用父级的构造函数，再调用子构造函数

	5.super必须出现在构造函数的第一条语句
	   

*/
class Animal{
	Animal(){
		System.out.println("this is super class 'Animal'");
	}
	Animal(int i){
		System.out.println(i);
	}
	void Speak(){
		System.out.println("Animal Speak now");
	}

}
public class test2 extends Animal{
	test2(){
		super();
		System.out.println("this is child class ");
	}
	test2(int i){
		super(i);
		System.out.println(i);
	}
	public static void main(String[] args){
		test2 t2 = new test2 ();
		t2.Speak();
		test2 tt2 = new test2(10);
	}
	void Speak(){
		System.out.println("child speak now ");
		super.Speak();

	}

}