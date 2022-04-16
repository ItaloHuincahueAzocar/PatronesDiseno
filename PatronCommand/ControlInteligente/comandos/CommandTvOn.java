package PatronCommand.ControlInteligente.comandos;

import PatronCommand.ControlInteligente.accesorios.Tv;

public class CommandTvOn implements Command {
	
	Tv tv;

	public CommandTvOn(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

}
