/**
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class TextEditorLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public TextEditorLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
