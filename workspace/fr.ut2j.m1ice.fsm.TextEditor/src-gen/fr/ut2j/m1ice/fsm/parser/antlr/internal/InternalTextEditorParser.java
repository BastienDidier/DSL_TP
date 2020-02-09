package fr.ut2j.m1ice.fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ut2j.m1ice.fsm.services.TextEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "','", "'Transition'", "' => '", "'StateOn'", "'StateOff'", "'StateFinal'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTextEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextEditorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextEditor.g"; }



     	private TextEditorGrammarAccess grammarAccess;

        public InternalTextEditorParser(TokenStream input, TextEditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected TextEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalTextEditor.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalTextEditor.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalTextEditor.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalTextEditor.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_6_0 = null;

        EObject lv_transition_8_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:77:2: ( (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )* ) )
            // InternalTextEditor.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )* )
            {
            // InternalTextEditor.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )* )
            // InternalTextEditor.g:79:3: otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalTextEditor.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTextEditor.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalTextEditor.g:84:4: (lv_name_1_0= ruleEString )
            // InternalTextEditor.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ut2j.m1ice.fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextEditor.g:102:3: ( ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* ) | (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==13) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTextEditor.g:103:4: ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* )
            	    {
            	    // InternalTextEditor.g:103:4: ( ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )* )
            	    // InternalTextEditor.g:104:5: ( (lv_state_2_0= ruleState ) ) (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )*
            	    {
            	    // InternalTextEditor.g:104:5: ( (lv_state_2_0= ruleState ) )
            	    // InternalTextEditor.g:105:6: (lv_state_2_0= ruleState )
            	    {
            	    // InternalTextEditor.g:105:6: (lv_state_2_0= ruleState )
            	    // InternalTextEditor.g:106:7: lv_state_2_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_2_0_0_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_state_2_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_2_0,
            	    								"fr.ut2j.m1ice.fsm.TextEditor.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalTextEditor.g:123:5: (otherlv_3= ',' ( (lv_state_4_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalTextEditor.g:124:6: otherlv_3= ',' ( (lv_state_4_0= ruleState ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getCommaKeyword_2_0_1_0());
            	    	    					
            	    	    // InternalTextEditor.g:128:6: ( (lv_state_4_0= ruleState ) )
            	    	    // InternalTextEditor.g:129:7: (lv_state_4_0= ruleState )
            	    	    {
            	    	    // InternalTextEditor.g:129:7: (lv_state_4_0= ruleState )
            	    	    // InternalTextEditor.g:130:8: lv_state_4_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_2_0_1_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_state_4_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_4_0,
            	    	    									"fr.ut2j.m1ice.fsm.TextEditor.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTextEditor.g:150:4: (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* )
            	    {
            	    // InternalTextEditor.g:150:4: (otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )* )
            	    // InternalTextEditor.g:151:5: otherlv_5= 'Transition' ( (lv_transition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getTransitionKeyword_2_1_0());
            	    				
            	    // InternalTextEditor.g:155:5: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalTextEditor.g:156:6: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalTextEditor.g:156:6: (lv_transition_6_0= ruleTransition )
            	    // InternalTextEditor.g:157:7: lv_transition_6_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_6_0,
            	    								"fr.ut2j.m1ice.fsm.TextEditor.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalTextEditor.g:174:5: (otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==12) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalTextEditor.g:175:6: otherlv_7= ',' ( (lv_transition_8_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,12,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCommaKeyword_2_1_2_0());
            	    	    					
            	    	    // InternalTextEditor.g:179:6: ( (lv_transition_8_0= ruleTransition ) )
            	    	    // InternalTextEditor.g:180:7: (lv_transition_8_0= ruleTransition )
            	    	    {
            	    	    // InternalTextEditor.g:180:7: (lv_transition_8_0= ruleTransition )
            	    	    // InternalTextEditor.g:181:8: lv_transition_8_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_2_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_transition_8_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_8_0,
            	    	    									"fr.ut2j.m1ice.fsm.TextEditor.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalTextEditor.g:205:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalTextEditor.g:205:46: (iv_ruleState= ruleState EOF )
            // InternalTextEditor.g:206:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalTextEditor.g:212:1: ruleState returns [EObject current=null] : (this_StateOn_0= ruleStateOn | this_StateOff_1= ruleStateOff | this_StateFinal_2= ruleStateFinal ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_StateOn_0 = null;

        EObject this_StateOff_1 = null;

        EObject this_StateFinal_2 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:218:2: ( (this_StateOn_0= ruleStateOn | this_StateOff_1= ruleStateOff | this_StateFinal_2= ruleStateFinal ) )
            // InternalTextEditor.g:219:2: (this_StateOn_0= ruleStateOn | this_StateOff_1= ruleStateOff | this_StateFinal_2= ruleStateFinal )
            {
            // InternalTextEditor.g:219:2: (this_StateOn_0= ruleStateOn | this_StateOff_1= ruleStateOff | this_StateFinal_2= ruleStateFinal )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTextEditor.g:220:3: this_StateOn_0= ruleStateOn
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getStateOnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateOn_0=ruleStateOn();

                    state._fsp--;


                    			current = this_StateOn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTextEditor.g:229:3: this_StateOff_1= ruleStateOff
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getStateOffParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateOff_1=ruleStateOff();

                    state._fsp--;


                    			current = this_StateOff_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTextEditor.g:238:3: this_StateFinal_2= ruleStateFinal
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getStateFinalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateFinal_2=ruleStateFinal();

                    state._fsp--;


                    			current = this_StateFinal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalTextEditor.g:250:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTextEditor.g:250:47: (iv_ruleEString= ruleEString EOF )
            // InternalTextEditor.g:251:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTextEditor.g:257:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTextEditor.g:263:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTextEditor.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTextEditor.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTextEditor.g:265:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTextEditor.g:273:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalTextEditor.g:284:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalTextEditor.g:284:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalTextEditor.g:285:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalTextEditor.g:291:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= ' => ' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:297:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= ' => ' ( ( ruleEString ) ) ) )
            // InternalTextEditor.g:298:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= ' => ' ( ( ruleEString ) ) )
            {
            // InternalTextEditor.g:298:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= ' => ' ( ( ruleEString ) ) )
            // InternalTextEditor.g:299:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= ' => ' ( ( ruleEString ) )
            {
            // InternalTextEditor.g:299:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTextEditor.g:300:4: (lv_name_0_0= ruleEString )
            {
            // InternalTextEditor.g:300:4: (lv_name_0_0= ruleEString )
            // InternalTextEditor.g:301:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ut2j.m1ice.fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextEditor.g:318:3: ( ( ruleEString ) )
            // InternalTextEditor.g:319:4: ( ruleEString )
            {
            // InternalTextEditor.g:319:4: ( ruleEString )
            // InternalTextEditor.g:320:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSpaceEqualsSignGreaterThanSignSpaceKeyword_2());
            		
            // InternalTextEditor.g:338:3: ( ( ruleEString ) )
            // InternalTextEditor.g:339:4: ( ruleEString )
            {
            // InternalTextEditor.g:339:4: ( ruleEString )
            // InternalTextEditor.g:340:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStateOn"
    // InternalTextEditor.g:358:1: entryRuleStateOn returns [EObject current=null] : iv_ruleStateOn= ruleStateOn EOF ;
    public final EObject entryRuleStateOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateOn = null;


        try {
            // InternalTextEditor.g:358:48: (iv_ruleStateOn= ruleStateOn EOF )
            // InternalTextEditor.g:359:2: iv_ruleStateOn= ruleStateOn EOF
            {
             newCompositeNode(grammarAccess.getStateOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateOn=ruleStateOn();

            state._fsp--;

             current =iv_ruleStateOn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateOn"


    // $ANTLR start "ruleStateOn"
    // InternalTextEditor.g:365:1: ruleStateOn returns [EObject current=null] : ( () otherlv_1= 'StateOn' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStateOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:371:2: ( ( () otherlv_1= 'StateOn' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTextEditor.g:372:2: ( () otherlv_1= 'StateOn' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:372:2: ( () otherlv_1= 'StateOn' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTextEditor.g:373:3: () otherlv_1= 'StateOn' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTextEditor.g:373:3: ()
            // InternalTextEditor.g:374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateOnAccess().getStateOnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateOnAccess().getStateOnKeyword_1());
            		
            // InternalTextEditor.g:384:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTextEditor.g:385:4: (lv_name_2_0= ruleEString )
            {
            // InternalTextEditor.g:385:4: (lv_name_2_0= ruleEString )
            // InternalTextEditor.g:386:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateOnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateOnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ut2j.m1ice.fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateOn"


    // $ANTLR start "entryRuleStateOff"
    // InternalTextEditor.g:407:1: entryRuleStateOff returns [EObject current=null] : iv_ruleStateOff= ruleStateOff EOF ;
    public final EObject entryRuleStateOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateOff = null;


        try {
            // InternalTextEditor.g:407:49: (iv_ruleStateOff= ruleStateOff EOF )
            // InternalTextEditor.g:408:2: iv_ruleStateOff= ruleStateOff EOF
            {
             newCompositeNode(grammarAccess.getStateOffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateOff=ruleStateOff();

            state._fsp--;

             current =iv_ruleStateOff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateOff"


    // $ANTLR start "ruleStateOff"
    // InternalTextEditor.g:414:1: ruleStateOff returns [EObject current=null] : ( () otherlv_1= 'StateOff' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStateOff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:420:2: ( ( () otherlv_1= 'StateOff' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTextEditor.g:421:2: ( () otherlv_1= 'StateOff' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:421:2: ( () otherlv_1= 'StateOff' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTextEditor.g:422:3: () otherlv_1= 'StateOff' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTextEditor.g:422:3: ()
            // InternalTextEditor.g:423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateOffAccess().getStateOffAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateOffAccess().getStateOffKeyword_1());
            		
            // InternalTextEditor.g:433:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTextEditor.g:434:4: (lv_name_2_0= ruleEString )
            {
            // InternalTextEditor.g:434:4: (lv_name_2_0= ruleEString )
            // InternalTextEditor.g:435:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateOffAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateOffRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ut2j.m1ice.fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateOff"


    // $ANTLR start "entryRuleStateFinal"
    // InternalTextEditor.g:456:1: entryRuleStateFinal returns [EObject current=null] : iv_ruleStateFinal= ruleStateFinal EOF ;
    public final EObject entryRuleStateFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFinal = null;


        try {
            // InternalTextEditor.g:456:51: (iv_ruleStateFinal= ruleStateFinal EOF )
            // InternalTextEditor.g:457:2: iv_ruleStateFinal= ruleStateFinal EOF
            {
             newCompositeNode(grammarAccess.getStateFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateFinal=ruleStateFinal();

            state._fsp--;

             current =iv_ruleStateFinal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateFinal"


    // $ANTLR start "ruleStateFinal"
    // InternalTextEditor.g:463:1: ruleStateFinal returns [EObject current=null] : ( () otherlv_1= 'StateFinal' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStateFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTextEditor.g:469:2: ( ( () otherlv_1= 'StateFinal' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTextEditor.g:470:2: ( () otherlv_1= 'StateFinal' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTextEditor.g:470:2: ( () otherlv_1= 'StateFinal' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTextEditor.g:471:3: () otherlv_1= 'StateFinal' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTextEditor.g:471:3: ()
            // InternalTextEditor.g:472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateFinalAccess().getStateFinalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateFinalAccess().getStateFinalKeyword_1());
            		
            // InternalTextEditor.g:482:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTextEditor.g:483:4: (lv_name_2_0= ruleEString )
            {
            // InternalTextEditor.g:483:4: (lv_name_2_0= ruleEString )
            // InternalTextEditor.g:484:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateFinalAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ut2j.m1ice.fsm.TextEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateFinal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003B002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}