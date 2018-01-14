package factory;

import factory.factory.ComputerFactory;
import factory.model.Computer;
import factory.model.ComputerType;

public class Main {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "16 GB", "1 TB", "2.9 GHz");

		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}

}
