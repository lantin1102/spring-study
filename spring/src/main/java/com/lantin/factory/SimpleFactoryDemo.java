package com.lantin.factory;

public class SimpleFactoryDemo {


	public static class SimpleFactory {
		Fruit makeFruit(String type) {
			if ("apple".equals(type)) {
				return new Apple();
			} else if ("banana".equals(type)) {
				return new Banana();
			}
			return null;
		}
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

	interface Fruit {
		void sayFruitName();
	}

	public static void main(String[] args) {

		SimpleFactory factory = new SimpleFactory();

		factory.makeFruit("apple").sayFruitName();
	}

}
