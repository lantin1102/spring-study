package com.lantin.factory;

public class FactoryMethodDemo {

	interface FruitFactory {
		Fruit makeFruit();
	}

	interface Fruit {
		void sayFruitName();
	}

	static class Apple implements Fruit {
		@Override
		public void sayFruitName() {
			System.out.println("我是苹果");
		}
	}

	static class Banana implements Fruit {
		@Override
		public void sayFruitName() {
			System.out.println("我是香蕉");
		}
	}

	static class AppleFactory implements FruitFactory {
		@Override
		public Fruit makeFruit() {
			return new Apple();
		}
	}

	static class BananaFactory implements FruitFactory {
		@Override
		public Fruit makeFruit() {
			return new Banana();
		}
	}

	public static void main(String[] args) {

		 FruitFactory factory1 = new AppleFactory();
		 factory1.makeFruit().sayFruitName();

		 FruitFactory factory2 = new BananaFactory();

		 factory2.makeFruit().sayFruitName();
	}
}
