package patron.comportamiento.command;

public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	public void run() {
		command.execute();
	}
}
