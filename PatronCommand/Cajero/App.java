package PatronCommand.Cajero;

import PatronCommand.Cajero.commands.Cuenta;
import PatronCommand.Cajero.commands.DepositarImpl;
import PatronCommand.Cajero.commands.Invoker;
import PatronCommand.Cajero.commands.RetirarImpl;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
