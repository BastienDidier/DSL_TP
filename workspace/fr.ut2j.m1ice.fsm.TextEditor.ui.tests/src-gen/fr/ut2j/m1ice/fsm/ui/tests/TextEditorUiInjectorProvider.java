/*
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.ui.tests;

import com.google.inject.Injector;
import fr.ut2j.m1ice.fsm.TextEditor.ui.internal.TextEditorActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TextEditorUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TextEditorActivator.getInstance().getInjector("fr.ut2j.m1ice.fsm.TextEditor");
	}

}
