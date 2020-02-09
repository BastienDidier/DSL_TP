/*
 * generated by Xtext 2.14.0
 */
package fr.ut2j.m1ice.fsm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.ut2j.m1ice.fsm.ide.contentassist.antlr.internal.InternalTextEditorParser;
import fr.ut2j.m1ice.fsm.services.TextEditorGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TextEditorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TextEditorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TextEditorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFSMAccess().getAlternatives_2(), "rule__FSM__Alternatives_2");
			builder.put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getFSMAccess().getGroup(), "rule__FSM__Group__0");
			builder.put(grammarAccess.getFSMAccess().getGroup_2_0(), "rule__FSM__Group_2_0__0");
			builder.put(grammarAccess.getFSMAccess().getGroup_2_0_1(), "rule__FSM__Group_2_0_1__0");
			builder.put(grammarAccess.getFSMAccess().getGroup_2_1(), "rule__FSM__Group_2_1__0");
			builder.put(grammarAccess.getFSMAccess().getGroup_2_1_2(), "rule__FSM__Group_2_1_2__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getStateOnAccess().getGroup(), "rule__StateOn__Group__0");
			builder.put(grammarAccess.getStateOffAccess().getGroup(), "rule__StateOff__Group__0");
			builder.put(grammarAccess.getStateFinalAccess().getGroup(), "rule__StateFinal__Group__0");
			builder.put(grammarAccess.getFSMAccess().getNameAssignment_1(), "rule__FSM__NameAssignment_1");
			builder.put(grammarAccess.getFSMAccess().getStateAssignment_2_0_0(), "rule__FSM__StateAssignment_2_0_0");
			builder.put(grammarAccess.getFSMAccess().getStateAssignment_2_0_1_1(), "rule__FSM__StateAssignment_2_0_1_1");
			builder.put(grammarAccess.getFSMAccess().getTransitionAssignment_2_1_1(), "rule__FSM__TransitionAssignment_2_1_1");
			builder.put(grammarAccess.getFSMAccess().getTransitionAssignment_2_1_2_1(), "rule__FSM__TransitionAssignment_2_1_2_1");
			builder.put(grammarAccess.getTransitionAccess().getNameAssignment_0(), "rule__Transition__NameAssignment_0");
			builder.put(grammarAccess.getTransitionAccess().getSourceAssignment_1(), "rule__Transition__SourceAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_3(), "rule__Transition__TargetAssignment_3");
			builder.put(grammarAccess.getStateOnAccess().getNameAssignment_2(), "rule__StateOn__NameAssignment_2");
			builder.put(grammarAccess.getStateOffAccess().getNameAssignment_2(), "rule__StateOff__NameAssignment_2");
			builder.put(grammarAccess.getStateFinalAccess().getNameAssignment_2(), "rule__StateFinal__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TextEditorGrammarAccess grammarAccess;

	@Override
	protected InternalTextEditorParser createParser() {
		InternalTextEditorParser result = new InternalTextEditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TextEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TextEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
