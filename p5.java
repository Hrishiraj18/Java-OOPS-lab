package course;
import java.util.*;
class CPU{
	int price;
	
	public class Processor
	{
		int cores;
		String manufa;
		public static class RAM
		{
			int memory;
		    String producer;
		}
	}
}




public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		CPU cpu=new CPU();
		CPU ram_price=new CPU();
		CPU.Processor processor= cpu.new Processor();
		CPU.Processor.RAM ram=new CPU.Processor.RAM();
		System.out.println("Enter the price ,coresand manufacturer of CPU");
		cpu.price=scan.nextInt();
		processor.cores=scan.nextInt();
		processor.manufa=scan.next();
		System.out.println("Enter the price, memory capacity and manufacturer of RAM ");
		ram_price.price=scan.nextInt();
		ram.memory=scan.nextInt();
		ram.producer=scan.next();
		System.out.println("********************************************************");
		System.out.println("The details of the system is ");
		System.out.println("Processor price : "+" "+cpu.price);
		System.out.println("Processor core : "+" "+processor.cores);
		System.out.println("Processor  Manufacturer : "+" "+processor.manufa);
		System.out.println("RAM price : "+"$"+ram_price.price);
		System.out.println("RAM memory : "+" "+ram.memory+"GB");
		System.out.println("RAM manufacturer : "+" "+ram.producer);
		scan.close();
	
	}

}
