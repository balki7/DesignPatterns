package factory.factory;

import factory.model.Computer;
import factory.model.ComputerType;
import factory.model.PC;
import factory.model.Server;

public class ComputerFactory {
	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
		switch(type) {
		case PC:{
			return new PC(ram, hdd, cpu);
		}
		case SERVER:{
			return new Server(ram, hdd, cpu);
		}
		}
		
		return null;
	}
}
