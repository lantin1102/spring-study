package com.lantin.factory;

//为创建一组相关或者是相互依赖的对象提供的一个接口，而不需要指定它们的具体类
// 通常这些对象是有几个不同维度的属性而不是单一属性
public class AbstractFactoryDemo {


	static abstract class ComputerFactory {
		abstract MotherBoard getMotherBoard();

		abstract CPU getCpu();

		abstract GPU getGpu();
	}

	public static void main(String[] args) {
		ComputerFactory factoryIntel = new Factory1();

		factoryIntel.getCpu().coreNum();
		factoryIntel.getMotherBoard().version();
		factoryIntel.getGpu().GPUMemory();

		System.out.println("=============");
		ComputerFactory factoryAMD = new Factory2();

		factoryAMD.getMotherBoard().version();
		factoryAMD.getCpu().coreNum();
		factoryAMD.getGpu().GPUMemory();

	}

	static class AMDGPU implements GPU{
		@Override
		public void GPUMemory() {
			System.out.println("8G 显卡");
		}
	}
	static class NVGPU implements GPU{
		@Override
		public void GPUMemory() {
			System.out.println("光追显卡");
		}
	}

	static class Factory1 extends ComputerFactory{
		@Override
		MotherBoard getMotherBoard() {
			return new Asus();
		}
		@Override
		CPU getCpu() {
			return new I7();
		}
		@Override
		GPU getGpu() {
			return new NVGPU();
		}
	}
	static class Factory2 extends ComputerFactory{
		@Override
		MotherBoard getMotherBoard() {
			return new GigaByte();
		}

		@Override
		CPU getCpu() {
			return new RYZEN();
		}

		@Override
		GPU getGpu() {
			return new AMDGPU();
		}
	}


	interface MotherBoard{
		void version();
	}
	interface CPU{
		void coreNum();
	}


	interface GPU{
		void GPUMemory();
	}

	static class I7 implements CPU{
		@Override
		public void coreNum() {
			System.out.println("酷睿8核");
		}
	}
	static class RYZEN implements CPU{
		@Override
		public void coreNum() {
			System.out.println("锐龙16核");
		}
	}

	static class Asus implements MotherBoard{
		@Override
		public void version() {
			System.out.println("ROG主板");
		}
	}

	static class GigaByte implements MotherBoard{
		@Override
		public void version() {
			System.out.println("技嘉主板");
		}
	}

}
