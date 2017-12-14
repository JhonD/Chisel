package de.ubt.ai7.csv_validator.console.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import de.ubt.ai7.csv_validator.console.Console;

public class ConsoleImpl implements Console {
	private static final int POSITIVE_COLOR = SWT.COLOR_DARK_GREEN;
	private static final int NEGATIVE_COLOR = SWT.COLOR_RED;
	
	private static final String CONSOLE_NAME = "MyConsole";
	private final MessageConsole myConsole;

	private ConsoleImpl() {
		myConsole = findConsole(CONSOLE_NAME);
	}

	public static ConsoleImpl init() {
		return new ConsoleImpl();
	}

	@Override
	public void println(String text) {
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(text);
	}
	
	@Override
	public void printlnNegative(String text){
		println(NEGATIVE_COLOR,text);
	}
	
	@Override
	public void printlnPositive(String text){
		println(POSITIVE_COLOR,text);		
	}
	

	private void println(int color, String text) {
		MessageConsoleStream out = myConsole.newMessageStream();

		out.setColor(Display.getCurrent().getSystemColor(color));
		out.println(text);
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
}
