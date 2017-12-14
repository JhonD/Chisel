package de.ubt.ai7.csv_validator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.ubt.ai7.csv_validator.services.SculptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSculptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DELIMITERS'", "'TYPES'", "'TOKENS'", "'REGIONS'", "'RULES'", "'TRANSFORMATION PROGRAM'", "'Row delim'", "'='", "';'", "'Col delim'", "'List delim'", "':'", "'base'", "'format'", "'decimalChar'", "'groupChar'", "'length'", "'minLength'", "'maxLength'", "'minimum'", "'minInclusive'", "'maximum'", "'maxInclusive'", "'minExclusive'", "'maxExclusive'", "'default'", "'empty'", "'+'", "'list'", "'<'", "'minElements'", "'maxElements'", "'UNBOUNDED'", "'separator'", "'>'", "'primary'", "'key'", "'foreign'", "'references'", "'{'", "','", "'}'", "'or'", "'and'", "'not'", "'/'", "'('", "')'", "'last'", "'True'", "'.'", "'['", "']'", "'*'", "'?'", "'|'", "'right'", "'down'", "'left'", "'up'", "'self'", "'::'", "'::*'", "'ANY'", "'EMPTY'", "'SOMETHING'", "'./'", "'output'", "'for'", "'each'", "'in'", "'if'", "'else'", "'is'", "'row'", "'col'", "'<='", "'>='", "'!='", "'=>'", "'->'", "'|>'", "'split'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSculptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSculptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSculptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSculpt.g"; }



     	private SculptGrammarAccess grammarAccess;
     	
        public InternalSculptParser(TokenStream input, SculptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Sculpt";	
       	}
       	
       	@Override
       	protected SculptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSculpt"
    // InternalSculpt.g:68:1: entryRuleSculpt returns [EObject current=null] : iv_ruleSculpt= ruleSculpt EOF ;
    public final EObject entryRuleSculpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSculpt = null;


        try {
            // InternalSculpt.g:69:2: (iv_ruleSculpt= ruleSculpt EOF )
            // InternalSculpt.g:70:2: iv_ruleSculpt= ruleSculpt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSculptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSculpt=ruleSculpt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSculpt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSculpt"


    // $ANTLR start "ruleSculpt"
    // InternalSculpt.g:77:1: ruleSculpt returns [EObject current=null] : ( () (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )? (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )? (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )? (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )? (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )? (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )? ) ;
    public final EObject ruleSculpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_delimiter_2_0 = null;

        EObject lv_types_4_0 = null;

        EObject lv_tokens_6_0 = null;

        EObject lv_regionTokens_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_transformationProgram_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:80:28: ( ( () (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )? (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )? (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )? (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )? (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )? (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )? ) )
            // InternalSculpt.g:81:1: ( () (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )? (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )? (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )? (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )? (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )? (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )? )
            {
            // InternalSculpt.g:81:1: ( () (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )? (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )? (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )? (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )? (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )? (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )? )
            // InternalSculpt.g:81:2: () (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )? (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )? (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )? (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )? (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )? (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )?
            {
            // InternalSculpt.g:81:2: ()
            // InternalSculpt.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSculptAccess().getSculptAction_0(),
                          current);
                  
            }

            }

            // InternalSculpt.g:87:2: (otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSculpt.g:87:4: otherlv_1= 'DELIMITERS' ( (lv_delimiter_2_0= ruleDelimiters ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSculptAccess().getDELIMITERSKeyword_1_0());
                          
                    }
                    // InternalSculpt.g:91:1: ( (lv_delimiter_2_0= ruleDelimiters ) )
                    // InternalSculpt.g:92:1: (lv_delimiter_2_0= ruleDelimiters )
                    {
                    // InternalSculpt.g:92:1: (lv_delimiter_2_0= ruleDelimiters )
                    // InternalSculpt.g:93:3: lv_delimiter_2_0= ruleDelimiters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSculptAccess().getDelimiterDelimitersParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_delimiter_2_0=ruleDelimiters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                      	        }
                             		set(
                             			current, 
                             			"delimiter",
                              		lv_delimiter_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Delimiters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSculpt.g:109:4: (otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSculpt.g:109:6: otherlv_3= 'TYPES' ( (lv_types_4_0= ruleType ) )*
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSculptAccess().getTYPESKeyword_2_0());
                          
                    }
                    // InternalSculpt.g:113:1: ( (lv_types_4_0= ruleType ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSculpt.g:114:1: (lv_types_4_0= ruleType )
                    	    {
                    	    // InternalSculpt.g:114:1: (lv_types_4_0= ruleType )
                    	    // InternalSculpt.g:115:3: lv_types_4_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSculptAccess().getTypesTypeParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    lv_types_4_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"types",
                    	              		lv_types_4_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.Type");
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
                    break;

            }

            // InternalSculpt.g:131:5: (otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSculpt.g:131:7: otherlv_5= 'TOKENS' ( (lv_tokens_6_0= ruleToken ) )*
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSculptAccess().getTOKENSKeyword_3_0());
                          
                    }
                    // InternalSculpt.g:135:1: ( (lv_tokens_6_0= ruleToken ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSculpt.g:136:1: (lv_tokens_6_0= ruleToken )
                    	    {
                    	    // InternalSculpt.g:136:1: (lv_tokens_6_0= ruleToken )
                    	    // InternalSculpt.g:137:3: lv_tokens_6_0= ruleToken
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSculptAccess().getTokensTokenParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_tokens_6_0=ruleToken();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"tokens",
                    	              		lv_tokens_6_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.Token");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSculpt.g:153:5: (otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSculpt.g:153:7: otherlv_7= 'REGIONS' ( (lv_regionTokens_8_0= ruleRegionToken ) )*
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSculptAccess().getREGIONSKeyword_4_0());
                          
                    }
                    // InternalSculpt.g:157:1: ( (lv_regionTokens_8_0= ruleRegionToken ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSculpt.g:158:1: (lv_regionTokens_8_0= ruleRegionToken )
                    	    {
                    	    // InternalSculpt.g:158:1: (lv_regionTokens_8_0= ruleRegionToken )
                    	    // InternalSculpt.g:159:3: lv_regionTokens_8_0= ruleRegionToken
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSculptAccess().getRegionTokensRegionTokenParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_regionTokens_8_0=ruleRegionToken();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"regionTokens",
                    	              		lv_regionTokens_8_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.RegionToken");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSculpt.g:175:5: (otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSculpt.g:175:7: otherlv_9= 'RULES' ( (lv_constraints_10_0= ruleConstraint ) )*
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getSculptAccess().getRULESKeyword_5_0());
                          
                    }
                    // InternalSculpt.g:179:1: ( (lv_constraints_10_0= ruleConstraint ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==46||LA8_0==48||(LA8_0>=55 && LA8_0<=57)||LA8_0==60||(LA8_0>=67 && LA8_0<=71)||(LA8_0>=85 && LA8_0<=86)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSculpt.g:180:1: (lv_constraints_10_0= ruleConstraint )
                    	    {
                    	    // InternalSculpt.g:180:1: (lv_constraints_10_0= ruleConstraint )
                    	    // InternalSculpt.g:181:3: lv_constraints_10_0= ruleConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSculptAccess().getConstraintsConstraintParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_constraints_10_0=ruleConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constraints",
                    	              		lv_constraints_10_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.Constraint");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSculpt.g:197:5: (otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSculpt.g:197:7: otherlv_11= 'TRANSFORMATION PROGRAM' ( (lv_transformationProgram_12_0= ruleTransformationProgram ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSculptAccess().getTRANSFORMATIONPROGRAMKeyword_6_0());
                          
                    }
                    // InternalSculpt.g:201:1: ( (lv_transformationProgram_12_0= ruleTransformationProgram ) )
                    // InternalSculpt.g:202:1: (lv_transformationProgram_12_0= ruleTransformationProgram )
                    {
                    // InternalSculpt.g:202:1: (lv_transformationProgram_12_0= ruleTransformationProgram )
                    // InternalSculpt.g:203:3: lv_transformationProgram_12_0= ruleTransformationProgram
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSculptAccess().getTransformationProgramTransformationProgramParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_transformationProgram_12_0=ruleTransformationProgram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSculptRule());
                      	        }
                             		set(
                             			current, 
                             			"transformationProgram",
                              		lv_transformationProgram_12_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.TransformationProgram");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSculpt"


    // $ANTLR start "entryRuleDelimiters"
    // InternalSculpt.g:227:1: entryRuleDelimiters returns [EObject current=null] : iv_ruleDelimiters= ruleDelimiters EOF ;
    public final EObject entryRuleDelimiters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimiters = null;


        try {
            // InternalSculpt.g:228:2: (iv_ruleDelimiters= ruleDelimiters EOF )
            // InternalSculpt.g:229:2: iv_ruleDelimiters= ruleDelimiters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDelimitersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDelimiters=ruleDelimiters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelimiters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDelimiters"


    // $ANTLR start "ruleDelimiters"
    // InternalSculpt.g:236:1: ruleDelimiters returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDelimiters() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rowDelim_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_colDelim_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_listDelim_12_0=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:239:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalSculpt.g:240:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalSculpt.g:240:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) ) )
            // InternalSculpt.g:242:1: ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) )
            {
            // InternalSculpt.g:242:1: ( ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?) )
            // InternalSculpt.g:243:2: ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getDelimitersAccess().getUnorderedGroup());
            // InternalSculpt.g:246:2: ( ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?)
            // InternalSculpt.g:247:3: ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+ {...}?
            {
            // InternalSculpt.g:247:3: ( ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( ( LA15_0 == 17 || LA15_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSculpt.g:249:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalSculpt.g:249:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalSculpt.g:250:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalSculpt.g:250:105: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalSculpt.g:251:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 0);
            	    // InternalSculpt.g:254:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) ) )
            	    // InternalSculpt.g:254:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDelimiters", "true");
            	    }
            	    // InternalSculpt.g:254:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) ) )
            	    // InternalSculpt.g:256:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalSculpt.g:256:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?) )
            	    // InternalSculpt.g:257:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?)
            	    {
            	    getUnorderedGroupHelper().enter(grammarAccess.getDelimitersAccess().getUnorderedGroup_0());
            	    // InternalSculpt.g:260:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?)
            	    // InternalSculpt.g:261:3: ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+ {...}?
            	    {
            	    // InternalSculpt.g:261:3: ( ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=3;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==17) ) {
            	            int LA13_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 0) ) {
            	                alt13=1;
            	            }


            	        }
            	        else if ( (LA13_0==20) ) {
            	            int LA13_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 1) ) {
            	                alt13=2;
            	            }


            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalSculpt.g:263:4: ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) )
            	    	    {
            	    	    // InternalSculpt.g:263:4: ({...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) ) )
            	    	    // InternalSculpt.g:264:5: {...}? => ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 0) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 0)");
            	    	    }
            	    	    // InternalSculpt.g:264:107: ( ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) ) )
            	    	    // InternalSculpt.g:265:6: ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) )
            	    	    {
            	    	    getUnorderedGroupHelper().select(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 0);
            	    	    // InternalSculpt.g:268:6: ({...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ) )
            	    	    // InternalSculpt.g:268:7: {...}? => (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDelimiters", "true");
            	    	    }
            	    	    // InternalSculpt.g:268:16: (otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )
            	    	    // InternalSculpt.g:268:18: otherlv_2= 'Row delim' otherlv_3= '=' ( (lv_rowDelim_4_0= RULE_STRING ) ) (otherlv_5= ';' )?
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getDelimitersAccess().getRowDelimKeyword_0_0_0());
            	    	          
            	    	    }
            	    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_3, grammarAccess.getDelimitersAccess().getEqualsSignKeyword_0_0_1());
            	    	          
            	    	    }
            	    	    // InternalSculpt.g:276:1: ( (lv_rowDelim_4_0= RULE_STRING ) )
            	    	    // InternalSculpt.g:277:1: (lv_rowDelim_4_0= RULE_STRING )
            	    	    {
            	    	    // InternalSculpt.g:277:1: (lv_rowDelim_4_0= RULE_STRING )
            	    	    // InternalSculpt.g:278:3: lv_rowDelim_4_0= RULE_STRING
            	    	    {
            	    	    lv_rowDelim_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      			newLeafNode(lv_rowDelim_4_0, grammarAccess.getDelimitersAccess().getRowDelimSTRINGTerminalRuleCall_0_0_2_0()); 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getDelimitersRule());
            	    	      	        }
            	    	             		setWithLastConsumed(
            	    	             			current, 
            	    	             			"rowDelim",
            	    	              		lv_rowDelim_4_0, 
            	    	              		"org.eclipse.xtext.common.Terminals.STRING");
            	    	      	    
            	    	    }

            	    	    }


            	    	    }

            	    	    // InternalSculpt.g:294:2: (otherlv_5= ';' )?
            	    	    int alt11=2;
            	    	    int LA11_0 = input.LA(1);

            	    	    if ( (LA11_0==19) ) {
            	    	        alt11=1;
            	    	    }
            	    	    switch (alt11) {
            	    	        case 1 :
            	    	            // InternalSculpt.g:294:4: otherlv_5= ';'
            	    	            {
            	    	            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	                  	newLeafNode(otherlv_5, grammarAccess.getDelimitersAccess().getSemicolonKeyword_0_0_3());
            	    	                  
            	    	            }

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }

            	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDelimitersAccess().getUnorderedGroup_0());

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalSculpt.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) )
            	    	    {
            	    	    // InternalSculpt.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) ) )
            	    	    // InternalSculpt.g:306:5: {...}? => ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 1) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 1)");
            	    	    }
            	    	    // InternalSculpt.g:306:107: ( ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) ) )
            	    	    // InternalSculpt.g:307:6: ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) )
            	    	    {
            	    	    getUnorderedGroupHelper().select(grammarAccess.getDelimitersAccess().getUnorderedGroup_0(), 1);
            	    	    // InternalSculpt.g:310:6: ({...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? ) )
            	    	    // InternalSculpt.g:310:7: {...}? => (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDelimiters", "true");
            	    	    }
            	    	    // InternalSculpt.g:310:16: (otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )? )
            	    	    // InternalSculpt.g:310:18: otherlv_6= 'Col delim' otherlv_7= '=' ( (lv_colDelim_8_0= RULE_STRING ) ) (otherlv_9= ';' )?
            	    	    {
            	    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_6, grammarAccess.getDelimitersAccess().getColDelimKeyword_0_1_0());
            	    	          
            	    	    }
            	    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_7, grammarAccess.getDelimitersAccess().getEqualsSignKeyword_0_1_1());
            	    	          
            	    	    }
            	    	    // InternalSculpt.g:318:1: ( (lv_colDelim_8_0= RULE_STRING ) )
            	    	    // InternalSculpt.g:319:1: (lv_colDelim_8_0= RULE_STRING )
            	    	    {
            	    	    // InternalSculpt.g:319:1: (lv_colDelim_8_0= RULE_STRING )
            	    	    // InternalSculpt.g:320:3: lv_colDelim_8_0= RULE_STRING
            	    	    {
            	    	    lv_colDelim_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      			newLeafNode(lv_colDelim_8_0, grammarAccess.getDelimitersAccess().getColDelimSTRINGTerminalRuleCall_0_1_2_0()); 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getDelimitersRule());
            	    	      	        }
            	    	             		setWithLastConsumed(
            	    	             			current, 
            	    	             			"colDelim",
            	    	              		lv_colDelim_8_0, 
            	    	              		"org.eclipse.xtext.common.Terminals.STRING");
            	    	      	    
            	    	    }

            	    	    }


            	    	    }

            	    	    // InternalSculpt.g:336:2: (otherlv_9= ';' )?
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==19) ) {
            	    	        alt12=1;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // InternalSculpt.g:336:4: otherlv_9= ';'
            	    	            {
            	    	            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	                  	newLeafNode(otherlv_9, grammarAccess.getDelimitersAccess().getSemicolonKeyword_0_1_3());
            	    	                  
            	    	            }

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }

            	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDelimitersAccess().getUnorderedGroup_0());

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDelimitersAccess().getUnorderedGroup_0()) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canLeave(grammarAccess.getDelimitersAccess().getUnorderedGroup_0())");
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().leave(grammarAccess.getDelimitersAccess().getUnorderedGroup_0());

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDelimitersAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSculpt.g:362:4: ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) )
            	    {
            	    // InternalSculpt.g:362:4: ({...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) ) )
            	    // InternalSculpt.g:363:5: {...}? => ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canSelect(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalSculpt.g:363:105: ( ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) ) )
            	    // InternalSculpt.g:364:6: ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDelimitersAccess().getUnorderedGroup(), 1);
            	    // InternalSculpt.g:367:6: ({...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? ) )
            	    // InternalSculpt.g:367:7: {...}? => (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDelimiters", "true");
            	    }
            	    // InternalSculpt.g:367:16: (otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )? )
            	    // InternalSculpt.g:367:18: otherlv_10= 'List delim' otherlv_11= '=' ( (lv_listDelim_12_0= RULE_STRING ) ) (otherlv_13= ';' )?
            	    {
            	    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getDelimitersAccess().getListDelimKeyword_1_0());
            	          
            	    }
            	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getDelimitersAccess().getEqualsSignKeyword_1_1());
            	          
            	    }
            	    // InternalSculpt.g:375:1: ( (lv_listDelim_12_0= RULE_STRING ) )
            	    // InternalSculpt.g:376:1: (lv_listDelim_12_0= RULE_STRING )
            	    {
            	    // InternalSculpt.g:376:1: (lv_listDelim_12_0= RULE_STRING )
            	    // InternalSculpt.g:377:3: lv_listDelim_12_0= RULE_STRING
            	    {
            	    lv_listDelim_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_listDelim_12_0, grammarAccess.getDelimitersAccess().getListDelimSTRINGTerminalRuleCall_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDelimitersRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"listDelim",
            	              		lv_listDelim_12_0, 
            	              		"org.eclipse.xtext.common.Terminals.STRING");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSculpt.g:393:2: (otherlv_13= ';' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==19) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSculpt.g:393:4: otherlv_13= ';'
            	            {
            	            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_13, grammarAccess.getDelimitersAccess().getSemicolonKeyword_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDelimitersAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDelimitersAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleDelimiters", "getUnorderedGroupHelper().canLeave(grammarAccess.getDelimitersAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getDelimitersAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDelimiters"


    // $ANTLR start "entryRuleType"
    // InternalSculpt.g:420:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSculpt.g:421:2: (iv_ruleType= ruleType EOF )
            // InternalSculpt.g:422:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSculpt.g:429:1: ruleType returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? ) | ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? ) | ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_base_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_format_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_decimalChar_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_groupChar_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_length_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_minLength_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_maxLength_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_minimum_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_maximum_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_minExclusive_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token lv_maxExclusive_38_0=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_defaultValue_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_emptyValue_44_0=null;
        Token otherlv_45=null;
        Token lv_name_47_0=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_defaultValue_55_0=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token lv_emptyValue_58_0=null;
        Token otherlv_59=null;
        Token lv_name_61_0=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token lv_minElements_72_0=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token lv_maxElements_75_0=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token lv_separator_79_0=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token lv_defaultValue_83_0=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token lv_emptyValue_86_0=null;
        Token otherlv_87=null;
        EObject lv_primitives_49_0 = null;

        EObject lv_primitives_51_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:432:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? ) | ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? ) | ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? ) ) )
            // InternalSculpt.g:433:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? ) | ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? ) | ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? ) )
            {
            // InternalSculpt.g:433:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? ) | ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? ) | ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==22) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                    case 37:
                    case 39:
                        {
                        alt28=3;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt28=2;
                        }
                        break;
                    case 23:
                        {
                        alt28=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSculpt.g:433:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? )
                    {
                    // InternalSculpt.g:433:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )? )
                    // InternalSculpt.g:433:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_45= ';' )?
                    {
                    // InternalSculpt.g:433:3: ()
                    // InternalSculpt.g:434:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getAtomicTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:439:2: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSculpt.g:440:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSculpt.g:440:1: (lv_name_1_0= RULE_ID )
                    // InternalSculpt.g:441:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getColonKeyword_0_2());
                          
                    }
                    // InternalSculpt.g:461:1: (otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) ) )
                    // InternalSculpt.g:461:3: otherlv_3= 'base' otherlv_4= '=' ( (lv_base_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getBaseKeyword_0_3_0());
                          
                    }
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_3_1());
                          
                    }
                    // InternalSculpt.g:469:1: ( (lv_base_5_0= RULE_STRING ) )
                    // InternalSculpt.g:470:1: (lv_base_5_0= RULE_STRING )
                    {
                    // InternalSculpt.g:470:1: (lv_base_5_0= RULE_STRING )
                    // InternalSculpt.g:471:3: lv_base_5_0= RULE_STRING
                    {
                    lv_base_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_base_5_0, grammarAccess.getTypeAccess().getBaseSTRINGTerminalRuleCall_0_3_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"base",
                              		lv_base_5_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }

                    // InternalSculpt.g:487:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // InternalSculpt.g:489:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // InternalSculpt.g:489:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // InternalSculpt.g:490:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());
                    // InternalSculpt.g:493:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )* )
                    // InternalSculpt.g:494:3: ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // InternalSculpt.g:494:3: ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )*
                    loop18:
                    do {
                        int alt18=13;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalSculpt.g:496:4: ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:496:4: ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:497:5: {...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 0)");
                    	    }
                    	    // InternalSculpt.g:497:103: ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:498:6: ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 0);
                    	    // InternalSculpt.g:501:6: ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:501:7: {...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:501:16: (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:501:18: otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getFormatKeyword_0_4_0_0());
                    	          
                    	    }
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_0_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:509:1: ( (lv_format_9_0= RULE_STRING ) )
                    	    // InternalSculpt.g:510:1: (lv_format_9_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:510:1: (lv_format_9_0= RULE_STRING )
                    	    // InternalSculpt.g:511:3: lv_format_9_0= RULE_STRING
                    	    {
                    	    lv_format_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_format_9_0, grammarAccess.getTypeAccess().getFormatSTRINGTerminalRuleCall_0_4_0_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"format",
                    	              		lv_format_9_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSculpt.g:534:4: ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:534:4: ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:535:5: {...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 1)");
                    	    }
                    	    // InternalSculpt.g:535:103: ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:536:6: ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 1);
                    	    // InternalSculpt.g:539:6: ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:539:7: {...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:539:16: (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:539:18: otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getDecimalCharKeyword_0_4_1_0());
                    	          
                    	    }
                    	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_1_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:547:1: ( (lv_decimalChar_12_0= RULE_STRING ) )
                    	    // InternalSculpt.g:548:1: (lv_decimalChar_12_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:548:1: (lv_decimalChar_12_0= RULE_STRING )
                    	    // InternalSculpt.g:549:3: lv_decimalChar_12_0= RULE_STRING
                    	    {
                    	    lv_decimalChar_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_decimalChar_12_0, grammarAccess.getTypeAccess().getDecimalCharSTRINGTerminalRuleCall_0_4_1_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"decimalChar",
                    	              		lv_decimalChar_12_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalSculpt.g:572:4: ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:572:4: ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:573:5: {...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 2)");
                    	    }
                    	    // InternalSculpt.g:573:103: ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:574:6: ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 2);
                    	    // InternalSculpt.g:577:6: ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:577:7: {...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:577:16: (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:577:18: otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getGroupCharKeyword_0_4_2_0());
                    	          
                    	    }
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_2_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:585:1: ( (lv_groupChar_15_0= RULE_STRING ) )
                    	    // InternalSculpt.g:586:1: (lv_groupChar_15_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:586:1: (lv_groupChar_15_0= RULE_STRING )
                    	    // InternalSculpt.g:587:3: lv_groupChar_15_0= RULE_STRING
                    	    {
                    	    lv_groupChar_15_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_groupChar_15_0, grammarAccess.getTypeAccess().getGroupCharSTRINGTerminalRuleCall_0_4_2_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"groupChar",
                    	              		lv_groupChar_15_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalSculpt.g:610:4: ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:610:4: ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSculpt.g:611:5: {...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 3) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 3)");
                    	    }
                    	    // InternalSculpt.g:611:103: ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) )
                    	    // InternalSculpt.g:612:6: ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 3);
                    	    // InternalSculpt.g:615:6: ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) )
                    	    // InternalSculpt.g:615:7: {...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:615:16: (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) )
                    	    // InternalSculpt.g:615:18: otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) )
                    	    {
                    	    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getTypeAccess().getLengthKeyword_0_4_3_0());
                    	          
                    	    }
                    	    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_3_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:623:1: ( (lv_length_18_0= RULE_INT ) )
                    	    // InternalSculpt.g:624:1: (lv_length_18_0= RULE_INT )
                    	    {
                    	    // InternalSculpt.g:624:1: (lv_length_18_0= RULE_INT )
                    	    // InternalSculpt.g:625:3: lv_length_18_0= RULE_INT
                    	    {
                    	    lv_length_18_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_length_18_0, grammarAccess.getTypeAccess().getLengthINTTerminalRuleCall_0_4_3_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"length",
                    	              		lv_length_18_0, 
                    	              		"org.eclipse.xtext.common.Terminals.INT");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalSculpt.g:648:4: ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:648:4: ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSculpt.g:649:5: {...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 4) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 4)");
                    	    }
                    	    // InternalSculpt.g:649:103: ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) )
                    	    // InternalSculpt.g:650:6: ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 4);
                    	    // InternalSculpt.g:653:6: ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) )
                    	    // InternalSculpt.g:653:7: {...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:653:16: (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) )
                    	    // InternalSculpt.g:653:18: otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getTypeAccess().getMinLengthKeyword_0_4_4_0());
                    	          
                    	    }
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_20, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_4_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:661:1: ( (lv_minLength_21_0= RULE_INT ) )
                    	    // InternalSculpt.g:662:1: (lv_minLength_21_0= RULE_INT )
                    	    {
                    	    // InternalSculpt.g:662:1: (lv_minLength_21_0= RULE_INT )
                    	    // InternalSculpt.g:663:3: lv_minLength_21_0= RULE_INT
                    	    {
                    	    lv_minLength_21_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_minLength_21_0, grammarAccess.getTypeAccess().getMinLengthINTTerminalRuleCall_0_4_4_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"minLength",
                    	              		lv_minLength_21_0, 
                    	              		"org.eclipse.xtext.common.Terminals.INT");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalSculpt.g:686:4: ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:686:4: ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) )
                    	    // InternalSculpt.g:687:5: {...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 5) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 5)");
                    	    }
                    	    // InternalSculpt.g:687:103: ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) )
                    	    // InternalSculpt.g:688:6: ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 5);
                    	    // InternalSculpt.g:691:6: ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) )
                    	    // InternalSculpt.g:691:7: {...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:691:16: (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) )
                    	    // InternalSculpt.g:691:18: otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) )
                    	    {
                    	    otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getTypeAccess().getMaxLengthKeyword_0_4_5_0());
                    	          
                    	    }
                    	    otherlv_23=(Token)match(input,18,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_23, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_5_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:699:1: ( (lv_maxLength_24_0= RULE_INT ) )
                    	    // InternalSculpt.g:700:1: (lv_maxLength_24_0= RULE_INT )
                    	    {
                    	    // InternalSculpt.g:700:1: (lv_maxLength_24_0= RULE_INT )
                    	    // InternalSculpt.g:701:3: lv_maxLength_24_0= RULE_INT
                    	    {
                    	    lv_maxLength_24_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_maxLength_24_0, grammarAccess.getTypeAccess().getMaxLengthINTTerminalRuleCall_0_4_5_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"maxLength",
                    	              		lv_maxLength_24_0, 
                    	              		"org.eclipse.xtext.common.Terminals.INT");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalSculpt.g:724:4: ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:724:4: ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:725:5: {...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 6) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 6)");
                    	    }
                    	    // InternalSculpt.g:725:103: ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:726:6: ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 6);
                    	    // InternalSculpt.g:729:6: ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:729:7: {...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:729:16: ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:729:17: (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) )
                    	    {
                    	    // InternalSculpt.g:729:17: (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' )
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==30) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==31) ) {
                    	        alt16=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 16, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // InternalSculpt.g:729:19: otherlv_25= 'minimum'
                    	            {
                    	            otherlv_25=(Token)match(input,30,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_25, grammarAccess.getTypeAccess().getMinimumKeyword_0_4_6_0_0());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSculpt.g:734:7: otherlv_26= 'minInclusive'
                    	            {
                    	            otherlv_26=(Token)match(input,31,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_26, grammarAccess.getTypeAccess().getMinInclusiveKeyword_0_4_6_0_1());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_27, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_6_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:742:1: ( (lv_minimum_28_0= RULE_STRING ) )
                    	    // InternalSculpt.g:743:1: (lv_minimum_28_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:743:1: (lv_minimum_28_0= RULE_STRING )
                    	    // InternalSculpt.g:744:3: lv_minimum_28_0= RULE_STRING
                    	    {
                    	    lv_minimum_28_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_minimum_28_0, grammarAccess.getTypeAccess().getMinimumSTRINGTerminalRuleCall_0_4_6_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"minimum",
                    	              		lv_minimum_28_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalSculpt.g:767:4: ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:767:4: ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:768:5: {...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 7) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 7)");
                    	    }
                    	    // InternalSculpt.g:768:103: ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:769:6: ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 7);
                    	    // InternalSculpt.g:772:6: ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:772:7: {...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:772:16: ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:772:17: (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) )
                    	    {
                    	    // InternalSculpt.g:772:17: (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==32) ) {
                    	        alt17=1;
                    	    }
                    	    else if ( (LA17_0==33) ) {
                    	        alt17=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // InternalSculpt.g:772:19: otherlv_29= 'maximum'
                    	            {
                    	            otherlv_29=(Token)match(input,32,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_29, grammarAccess.getTypeAccess().getMaximumKeyword_0_4_7_0_0());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSculpt.g:777:7: otherlv_30= 'maxInclusive'
                    	            {
                    	            otherlv_30=(Token)match(input,33,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_30, grammarAccess.getTypeAccess().getMaxInclusiveKeyword_0_4_7_0_1());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_31, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_7_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:785:1: ( (lv_maximum_32_0= RULE_STRING ) )
                    	    // InternalSculpt.g:786:1: (lv_maximum_32_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:786:1: (lv_maximum_32_0= RULE_STRING )
                    	    // InternalSculpt.g:787:3: lv_maximum_32_0= RULE_STRING
                    	    {
                    	    lv_maximum_32_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_maximum_32_0, grammarAccess.getTypeAccess().getMaximumSTRINGTerminalRuleCall_0_4_7_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"maximum",
                    	              		lv_maximum_32_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalSculpt.g:810:4: ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:810:4: ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:811:5: {...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 8) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 8)");
                    	    }
                    	    // InternalSculpt.g:811:103: ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:812:6: ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 8);
                    	    // InternalSculpt.g:815:6: ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:815:7: {...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:815:16: (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:815:18: otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) )
                    	    {
                    	    otherlv_33=(Token)match(input,34,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_33, grammarAccess.getTypeAccess().getMinExclusiveKeyword_0_4_8_0());
                    	          
                    	    }
                    	    otherlv_34=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_34, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_8_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:823:1: ( (lv_minExclusive_35_0= RULE_STRING ) )
                    	    // InternalSculpt.g:824:1: (lv_minExclusive_35_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:824:1: (lv_minExclusive_35_0= RULE_STRING )
                    	    // InternalSculpt.g:825:3: lv_minExclusive_35_0= RULE_STRING
                    	    {
                    	    lv_minExclusive_35_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_minExclusive_35_0, grammarAccess.getTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_0_4_8_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"minExclusive",
                    	              		lv_minExclusive_35_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 10 :
                    	    // InternalSculpt.g:848:4: ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:848:4: ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:849:5: {...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 9) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 9)");
                    	    }
                    	    // InternalSculpt.g:849:103: ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:850:6: ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 9);
                    	    // InternalSculpt.g:853:6: ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:853:7: {...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:853:16: (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:853:18: otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) )
                    	    {
                    	    otherlv_36=(Token)match(input,35,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_36, grammarAccess.getTypeAccess().getMaxExclusiveKeyword_0_4_9_0());
                    	          
                    	    }
                    	    otherlv_37=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_37, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_9_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:861:1: ( (lv_maxExclusive_38_0= RULE_STRING ) )
                    	    // InternalSculpt.g:862:1: (lv_maxExclusive_38_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:862:1: (lv_maxExclusive_38_0= RULE_STRING )
                    	    // InternalSculpt.g:863:3: lv_maxExclusive_38_0= RULE_STRING
                    	    {
                    	    lv_maxExclusive_38_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_maxExclusive_38_0, grammarAccess.getTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_0_4_9_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"maxExclusive",
                    	              		lv_maxExclusive_38_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 11 :
                    	    // InternalSculpt.g:886:4: ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:886:4: ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:887:5: {...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 10) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 10)");
                    	    }
                    	    // InternalSculpt.g:887:104: ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:888:6: ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 10);
                    	    // InternalSculpt.g:891:6: ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:891:7: {...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:891:16: (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:891:18: otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) )
                    	    {
                    	    otherlv_39=(Token)match(input,36,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_39, grammarAccess.getTypeAccess().getDefaultKeyword_0_4_10_0());
                    	          
                    	    }
                    	    otherlv_40=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_40, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_10_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:899:1: ( (lv_defaultValue_41_0= RULE_STRING ) )
                    	    // InternalSculpt.g:900:1: (lv_defaultValue_41_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:900:1: (lv_defaultValue_41_0= RULE_STRING )
                    	    // InternalSculpt.g:901:3: lv_defaultValue_41_0= RULE_STRING
                    	    {
                    	    lv_defaultValue_41_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_defaultValue_41_0, grammarAccess.getTypeAccess().getDefaultValueSTRINGTerminalRuleCall_0_4_10_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"defaultValue",
                    	              		lv_defaultValue_41_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 12 :
                    	    // InternalSculpt.g:924:4: ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:924:4: ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:925:5: {...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 11) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 11)");
                    	    }
                    	    // InternalSculpt.g:925:104: ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:926:6: ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 11);
                    	    // InternalSculpt.g:929:6: ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:929:7: {...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:929:16: (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:929:18: otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) )
                    	    {
                    	    otherlv_42=(Token)match(input,37,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_42, grammarAccess.getTypeAccess().getEmptyKeyword_0_4_11_0());
                    	          
                    	    }
                    	    otherlv_43=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_43, grammarAccess.getTypeAccess().getEqualsSignKeyword_0_4_11_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:937:1: ( (lv_emptyValue_44_0= RULE_STRING ) )
                    	    // InternalSculpt.g:938:1: (lv_emptyValue_44_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:938:1: (lv_emptyValue_44_0= RULE_STRING )
                    	    // InternalSculpt.g:939:3: lv_emptyValue_44_0= RULE_STRING
                    	    {
                    	    lv_emptyValue_44_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_emptyValue_44_0, grammarAccess.getTypeAccess().getEmptyValueSTRINGTerminalRuleCall_0_4_11_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"emptyValue",
                    	              		lv_emptyValue_44_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getTypeAccess().getUnorderedGroup_0_4());

                    }

                    // InternalSculpt.g:969:2: (otherlv_45= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==19) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSculpt.g:969:4: otherlv_45= ';'
                            {
                            otherlv_45=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_45, grammarAccess.getTypeAccess().getSemicolonKeyword_0_5());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:974:6: ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? )
                    {
                    // InternalSculpt.g:974:6: ( () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )? )
                    // InternalSculpt.g:974:7: () ( (lv_name_47_0= RULE_ID ) ) otherlv_48= ':' ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )* ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) (otherlv_59= ';' )?
                    {
                    // InternalSculpt.g:974:7: ()
                    // InternalSculpt.g:975:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getCompoundTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:980:2: ( (lv_name_47_0= RULE_ID ) )
                    // InternalSculpt.g:981:1: (lv_name_47_0= RULE_ID )
                    {
                    // InternalSculpt.g:981:1: (lv_name_47_0= RULE_ID )
                    // InternalSculpt.g:982:3: lv_name_47_0= RULE_ID
                    {
                    lv_name_47_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_47_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_47_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    otherlv_48=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getTypeAccess().getColonKeyword_1_2());
                          
                    }
                    // InternalSculpt.g:1002:1: ( ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )? )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_STRING) ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1==RULE_STRING||LA21_1==38) ) {
                                alt21=1;
                            }
                            else if ( (LA21_1==RULE_ID) ) {
                                int LA21_4 = input.LA(3);

                                if ( (LA21_4==EOF||(LA21_4>=RULE_STRING && LA21_4<=RULE_ID)||(LA21_4>=13 && LA21_4<=16)||LA21_4==19||(LA21_4>=36 && LA21_4<=38)) ) {
                                    alt21=1;
                                }


                            }


                        }
                        else if ( (LA21_0==RULE_ID) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==RULE_STRING||LA21_2==38) ) {
                                alt21=1;
                            }
                            else if ( (LA21_2==RULE_ID) ) {
                                int LA21_4 = input.LA(3);

                                if ( (LA21_4==EOF||(LA21_4>=RULE_STRING && LA21_4<=RULE_ID)||(LA21_4>=13 && LA21_4<=16)||LA21_4==19||(LA21_4>=36 && LA21_4<=38)) ) {
                                    alt21=1;
                                }


                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSculpt.g:1002:2: ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) ) (otherlv_50= '+' )?
                    	    {
                    	    // InternalSculpt.g:1002:2: ( (lv_primitives_49_0= ruleCompoundTypePrimitive ) )
                    	    // InternalSculpt.g:1003:1: (lv_primitives_49_0= ruleCompoundTypePrimitive )
                    	    {
                    	    // InternalSculpt.g:1003:1: (lv_primitives_49_0= ruleCompoundTypePrimitive )
                    	    // InternalSculpt.g:1004:3: lv_primitives_49_0= ruleCompoundTypePrimitive
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeAccess().getPrimitivesCompoundTypePrimitiveParserRuleCall_1_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_primitives_49_0=ruleCompoundTypePrimitive();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"primitives",
                    	              		lv_primitives_49_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.CompoundTypePrimitive");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSculpt.g:1020:2: (otherlv_50= '+' )?
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==38) ) {
                    	        alt20=1;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // InternalSculpt.g:1020:4: otherlv_50= '+'
                    	            {
                    	            otherlv_50=(Token)match(input,38,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_50, grammarAccess.getTypeAccess().getPlusSignKeyword_1_3_1());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // InternalSculpt.g:1024:5: ( (lv_primitives_51_0= ruleCompoundTypePrimitive ) )
                    // InternalSculpt.g:1025:1: (lv_primitives_51_0= ruleCompoundTypePrimitive )
                    {
                    // InternalSculpt.g:1025:1: (lv_primitives_51_0= ruleCompoundTypePrimitive )
                    // InternalSculpt.g:1026:3: lv_primitives_51_0= ruleCompoundTypePrimitive
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getPrimitivesCompoundTypePrimitiveParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_primitives_51_0=ruleCompoundTypePrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"primitives",
                              		lv_primitives_51_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.CompoundTypePrimitive");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:1042:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // InternalSculpt.g:1044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // InternalSculpt.g:1044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // InternalSculpt.g:1045:2: ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getTypeAccess().getUnorderedGroup_1_5());
                    // InternalSculpt.g:1048:2: ( ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )* )
                    // InternalSculpt.g:1049:3: ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // InternalSculpt.g:1049:3: ( ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 0) ) {
                            alt22=1;
                        }
                        else if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 1) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSculpt.g:1051:4: ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:1051:4: ({...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:1052:5: {...}? => ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 0)");
                    	    }
                    	    // InternalSculpt.g:1052:103: ( ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:1053:6: ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 0);
                    	    // InternalSculpt.g:1056:6: ({...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:1056:7: {...}? => (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:1056:16: (otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:1056:18: otherlv_53= 'default' otherlv_54= '=' ( (lv_defaultValue_55_0= RULE_STRING ) )
                    	    {
                    	    otherlv_53=(Token)match(input,36,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_53, grammarAccess.getTypeAccess().getDefaultKeyword_1_5_0_0());
                    	          
                    	    }
                    	    otherlv_54=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_54, grammarAccess.getTypeAccess().getEqualsSignKeyword_1_5_0_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:1064:1: ( (lv_defaultValue_55_0= RULE_STRING ) )
                    	    // InternalSculpt.g:1065:1: (lv_defaultValue_55_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:1065:1: (lv_defaultValue_55_0= RULE_STRING )
                    	    // InternalSculpt.g:1066:3: lv_defaultValue_55_0= RULE_STRING
                    	    {
                    	    lv_defaultValue_55_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_defaultValue_55_0, grammarAccess.getTypeAccess().getDefaultValueSTRINGTerminalRuleCall_1_5_0_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"defaultValue",
                    	              		lv_defaultValue_55_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_1_5());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSculpt.g:1089:4: ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:1089:4: ({...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:1090:5: {...}? => ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 1)");
                    	    }
                    	    // InternalSculpt.g:1090:103: ( ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:1091:6: ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_1_5(), 1);
                    	    // InternalSculpt.g:1094:6: ({...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:1094:7: {...}? => (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:1094:16: (otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:1094:18: otherlv_56= 'empty' otherlv_57= '=' ( (lv_emptyValue_58_0= RULE_STRING ) )
                    	    {
                    	    otherlv_56=(Token)match(input,37,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_56, grammarAccess.getTypeAccess().getEmptyKeyword_1_5_1_0());
                    	          
                    	    }
                    	    otherlv_57=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_57, grammarAccess.getTypeAccess().getEqualsSignKeyword_1_5_1_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:1102:1: ( (lv_emptyValue_58_0= RULE_STRING ) )
                    	    // InternalSculpt.g:1103:1: (lv_emptyValue_58_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:1103:1: (lv_emptyValue_58_0= RULE_STRING )
                    	    // InternalSculpt.g:1104:3: lv_emptyValue_58_0= RULE_STRING
                    	    {
                    	    lv_emptyValue_58_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_emptyValue_58_0, grammarAccess.getTypeAccess().getEmptyValueSTRINGTerminalRuleCall_1_5_1_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"emptyValue",
                    	              		lv_emptyValue_58_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_1_5());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getTypeAccess().getUnorderedGroup_1_5());

                    }

                    // InternalSculpt.g:1134:2: (otherlv_59= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==19) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSculpt.g:1134:4: otherlv_59= ';'
                            {
                            otherlv_59=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getTypeAccess().getSemicolonKeyword_1_6());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:1139:6: ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? )
                    {
                    // InternalSculpt.g:1139:6: ( () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )? )
                    // InternalSculpt.g:1139:7: () ( (lv_name_61_0= RULE_ID ) ) otherlv_62= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_87= ';' )?
                    {
                    // InternalSculpt.g:1139:7: ()
                    // InternalSculpt.g:1140:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getListTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:1145:2: ( (lv_name_61_0= RULE_ID ) )
                    // InternalSculpt.g:1146:1: (lv_name_61_0= RULE_ID )
                    {
                    // InternalSculpt.g:1146:1: (lv_name_61_0= RULE_ID )
                    // InternalSculpt.g:1147:3: lv_name_61_0= RULE_ID
                    {
                    lv_name_61_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_61_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_61_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    otherlv_62=(Token)match(input,22,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_62, grammarAccess.getTypeAccess().getColonKeyword_2_2());
                          
                    }
                    // InternalSculpt.g:1167:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalSculpt.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalSculpt.g:1169:1: ( ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    // InternalSculpt.g:1170:2: ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getTypeAccess().getUnorderedGroup_2_3());
                    // InternalSculpt.g:1173:2: ( ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    // InternalSculpt.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalSculpt.g:1174:3: ( ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=4;
                        int LA26_0 = input.LA(1);

                        if ( LA26_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 0) ) {
                            alt26=1;
                        }
                        else if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 1) ) {
                            alt26=2;
                        }
                        else if ( LA26_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 2) ) {
                            alt26=3;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSculpt.g:1176:4: ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) )
                    	    {
                    	    // InternalSculpt.g:1176:4: ({...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) ) )
                    	    // InternalSculpt.g:1177:5: {...}? => ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 0)");
                    	    }
                    	    // InternalSculpt.g:1177:103: ( ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) ) )
                    	    // InternalSculpt.g:1178:6: ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 0);
                    	    // InternalSculpt.g:1181:6: ({...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' ) )
                    	    // InternalSculpt.g:1181:7: {...}? => (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:1181:16: (otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>' )
                    	    // InternalSculpt.g:1181:18: otherlv_64= 'list' otherlv_65= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_80= '>'
                    	    {
                    	    otherlv_64=(Token)match(input,39,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_64, grammarAccess.getTypeAccess().getListKeyword_2_3_0_0());
                    	          
                    	    }
                    	    otherlv_65=(Token)match(input,40,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_65, grammarAccess.getTypeAccess().getLessThanSignKeyword_2_3_0_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:1189:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
                    	    // InternalSculpt.g:1191:1: ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    	    {
                    	    // InternalSculpt.g:1191:1: ( ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    	    // InternalSculpt.g:1192:2: ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    	    {
                    	    getUnorderedGroupHelper().enter(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());
                    	    // InternalSculpt.g:1195:2: ( ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    	    // InternalSculpt.g:1196:3: ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
                    	    {
                    	    // InternalSculpt.g:1196:3: ( ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) ) )+
                    	    int cnt25=0;
                    	    loop25:
                    	    do {
                    	        int alt25=5;
                    	        int LA25_0 = input.LA(1);

                    	        if ( LA25_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 0) ) {
                    	            alt25=1;
                    	        }
                    	        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 1) ) {
                    	            alt25=2;
                    	        }
                    	        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 2) ) {
                    	            alt25=3;
                    	        }
                    	        else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 3) ) {
                    	            alt25=4;
                    	        }


                    	        switch (alt25) {
                    	    	case 1 :
                    	    	    // InternalSculpt.g:1198:4: ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) )
                    	    	    {
                    	    	    // InternalSculpt.g:1198:4: ({...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) ) )
                    	    	    // InternalSculpt.g:1199:5: {...}? => ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 0) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 0)");
                    	    	    }
                    	    	    // InternalSculpt.g:1199:107: ( ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) ) )
                    	    	    // InternalSculpt.g:1200:6: ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) )
                    	    	    {
                    	    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 0);
                    	    	    // InternalSculpt.g:1203:6: ({...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) ) )
                    	    	    // InternalSculpt.g:1203:7: {...}? => (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    	    }
                    	    	    // InternalSculpt.g:1203:16: (otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) ) )
                    	    	    // InternalSculpt.g:1203:18: otherlv_67= 'base' otherlv_68= '=' ( (otherlv_69= RULE_ID ) )
                    	    	    {
                    	    	    otherlv_67=(Token)match(input,23,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_67, grammarAccess.getTypeAccess().getBaseKeyword_2_3_0_2_0_0());
                    	    	          
                    	    	    }
                    	    	    otherlv_68=(Token)match(input,18,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_68, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_0_2_0_1());
                    	    	          
                    	    	    }
                    	    	    // InternalSculpt.g:1211:1: ( (otherlv_69= RULE_ID ) )
                    	    	    // InternalSculpt.g:1212:1: (otherlv_69= RULE_ID )
                    	    	    {
                    	    	    // InternalSculpt.g:1212:1: (otherlv_69= RULE_ID )
                    	    	    // InternalSculpt.g:1213:3: otherlv_69= RULE_ID
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      			if (current==null) {
                    	    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	    	      	        }
                    	    	              
                    	    	    }
                    	    	    otherlv_69=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      		newLeafNode(otherlv_69, grammarAccess.getTypeAccess().getBaseTypeCrossReference_2_3_0_2_0_2_0()); 
                    	    	      	
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }


                    	    	    }

                    	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalSculpt.g:1231:4: ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) )
                    	    	    {
                    	    	    // InternalSculpt.g:1231:4: ({...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) ) )
                    	    	    // InternalSculpt.g:1232:5: {...}? => ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 1) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 1)");
                    	    	    }
                    	    	    // InternalSculpt.g:1232:107: ( ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) ) )
                    	    	    // InternalSculpt.g:1233:6: ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) )
                    	    	    {
                    	    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 1);
                    	    	    // InternalSculpt.g:1236:6: ({...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) ) )
                    	    	    // InternalSculpt.g:1236:7: {...}? => (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    	    }
                    	    	    // InternalSculpt.g:1236:16: (otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) ) )
                    	    	    // InternalSculpt.g:1236:18: otherlv_70= 'minElements' otherlv_71= '=' ( (lv_minElements_72_0= RULE_INT ) )
                    	    	    {
                    	    	    otherlv_70=(Token)match(input,41,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_70, grammarAccess.getTypeAccess().getMinElementsKeyword_2_3_0_2_1_0());
                    	    	          
                    	    	    }
                    	    	    otherlv_71=(Token)match(input,18,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_71, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_0_2_1_1());
                    	    	          
                    	    	    }
                    	    	    // InternalSculpt.g:1244:1: ( (lv_minElements_72_0= RULE_INT ) )
                    	    	    // InternalSculpt.g:1245:1: (lv_minElements_72_0= RULE_INT )
                    	    	    {
                    	    	    // InternalSculpt.g:1245:1: (lv_minElements_72_0= RULE_INT )
                    	    	    // InternalSculpt.g:1246:3: lv_minElements_72_0= RULE_INT
                    	    	    {
                    	    	    lv_minElements_72_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      			newLeafNode(lv_minElements_72_0, grammarAccess.getTypeAccess().getMinElementsINTTerminalRuleCall_2_3_0_2_1_2_0()); 
                    	    	      		
                    	    	    }
                    	    	    if ( state.backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	    	      	        }
                    	    	             		setWithLastConsumed(
                    	    	             			current, 
                    	    	             			"minElements",
                    	    	              		lv_minElements_72_0, 
                    	    	              		"org.eclipse.xtext.common.Terminals.INT");
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }


                    	    	    }

                    	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // InternalSculpt.g:1269:4: ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) )
                    	    	    {
                    	    	    // InternalSculpt.g:1269:4: ({...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) ) )
                    	    	    // InternalSculpt.g:1270:5: {...}? => ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 2) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 2)");
                    	    	    }
                    	    	    // InternalSculpt.g:1270:107: ( ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) ) )
                    	    	    // InternalSculpt.g:1271:6: ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) )
                    	    	    {
                    	    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 2);
                    	    	    // InternalSculpt.g:1274:6: ({...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) ) )
                    	    	    // InternalSculpt.g:1274:7: {...}? => (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    	    }
                    	    	    // InternalSculpt.g:1274:16: (otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' ) )
                    	    	    // InternalSculpt.g:1274:18: otherlv_73= 'maxElements' otherlv_74= '=' ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' )
                    	    	    {
                    	    	    otherlv_73=(Token)match(input,42,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_73, grammarAccess.getTypeAccess().getMaxElementsKeyword_2_3_0_2_2_0());
                    	    	          
                    	    	    }
                    	    	    otherlv_74=(Token)match(input,18,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_74, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_0_2_2_1());
                    	    	          
                    	    	    }
                    	    	    // InternalSculpt.g:1282:1: ( ( (lv_maxElements_75_0= RULE_INT ) ) | otherlv_76= 'UNBOUNDED' )
                    	    	    int alt24=2;
                    	    	    int LA24_0 = input.LA(1);

                    	    	    if ( (LA24_0==RULE_INT) ) {
                    	    	        alt24=1;
                    	    	    }
                    	    	    else if ( (LA24_0==43) ) {
                    	    	        alt24=2;
                    	    	    }
                    	    	    else {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        NoViableAltException nvae =
                    	    	            new NoViableAltException("", 24, 0, input);

                    	    	        throw nvae;
                    	    	    }
                    	    	    switch (alt24) {
                    	    	        case 1 :
                    	    	            // InternalSculpt.g:1282:2: ( (lv_maxElements_75_0= RULE_INT ) )
                    	    	            {
                    	    	            // InternalSculpt.g:1282:2: ( (lv_maxElements_75_0= RULE_INT ) )
                    	    	            // InternalSculpt.g:1283:1: (lv_maxElements_75_0= RULE_INT )
                    	    	            {
                    	    	            // InternalSculpt.g:1283:1: (lv_maxElements_75_0= RULE_INT )
                    	    	            // InternalSculpt.g:1284:3: lv_maxElements_75_0= RULE_INT
                    	    	            {
                    	    	            lv_maxElements_75_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              			newLeafNode(lv_maxElements_75_0, grammarAccess.getTypeAccess().getMaxElementsINTTerminalRuleCall_2_3_0_2_2_2_0_0()); 
                    	    	              		
                    	    	            }
                    	    	            if ( state.backtracking==0 ) {

                    	    	              	        if (current==null) {
                    	    	              	            current = createModelElement(grammarAccess.getTypeRule());
                    	    	              	        }
                    	    	                     		setWithLastConsumed(
                    	    	                     			current, 
                    	    	                     			"maxElements",
                    	    	                      		lv_maxElements_75_0, 
                    	    	                      		"org.eclipse.xtext.common.Terminals.INT");
                    	    	              	    
                    	    	            }

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;
                    	    	        case 2 :
                    	    	            // InternalSculpt.g:1301:7: otherlv_76= 'UNBOUNDED'
                    	    	            {
                    	    	            otherlv_76=(Token)match(input,43,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	                  	newLeafNode(otherlv_76, grammarAccess.getTypeAccess().getUNBOUNDEDKeyword_2_3_0_2_2_2_1());
                    	    	                  
                    	    	            }

                    	    	            }
                    	    	            break;

                    	    	    }


                    	    	    }


                    	    	    }

                    	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // InternalSculpt.g:1312:4: ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) )
                    	    	    {
                    	    	    // InternalSculpt.g:1312:4: ({...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) ) )
                    	    	    // InternalSculpt.g:1313:5: {...}? => ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) )
                    	    	    {
                    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 3) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 3)");
                    	    	    }
                    	    	    // InternalSculpt.g:1313:107: ( ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) ) )
                    	    	    // InternalSculpt.g:1314:6: ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) )
                    	    	    {
                    	    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2(), 3);
                    	    	    // InternalSculpt.g:1317:6: ({...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) ) )
                    	    	    // InternalSculpt.g:1317:7: {...}? => (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    	    }
                    	    	    // InternalSculpt.g:1317:16: (otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) ) )
                    	    	    // InternalSculpt.g:1317:18: otherlv_77= 'separator' otherlv_78= '=' ( (lv_separator_79_0= RULE_STRING ) )
                    	    	    {
                    	    	    otherlv_77=(Token)match(input,44,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_77, grammarAccess.getTypeAccess().getSeparatorKeyword_2_3_0_2_3_0());
                    	    	          
                    	    	    }
                    	    	    otherlv_78=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_78, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_0_2_3_1());
                    	    	          
                    	    	    }
                    	    	    // InternalSculpt.g:1325:1: ( (lv_separator_79_0= RULE_STRING ) )
                    	    	    // InternalSculpt.g:1326:1: (lv_separator_79_0= RULE_STRING )
                    	    	    {
                    	    	    // InternalSculpt.g:1326:1: (lv_separator_79_0= RULE_STRING )
                    	    	    // InternalSculpt.g:1327:3: lv_separator_79_0= RULE_STRING
                    	    	    {
                    	    	    lv_separator_79_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      			newLeafNode(lv_separator_79_0, grammarAccess.getTypeAccess().getSeparatorSTRINGTerminalRuleCall_2_3_0_2_3_2_0()); 
                    	    	      		
                    	    	    }
                    	    	    if ( state.backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	    	      	        }
                    	    	             		setWithLastConsumed(
                    	    	             			current, 
                    	    	             			"separator",
                    	    	              		lv_separator_79_0, 
                    	    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }


                    	    	    }

                    	    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt25 >= 1 ) break loop25;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(25, input);
                    	                throw eee;
                    	        }
                    	        cnt25++;
                    	    } while (true);

                    	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2()) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canLeave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2())");
                    	    }

                    	    }


                    	    }

                    	    getUnorderedGroupHelper().leave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3_0_2());

                    	    }

                    	    otherlv_80=(Token)match(input,45,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_80, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_2_3_0_3());
                    	          
                    	    }

                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSculpt.g:1369:4: ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:1369:4: ({...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:1370:5: {...}? => ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 1)");
                    	    }
                    	    // InternalSculpt.g:1370:103: ( ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:1371:6: ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 1);
                    	    // InternalSculpt.g:1374:6: ({...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:1374:7: {...}? => (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:1374:16: (otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:1374:18: otherlv_81= 'default' otherlv_82= '=' ( (lv_defaultValue_83_0= RULE_STRING ) )
                    	    {
                    	    otherlv_81=(Token)match(input,36,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_81, grammarAccess.getTypeAccess().getDefaultKeyword_2_3_1_0());
                    	          
                    	    }
                    	    otherlv_82=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_82, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_1_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:1382:1: ( (lv_defaultValue_83_0= RULE_STRING ) )
                    	    // InternalSculpt.g:1383:1: (lv_defaultValue_83_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:1383:1: (lv_defaultValue_83_0= RULE_STRING )
                    	    // InternalSculpt.g:1384:3: lv_defaultValue_83_0= RULE_STRING
                    	    {
                    	    lv_defaultValue_83_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_defaultValue_83_0, grammarAccess.getTypeAccess().getDefaultValueSTRINGTerminalRuleCall_2_3_1_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"defaultValue",
                    	              		lv_defaultValue_83_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalSculpt.g:1407:4: ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalSculpt.g:1407:4: ({...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalSculpt.g:1408:5: {...}? => ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 2)");
                    	    }
                    	    // InternalSculpt.g:1408:103: ( ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) ) )
                    	    // InternalSculpt.g:1409:6: ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getTypeAccess().getUnorderedGroup_2_3(), 2);
                    	    // InternalSculpt.g:1412:6: ({...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) ) )
                    	    // InternalSculpt.g:1412:7: {...}? => (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleType", "true");
                    	    }
                    	    // InternalSculpt.g:1412:16: (otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) ) )
                    	    // InternalSculpt.g:1412:18: otherlv_84= 'empty' otherlv_85= '=' ( (lv_emptyValue_86_0= RULE_STRING ) )
                    	    {
                    	    otherlv_84=(Token)match(input,37,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_84, grammarAccess.getTypeAccess().getEmptyKeyword_2_3_2_0());
                    	          
                    	    }
                    	    otherlv_85=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_85, grammarAccess.getTypeAccess().getEqualsSignKeyword_2_3_2_1());
                    	          
                    	    }
                    	    // InternalSculpt.g:1420:1: ( (lv_emptyValue_86_0= RULE_STRING ) )
                    	    // InternalSculpt.g:1421:1: (lv_emptyValue_86_0= RULE_STRING )
                    	    {
                    	    // InternalSculpt.g:1421:1: (lv_emptyValue_86_0= RULE_STRING )
                    	    // InternalSculpt.g:1422:3: lv_emptyValue_86_0= RULE_STRING
                    	    {
                    	    lv_emptyValue_86_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_emptyValue_86_0, grammarAccess.getTypeAccess().getEmptyValueSTRINGTerminalRuleCall_2_3_2_2_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"emptyValue",
                    	              		lv_emptyValue_86_0, 
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypeAccess().getUnorderedGroup_2_3());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleType", "getUnorderedGroupHelper().canLeave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getTypeAccess().getUnorderedGroup_2_3());

                    }

                    // InternalSculpt.g:1453:2: (otherlv_87= ';' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==19) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSculpt.g:1453:4: otherlv_87= ';'
                            {
                            otherlv_87=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_87, grammarAccess.getTypeAccess().getSemicolonKeyword_2_4());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleToken"
    // InternalSculpt.g:1467:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalSculpt.g:1468:2: (iv_ruleToken= ruleToken EOF )
            // InternalSculpt.g:1469:2: iv_ruleToken= ruleToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTokenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToken; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalSculpt.g:1476:1: ruleToken returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tokenRegex_3_0= RULE_STRING ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_tokenRegex_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:1479:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tokenRegex_3_0= RULE_STRING ) ) (otherlv_4= ';' )? ) )
            // InternalSculpt.g:1480:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tokenRegex_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )
            {
            // InternalSculpt.g:1480:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tokenRegex_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )
            // InternalSculpt.g:1480:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_tokenRegex_3_0= RULE_STRING ) ) (otherlv_4= ';' )?
            {
            // InternalSculpt.g:1480:2: ()
            // InternalSculpt.g:1481:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTokenAccess().getTokenAction_0(),
                          current);
                  
            }

            }

            // InternalSculpt.g:1486:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSculpt.g:1487:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSculpt.g:1487:1: (lv_name_1_0= RULE_ID )
            // InternalSculpt.g:1488:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTokenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSculpt.g:1508:1: ( (lv_tokenRegex_3_0= RULE_STRING ) )
            // InternalSculpt.g:1509:1: (lv_tokenRegex_3_0= RULE_STRING )
            {
            // InternalSculpt.g:1509:1: (lv_tokenRegex_3_0= RULE_STRING )
            // InternalSculpt.g:1510:3: lv_tokenRegex_3_0= RULE_STRING
            {
            lv_tokenRegex_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_tokenRegex_3_0, grammarAccess.getTokenAccess().getTokenRegexSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTokenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"tokenRegex",
                      		lv_tokenRegex_3_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalSculpt.g:1526:2: (otherlv_4= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSculpt.g:1526:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTokenAccess().getSemicolonKeyword_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleCompoundTypePrimitive"
    // InternalSculpt.g:1538:1: entryRuleCompoundTypePrimitive returns [EObject current=null] : iv_ruleCompoundTypePrimitive= ruleCompoundTypePrimitive EOF ;
    public final EObject entryRuleCompoundTypePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundTypePrimitive = null;


        try {
            // InternalSculpt.g:1539:2: (iv_ruleCompoundTypePrimitive= ruleCompoundTypePrimitive EOF )
            // InternalSculpt.g:1540:2: iv_ruleCompoundTypePrimitive= ruleCompoundTypePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundTypePrimitiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompoundTypePrimitive=ruleCompoundTypePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundTypePrimitive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompoundTypePrimitive"


    // $ANTLR start "ruleCompoundTypePrimitive"
    // InternalSculpt.g:1547:1: ruleCompoundTypePrimitive returns [EObject current=null] : ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleCompoundTypePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:1550:28: ( ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalSculpt.g:1551:1: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalSculpt.g:1551:1: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSculpt.g:1551:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:1551:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    // InternalSculpt.g:1551:3: () ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:1551:3: ()
                    // InternalSculpt.g:1552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCompoundTypePrimitiveAccess().getCompoundTypePrimitiveAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:1557:2: ( (lv_text_1_0= RULE_STRING ) )
                    // InternalSculpt.g:1558:1: (lv_text_1_0= RULE_STRING )
                    {
                    // InternalSculpt.g:1558:1: (lv_text_1_0= RULE_STRING )
                    // InternalSculpt.g:1559:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_1_0, grammarAccess.getCompoundTypePrimitiveAccess().getTextSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompoundTypePrimitiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:1576:6: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSculpt.g:1576:6: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalSculpt.g:1576:7: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSculpt.g:1576:7: ()
                    // InternalSculpt.g:1577:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCompoundTypePrimitiveAccess().getCompoundTypePrimitiveAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:1582:2: ( (otherlv_3= RULE_ID ) )
                    // InternalSculpt.g:1583:1: (otherlv_3= RULE_ID )
                    {
                    // InternalSculpt.g:1583:1: (otherlv_3= RULE_ID )
                    // InternalSculpt.g:1584:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompoundTypePrimitiveRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getCompoundTypePrimitiveAccess().getTypeTypeCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompoundTypePrimitive"


    // $ANTLR start "entryRuleRegionToken"
    // InternalSculpt.g:1603:1: entryRuleRegionToken returns [EObject current=null] : iv_ruleRegionToken= ruleRegionToken EOF ;
    public final EObject entryRuleRegionToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionToken = null;


        try {
            // InternalSculpt.g:1604:2: (iv_ruleRegionToken= ruleRegionToken EOF )
            // InternalSculpt.g:1605:2: iv_ruleRegionToken= ruleRegionToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionTokenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegionToken=ruleRegionToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegionToken; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegionToken"


    // $ANTLR start "ruleRegionToken"
    // InternalSculpt.g:1612:1: ruleRegionToken returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_region_3_0= ruleNodeExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleRegionToken() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_region_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1615:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_region_3_0= ruleNodeExpression ) ) otherlv_4= ';' ) )
            // InternalSculpt.g:1616:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_region_3_0= ruleNodeExpression ) ) otherlv_4= ';' )
            {
            // InternalSculpt.g:1616:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_region_3_0= ruleNodeExpression ) ) otherlv_4= ';' )
            // InternalSculpt.g:1616:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_region_3_0= ruleNodeExpression ) ) otherlv_4= ';'
            {
            // InternalSculpt.g:1616:2: ()
            // InternalSculpt.g:1617:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegionTokenAccess().getRegionTokenAction_0(),
                          current);
                  
            }

            }

            // InternalSculpt.g:1622:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalSculpt.g:1623:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSculpt.g:1623:1: (lv_name_1_0= RULE_ID )
            // InternalSculpt.g:1624:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRegionTokenAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegionTokenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRegionTokenAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSculpt.g:1644:1: ( (lv_region_3_0= ruleNodeExpression ) )
            // InternalSculpt.g:1645:1: (lv_region_3_0= ruleNodeExpression )
            {
            // InternalSculpt.g:1645:1: (lv_region_3_0= ruleNodeExpression )
            // InternalSculpt.g:1646:3: lv_region_3_0= ruleNodeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegionTokenAccess().getRegionNodeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_region_3_0=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegionTokenRule());
              	        }
                     		set(
                     			current, 
                     			"region",
                      		lv_region_3_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRegionTokenAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRegionToken"


    // $ANTLR start "entryRuleConstraint"
    // InternalSculpt.g:1674:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSculpt.g:1675:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSculpt.g:1676:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSculpt.g:1683:1: ruleConstraint returns [EObject current=null] : (this_ContentConstraint_0= ruleContentConstraint | this_PrimaryKeyConstraint_1= rulePrimaryKeyConstraint | this_ForeignKeyConstraint_2= ruleForeignKeyConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ContentConstraint_0 = null;

        EObject this_PrimaryKeyConstraint_1 = null;

        EObject this_ForeignKeyConstraint_2 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1686:28: ( (this_ContentConstraint_0= ruleContentConstraint | this_PrimaryKeyConstraint_1= rulePrimaryKeyConstraint | this_ForeignKeyConstraint_2= ruleForeignKeyConstraint ) )
            // InternalSculpt.g:1687:1: (this_ContentConstraint_0= ruleContentConstraint | this_PrimaryKeyConstraint_1= rulePrimaryKeyConstraint | this_ForeignKeyConstraint_2= ruleForeignKeyConstraint )
            {
            // InternalSculpt.g:1687:1: (this_ContentConstraint_0= ruleContentConstraint | this_PrimaryKeyConstraint_1= rulePrimaryKeyConstraint | this_ForeignKeyConstraint_2= ruleForeignKeyConstraint )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 55:
            case 56:
            case 57:
            case 60:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 85:
            case 86:
                {
                alt31=1;
                }
                break;
            case 46:
                {
                alt31=2;
                }
                break;
            case 48:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSculpt.g:1688:5: this_ContentConstraint_0= ruleContentConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getContentConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ContentConstraint_0=ruleContentConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContentConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSculpt.g:1698:5: this_PrimaryKeyConstraint_1= rulePrimaryKeyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getPrimaryKeyConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimaryKeyConstraint_1=rulePrimaryKeyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryKeyConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSculpt.g:1708:5: this_ForeignKeyConstraint_2= ruleForeignKeyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getForeignKeyConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ForeignKeyConstraint_2=ruleForeignKeyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForeignKeyConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleContentConstraint"
    // InternalSculpt.g:1724:1: entryRuleContentConstraint returns [EObject current=null] : iv_ruleContentConstraint= ruleContentConstraint EOF ;
    public final EObject entryRuleContentConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentConstraint = null;


        try {
            // InternalSculpt.g:1725:2: (iv_ruleContentConstraint= ruleContentConstraint EOF )
            // InternalSculpt.g:1726:2: iv_ruleContentConstraint= ruleContentConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContentConstraint=ruleContentConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentConstraint"


    // $ANTLR start "ruleContentConstraint"
    // InternalSculpt.g:1733:1: ruleContentConstraint returns [EObject current=null] : ( ( (lv_region_0_0= ruleNodeExpression ) ) ( (lv_validationMode_1_0= ruleValidationMode ) ) ( (lv_contentExpression_2_0= ruleContentExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleContentConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_region_0_0 = null;

        Enumerator lv_validationMode_1_0 = null;

        EObject lv_contentExpression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1736:28: ( ( ( (lv_region_0_0= ruleNodeExpression ) ) ( (lv_validationMode_1_0= ruleValidationMode ) ) ( (lv_contentExpression_2_0= ruleContentExpression ) ) otherlv_3= ';' ) )
            // InternalSculpt.g:1737:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) ( (lv_validationMode_1_0= ruleValidationMode ) ) ( (lv_contentExpression_2_0= ruleContentExpression ) ) otherlv_3= ';' )
            {
            // InternalSculpt.g:1737:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) ( (lv_validationMode_1_0= ruleValidationMode ) ) ( (lv_contentExpression_2_0= ruleContentExpression ) ) otherlv_3= ';' )
            // InternalSculpt.g:1737:2: ( (lv_region_0_0= ruleNodeExpression ) ) ( (lv_validationMode_1_0= ruleValidationMode ) ) ( (lv_contentExpression_2_0= ruleContentExpression ) ) otherlv_3= ';'
            {
            // InternalSculpt.g:1737:2: ( (lv_region_0_0= ruleNodeExpression ) )
            // InternalSculpt.g:1738:1: (lv_region_0_0= ruleNodeExpression )
            {
            // InternalSculpt.g:1738:1: (lv_region_0_0= ruleNodeExpression )
            // InternalSculpt.g:1739:3: lv_region_0_0= ruleNodeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContentConstraintAccess().getRegionNodeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_region_0_0=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContentConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"region",
                      		lv_region_0_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:1755:2: ( (lv_validationMode_1_0= ruleValidationMode ) )
            // InternalSculpt.g:1756:1: (lv_validationMode_1_0= ruleValidationMode )
            {
            // InternalSculpt.g:1756:1: (lv_validationMode_1_0= ruleValidationMode )
            // InternalSculpt.g:1757:3: lv_validationMode_1_0= ruleValidationMode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContentConstraintAccess().getValidationModeValidationModeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_validationMode_1_0=ruleValidationMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContentConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"validationMode",
                      		lv_validationMode_1_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.ValidationMode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:1773:2: ( (lv_contentExpression_2_0= ruleContentExpression ) )
            // InternalSculpt.g:1774:1: (lv_contentExpression_2_0= ruleContentExpression )
            {
            // InternalSculpt.g:1774:1: (lv_contentExpression_2_0= ruleContentExpression )
            // InternalSculpt.g:1775:3: lv_contentExpression_2_0= ruleContentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContentConstraintAccess().getContentExpressionContentExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_contentExpression_2_0=ruleContentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContentConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"contentExpression",
                      		lv_contentExpression_2_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.ContentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getContentConstraintAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentConstraint"


    // $ANTLR start "entryRulePrimaryKeyConstraint"
    // InternalSculpt.g:1803:1: entryRulePrimaryKeyConstraint returns [EObject current=null] : iv_rulePrimaryKeyConstraint= rulePrimaryKeyConstraint EOF ;
    public final EObject entryRulePrimaryKeyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKeyConstraint = null;


        try {
            // InternalSculpt.g:1804:2: (iv_rulePrimaryKeyConstraint= rulePrimaryKeyConstraint EOF )
            // InternalSculpt.g:1805:2: iv_rulePrimaryKeyConstraint= rulePrimaryKeyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryKeyConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryKeyConstraint=rulePrimaryKeyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryKeyConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryKeyConstraint"


    // $ANTLR start "rulePrimaryKeyConstraint"
    // InternalSculpt.g:1812:1: rulePrimaryKeyConstraint returns [EObject current=null] : (otherlv_0= 'primary' otherlv_1= 'key' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_tupleSelector_4_0= ruleTupleSelector ) ) otherlv_5= ';' ) ;
    public final EObject rulePrimaryKeyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tupleSelector_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1815:28: ( (otherlv_0= 'primary' otherlv_1= 'key' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_tupleSelector_4_0= ruleTupleSelector ) ) otherlv_5= ';' ) )
            // InternalSculpt.g:1816:1: (otherlv_0= 'primary' otherlv_1= 'key' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_tupleSelector_4_0= ruleTupleSelector ) ) otherlv_5= ';' )
            {
            // InternalSculpt.g:1816:1: (otherlv_0= 'primary' otherlv_1= 'key' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_tupleSelector_4_0= ruleTupleSelector ) ) otherlv_5= ';' )
            // InternalSculpt.g:1816:3: otherlv_0= 'primary' otherlv_1= 'key' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_tupleSelector_4_0= ruleTupleSelector ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyConstraintAccess().getPrimaryKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyConstraintAccess().getKeyKeyword_1());
                  
            }
            // InternalSculpt.g:1824:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSculpt.g:1825:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSculpt.g:1825:1: (lv_name_2_0= RULE_ID )
            // InternalSculpt.g:1826:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPrimaryKeyConstraintAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPrimaryKeyConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyConstraintAccess().getColonKeyword_3());
                  
            }
            // InternalSculpt.g:1846:1: ( (lv_tupleSelector_4_0= ruleTupleSelector ) )
            // InternalSculpt.g:1847:1: (lv_tupleSelector_4_0= ruleTupleSelector )
            {
            // InternalSculpt.g:1847:1: (lv_tupleSelector_4_0= ruleTupleSelector )
            // InternalSculpt.g:1848:3: lv_tupleSelector_4_0= ruleTupleSelector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryKeyConstraintAccess().getTupleSelectorTupleSelectorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tupleSelector_4_0=ruleTupleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryKeyConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"tupleSelector",
                      		lv_tupleSelector_4_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TupleSelector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyConstraintAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryKeyConstraint"


    // $ANTLR start "entryRuleForeignKeyConstraint"
    // InternalSculpt.g:1876:1: entryRuleForeignKeyConstraint returns [EObject current=null] : iv_ruleForeignKeyConstraint= ruleForeignKeyConstraint EOF ;
    public final EObject entryRuleForeignKeyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKeyConstraint = null;


        try {
            // InternalSculpt.g:1877:2: (iv_ruleForeignKeyConstraint= ruleForeignKeyConstraint EOF )
            // InternalSculpt.g:1878:2: iv_ruleForeignKeyConstraint= ruleForeignKeyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignKeyConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForeignKeyConstraint=ruleForeignKeyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignKeyConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeignKeyConstraint"


    // $ANTLR start "ruleForeignKeyConstraint"
    // InternalSculpt.g:1885:1: ruleForeignKeyConstraint returns [EObject current=null] : (otherlv_0= 'foreign' otherlv_1= 'key' ( (lv_tupleSelector_2_0= ruleTupleSelector ) ) otherlv_3= 'references' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleForeignKeyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_tupleSelector_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1888:28: ( (otherlv_0= 'foreign' otherlv_1= 'key' ( (lv_tupleSelector_2_0= ruleTupleSelector ) ) otherlv_3= 'references' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSculpt.g:1889:1: (otherlv_0= 'foreign' otherlv_1= 'key' ( (lv_tupleSelector_2_0= ruleTupleSelector ) ) otherlv_3= 'references' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSculpt.g:1889:1: (otherlv_0= 'foreign' otherlv_1= 'key' ( (lv_tupleSelector_2_0= ruleTupleSelector ) ) otherlv_3= 'references' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalSculpt.g:1889:3: otherlv_0= 'foreign' otherlv_1= 'key' ( (lv_tupleSelector_2_0= ruleTupleSelector ) ) otherlv_3= 'references' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeignKeyConstraintAccess().getForeignKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForeignKeyConstraintAccess().getKeyKeyword_1());
                  
            }
            // InternalSculpt.g:1897:1: ( (lv_tupleSelector_2_0= ruleTupleSelector ) )
            // InternalSculpt.g:1898:1: (lv_tupleSelector_2_0= ruleTupleSelector )
            {
            // InternalSculpt.g:1898:1: (lv_tupleSelector_2_0= ruleTupleSelector )
            // InternalSculpt.g:1899:3: lv_tupleSelector_2_0= ruleTupleSelector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeignKeyConstraintAccess().getTupleSelectorTupleSelectorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_34);
            lv_tupleSelector_2_0=ruleTupleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeignKeyConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"tupleSelector",
                      		lv_tupleSelector_2_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TupleSelector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForeignKeyConstraintAccess().getReferencesKeyword_3());
                  
            }
            // InternalSculpt.g:1919:1: ( (otherlv_4= RULE_ID ) )
            // InternalSculpt.g:1920:1: (otherlv_4= RULE_ID )
            {
            // InternalSculpt.g:1920:1: (otherlv_4= RULE_ID )
            // InternalSculpt.g:1921:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForeignKeyConstraintRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getForeignKeyConstraintAccess().getReferencedRelationPrimaryKeyConstraintCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForeignKeyConstraintAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForeignKeyConstraint"


    // $ANTLR start "entryRuleTupleSelector"
    // InternalSculpt.g:1944:1: entryRuleTupleSelector returns [EObject current=null] : iv_ruleTupleSelector= ruleTupleSelector EOF ;
    public final EObject entryRuleTupleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleSelector = null;


        try {
            // InternalSculpt.g:1945:2: (iv_ruleTupleSelector= ruleTupleSelector EOF )
            // InternalSculpt.g:1946:2: iv_ruleTupleSelector= ruleTupleSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleSelectorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleSelector=ruleTupleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleSelector; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleSelector"


    // $ANTLR start "ruleTupleSelector"
    // InternalSculpt.g:1953:1: ruleTupleSelector returns [EObject current=null] : ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= '{' ( (lv_selectors_2_0= rulePath_Expression ) ) (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_region_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_selectors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:1956:28: ( ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= '{' ( (lv_selectors_2_0= rulePath_Expression ) ) (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )* otherlv_5= '}' ) )
            // InternalSculpt.g:1957:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= '{' ( (lv_selectors_2_0= rulePath_Expression ) ) (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )* otherlv_5= '}' )
            {
            // InternalSculpt.g:1957:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= '{' ( (lv_selectors_2_0= rulePath_Expression ) ) (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )* otherlv_5= '}' )
            // InternalSculpt.g:1957:2: ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= '{' ( (lv_selectors_2_0= rulePath_Expression ) ) (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )* otherlv_5= '}'
            {
            // InternalSculpt.g:1957:2: ( (lv_region_0_0= ruleNodeExpression ) )
            // InternalSculpt.g:1958:1: (lv_region_0_0= ruleNodeExpression )
            {
            // InternalSculpt.g:1958:1: (lv_region_0_0= ruleNodeExpression )
            // InternalSculpt.g:1959:3: lv_region_0_0= ruleNodeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleSelectorAccess().getRegionNodeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_region_0_0=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"region",
                      		lv_region_0_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleSelectorAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalSculpt.g:1979:1: ( (lv_selectors_2_0= rulePath_Expression ) )
            // InternalSculpt.g:1980:1: (lv_selectors_2_0= rulePath_Expression )
            {
            // InternalSculpt.g:1980:1: (lv_selectors_2_0= rulePath_Expression )
            // InternalSculpt.g:1981:3: lv_selectors_2_0= rulePath_Expression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleSelectorAccess().getSelectorsPath_ExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_selectors_2_0=rulePath_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleSelectorRule());
              	        }
                     		add(
                     			current, 
                     			"selectors",
                      		lv_selectors_2_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:1997:2: (otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==51) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSculpt.g:1997:4: otherlv_3= ',' ( (lv_selectors_4_0= rulePath_Expression ) )
            	    {
            	    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleSelectorAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSculpt.g:2001:1: ( (lv_selectors_4_0= rulePath_Expression ) )
            	    // InternalSculpt.g:2002:1: (lv_selectors_4_0= rulePath_Expression )
            	    {
            	    // InternalSculpt.g:2002:1: (lv_selectors_4_0= rulePath_Expression )
            	    // InternalSculpt.g:2003:3: lv_selectors_4_0= rulePath_Expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleSelectorAccess().getSelectorsPath_ExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_selectors_4_0=rulePath_Expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleSelectorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"selectors",
            	              		lv_selectors_4_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleSelectorAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTupleSelector"


    // $ANTLR start "entryRuleTransformationProgram"
    // InternalSculpt.g:2031:1: entryRuleTransformationProgram returns [EObject current=null] : iv_ruleTransformationProgram= ruleTransformationProgram EOF ;
    public final EObject entryRuleTransformationProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationProgram = null;


        try {
            // InternalSculpt.g:2032:2: (iv_ruleTransformationProgram= ruleTransformationProgram EOF )
            // InternalSculpt.g:2033:2: iv_ruleTransformationProgram= ruleTransformationProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationProgramRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransformationProgram=ruleTransformationProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationProgram; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransformationProgram"


    // $ANTLR start "ruleTransformationProgram"
    // InternalSculpt.g:2040:1: ruleTransformationProgram returns [EObject current=null] : ( ( (lv_delimiter_0_0= ruleDelimiters ) )? ( (lv_statements_1_0= ruleTLStatement ) )+ ) ;
    public final EObject ruleTransformationProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_delimiter_0_0 = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2043:28: ( ( ( (lv_delimiter_0_0= ruleDelimiters ) )? ( (lv_statements_1_0= ruleTLStatement ) )+ ) )
            // InternalSculpt.g:2044:1: ( ( (lv_delimiter_0_0= ruleDelimiters ) )? ( (lv_statements_1_0= ruleTLStatement ) )+ )
            {
            // InternalSculpt.g:2044:1: ( ( (lv_delimiter_0_0= ruleDelimiters ) )? ( (lv_statements_1_0= ruleTLStatement ) )+ )
            // InternalSculpt.g:2044:2: ( (lv_delimiter_0_0= ruleDelimiters ) )? ( (lv_statements_1_0= ruleTLStatement ) )+
            {
            // InternalSculpt.g:2044:2: ( (lv_delimiter_0_0= ruleDelimiters ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17||(LA33_0>=20 && LA33_0<=21)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSculpt.g:2045:1: (lv_delimiter_0_0= ruleDelimiters )
                    {
                    // InternalSculpt.g:2045:1: (lv_delimiter_0_0= ruleDelimiters )
                    // InternalSculpt.g:2046:3: lv_delimiter_0_0= ruleDelimiters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransformationProgramAccess().getDelimiterDelimitersParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_delimiter_0_0=ruleDelimiters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransformationProgramRule());
                      	        }
                             		set(
                             			current, 
                             			"delimiter",
                              		lv_delimiter_0_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Delimiters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSculpt.g:2062:3: ( (lv_statements_1_0= ruleTLStatement ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=78 && LA34_0<=79)||LA34_0==82) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSculpt.g:2063:1: (lv_statements_1_0= ruleTLStatement )
            	    {
            	    // InternalSculpt.g:2063:1: (lv_statements_1_0= ruleTLStatement )
            	    // InternalSculpt.g:2064:3: lv_statements_1_0= ruleTLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransformationProgramAccess().getStatementsTLStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    lv_statements_1_0=ruleTLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransformationProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.TLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransformationProgram"


    // $ANTLR start "entryRuleNodeExpression"
    // InternalSculpt.g:2088:1: entryRuleNodeExpression returns [EObject current=null] : iv_ruleNodeExpression= ruleNodeExpression EOF ;
    public final EObject entryRuleNodeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExpression = null;


        try {
            // InternalSculpt.g:2089:2: (iv_ruleNodeExpression= ruleNodeExpression EOF )
            // InternalSculpt.g:2090:2: iv_ruleNodeExpression= ruleNodeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeExpression=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeExpression"


    // $ANTLR start "ruleNodeExpression"
    // InternalSculpt.g:2097:1: ruleNodeExpression returns [EObject current=null] : this_Ne_Or_0= ruleNe_Or ;
    public final EObject ruleNodeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Ne_Or_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2100:28: (this_Ne_Or_0= ruleNe_Or )
            // InternalSculpt.g:2102:5: this_Ne_Or_0= ruleNe_Or
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNodeExpressionAccess().getNe_OrParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Ne_Or_0=ruleNe_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ne_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeExpression"


    // $ANTLR start "entryRuleNe_Or"
    // InternalSculpt.g:2118:1: entryRuleNe_Or returns [EObject current=null] : iv_ruleNe_Or= ruleNe_Or EOF ;
    public final EObject entryRuleNe_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Or = null;


        try {
            // InternalSculpt.g:2119:2: (iv_ruleNe_Or= ruleNe_Or EOF )
            // InternalSculpt.g:2120:2: iv_ruleNe_Or= ruleNe_Or EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_OrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Or=ruleNe_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Or; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Or"


    // $ANTLR start "ruleNe_Or"
    // InternalSculpt.g:2127:1: ruleNe_Or returns [EObject current=null] : (this_Ne_And_0= ruleNe_And ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )* ) ;
    public final EObject ruleNe_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Ne_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2130:28: ( (this_Ne_And_0= ruleNe_And ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )* ) )
            // InternalSculpt.g:2131:1: (this_Ne_And_0= ruleNe_And ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )* )
            {
            // InternalSculpt.g:2131:1: (this_Ne_And_0= ruleNe_And ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )* )
            // InternalSculpt.g:2132:5: this_Ne_And_0= ruleNe_And ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNe_OrAccess().getNe_AndParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_Ne_And_0=ruleNe_And();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ne_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:2140:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSculpt.g:2140:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleNe_And ) )
            	    {
            	    // InternalSculpt.g:2140:2: ()
            	    // InternalSculpt.g:2141:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNe_OrAccess().getNodeExpressionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNe_OrAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // InternalSculpt.g:2150:1: ( (lv_right_3_0= ruleNe_And ) )
            	    // InternalSculpt.g:2151:1: (lv_right_3_0= ruleNe_And )
            	    {
            	    // InternalSculpt.g:2151:1: (lv_right_3_0= ruleNe_And )
            	    // InternalSculpt.g:2152:3: lv_right_3_0= ruleNe_And
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNe_OrAccess().getRightNe_AndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_right_3_0=ruleNe_And();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNe_OrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Ne_And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Or"


    // $ANTLR start "entryRuleNe_And"
    // InternalSculpt.g:2176:1: entryRuleNe_And returns [EObject current=null] : iv_ruleNe_And= ruleNe_And EOF ;
    public final EObject entryRuleNe_And() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_And = null;


        try {
            // InternalSculpt.g:2177:2: (iv_ruleNe_And= ruleNe_And EOF )
            // InternalSculpt.g:2178:2: iv_ruleNe_And= ruleNe_And EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_AndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_And=ruleNe_And();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_And; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_And"


    // $ANTLR start "ruleNe_And"
    // InternalSculpt.g:2185:1: ruleNe_And returns [EObject current=null] : (this_Ne_Not_0= ruleNe_Not ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )* ) ;
    public final EObject ruleNe_And() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Ne_Not_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2188:28: ( (this_Ne_Not_0= ruleNe_Not ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )* ) )
            // InternalSculpt.g:2189:1: (this_Ne_Not_0= ruleNe_Not ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )* )
            {
            // InternalSculpt.g:2189:1: (this_Ne_Not_0= ruleNe_Not ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )* )
            // InternalSculpt.g:2190:5: this_Ne_Not_0= ruleNe_Not ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNe_AndAccess().getNe_NotParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_Ne_Not_0=ruleNe_Not();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ne_Not_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:2198:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSculpt.g:2198:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleNe_Not ) )
            	    {
            	    // InternalSculpt.g:2198:2: ()
            	    // InternalSculpt.g:2199:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNe_AndAccess().getNodeExpressionAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNe_AndAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // InternalSculpt.g:2208:1: ( (lv_right_3_0= ruleNe_Not ) )
            	    // InternalSculpt.g:2209:1: (lv_right_3_0= ruleNe_Not )
            	    {
            	    // InternalSculpt.g:2209:1: (lv_right_3_0= ruleNe_Not )
            	    // InternalSculpt.g:2210:3: lv_right_3_0= ruleNe_Not
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNe_AndAccess().getRightNe_NotParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_right_3_0=ruleNe_Not();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNe_AndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Ne_Not");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_And"


    // $ANTLR start "entryRuleNe_Not"
    // InternalSculpt.g:2234:1: entryRuleNe_Not returns [EObject current=null] : iv_ruleNe_Not= ruleNe_Not EOF ;
    public final EObject entryRuleNe_Not() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Not = null;


        try {
            // InternalSculpt.g:2235:2: (iv_ruleNe_Not= ruleNe_Not EOF )
            // InternalSculpt.g:2236:2: iv_ruleNe_Not= ruleNe_Not EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_NotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Not=ruleNe_Not();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Not; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Not"


    // $ANTLR start "ruleNe_Not"
    // InternalSculpt.g:2243:1: ruleNe_Not returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) ) | this_Ne_Path_3= ruleNe_Path ) ;
    public final EObject ruleNe_Not() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_region_2_0 = null;

        EObject this_Ne_Path_3 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2246:28: ( ( ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) ) | this_Ne_Path_3= ruleNe_Path ) )
            // InternalSculpt.g:2247:1: ( ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) ) | this_Ne_Path_3= ruleNe_Path )
            {
            // InternalSculpt.g:2247:1: ( ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) ) | this_Ne_Path_3= ruleNe_Path )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||(LA37_0>=56 && LA37_0<=57)||LA37_0==60||(LA37_0>=67 && LA37_0<=71)||(LA37_0>=85 && LA37_0<=86)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalSculpt.g:2247:2: ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) )
                    {
                    // InternalSculpt.g:2247:2: ( () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) ) )
                    // InternalSculpt.g:2247:3: () otherlv_1= 'not' ( (lv_region_2_0= ruleNe_Path ) )
                    {
                    // InternalSculpt.g:2247:3: ()
                    // InternalSculpt.g:2248:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_NotAccess().getNodeExpressionNotAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNe_NotAccess().getNotKeyword_0_1());
                          
                    }
                    // InternalSculpt.g:2257:1: ( (lv_region_2_0= ruleNe_Path ) )
                    // InternalSculpt.g:2258:1: (lv_region_2_0= ruleNe_Path )
                    {
                    // InternalSculpt.g:2258:1: (lv_region_2_0= ruleNe_Path )
                    // InternalSculpt.g:2259:3: lv_region_2_0= ruleNe_Path
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_NotAccess().getRegionNe_PathParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_region_2_0=ruleNe_Path();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_NotRule());
                      	        }
                             		set(
                             			current, 
                             			"region",
                              		lv_region_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Ne_Path");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2277:5: this_Ne_Path_3= ruleNe_Path
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_NotAccess().getNe_PathParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ne_Path_3=ruleNe_Path();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Path_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Not"


    // $ANTLR start "entryRuleNe_Path"
    // InternalSculpt.g:2293:1: entryRuleNe_Path returns [EObject current=null] : iv_ruleNe_Path= ruleNe_Path EOF ;
    public final EObject entryRuleNe_Path() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Path = null;


        try {
            // InternalSculpt.g:2294:2: (iv_ruleNe_Path= ruleNe_Path EOF )
            // InternalSculpt.g:2295:2: iv_ruleNe_Path= ruleNe_Path EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_PathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Path=ruleNe_Path();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Path; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Path"


    // $ANTLR start "ruleNe_Path"
    // InternalSculpt.g:2302:1: ruleNe_Path returns [EObject current=null] : ( ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? ) | ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) ) | ( () ( (lv_path_8_0= rulePath_Expression ) ) ) ) ;
    public final EObject ruleNe_Path() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Ne_Primitive_0 = null;

        EObject lv_path_3_0 = null;

        EObject lv_path_6_0 = null;

        EObject lv_path_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2305:28: ( ( ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? ) | ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) ) | ( () ( (lv_path_8_0= rulePath_Expression ) ) ) ) )
            // InternalSculpt.g:2306:1: ( ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? ) | ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) ) | ( () ( (lv_path_8_0= rulePath_Expression ) ) ) )
            {
            // InternalSculpt.g:2306:1: ( ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? ) | ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) ) | ( () ( (lv_path_8_0= rulePath_Expression ) ) ) )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalSculpt.g:2306:2: ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? )
                    {
                    // InternalSculpt.g:2306:2: ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? )
                    // InternalSculpt.g:2306:3: ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )?
                    {
                    // InternalSculpt.g:2306:3: ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive )
                    // InternalSculpt.g:2306:4: ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_PathAccess().getNe_PrimitiveParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    this_Ne_Primitive_0=ruleNe_Primitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Primitive_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // InternalSculpt.g:2315:2: ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==56) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSculpt.g:2315:3: () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) )
                            {
                            // InternalSculpt.g:2315:3: ()
                            // InternalSculpt.g:2316:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getNe_PathAccess().getNodeExpressionPathRegionAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            // InternalSculpt.g:2321:2: (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) )
                            // InternalSculpt.g:2321:4: otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) )
                            {
                            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getNe_PathAccess().getSolidusKeyword_0_1_1_0());
                                  
                            }
                            // InternalSculpt.g:2325:1: ( (lv_path_3_0= rulePath_Expression ) )
                            // InternalSculpt.g:2326:1: (lv_path_3_0= rulePath_Expression )
                            {
                            // InternalSculpt.g:2326:1: (lv_path_3_0= rulePath_Expression )
                            // InternalSculpt.g:2327:3: lv_path_3_0= rulePath_Expression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNe_PathAccess().getPathPath_ExpressionParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_path_3_0=rulePath_Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNe_PathRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"path",
                                      		lv_path_3_0, 
                                      		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2344:6: ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) )
                    {
                    // InternalSculpt.g:2344:6: ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) )
                    // InternalSculpt.g:2344:7: () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) )
                    {
                    // InternalSculpt.g:2344:7: ()
                    // InternalSculpt.g:2345:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_PathAccess().getNodeExpressionPathAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNe_PathAccess().getSolidusKeyword_1_1());
                          
                    }
                    // InternalSculpt.g:2354:1: ( (lv_path_6_0= rulePath_Expression ) )
                    // InternalSculpt.g:2355:1: (lv_path_6_0= rulePath_Expression )
                    {
                    // InternalSculpt.g:2355:1: (lv_path_6_0= rulePath_Expression )
                    // InternalSculpt.g:2356:3: lv_path_6_0= rulePath_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_PathAccess().getPathPath_ExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_6_0=rulePath_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_PathRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_6_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:2373:6: ( () ( (lv_path_8_0= rulePath_Expression ) ) )
                    {
                    // InternalSculpt.g:2373:6: ( () ( (lv_path_8_0= rulePath_Expression ) ) )
                    // InternalSculpt.g:2373:7: () ( (lv_path_8_0= rulePath_Expression ) )
                    {
                    // InternalSculpt.g:2373:7: ()
                    // InternalSculpt.g:2374:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_PathAccess().getPathExpressionPredicateAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2379:2: ( (lv_path_8_0= rulePath_Expression ) )
                    // InternalSculpt.g:2380:1: (lv_path_8_0= rulePath_Expression )
                    {
                    // InternalSculpt.g:2380:1: (lv_path_8_0= rulePath_Expression )
                    // InternalSculpt.g:2381:3: lv_path_8_0= rulePath_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_PathAccess().getPathPath_ExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_8_0=rulePath_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_PathRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_8_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Path"


    // $ANTLR start "entryRuleNe_Primitive"
    // InternalSculpt.g:2405:1: entryRuleNe_Primitive returns [EObject current=null] : iv_ruleNe_Primitive= ruleNe_Primitive EOF ;
    public final EObject entryRuleNe_Primitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Primitive = null;


        try {
            // InternalSculpt.g:2406:2: (iv_ruleNe_Primitive= ruleNe_Primitive EOF )
            // InternalSculpt.g:2407:2: iv_ruleNe_Primitive= ruleNe_Primitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_PrimitiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Primitive=ruleNe_Primitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Primitive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Primitive"


    // $ANTLR start "ruleNe_Primitive"
    // InternalSculpt.g:2414:1: ruleNe_Primitive returns [EObject current=null] : ( (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' ) | this_Ne_Comparison_3= ruleNe_Comparison | this_Ne_Atomic_4= ruleNe_Atomic ) ;
    public final EObject ruleNe_Primitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Ne_Or_1 = null;

        EObject this_Ne_Comparison_3 = null;

        EObject this_Ne_Atomic_4 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2417:28: ( ( (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' ) | this_Ne_Comparison_3= ruleNe_Comparison | this_Ne_Atomic_4= ruleNe_Atomic ) )
            // InternalSculpt.g:2418:1: ( (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' ) | this_Ne_Comparison_3= ruleNe_Comparison | this_Ne_Atomic_4= ruleNe_Atomic )
            {
            // InternalSculpt.g:2418:1: ( (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' ) | this_Ne_Comparison_3= ruleNe_Comparison | this_Ne_Atomic_4= ruleNe_Atomic )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT) ) {
                    alt40=3;
                }
                else if ( ((LA40_1>=RULE_STRING && LA40_1<=RULE_ID)||(LA40_1>=55 && LA40_1<=57)||LA40_1==60||(LA40_1>=67 && LA40_1<=71)||(LA40_1>=85 && LA40_1<=86)) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    int LA40_6 = input.LA(3);

                    if ( (LA40_6==RULE_ID) ) {
                        alt40=2;
                    }
                    else if ( (LA40_6==84||LA40_6==93) ) {
                        alt40=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                case 40:
                case 45:
                case 62:
                case 87:
                case 88:
                case 89:
                    {
                    alt40=2;
                    }
                    break;
                case EOF:
                case 19:
                case 50:
                case 53:
                case 54:
                case 56:
                case 58:
                case 63:
                case 84:
                case 90:
                case 91:
                case 92:
                    {
                    alt40=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt40=2;
                }
                break;
            case 60:
            case 85:
            case 86:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSculpt.g:2418:2: (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' )
                    {
                    // InternalSculpt.g:2418:2: (otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')' )
                    // InternalSculpt.g:2418:4: otherlv_0= '(' this_Ne_Or_1= ruleNe_Or otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNe_PrimitiveAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_PrimitiveAccess().getNe_OrParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_Ne_Or_1=ruleNe_Or();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Or_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNe_PrimitiveAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2437:5: this_Ne_Comparison_3= ruleNe_Comparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_PrimitiveAccess().getNe_ComparisonParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ne_Comparison_3=ruleNe_Comparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Comparison_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSculpt.g:2447:5: this_Ne_Atomic_4= ruleNe_Atomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_PrimitiveAccess().getNe_AtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ne_Atomic_4=ruleNe_Atomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Atomic_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Primitive"


    // $ANTLR start "entryRuleNe_Atomic"
    // InternalSculpt.g:2463:1: entryRuleNe_Atomic returns [EObject current=null] : iv_ruleNe_Atomic= ruleNe_Atomic EOF ;
    public final EObject entryRuleNe_Atomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Atomic = null;


        try {
            // InternalSculpt.g:2464:2: (iv_ruleNe_Atomic= ruleNe_Atomic EOF )
            // InternalSculpt.g:2465:2: iv_ruleNe_Atomic= ruleNe_Atomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_AtomicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Atomic=ruleNe_Atomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Atomic; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Atomic"


    // $ANTLR start "ruleNe_Atomic"
    // InternalSculpt.g:2472:1: ruleNe_Atomic returns [EObject current=null] : (this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test | ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' ) | ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) | ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' ) | ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' ) | ( () otherlv_29= 'True' ) ) ;
    public final EObject ruleNe_Atomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token lv_index_11_0=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token lv_string_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject this_Ne_Atomic_Node_Test_0 = null;

        Enumerator lv_mode_2_0 = null;

        Enumerator lv_mode_9_0 = null;

        Enumerator lv_mode_14_0 = null;

        Enumerator lv_mode_19_0 = null;

        Enumerator lv_mode_24_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2475:28: ( (this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test | ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' ) | ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) | ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' ) | ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' ) | ( () otherlv_29= 'True' ) ) )
            // InternalSculpt.g:2476:1: (this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test | ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' ) | ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) | ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' ) | ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' ) | ( () otherlv_29= 'True' ) )
            {
            // InternalSculpt.g:2476:1: (this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test | ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' ) | ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) | ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' ) | ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' ) | ( () otherlv_29= 'True' ) )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalSculpt.g:2477:5: this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNe_AtomicAccess().getNe_Atomic_Node_TestParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ne_Atomic_Node_Test_0=ruleNe_Atomic_Node_Test();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ne_Atomic_Node_Test_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2486:6: ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' )
                    {
                    // InternalSculpt.g:2486:6: ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' )
                    // InternalSculpt.g:2486:7: () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    // InternalSculpt.g:2486:7: ()
                    // InternalSculpt.g:2487:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionRowColCoordinateAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2492:2: ( (lv_mode_2_0= ruleRowCol ) )
                    // InternalSculpt.g:2493:1: (lv_mode_2_0= ruleRowCol )
                    {
                    // InternalSculpt.g:2493:1: (lv_mode_2_0= ruleRowCol )
                    // InternalSculpt.g:2494:3: lv_mode_2_0= ruleRowCol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_AtomicAccess().getModeRowColEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_2_0=ruleRowCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.RowCol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNe_AtomicAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // InternalSculpt.g:2514:1: ( (lv_row_4_0= RULE_INT ) )
                    // InternalSculpt.g:2515:1: (lv_row_4_0= RULE_INT )
                    {
                    // InternalSculpt.g:2515:1: (lv_row_4_0= RULE_INT )
                    // InternalSculpt.g:2516:3: lv_row_4_0= RULE_INT
                    {
                    lv_row_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_row_4_0, grammarAccess.getNe_AtomicAccess().getRowINTTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"row",
                              		lv_row_4_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNe_AtomicAccess().getCommaKeyword_1_4());
                          
                    }
                    // InternalSculpt.g:2536:1: ( (lv_column_6_0= RULE_INT ) )
                    // InternalSculpt.g:2537:1: (lv_column_6_0= RULE_INT )
                    {
                    // InternalSculpt.g:2537:1: (lv_column_6_0= RULE_INT )
                    // InternalSculpt.g:2538:3: lv_column_6_0= RULE_INT
                    {
                    lv_column_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_column_6_0, grammarAccess.getNe_AtomicAccess().getColumnINTTerminalRuleCall_1_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"column",
                              		lv_column_6_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNe_AtomicAccess().getRightParenthesisKeyword_1_6());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:2559:6: ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' )
                    {
                    // InternalSculpt.g:2559:6: ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' )
                    // InternalSculpt.g:2559:7: () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')'
                    {
                    // InternalSculpt.g:2559:7: ()
                    // InternalSculpt.g:2560:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionRowColCoordinateAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2565:2: ( (lv_mode_9_0= ruleRowCol ) )
                    // InternalSculpt.g:2566:1: (lv_mode_9_0= ruleRowCol )
                    {
                    // InternalSculpt.g:2566:1: (lv_mode_9_0= ruleRowCol )
                    // InternalSculpt.g:2567:3: lv_mode_9_0= ruleRowCol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_AtomicAccess().getModeRowColEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_9_0=ruleRowCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_9_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.RowCol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,57,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getNe_AtomicAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // InternalSculpt.g:2587:1: ( (lv_index_11_0= RULE_INT ) )
                    // InternalSculpt.g:2588:1: (lv_index_11_0= RULE_INT )
                    {
                    // InternalSculpt.g:2588:1: (lv_index_11_0= RULE_INT )
                    // InternalSculpt.g:2589:3: lv_index_11_0= RULE_INT
                    {
                    lv_index_11_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_index_11_0, grammarAccess.getNe_AtomicAccess().getIndexINTTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"index",
                              		lv_index_11_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getNe_AtomicAccess().getRightParenthesisKeyword_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSculpt.g:2610:6: ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' )
                    {
                    // InternalSculpt.g:2610:6: ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' )
                    // InternalSculpt.g:2610:7: () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')'
                    {
                    // InternalSculpt.g:2610:7: ()
                    // InternalSculpt.g:2611:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionRowColTokenAction_3_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2616:2: ( (lv_mode_14_0= ruleRowCol ) )
                    // InternalSculpt.g:2617:1: (lv_mode_14_0= ruleRowCol )
                    {
                    // InternalSculpt.g:2617:1: (lv_mode_14_0= ruleRowCol )
                    // InternalSculpt.g:2618:3: lv_mode_14_0= ruleRowCol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_AtomicAccess().getModeRowColEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_14_0=ruleRowCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_14_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.RowCol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,57,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getNe_AtomicAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // InternalSculpt.g:2638:1: ( (otherlv_16= RULE_ID ) )
                    // InternalSculpt.g:2639:1: (otherlv_16= RULE_ID )
                    {
                    // InternalSculpt.g:2639:1: (otherlv_16= RULE_ID )
                    // InternalSculpt.g:2640:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_AtomicRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_16, grammarAccess.getNe_AtomicAccess().getTokenTokenCrossReference_3_3_0()); 
                      	
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getNe_AtomicAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSculpt.g:2656:6: ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' )
                    {
                    // InternalSculpt.g:2656:6: ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' )
                    // InternalSculpt.g:2656:7: () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')'
                    {
                    // InternalSculpt.g:2656:7: ()
                    // InternalSculpt.g:2657:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionRowColStringAction_4_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2662:2: ( (lv_mode_19_0= ruleRowCol ) )
                    // InternalSculpt.g:2663:1: (lv_mode_19_0= ruleRowCol )
                    {
                    // InternalSculpt.g:2663:1: (lv_mode_19_0= ruleRowCol )
                    // InternalSculpt.g:2664:3: lv_mode_19_0= ruleRowCol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_AtomicAccess().getModeRowColEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_19_0=ruleRowCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_19_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.RowCol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,57,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getNe_AtomicAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // InternalSculpt.g:2684:1: ( (lv_string_21_0= RULE_STRING ) )
                    // InternalSculpt.g:2685:1: (lv_string_21_0= RULE_STRING )
                    {
                    // InternalSculpt.g:2685:1: (lv_string_21_0= RULE_STRING )
                    // InternalSculpt.g:2686:3: lv_string_21_0= RULE_STRING
                    {
                    lv_string_21_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_21_0, grammarAccess.getNe_AtomicAccess().getStringSTRINGTerminalRuleCall_4_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_21_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getNe_AtomicAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSculpt.g:2707:6: ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' )
                    {
                    // InternalSculpt.g:2707:6: ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' )
                    // InternalSculpt.g:2707:7: () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')'
                    {
                    // InternalSculpt.g:2707:7: ()
                    // InternalSculpt.g:2708:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionRowColLastAction_5_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2713:2: ( (lv_mode_24_0= ruleRowCol ) )
                    // InternalSculpt.g:2714:1: (lv_mode_24_0= ruleRowCol )
                    {
                    // InternalSculpt.g:2714:1: (lv_mode_24_0= ruleRowCol )
                    // InternalSculpt.g:2715:3: lv_mode_24_0= ruleRowCol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_AtomicAccess().getModeRowColEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_24_0=ruleRowCol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_24_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.RowCol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,57,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getNe_AtomicAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    otherlv_26=(Token)match(input,59,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getNe_AtomicAccess().getLastKeyword_5_3());
                          
                    }
                    otherlv_27=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getNe_AtomicAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSculpt.g:2744:6: ( () otherlv_29= 'True' )
                    {
                    // InternalSculpt.g:2744:6: ( () otherlv_29= 'True' )
                    // InternalSculpt.g:2744:7: () otherlv_29= 'True'
                    {
                    // InternalSculpt.g:2744:7: ()
                    // InternalSculpt.g:2745:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_AtomicAccess().getNodeExpressionCompleteAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_29=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getNe_AtomicAccess().getTrueKeyword_6_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Atomic"


    // $ANTLR start "entryRuleNe_Comparison"
    // InternalSculpt.g:2762:1: entryRuleNe_Comparison returns [EObject current=null] : iv_ruleNe_Comparison= ruleNe_Comparison EOF ;
    public final EObject entryRuleNe_Comparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Comparison = null;


        try {
            // InternalSculpt.g:2763:2: (iv_ruleNe_Comparison= ruleNe_Comparison EOF )
            // InternalSculpt.g:2764:2: iv_ruleNe_Comparison= ruleNe_Comparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_ComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Comparison=ruleNe_Comparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Comparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Comparison"


    // $ANTLR start "ruleNe_Comparison"
    // InternalSculpt.g:2771:1: ruleNe_Comparison returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleNe_Comparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        EObject lv_typeSpecifier_1_0 = null;

        Enumerator lv_comp_2_0 = null;

        Enumerator lv_comp_6_0 = null;

        EObject lv_typeSpecifier_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:2774:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* ) ) )
            // InternalSculpt.g:2775:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* ) )
            {
            // InternalSculpt.g:2775:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_STRING) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSculpt.g:2775:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:2775:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalSculpt.g:2775:3: ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:2775:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSculpt.g:2776:1: (otherlv_0= RULE_ID )
                    {
                    // InternalSculpt.g:2776:1: (otherlv_0= RULE_ID )
                    // InternalSculpt.g:2777:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_ComparisonRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getNe_ComparisonAccess().getTypeTypeCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:2788:2: ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=61 && LA42_0<=62)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSculpt.g:2789:1: (lv_typeSpecifier_1_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:2789:1: (lv_typeSpecifier_1_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:2790:3: lv_typeSpecifier_1_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNe_ComparisonAccess().getTypeSpecifierTypeSpecifierParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
                    	    lv_typeSpecifier_1_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNe_ComparisonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_1_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // InternalSculpt.g:2806:3: ( (lv_comp_2_0= ruleComparator ) )
                    // InternalSculpt.g:2807:1: (lv_comp_2_0= ruleComparator )
                    {
                    // InternalSculpt.g:2807:1: (lv_comp_2_0= ruleComparator )
                    // InternalSculpt.g:2808:3: lv_comp_2_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_ComparisonAccess().getCompComparatorEnumRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_comp_2_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"comp",
                              		lv_comp_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:2824:2: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalSculpt.g:2825:1: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalSculpt.g:2825:1: (lv_value_3_0= RULE_STRING )
                    // InternalSculpt.g:2826:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getNe_ComparisonAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_ComparisonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2843:6: ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* )
                    {
                    // InternalSculpt.g:2843:6: ( () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )* )
                    // InternalSculpt.g:2843:7: () ( (lv_value_5_0= RULE_STRING ) ) ( (lv_comp_6_0= ruleComparator ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )*
                    {
                    // InternalSculpt.g:2843:7: ()
                    // InternalSculpt.g:2844:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_ComparisonAccess().getNodeExpressionComparisonR2LAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:2849:2: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalSculpt.g:2850:1: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalSculpt.g:2850:1: (lv_value_5_0= RULE_STRING )
                    // InternalSculpt.g:2851:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getNe_ComparisonAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_ComparisonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:2867:2: ( (lv_comp_6_0= ruleComparator ) )
                    // InternalSculpt.g:2868:1: (lv_comp_6_0= ruleComparator )
                    {
                    // InternalSculpt.g:2868:1: (lv_comp_6_0= ruleComparator )
                    // InternalSculpt.g:2869:3: lv_comp_6_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNe_ComparisonAccess().getCompComparatorEnumRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_comp_6_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"comp",
                              		lv_comp_6_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:2885:2: ( (otherlv_7= RULE_ID ) )
                    // InternalSculpt.g:2886:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSculpt.g:2886:1: (otherlv_7= RULE_ID )
                    // InternalSculpt.g:2887:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_ComparisonRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getNe_ComparisonAccess().getTypeTypeCrossReference_1_3_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:2898:2: ( (lv_typeSpecifier_8_0= ruleTypeSpecifier ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==61) ) {
                            int LA43_2 = input.LA(2);

                            if ( (LA43_2==RULE_ID) ) {
                                alt43=1;
                            }


                        }
                        else if ( (LA43_0==62) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSculpt.g:2899:1: (lv_typeSpecifier_8_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:2899:1: (lv_typeSpecifier_8_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:2900:3: lv_typeSpecifier_8_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNe_ComparisonAccess().getTypeSpecifierTypeSpecifierParserRuleCall_1_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    lv_typeSpecifier_8_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNe_ComparisonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_8_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Comparison"


    // $ANTLR start "entryRuleTypeSpecifier"
    // InternalSculpt.g:2924:1: entryRuleTypeSpecifier returns [EObject current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final EObject entryRuleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecifier = null;


        try {
            // InternalSculpt.g:2925:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalSculpt.g:2926:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // InternalSculpt.g:2933:1: ruleTypeSpecifier returns [EObject current=null] : ( ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? ) | ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' ) ) ;
    public final EObject ruleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_index_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_index_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:2936:28: ( ( ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? ) | ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' ) ) )
            // InternalSculpt.g:2937:1: ( ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? ) | ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            {
            // InternalSculpt.g:2937:1: ( ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? ) | ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            else if ( (LA46_0==62) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSculpt.g:2937:2: ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? )
                    {
                    // InternalSculpt.g:2937:2: ( () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )? )
                    // InternalSculpt.g:2937:3: () otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )?
                    {
                    // InternalSculpt.g:2937:3: ()
                    // InternalSculpt.g:2938:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeSpecifierAccess().getCompoundTypeSpecifierAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeSpecifierAccess().getFullStopKeyword_0_1());
                          
                    }
                    // InternalSculpt.g:2947:1: ( (otherlv_2= RULE_ID ) )
                    // InternalSculpt.g:2948:1: (otherlv_2= RULE_ID )
                    {
                    // InternalSculpt.g:2948:1: (otherlv_2= RULE_ID )
                    // InternalSculpt.g:2949:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getTypeSpecifierAccess().getSubtypeTypeCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:2960:2: (otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==40) ) {
                        int LA45_1 = input.LA(2);

                        if ( (LA45_1==RULE_INT) ) {
                            alt45=1;
                        }
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSculpt.g:2960:4: otherlv_3= '<' ( (lv_index_4_0= RULE_INT ) ) otherlv_5= '>'
                            {
                            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getTypeSpecifierAccess().getLessThanSignKeyword_0_3_0());
                                  
                            }
                            // InternalSculpt.g:2964:1: ( (lv_index_4_0= RULE_INT ) )
                            // InternalSculpt.g:2965:1: (lv_index_4_0= RULE_INT )
                            {
                            // InternalSculpt.g:2965:1: (lv_index_4_0= RULE_INT )
                            // InternalSculpt.g:2966:3: lv_index_4_0= RULE_INT
                            {
                            lv_index_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_index_4_0, grammarAccess.getTypeSpecifierAccess().getIndexINTTerminalRuleCall_0_3_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"index",
                                      		lv_index_4_0, 
                                      		"org.eclipse.xtext.common.Terminals.INT");
                              	    
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getTypeSpecifierAccess().getGreaterThanSignKeyword_0_3_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:2987:6: ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' )
                    {
                    // InternalSculpt.g:2987:6: ( () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']' )
                    // InternalSculpt.g:2987:7: () otherlv_7= '[' ( (lv_index_8_0= RULE_INT ) ) otherlv_9= ']'
                    {
                    // InternalSculpt.g:2987:7: ()
                    // InternalSculpt.g:2988:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeSpecifierAccess().getListTypeSpecifierAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTypeSpecifierAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // InternalSculpt.g:2997:1: ( (lv_index_8_0= RULE_INT ) )
                    // InternalSculpt.g:2998:1: (lv_index_8_0= RULE_INT )
                    {
                    // InternalSculpt.g:2998:1: (lv_index_8_0= RULE_INT )
                    // InternalSculpt.g:2999:3: lv_index_8_0= RULE_INT
                    {
                    lv_index_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_index_8_0, grammarAccess.getTypeSpecifierAccess().getIndexINTTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"index",
                              		lv_index_8_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTypeSpecifierAccess().getRightSquareBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleNe_Atomic_Node_Test"
    // InternalSculpt.g:3027:1: entryRuleNe_Atomic_Node_Test returns [EObject current=null] : iv_ruleNe_Atomic_Node_Test= ruleNe_Atomic_Node_Test EOF ;
    public final EObject entryRuleNe_Atomic_Node_Test() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNe_Atomic_Node_Test = null;


        try {
            // InternalSculpt.g:3028:2: (iv_ruleNe_Atomic_Node_Test= ruleNe_Atomic_Node_Test EOF )
            // InternalSculpt.g:3029:2: iv_ruleNe_Atomic_Node_Test= ruleNe_Atomic_Node_Test EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNe_Atomic_Node_TestRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNe_Atomic_Node_Test=ruleNe_Atomic_Node_Test();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNe_Atomic_Node_Test; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNe_Atomic_Node_Test"


    // $ANTLR start "ruleNe_Atomic_Node_Test"
    // InternalSculpt.g:3036:1: ruleNe_Atomic_Node_Test returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleNe_Atomic_Node_Test() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_row_2_0=null;
        Token otherlv_3=null;
        Token lv_column_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:3039:28: ( ( ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalSculpt.g:3040:1: ( ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalSculpt.g:3040:1: ( ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSculpt.g:3040:2: ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' )
                    {
                    // InternalSculpt.g:3040:2: ( () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')' )
                    // InternalSculpt.g:3040:3: () otherlv_1= '(' ( (lv_row_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_INT ) ) otherlv_5= ')'
                    {
                    // InternalSculpt.g:3040:3: ()
                    // InternalSculpt.g:3041:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_Atomic_Node_TestAccess().getNodeExpressionCoordinateAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNe_Atomic_Node_TestAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // InternalSculpt.g:3050:1: ( (lv_row_2_0= RULE_INT ) )
                    // InternalSculpt.g:3051:1: (lv_row_2_0= RULE_INT )
                    {
                    // InternalSculpt.g:3051:1: (lv_row_2_0= RULE_INT )
                    // InternalSculpt.g:3052:3: lv_row_2_0= RULE_INT
                    {
                    lv_row_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_row_2_0, grammarAccess.getNe_Atomic_Node_TestAccess().getRowINTTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_Atomic_Node_TestRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"row",
                              		lv_row_2_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNe_Atomic_Node_TestAccess().getCommaKeyword_0_3());
                          
                    }
                    // InternalSculpt.g:3072:1: ( (lv_column_4_0= RULE_INT ) )
                    // InternalSculpt.g:3073:1: (lv_column_4_0= RULE_INT )
                    {
                    // InternalSculpt.g:3073:1: (lv_column_4_0= RULE_INT )
                    // InternalSculpt.g:3074:3: lv_column_4_0= RULE_INT
                    {
                    lv_column_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_column_4_0, grammarAccess.getNe_Atomic_Node_TestAccess().getColumnINTTerminalRuleCall_0_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_Atomic_Node_TestRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"column",
                              		lv_column_4_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNe_Atomic_Node_TestAccess().getRightParenthesisKeyword_0_5());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3095:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalSculpt.g:3095:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalSculpt.g:3095:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalSculpt.g:3095:7: ()
                    // InternalSculpt.g:3096:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNe_Atomic_Node_TestAccess().getNodeExpressionTokenAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:3101:2: ( (otherlv_7= RULE_ID ) )
                    // InternalSculpt.g:3102:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSculpt.g:3102:1: (otherlv_7= RULE_ID )
                    // InternalSculpt.g:3103:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNe_Atomic_Node_TestRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getNe_Atomic_Node_TestAccess().getTokenAbstractTokenCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNe_Atomic_Node_Test"


    // $ANTLR start "entryRulePath_Expression"
    // InternalSculpt.g:3122:1: entryRulePath_Expression returns [EObject current=null] : iv_rulePath_Expression= rulePath_Expression EOF ;
    public final EObject entryRulePath_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath_Expression = null;


        try {
            // InternalSculpt.g:3123:2: (iv_rulePath_Expression= rulePath_Expression EOF )
            // InternalSculpt.g:3124:2: iv_rulePath_Expression= rulePath_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPath_ExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePath_Expression=rulePath_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath_Expression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePath_Expression"


    // $ANTLR start "rulePath_Expression"
    // InternalSculpt.g:3131:1: rulePath_Expression returns [EObject current=null] : (this_Pe_Regex_0= rulePe_Regex ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )? ) ;
    public final EObject rulePath_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Pe_Regex_0 = null;

        EObject lv_rest_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3134:28: ( (this_Pe_Regex_0= rulePe_Regex ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )? ) )
            // InternalSculpt.g:3135:1: (this_Pe_Regex_0= rulePe_Regex ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )? )
            {
            // InternalSculpt.g:3135:1: (this_Pe_Regex_0= rulePe_Regex ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )? )
            // InternalSculpt.g:3136:5: this_Pe_Regex_0= rulePe_Regex ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPath_ExpressionAccess().getPe_RegexParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_Pe_Regex_0=rulePe_Regex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Pe_Regex_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3144:1: ( () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+ )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==56) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSculpt.g:3144:2: () (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+
                    {
                    // InternalSculpt.g:3144:2: ()
                    // InternalSculpt.g:3145:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPath_ExpressionAccess().getPathExpressionListFirstAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:3150:2: (otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==56) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalSculpt.g:3150:4: otherlv_2= '/' ( (lv_rest_3_0= rulePe_Regex ) )
                    	    {
                    	    otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getPath_ExpressionAccess().getSolidusKeyword_1_1_0());
                    	          
                    	    }
                    	    // InternalSculpt.g:3154:1: ( (lv_rest_3_0= rulePe_Regex ) )
                    	    // InternalSculpt.g:3155:1: (lv_rest_3_0= rulePe_Regex )
                    	    {
                    	    // InternalSculpt.g:3155:1: (lv_rest_3_0= rulePe_Regex )
                    	    // InternalSculpt.g:3156:3: lv_rest_3_0= rulePe_Regex
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPath_ExpressionAccess().getRestPe_RegexParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_rest_3_0=rulePe_Regex();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPath_ExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"rest",
                    	              		lv_rest_3_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.Pe_Regex");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePath_Expression"


    // $ANTLR start "entryRulePe_Regex"
    // InternalSculpt.g:3180:1: entryRulePe_Regex returns [EObject current=null] : iv_rulePe_Regex= rulePe_Regex EOF ;
    public final EObject entryRulePe_Regex() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePe_Regex = null;


        try {
            // InternalSculpt.g:3181:2: (iv_rulePe_Regex= rulePe_Regex EOF )
            // InternalSculpt.g:3182:2: iv_rulePe_Regex= rulePe_Regex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPe_RegexRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePe_Regex=rulePe_Regex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePe_Regex; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePe_Regex"


    // $ANTLR start "rulePe_Regex"
    // InternalSculpt.g:3189:1: rulePe_Regex returns [EObject current=null] : (this_Pe_Primitive_0= rulePe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) ;
    public final EObject rulePe_Regex() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Pe_Primitive_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3192:28: ( (this_Pe_Primitive_0= rulePe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) )
            // InternalSculpt.g:3193:1: (this_Pe_Primitive_0= rulePe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            {
            // InternalSculpt.g:3193:1: (this_Pe_Primitive_0= rulePe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            // InternalSculpt.g:3194:5: this_Pe_Primitive_0= rulePe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPe_RegexAccess().getPe_PrimitiveParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_50);
            this_Pe_Primitive_0=rulePe_Primitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Pe_Primitive_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3202:1: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            int alt50=4;
            switch ( input.LA(1) ) {
                case 64:
                    {
                    alt50=1;
                    }
                    break;
                case 38:
                    {
                    alt50=2;
                    }
                    break;
                case 65:
                    {
                    alt50=3;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // InternalSculpt.g:3202:2: ( () otherlv_2= '*' )
                    {
                    // InternalSculpt.g:3202:2: ( () otherlv_2= '*' )
                    // InternalSculpt.g:3202:3: () otherlv_2= '*'
                    {
                    // InternalSculpt.g:3202:3: ()
                    // InternalSculpt.g:3203:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPe_RegexAccess().getPathExpressionStarElementAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPe_RegexAccess().getAsteriskKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3213:6: ( () otherlv_4= '+' )
                    {
                    // InternalSculpt.g:3213:6: ( () otherlv_4= '+' )
                    // InternalSculpt.g:3213:7: () otherlv_4= '+'
                    {
                    // InternalSculpt.g:3213:7: ()
                    // InternalSculpt.g:3214:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPe_RegexAccess().getPathExpressionPlusElementAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPe_RegexAccess().getPlusSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:3224:6: ( () otherlv_6= '?' )
                    {
                    // InternalSculpt.g:3224:6: ( () otherlv_6= '?' )
                    // InternalSculpt.g:3224:7: () otherlv_6= '?'
                    {
                    // InternalSculpt.g:3224:7: ()
                    // InternalSculpt.g:3225:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPe_RegexAccess().getPathExpressionOptionElementAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPe_RegexAccess().getQuestionMarkKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePe_Regex"


    // $ANTLR start "entryRulePe_Primitive"
    // InternalSculpt.g:3242:1: entryRulePe_Primitive returns [EObject current=null] : iv_rulePe_Primitive= rulePe_Primitive EOF ;
    public final EObject entryRulePe_Primitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePe_Primitive = null;


        try {
            // InternalSculpt.g:3243:2: (iv_rulePe_Primitive= rulePe_Primitive EOF )
            // InternalSculpt.g:3244:2: iv_rulePe_Primitive= rulePe_Primitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPe_PrimitiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePe_Primitive=rulePe_Primitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePe_Primitive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePe_Primitive"


    // $ANTLR start "rulePe_Primitive"
    // InternalSculpt.g:3251:1: rulePe_Primitive returns [EObject current=null] : ( (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' ) | this_Pe_Atomic_3= rulePe_Atomic ) ;
    public final EObject rulePe_Primitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Pe_Or_1 = null;

        EObject this_Pe_Atomic_3 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3254:28: ( ( (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' ) | this_Pe_Atomic_3= rulePe_Atomic ) )
            // InternalSculpt.g:3255:1: ( (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' ) | this_Pe_Atomic_3= rulePe_Atomic )
            {
            // InternalSculpt.g:3255:1: ( (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' ) | this_Pe_Atomic_3= rulePe_Atomic )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=67 && LA51_0<=71)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSculpt.g:3255:2: (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' )
                    {
                    // InternalSculpt.g:3255:2: (otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')' )
                    // InternalSculpt.g:3255:4: otherlv_0= '(' this_Pe_Or_1= rulePe_Or otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPe_PrimitiveAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPe_PrimitiveAccess().getPe_OrParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_Pe_Or_1=rulePe_Or();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Pe_Or_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPe_PrimitiveAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3274:5: this_Pe_Atomic_3= rulePe_Atomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPe_PrimitiveAccess().getPe_AtomicParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Pe_Atomic_3=rulePe_Atomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Pe_Atomic_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePe_Primitive"


    // $ANTLR start "entryRulePe_Or"
    // InternalSculpt.g:3290:1: entryRulePe_Or returns [EObject current=null] : iv_rulePe_Or= rulePe_Or EOF ;
    public final EObject entryRulePe_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePe_Or = null;


        try {
            // InternalSculpt.g:3291:2: (iv_rulePe_Or= rulePe_Or EOF )
            // InternalSculpt.g:3292:2: iv_rulePe_Or= rulePe_Or EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPe_OrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePe_Or=rulePe_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePe_Or; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePe_Or"


    // $ANTLR start "rulePe_Or"
    // InternalSculpt.g:3299:1: rulePe_Or returns [EObject current=null] : (this_Path_Expression_0= rulePath_Expression ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )* ) ;
    public final EObject rulePe_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Path_Expression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3302:28: ( (this_Path_Expression_0= rulePath_Expression ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )* ) )
            // InternalSculpt.g:3303:1: (this_Path_Expression_0= rulePath_Expression ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )* )
            {
            // InternalSculpt.g:3303:1: (this_Path_Expression_0= rulePath_Expression ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )* )
            // InternalSculpt.g:3304:5: this_Path_Expression_0= rulePath_Expression ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPe_OrAccess().getPath_ExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_Path_Expression_0=rulePath_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Path_Expression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3312:1: ( () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==66) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSculpt.g:3312:2: () otherlv_2= '|' ( (lv_right_3_0= rulePath_Expression ) )
            	    {
            	    // InternalSculpt.g:3312:2: ()
            	    // InternalSculpt.g:3313:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPe_OrAccess().getPathExpressionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPe_OrAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // InternalSculpt.g:3322:1: ( (lv_right_3_0= rulePath_Expression ) )
            	    // InternalSculpt.g:3323:1: (lv_right_3_0= rulePath_Expression )
            	    {
            	    // InternalSculpt.g:3323:1: (lv_right_3_0= rulePath_Expression )
            	    // InternalSculpt.g:3324:3: lv_right_3_0= rulePath_Expression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPe_OrAccess().getRightPath_ExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_right_3_0=rulePath_Expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPe_OrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePe_Or"


    // $ANTLR start "entryRulePe_Atomic"
    // InternalSculpt.g:3348:1: entryRulePe_Atomic returns [EObject current=null] : iv_rulePe_Atomic= rulePe_Atomic EOF ;
    public final EObject entryRulePe_Atomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePe_Atomic = null;


        try {
            // InternalSculpt.g:3349:2: (iv_rulePe_Atomic= rulePe_Atomic EOF )
            // InternalSculpt.g:3350:2: iv_rulePe_Atomic= rulePe_Atomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPe_AtomicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePe_Atomic=rulePe_Atomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePe_Atomic; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePe_Atomic"


    // $ANTLR start "rulePe_Atomic"
    // InternalSculpt.g:3357:1: rulePe_Atomic returns [EObject current=null] : ( () ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) ) ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )? (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )? ) ;
    public final EObject rulePe_Atomic() throws RecognitionException {
        EObject current = null;

        Token lv_axes_1_1=null;
        Token lv_axes_1_2=null;
        Token lv_axes_1_3=null;
        Token lv_axes_1_4=null;
        Token lv_axes_1_5=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_node_test_3_0 = null;

        EObject lv_predicate_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3360:28: ( ( () ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) ) ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )? (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )? ) )
            // InternalSculpt.g:3361:1: ( () ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) ) ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )? (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )? )
            {
            // InternalSculpt.g:3361:1: ( () ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) ) ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )? (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )? )
            // InternalSculpt.g:3361:2: () ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) ) ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )? (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )?
            {
            // InternalSculpt.g:3361:2: ()
            // InternalSculpt.g:3362:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPe_AtomicAccess().getPathExpressionStepAction_0(),
                          current);
                  
            }

            }

            // InternalSculpt.g:3367:2: ( ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) ) )
            // InternalSculpt.g:3368:1: ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) )
            {
            // InternalSculpt.g:3368:1: ( (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' ) )
            // InternalSculpt.g:3369:1: (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' )
            {
            // InternalSculpt.g:3369:1: (lv_axes_1_1= 'right' | lv_axes_1_2= 'down' | lv_axes_1_3= 'left' | lv_axes_1_4= 'up' | lv_axes_1_5= 'self' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt53=1;
                }
                break;
            case 68:
                {
                alt53=2;
                }
                break;
            case 69:
                {
                alt53=3;
                }
                break;
            case 70:
                {
                alt53=4;
                }
                break;
            case 71:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalSculpt.g:3370:3: lv_axes_1_1= 'right'
                    {
                    lv_axes_1_1=(Token)match(input,67,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axes_1_1, grammarAccess.getPe_AtomicAccess().getAxesRightKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPe_AtomicRule());
                      	        }
                             		setWithLastConsumed(current, "axes", lv_axes_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3382:8: lv_axes_1_2= 'down'
                    {
                    lv_axes_1_2=(Token)match(input,68,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axes_1_2, grammarAccess.getPe_AtomicAccess().getAxesDownKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPe_AtomicRule());
                      	        }
                             		setWithLastConsumed(current, "axes", lv_axes_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalSculpt.g:3394:8: lv_axes_1_3= 'left'
                    {
                    lv_axes_1_3=(Token)match(input,69,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axes_1_3, grammarAccess.getPe_AtomicAccess().getAxesLeftKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPe_AtomicRule());
                      	        }
                             		setWithLastConsumed(current, "axes", lv_axes_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalSculpt.g:3406:8: lv_axes_1_4= 'up'
                    {
                    lv_axes_1_4=(Token)match(input,70,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axes_1_4, grammarAccess.getPe_AtomicAccess().getAxesUpKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPe_AtomicRule());
                      	        }
                             		setWithLastConsumed(current, "axes", lv_axes_1_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // InternalSculpt.g:3418:8: lv_axes_1_5= 'self'
                    {
                    lv_axes_1_5=(Token)match(input,71,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axes_1_5, grammarAccess.getPe_AtomicAccess().getAxesSelfKeyword_1_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPe_AtomicRule());
                      	        }
                             		setWithLastConsumed(current, "axes", lv_axes_1_5, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalSculpt.g:3433:2: ( (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) ) | otherlv_4= '::*' )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==72) ) {
                alt54=1;
            }
            else if ( (LA54_0==73) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // InternalSculpt.g:3433:3: (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) )
                    {
                    // InternalSculpt.g:3433:3: (otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) ) )
                    // InternalSculpt.g:3433:5: otherlv_2= '::' ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) )
                    {
                    otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPe_AtomicAccess().getColonColonKeyword_2_0_0());
                          
                    }
                    // InternalSculpt.g:3437:1: ( (lv_node_test_3_0= ruleNe_Atomic_Node_Test ) )
                    // InternalSculpt.g:3438:1: (lv_node_test_3_0= ruleNe_Atomic_Node_Test )
                    {
                    // InternalSculpt.g:3438:1: (lv_node_test_3_0= ruleNe_Atomic_Node_Test )
                    // InternalSculpt.g:3439:3: lv_node_test_3_0= ruleNe_Atomic_Node_Test
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPe_AtomicAccess().getNode_testNe_Atomic_Node_TestParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_node_test_3_0=ruleNe_Atomic_Node_Test();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"node_test",
                              		lv_node_test_3_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Ne_Atomic_Node_Test");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3456:7: otherlv_4= '::*'
                    {
                    otherlv_4=(Token)match(input,73,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPe_AtomicAccess().getColonColonAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // InternalSculpt.g:3460:3: (otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSculpt.g:3460:5: otherlv_5= '[' ( (lv_predicate_6_0= ruleNodeExpression ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,62,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPe_AtomicAccess().getLeftSquareBracketKeyword_3_0());
                          
                    }
                    // InternalSculpt.g:3464:1: ( (lv_predicate_6_0= ruleNodeExpression ) )
                    // InternalSculpt.g:3465:1: (lv_predicate_6_0= ruleNodeExpression )
                    {
                    // InternalSculpt.g:3465:1: (lv_predicate_6_0= ruleNodeExpression )
                    // InternalSculpt.g:3466:3: lv_predicate_6_0= ruleNodeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPe_AtomicAccess().getPredicateNodeExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_predicate_6_0=ruleNodeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPe_AtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"predicate",
                              		lv_predicate_6_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPe_AtomicAccess().getRightSquareBracketKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePe_Atomic"


    // $ANTLR start "entryRuleContentExpression"
    // InternalSculpt.g:3494:1: entryRuleContentExpression returns [EObject current=null] : iv_ruleContentExpression= ruleContentExpression EOF ;
    public final EObject entryRuleContentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentExpression = null;


        try {
            // InternalSculpt.g:3495:2: (iv_ruleContentExpression= ruleContentExpression EOF )
            // InternalSculpt.g:3496:2: iv_ruleContentExpression= ruleContentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContentExpression=ruleContentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentExpression"


    // $ANTLR start "ruleContentExpression"
    // InternalSculpt.g:3503:1: ruleContentExpression returns [EObject current=null] : this_Ce_Or_0= ruleCe_Or ;
    public final EObject ruleContentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Ce_Or_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3506:28: (this_Ce_Or_0= ruleCe_Or )
            // InternalSculpt.g:3508:5: this_Ce_Or_0= ruleCe_Or
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getContentExpressionAccess().getCe_OrParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Ce_Or_0=ruleCe_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ce_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentExpression"


    // $ANTLR start "entryRuleCe_Or"
    // InternalSculpt.g:3524:1: entryRuleCe_Or returns [EObject current=null] : iv_ruleCe_Or= ruleCe_Or EOF ;
    public final EObject entryRuleCe_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_Or = null;


        try {
            // InternalSculpt.g:3525:2: (iv_ruleCe_Or= ruleCe_Or EOF )
            // InternalSculpt.g:3526:2: iv_ruleCe_Or= ruleCe_Or EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_OrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_Or=ruleCe_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_Or; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_Or"


    // $ANTLR start "ruleCe_Or"
    // InternalSculpt.g:3533:1: ruleCe_Or returns [EObject current=null] : (this_Ce_List_0= ruleCe_List ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )* ) ;
    public final EObject ruleCe_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Ce_List_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3536:28: ( (this_Ce_List_0= ruleCe_List ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )* ) )
            // InternalSculpt.g:3537:1: (this_Ce_List_0= ruleCe_List ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )* )
            {
            // InternalSculpt.g:3537:1: (this_Ce_List_0= ruleCe_List ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )* )
            // InternalSculpt.g:3538:5: this_Ce_List_0= ruleCe_List ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCe_OrAccess().getCe_ListParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_Ce_List_0=ruleCe_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ce_List_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3546:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==66) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSculpt.g:3546:2: () otherlv_2= '|' ( (lv_right_3_0= ruleCe_List ) )
            	    {
            	    // InternalSculpt.g:3546:2: ()
            	    // InternalSculpt.g:3547:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCe_OrAccess().getContentExpressionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCe_OrAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // InternalSculpt.g:3556:1: ( (lv_right_3_0= ruleCe_List ) )
            	    // InternalSculpt.g:3557:1: (lv_right_3_0= ruleCe_List )
            	    {
            	    // InternalSculpt.g:3557:1: (lv_right_3_0= ruleCe_List )
            	    // InternalSculpt.g:3558:3: lv_right_3_0= ruleCe_List
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCe_OrAccess().getRightCe_ListParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_right_3_0=ruleCe_List();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCe_OrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Ce_List");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_Or"


    // $ANTLR start "entryRuleCe_List"
    // InternalSculpt.g:3582:1: entryRuleCe_List returns [EObject current=null] : iv_ruleCe_List= ruleCe_List EOF ;
    public final EObject entryRuleCe_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_List = null;


        try {
            // InternalSculpt.g:3583:2: (iv_ruleCe_List= ruleCe_List EOF )
            // InternalSculpt.g:3584:2: iv_ruleCe_List= ruleCe_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_ListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_List=ruleCe_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_List; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_List"


    // $ANTLR start "ruleCe_List"
    // InternalSculpt.g:3591:1: ruleCe_List returns [EObject current=null] : (this_Ce_Recursive_0= ruleCe_Recursive ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )* ) ;
    public final EObject ruleCe_List() throws RecognitionException {
        EObject current = null;

        EObject this_Ce_Recursive_0 = null;

        EObject lv_rest_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3594:28: ( (this_Ce_Recursive_0= ruleCe_Recursive ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )* ) )
            // InternalSculpt.g:3595:1: (this_Ce_Recursive_0= ruleCe_Recursive ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )* )
            {
            // InternalSculpt.g:3595:1: (this_Ce_Recursive_0= ruleCe_Recursive ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )* )
            // InternalSculpt.g:3596:5: this_Ce_Recursive_0= ruleCe_Recursive ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCe_ListAccess().getCe_RecursiveParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_55);
            this_Ce_Recursive_0=ruleCe_Recursive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ce_Recursive_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3604:1: ( () ( (lv_rest_2_0= ruleCe_Recursive ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)||LA57_0==57||(LA57_0>=74 && LA57_0<=77)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalSculpt.g:3604:2: () ( (lv_rest_2_0= ruleCe_Recursive ) )
            	    {
            	    // InternalSculpt.g:3604:2: ()
            	    // InternalSculpt.g:3605:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCe_ListAccess().getContentExpressionListFirstAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSculpt.g:3610:2: ( (lv_rest_2_0= ruleCe_Recursive ) )
            	    // InternalSculpt.g:3611:1: (lv_rest_2_0= ruleCe_Recursive )
            	    {
            	    // InternalSculpt.g:3611:1: (lv_rest_2_0= ruleCe_Recursive )
            	    // InternalSculpt.g:3612:3: lv_rest_2_0= ruleCe_Recursive
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCe_ListAccess().getRestCe_RecursiveParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_rest_2_0=ruleCe_Recursive();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCe_ListRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rest",
            	              		lv_rest_2_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Ce_Recursive");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_List"


    // $ANTLR start "entryRuleCe_Recursive"
    // InternalSculpt.g:3636:1: entryRuleCe_Recursive returns [EObject current=null] : iv_ruleCe_Recursive= ruleCe_Recursive EOF ;
    public final EObject entryRuleCe_Recursive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_Recursive = null;


        try {
            // InternalSculpt.g:3637:2: (iv_ruleCe_Recursive= ruleCe_Recursive EOF )
            // InternalSculpt.g:3638:2: iv_ruleCe_Recursive= ruleCe_Recursive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_RecursiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_Recursive=ruleCe_Recursive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_Recursive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_Recursive"


    // $ANTLR start "ruleCe_Recursive"
    // InternalSculpt.g:3645:1: ruleCe_Recursive returns [EObject current=null] : (this_Ce_Primitive_0= ruleCe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) ;
    public final EObject ruleCe_Recursive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Ce_Primitive_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3648:28: ( (this_Ce_Primitive_0= ruleCe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) )
            // InternalSculpt.g:3649:1: (this_Ce_Primitive_0= ruleCe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            {
            // InternalSculpt.g:3649:1: (this_Ce_Primitive_0= ruleCe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            // InternalSculpt.g:3650:5: this_Ce_Primitive_0= ruleCe_Primitive ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCe_RecursiveAccess().getCe_PrimitiveParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_50);
            this_Ce_Primitive_0=ruleCe_Primitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Ce_Primitive_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:3658:1: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            int alt58=4;
            switch ( input.LA(1) ) {
                case 64:
                    {
                    alt58=1;
                    }
                    break;
                case 38:
                    {
                    alt58=2;
                    }
                    break;
                case 65:
                    {
                    alt58=3;
                    }
                    break;
            }

            switch (alt58) {
                case 1 :
                    // InternalSculpt.g:3658:2: ( () otherlv_2= '*' )
                    {
                    // InternalSculpt.g:3658:2: ( () otherlv_2= '*' )
                    // InternalSculpt.g:3658:3: () otherlv_2= '*'
                    {
                    // InternalSculpt.g:3658:3: ()
                    // InternalSculpt.g:3659:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCe_RecursiveAccess().getContentExpressionStarElementAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCe_RecursiveAccess().getAsteriskKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3669:6: ( () otherlv_4= '+' )
                    {
                    // InternalSculpt.g:3669:6: ( () otherlv_4= '+' )
                    // InternalSculpt.g:3669:7: () otherlv_4= '+'
                    {
                    // InternalSculpt.g:3669:7: ()
                    // InternalSculpt.g:3670:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCe_RecursiveAccess().getContentExpressionPlusElementAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCe_RecursiveAccess().getPlusSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:3680:6: ( () otherlv_6= '?' )
                    {
                    // InternalSculpt.g:3680:6: ( () otherlv_6= '?' )
                    // InternalSculpt.g:3680:7: () otherlv_6= '?'
                    {
                    // InternalSculpt.g:3680:7: ()
                    // InternalSculpt.g:3681:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCe_RecursiveAccess().getContentExpressionOptionElementAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCe_RecursiveAccess().getQuestionMarkKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_Recursive"


    // $ANTLR start "entryRuleCe_Primitive"
    // InternalSculpt.g:3698:1: entryRuleCe_Primitive returns [EObject current=null] : iv_ruleCe_Primitive= ruleCe_Primitive EOF ;
    public final EObject entryRuleCe_Primitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_Primitive = null;


        try {
            // InternalSculpt.g:3699:2: (iv_ruleCe_Primitive= ruleCe_Primitive EOF )
            // InternalSculpt.g:3700:2: iv_ruleCe_Primitive= ruleCe_Primitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_PrimitiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_Primitive=ruleCe_Primitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_Primitive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_Primitive"


    // $ANTLR start "ruleCe_Primitive"
    // InternalSculpt.g:3707:1: ruleCe_Primitive returns [EObject current=null] : ( (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' ) | this_Ce_Comparison_3= ruleCe_Comparison | this_Ce_Atomic_4= ruleCe_Atomic ) ;
    public final EObject ruleCe_Primitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ContentExpression_1 = null;

        EObject this_Ce_Comparison_3 = null;

        EObject this_Ce_Atomic_4 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3710:28: ( ( (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' ) | this_Ce_Comparison_3= ruleCe_Comparison | this_Ce_Atomic_4= ruleCe_Atomic ) )
            // InternalSculpt.g:3711:1: ( (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' ) | this_Ce_Comparison_3= ruleCe_Comparison | this_Ce_Atomic_4= ruleCe_Atomic )
            {
            // InternalSculpt.g:3711:1: ( (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' ) | this_Ce_Comparison_3= ruleCe_Comparison | this_Ce_Atomic_4= ruleCe_Atomic )
            int alt59=3;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalSculpt.g:3711:2: (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' )
                    {
                    // InternalSculpt.g:3711:2: (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' )
                    // InternalSculpt.g:3711:4: otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCe_PrimitiveAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCe_PrimitiveAccess().getContentExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_ContentExpression_1=ruleContentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContentExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCe_PrimitiveAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3730:5: this_Ce_Comparison_3= ruleCe_Comparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCe_PrimitiveAccess().getCe_ComparisonParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ce_Comparison_3=ruleCe_Comparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ce_Comparison_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSculpt.g:3740:5: this_Ce_Atomic_4= ruleCe_Atomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCe_PrimitiveAccess().getCe_AtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Ce_Atomic_4=ruleCe_Atomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ce_Atomic_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_Primitive"


    // $ANTLR start "entryRuleCe_Atomic"
    // InternalSculpt.g:3756:1: entryRuleCe_Atomic returns [EObject current=null] : iv_ruleCe_Atomic= ruleCe_Atomic EOF ;
    public final EObject entryRuleCe_Atomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_Atomic = null;


        try {
            // InternalSculpt.g:3757:2: (iv_ruleCe_Atomic= ruleCe_Atomic EOF )
            // InternalSculpt.g:3758:2: iv_ruleCe_Atomic= ruleCe_Atomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_AtomicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_Atomic=ruleCe_Atomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_Atomic; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_Atomic"


    // $ANTLR start "ruleCe_Atomic"
    // InternalSculpt.g:3765:1: ruleCe_Atomic returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) ) ;
    public final EObject ruleCe_Atomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_string_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:3768:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) ) )
            // InternalSculpt.g:3769:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) )
            {
            // InternalSculpt.g:3769:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt60=1;
                }
                break;
            case RULE_STRING:
                {
                alt60=2;
                }
                break;
            case 74:
                {
                alt60=3;
                }
                break;
            case 75:
                {
                alt60=4;
                }
                break;
            case 76:
                {
                alt60=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSculpt.g:3769:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalSculpt.g:3769:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalSculpt.g:3769:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSculpt.g:3769:3: ()
                    // InternalSculpt.g:3770:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_AtomicAccess().getContentExpressionTokenAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:3775:2: ( (otherlv_1= RULE_ID ) )
                    // InternalSculpt.g:3776:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSculpt.g:3776:1: (otherlv_1= RULE_ID )
                    // InternalSculpt.g:3777:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_AtomicRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getCe_AtomicAccess().getTokenTokenCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3789:6: ( () ( (lv_string_3_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:3789:6: ( () ( (lv_string_3_0= RULE_STRING ) ) )
                    // InternalSculpt.g:3789:7: () ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:3789:7: ()
                    // InternalSculpt.g:3790:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_AtomicAccess().getContentExpressionStringAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:3795:2: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalSculpt.g:3796:1: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalSculpt.g:3796:1: (lv_string_3_0= RULE_STRING )
                    // InternalSculpt.g:3797:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_3_0, grammarAccess.getCe_AtomicAccess().getStringSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:3814:6: ( () otherlv_5= 'ANY' )
                    {
                    // InternalSculpt.g:3814:6: ( () otherlv_5= 'ANY' )
                    // InternalSculpt.g:3814:7: () otherlv_5= 'ANY'
                    {
                    // InternalSculpt.g:3814:7: ()
                    // InternalSculpt.g:3815:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_AtomicAccess().getContentExpressionANYAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCe_AtomicAccess().getANYKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSculpt.g:3825:6: ( () otherlv_7= 'EMPTY' )
                    {
                    // InternalSculpt.g:3825:6: ( () otherlv_7= 'EMPTY' )
                    // InternalSculpt.g:3825:7: () otherlv_7= 'EMPTY'
                    {
                    // InternalSculpt.g:3825:7: ()
                    // InternalSculpt.g:3826:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_AtomicAccess().getContentExpressionEMPTYAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCe_AtomicAccess().getEMPTYKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSculpt.g:3836:6: ( () otherlv_9= 'SOMETHING' )
                    {
                    // InternalSculpt.g:3836:6: ( () otherlv_9= 'SOMETHING' )
                    // InternalSculpt.g:3836:7: () otherlv_9= 'SOMETHING'
                    {
                    // InternalSculpt.g:3836:7: ()
                    // InternalSculpt.g:3837:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_AtomicAccess().getContentExpressionSOMETHINGAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCe_AtomicAccess().getSOMETHINGKeyword_4_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_Atomic"


    // $ANTLR start "entryRuleCe_Comparison"
    // InternalSculpt.g:3854:1: entryRuleCe_Comparison returns [EObject current=null] : iv_ruleCe_Comparison= ruleCe_Comparison EOF ;
    public final EObject entryRuleCe_Comparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe_Comparison = null;


        try {
            // InternalSculpt.g:3855:2: (iv_ruleCe_Comparison= ruleCe_Comparison EOF )
            // InternalSculpt.g:3856:2: iv_ruleCe_Comparison= ruleCe_Comparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCe_ComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCe_Comparison=ruleCe_Comparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCe_Comparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCe_Comparison"


    // $ANTLR start "ruleCe_Comparison"
    // InternalSculpt.g:3863:1: ruleCe_Comparison returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' ) | ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleCe_Comparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_value_14_0=null;
        Token otherlv_16=null;
        EObject lv_typeSpecifier_1_0 = null;

        Enumerator lv_comp_2_0 = null;

        EObject lv_typeSpecifier_6_0 = null;

        Enumerator lv_comp_7_0 = null;

        EObject lv_path_9_0 = null;

        EObject lv_path_13_0 = null;

        Enumerator lv_comp_15_0 = null;

        EObject lv_typeSpecifier_17_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:3866:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' ) | ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* ) ) )
            // InternalSculpt.g:3867:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' ) | ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* ) )
            {
            // InternalSculpt.g:3867:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' ) | ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case 57:
                {
                alt65=2;
                }
                break;
            case RULE_STRING:
            case 77:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalSculpt.g:3867:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:3867:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalSculpt.g:3867:3: ( (otherlv_0= RULE_ID ) ) ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )* ( (lv_comp_2_0= ruleComparator ) ) ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:3867:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSculpt.g:3868:1: (otherlv_0= RULE_ID )
                    {
                    // InternalSculpt.g:3868:1: (otherlv_0= RULE_ID )
                    // InternalSculpt.g:3869:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_ComparisonRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getCe_ComparisonAccess().getTypeTypeCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:3880:2: ( (lv_typeSpecifier_1_0= ruleTypeSpecifier ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=61 && LA61_0<=62)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalSculpt.g:3881:1: (lv_typeSpecifier_1_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:3881:1: (lv_typeSpecifier_1_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:3882:3: lv_typeSpecifier_1_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierTypeSpecifierParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
                    	    lv_typeSpecifier_1_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_1_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    // InternalSculpt.g:3898:3: ( (lv_comp_2_0= ruleComparator ) )
                    // InternalSculpt.g:3899:1: (lv_comp_2_0= ruleComparator )
                    {
                    // InternalSculpt.g:3899:1: (lv_comp_2_0= ruleComparator )
                    // InternalSculpt.g:3900:3: lv_comp_2_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getCompComparatorEnumRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_comp_2_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"comp",
                              		lv_comp_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:3916:2: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalSculpt.g:3917:1: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalSculpt.g:3917:1: (lv_value_3_0= RULE_STRING )
                    // InternalSculpt.g:3918:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getCe_ComparisonAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_ComparisonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:3935:6: (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' )
                    {
                    // InternalSculpt.g:3935:6: (otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')' )
                    // InternalSculpt.g:3935:8: otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )* ( (lv_comp_7_0= ruleComparator ) ) otherlv_8= './' ( (lv_path_9_0= rulePath_Expression ) ) otherlv_10= ')'
                    {
                    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCe_ComparisonAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalSculpt.g:3939:1: ( (otherlv_5= RULE_ID ) )
                    // InternalSculpt.g:3940:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSculpt.g:3940:1: (otherlv_5= RULE_ID )
                    // InternalSculpt.g:3941:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_ComparisonRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getCe_ComparisonAccess().getTypeTypeCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:3952:2: ( (lv_typeSpecifier_6_0= ruleTypeSpecifier ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=61 && LA62_0<=62)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalSculpt.g:3953:1: (lv_typeSpecifier_6_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:3953:1: (lv_typeSpecifier_6_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:3954:3: lv_typeSpecifier_6_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierTypeSpecifierParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
                    	    lv_typeSpecifier_6_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_6_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    // InternalSculpt.g:3970:3: ( (lv_comp_7_0= ruleComparator ) )
                    // InternalSculpt.g:3971:1: (lv_comp_7_0= ruleComparator )
                    {
                    // InternalSculpt.g:3971:1: (lv_comp_7_0= ruleComparator )
                    // InternalSculpt.g:3972:3: lv_comp_7_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getCompComparatorEnumRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_comp_7_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"comp",
                              		lv_comp_7_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,77,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCe_ComparisonAccess().getFullStopSolidusKeyword_1_4());
                          
                    }
                    // InternalSculpt.g:3992:1: ( (lv_path_9_0= rulePath_Expression ) )
                    // InternalSculpt.g:3993:1: (lv_path_9_0= rulePath_Expression )
                    {
                    // InternalSculpt.g:3993:1: (lv_path_9_0= rulePath_Expression )
                    // InternalSculpt.g:3994:3: lv_path_9_0= rulePath_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getPathPath_ExpressionParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_path_9_0=rulePath_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_9_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCe_ComparisonAccess().getRightParenthesisKeyword_1_6());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:4015:6: ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* )
                    {
                    // InternalSculpt.g:4015:6: ( () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )* )
                    // InternalSculpt.g:4015:7: () ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) ) ( (lv_comp_15_0= ruleComparator ) ) ( (otherlv_16= RULE_ID ) ) ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )*
                    {
                    // InternalSculpt.g:4015:7: ()
                    // InternalSculpt.g:4016:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCe_ComparisonAccess().getContentExpressionComparisonR2LAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:4021:2: ( (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) ) | ( (lv_value_14_0= RULE_STRING ) ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==77) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_STRING) ) {
                        alt63=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalSculpt.g:4021:3: (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) )
                            {
                            // InternalSculpt.g:4021:3: (otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) ) )
                            // InternalSculpt.g:4021:5: otherlv_12= './' ( (lv_path_13_0= rulePath_Expression ) )
                            {
                            otherlv_12=(Token)match(input,77,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getCe_ComparisonAccess().getFullStopSolidusKeyword_2_1_0_0());
                                  
                            }
                            // InternalSculpt.g:4025:1: ( (lv_path_13_0= rulePath_Expression ) )
                            // InternalSculpt.g:4026:1: (lv_path_13_0= rulePath_Expression )
                            {
                            // InternalSculpt.g:4026:1: (lv_path_13_0= rulePath_Expression )
                            // InternalSculpt.g:4027:3: lv_path_13_0= rulePath_Expression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getPathPath_ExpressionParserRuleCall_2_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_path_13_0=rulePath_Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"path",
                                      		lv_path_13_0, 
                                      		"de.ubt.ai7.csv_validator.Sculpt.Path_Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSculpt.g:4044:6: ( (lv_value_14_0= RULE_STRING ) )
                            {
                            // InternalSculpt.g:4044:6: ( (lv_value_14_0= RULE_STRING ) )
                            // InternalSculpt.g:4045:1: (lv_value_14_0= RULE_STRING )
                            {
                            // InternalSculpt.g:4045:1: (lv_value_14_0= RULE_STRING )
                            // InternalSculpt.g:4046:3: lv_value_14_0= RULE_STRING
                            {
                            lv_value_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_14_0, grammarAccess.getCe_ComparisonAccess().getValueSTRINGTerminalRuleCall_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCe_ComparisonRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_14_0, 
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSculpt.g:4062:3: ( (lv_comp_15_0= ruleComparator ) )
                    // InternalSculpt.g:4063:1: (lv_comp_15_0= ruleComparator )
                    {
                    // InternalSculpt.g:4063:1: (lv_comp_15_0= ruleComparator )
                    // InternalSculpt.g:4064:3: lv_comp_15_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getCompComparatorEnumRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_comp_15_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"comp",
                              		lv_comp_15_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:4080:2: ( (otherlv_16= RULE_ID ) )
                    // InternalSculpt.g:4081:1: (otherlv_16= RULE_ID )
                    {
                    // InternalSculpt.g:4081:1: (otherlv_16= RULE_ID )
                    // InternalSculpt.g:4082:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCe_ComparisonRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_16, grammarAccess.getCe_ComparisonAccess().getTypeTypeCrossReference_2_3_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:4093:2: ( (lv_typeSpecifier_17_0= ruleTypeSpecifier ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=61 && LA64_0<=62)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalSculpt.g:4094:1: (lv_typeSpecifier_17_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:4094:1: (lv_typeSpecifier_17_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:4095:3: lv_typeSpecifier_17_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCe_ComparisonAccess().getTypeSpecifierTypeSpecifierParserRuleCall_2_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    lv_typeSpecifier_17_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCe_ComparisonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_17_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCe_Comparison"


    // $ANTLR start "entryRuleTLVariable"
    // InternalSculpt.g:4119:1: entryRuleTLVariable returns [EObject current=null] : iv_ruleTLVariable= ruleTLVariable EOF ;
    public final EObject entryRuleTLVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLVariable = null;


        try {
            // InternalSculpt.g:4120:2: (iv_ruleTLVariable= ruleTLVariable EOF )
            // InternalSculpt.g:4121:2: iv_ruleTLVariable= ruleTLVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLVariable=ruleTLVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLVariable"


    // $ANTLR start "ruleTLVariable"
    // InternalSculpt.g:4128:1: ruleTLVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTLVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:4131:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSculpt.g:4132:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSculpt.g:4132:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalSculpt.g:4133:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSculpt.g:4133:1: (lv_name_0_0= RULE_ID )
            // InternalSculpt.g:4134:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTLVariableAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTLVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLVariable"


    // $ANTLR start "entryRuleTLOutputPrimitive"
    // InternalSculpt.g:4158:1: entryRuleTLOutputPrimitive returns [EObject current=null] : iv_ruleTLOutputPrimitive= ruleTLOutputPrimitive EOF ;
    public final EObject entryRuleTLOutputPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLOutputPrimitive = null;


        try {
            // InternalSculpt.g:4159:2: (iv_ruleTLOutputPrimitive= ruleTLOutputPrimitive EOF )
            // InternalSculpt.g:4160:2: iv_ruleTLOutputPrimitive= ruleTLOutputPrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLOutputPrimitiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLOutputPrimitive=ruleTLOutputPrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLOutputPrimitive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLOutputPrimitive"


    // $ANTLR start "ruleTLOutputPrimitive"
    // InternalSculpt.g:4167:1: ruleTLOutputPrimitive returns [EObject current=null] : ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleTLOutputPrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token otherlv_3=null;
        EObject lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4170:28: ( ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) )
            // InternalSculpt.g:4171:1: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            {
            // InternalSculpt.g:4171:1: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSculpt.g:4171:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:4171:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    // InternalSculpt.g:4171:3: () ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:4171:3: ()
                    // InternalSculpt.g:4172:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTLOutputPrimitiveAccess().getTLOutputConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:4177:2: ( (lv_text_1_0= RULE_STRING ) )
                    // InternalSculpt.g:4178:1: (lv_text_1_0= RULE_STRING )
                    {
                    // InternalSculpt.g:4178:1: (lv_text_1_0= RULE_STRING )
                    // InternalSculpt.g:4179:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_1_0, grammarAccess.getTLOutputPrimitiveAccess().getTextSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTLOutputPrimitiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:4196:6: ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    {
                    // InternalSculpt.g:4196:6: ( () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    // InternalSculpt.g:4196:7: () ( (otherlv_3= RULE_ID ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    {
                    // InternalSculpt.g:4196:7: ()
                    // InternalSculpt.g:4197:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTLOutputPrimitiveAccess().getTLOutputVariableAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:4202:2: ( (otherlv_3= RULE_ID ) )
                    // InternalSculpt.g:4203:1: (otherlv_3= RULE_ID )
                    {
                    // InternalSculpt.g:4203:1: (otherlv_3= RULE_ID )
                    // InternalSculpt.g:4204:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTLOutputPrimitiveRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getTLOutputPrimitiveAccess().getVariableTLVariableCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSculpt.g:4215:2: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=61 && LA66_0<=62)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalSculpt.g:4216:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    {
                    	    // InternalSculpt.g:4216:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    // InternalSculpt.g:4217:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTLOutputPrimitiveAccess().getTypeSpecifierTypeSpecifierParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    lv_typeSpecifier_4_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTLOutputPrimitiveRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_4_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLOutputPrimitive"


    // $ANTLR start "entryRuleTL_Ce_List"
    // InternalSculpt.g:4241:1: entryRuleTL_Ce_List returns [EObject current=null] : iv_ruleTL_Ce_List= ruleTL_Ce_List EOF ;
    public final EObject entryRuleTL_Ce_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTL_Ce_List = null;


        try {
            // InternalSculpt.g:4242:2: (iv_ruleTL_Ce_List= ruleTL_Ce_List EOF )
            // InternalSculpt.g:4243:2: iv_ruleTL_Ce_List= ruleTL_Ce_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTL_Ce_ListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTL_Ce_List=ruleTL_Ce_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTL_Ce_List; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTL_Ce_List"


    // $ANTLR start "ruleTL_Ce_List"
    // InternalSculpt.g:4250:1: ruleTL_Ce_List returns [EObject current=null] : ( () ( (lv_list_1_0= ruleTL_Ce_Recursive ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )* ) ;
    public final EObject ruleTL_Ce_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4253:28: ( ( () ( (lv_list_1_0= ruleTL_Ce_Recursive ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )* ) )
            // InternalSculpt.g:4254:1: ( () ( (lv_list_1_0= ruleTL_Ce_Recursive ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )* )
            {
            // InternalSculpt.g:4254:1: ( () ( (lv_list_1_0= ruleTL_Ce_Recursive ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )* )
            // InternalSculpt.g:4254:2: () ( (lv_list_1_0= ruleTL_Ce_Recursive ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )*
            {
            // InternalSculpt.g:4254:2: ()
            // InternalSculpt.g:4255:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTL_Ce_ListAccess().getTLContentExpressionListAction_0(),
                          current);
                  
            }

            }

            // InternalSculpt.g:4260:2: ( (lv_list_1_0= ruleTL_Ce_Recursive ) )
            // InternalSculpt.g:4261:1: (lv_list_1_0= ruleTL_Ce_Recursive )
            {
            // InternalSculpt.g:4261:1: (lv_list_1_0= ruleTL_Ce_Recursive )
            // InternalSculpt.g:4262:3: lv_list_1_0= ruleTL_Ce_Recursive
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTL_Ce_ListAccess().getListTL_Ce_RecursiveParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
            lv_list_1_0=ruleTL_Ce_Recursive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTL_Ce_ListRule());
              	        }
                     		add(
                     			current, 
                     			"list",
                      		lv_list_1_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TL_Ce_Recursive");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:4278:2: (otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==51) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSculpt.g:4278:4: otherlv_2= ',' ( (lv_list_3_0= ruleCe_Recursive ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTL_Ce_ListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalSculpt.g:4282:1: ( (lv_list_3_0= ruleCe_Recursive ) )
            	    // InternalSculpt.g:4283:1: (lv_list_3_0= ruleCe_Recursive )
            	    {
            	    // InternalSculpt.g:4283:1: (lv_list_3_0= ruleCe_Recursive )
            	    // InternalSculpt.g:4284:3: lv_list_3_0= ruleCe_Recursive
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTL_Ce_ListAccess().getListCe_RecursiveParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_list_3_0=ruleCe_Recursive();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTL_Ce_ListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"list",
            	              		lv_list_3_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.Ce_Recursive");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTL_Ce_List"


    // $ANTLR start "entryRuleTL_Ce_Recursive"
    // InternalSculpt.g:4308:1: entryRuleTL_Ce_Recursive returns [EObject current=null] : iv_ruleTL_Ce_Recursive= ruleTL_Ce_Recursive EOF ;
    public final EObject entryRuleTL_Ce_Recursive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTL_Ce_Recursive = null;


        try {
            // InternalSculpt.g:4309:2: (iv_ruleTL_Ce_Recursive= ruleTL_Ce_Recursive EOF )
            // InternalSculpt.g:4310:2: iv_ruleTL_Ce_Recursive= ruleTL_Ce_Recursive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTL_Ce_RecursiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTL_Ce_Recursive=ruleTL_Ce_Recursive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTL_Ce_Recursive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTL_Ce_Recursive"


    // $ANTLR start "ruleTL_Ce_Recursive"
    // InternalSculpt.g:4317:1: ruleTL_Ce_Recursive returns [EObject current=null] : (this_TL_Ce_Atomic_0= ruleTL_Ce_Atomic ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) ;
    public final EObject ruleTL_Ce_Recursive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_TL_Ce_Atomic_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4320:28: ( (this_TL_Ce_Atomic_0= ruleTL_Ce_Atomic ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? ) )
            // InternalSculpt.g:4321:1: (this_TL_Ce_Atomic_0= ruleTL_Ce_Atomic ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            {
            // InternalSculpt.g:4321:1: (this_TL_Ce_Atomic_0= ruleTL_Ce_Atomic ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )? )
            // InternalSculpt.g:4322:5: this_TL_Ce_Atomic_0= ruleTL_Ce_Atomic ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTL_Ce_RecursiveAccess().getTL_Ce_AtomicParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_50);
            this_TL_Ce_Atomic_0=ruleTL_Ce_Atomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TL_Ce_Atomic_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSculpt.g:4330:1: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '+' ) | ( () otherlv_6= '?' ) )?
            int alt69=4;
            switch ( input.LA(1) ) {
                case 64:
                    {
                    alt69=1;
                    }
                    break;
                case 38:
                    {
                    alt69=2;
                    }
                    break;
                case 65:
                    {
                    alt69=3;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // InternalSculpt.g:4330:2: ( () otherlv_2= '*' )
                    {
                    // InternalSculpt.g:4330:2: ( () otherlv_2= '*' )
                    // InternalSculpt.g:4330:3: () otherlv_2= '*'
                    {
                    // InternalSculpt.g:4330:3: ()
                    // InternalSculpt.g:4331:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getTL_Ce_RecursiveAccess().getContentExpressionStarElementAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTL_Ce_RecursiveAccess().getAsteriskKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:4341:6: ( () otherlv_4= '+' )
                    {
                    // InternalSculpt.g:4341:6: ( () otherlv_4= '+' )
                    // InternalSculpt.g:4341:7: () otherlv_4= '+'
                    {
                    // InternalSculpt.g:4341:7: ()
                    // InternalSculpt.g:4342:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getTL_Ce_RecursiveAccess().getContentExpressionPlusElementAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTL_Ce_RecursiveAccess().getPlusSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:4352:6: ( () otherlv_6= '?' )
                    {
                    // InternalSculpt.g:4352:6: ( () otherlv_6= '?' )
                    // InternalSculpt.g:4352:7: () otherlv_6= '?'
                    {
                    // InternalSculpt.g:4352:7: ()
                    // InternalSculpt.g:4353:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getTL_Ce_RecursiveAccess().getContentExpressionOptionElementAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTL_Ce_RecursiveAccess().getQuestionMarkKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTL_Ce_Recursive"


    // $ANTLR start "entryRuleTL_Ce_Atomic"
    // InternalSculpt.g:4370:1: entryRuleTL_Ce_Atomic returns [EObject current=null] : iv_ruleTL_Ce_Atomic= ruleTL_Ce_Atomic EOF ;
    public final EObject entryRuleTL_Ce_Atomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTL_Ce_Atomic = null;


        try {
            // InternalSculpt.g:4371:2: (iv_ruleTL_Ce_Atomic= ruleTL_Ce_Atomic EOF )
            // InternalSculpt.g:4372:2: iv_ruleTL_Ce_Atomic= ruleTL_Ce_Atomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTL_Ce_AtomicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTL_Ce_Atomic=ruleTL_Ce_Atomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTL_Ce_Atomic; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTL_Ce_Atomic"


    // $ANTLR start "ruleTL_Ce_Atomic"
    // InternalSculpt.g:4379:1: ruleTL_Ce_Atomic returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) ) ;
    public final EObject ruleTL_Ce_Atomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_string_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // InternalSculpt.g:4382:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) ) )
            // InternalSculpt.g:4383:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) )
            {
            // InternalSculpt.g:4383:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_string_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'ANY' ) | ( () otherlv_7= 'EMPTY' ) | ( () otherlv_9= 'SOMETHING' ) )
            int alt70=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt70=1;
                }
                break;
            case RULE_STRING:
                {
                alt70=2;
                }
                break;
            case 74:
                {
                alt70=3;
                }
                break;
            case 75:
                {
                alt70=4;
                }
                break;
            case 76:
                {
                alt70=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalSculpt.g:4383:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalSculpt.g:4383:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalSculpt.g:4383:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSculpt.g:4383:3: ()
                    // InternalSculpt.g:4384:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTL_Ce_AtomicAccess().getContentExpressionTokenAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:4389:2: ( (otherlv_1= RULE_ID ) )
                    // InternalSculpt.g:4390:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSculpt.g:4390:1: (otherlv_1= RULE_ID )
                    // InternalSculpt.g:4391:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTL_Ce_AtomicRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getTL_Ce_AtomicAccess().getTokenTokenCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:4403:6: ( () ( (lv_string_3_0= RULE_STRING ) ) )
                    {
                    // InternalSculpt.g:4403:6: ( () ( (lv_string_3_0= RULE_STRING ) ) )
                    // InternalSculpt.g:4403:7: () ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalSculpt.g:4403:7: ()
                    // InternalSculpt.g:4404:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTL_Ce_AtomicAccess().getContentExpressionStringAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSculpt.g:4409:2: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalSculpt.g:4410:1: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalSculpt.g:4410:1: (lv_string_3_0= RULE_STRING )
                    // InternalSculpt.g:4411:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_3_0, grammarAccess.getTL_Ce_AtomicAccess().getStringSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTL_Ce_AtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:4428:6: ( () otherlv_5= 'ANY' )
                    {
                    // InternalSculpt.g:4428:6: ( () otherlv_5= 'ANY' )
                    // InternalSculpt.g:4428:7: () otherlv_5= 'ANY'
                    {
                    // InternalSculpt.g:4428:7: ()
                    // InternalSculpt.g:4429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTL_Ce_AtomicAccess().getContentExpressionANYAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTL_Ce_AtomicAccess().getANYKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSculpt.g:4439:6: ( () otherlv_7= 'EMPTY' )
                    {
                    // InternalSculpt.g:4439:6: ( () otherlv_7= 'EMPTY' )
                    // InternalSculpt.g:4439:7: () otherlv_7= 'EMPTY'
                    {
                    // InternalSculpt.g:4439:7: ()
                    // InternalSculpt.g:4440:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTL_Ce_AtomicAccess().getContentExpressionEMPTYAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTL_Ce_AtomicAccess().getEMPTYKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSculpt.g:4450:6: ( () otherlv_9= 'SOMETHING' )
                    {
                    // InternalSculpt.g:4450:6: ( () otherlv_9= 'SOMETHING' )
                    // InternalSculpt.g:4450:7: () otherlv_9= 'SOMETHING'
                    {
                    // InternalSculpt.g:4450:7: ()
                    // InternalSculpt.g:4451:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTL_Ce_AtomicAccess().getContentExpressionSOMETHINGAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTL_Ce_AtomicAccess().getSOMETHINGKeyword_4_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTL_Ce_Atomic"


    // $ANTLR start "entryRuleTLOutput"
    // InternalSculpt.g:4468:1: entryRuleTLOutput returns [EObject current=null] : iv_ruleTLOutput= ruleTLOutput EOF ;
    public final EObject entryRuleTLOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLOutput = null;


        try {
            // InternalSculpt.g:4469:2: (iv_ruleTLOutput= ruleTLOutput EOF )
            // InternalSculpt.g:4470:2: iv_ruleTLOutput= ruleTLOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLOutputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLOutput=ruleTLOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLOutput; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLOutput"


    // $ANTLR start "ruleTLOutput"
    // InternalSculpt.g:4477:1: ruleTLOutput returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= '(' ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleTLOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_primitives_2_0 = null;

        EObject lv_primitives_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4480:28: ( (otherlv_0= 'output' otherlv_1= '(' ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalSculpt.g:4481:1: (otherlv_0= 'output' otherlv_1= '(' ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalSculpt.g:4481:1: (otherlv_0= 'output' otherlv_1= '(' ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            // InternalSculpt.g:4481:3: otherlv_0= 'output' otherlv_1= '(' ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTLOutputAccess().getOutputKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTLOutputAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSculpt.g:4489:1: ( ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSculpt.g:4489:2: ( (lv_primitives_2_0= ruleTLOutputPrimitive ) ) (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )*
                    {
                    // InternalSculpt.g:4489:2: ( (lv_primitives_2_0= ruleTLOutputPrimitive ) )
                    // InternalSculpt.g:4490:1: (lv_primitives_2_0= ruleTLOutputPrimitive )
                    {
                    // InternalSculpt.g:4490:1: (lv_primitives_2_0= ruleTLOutputPrimitive )
                    // InternalSculpt.g:4491:3: lv_primitives_2_0= ruleTLOutputPrimitive
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTLOutputAccess().getPrimitivesTLOutputPrimitiveParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_primitives_2_0=ruleTLOutputPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTLOutputRule());
                      	        }
                             		add(
                             			current, 
                             			"primitives",
                              		lv_primitives_2_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.TLOutputPrimitive");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSculpt.g:4507:2: (otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==51) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalSculpt.g:4507:4: otherlv_3= ',' ( (lv_primitives_4_0= ruleTLOutputPrimitive ) )
                    	    {
                    	    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTLOutputAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalSculpt.g:4511:1: ( (lv_primitives_4_0= ruleTLOutputPrimitive ) )
                    	    // InternalSculpt.g:4512:1: (lv_primitives_4_0= ruleTLOutputPrimitive )
                    	    {
                    	    // InternalSculpt.g:4512:1: (lv_primitives_4_0= ruleTLOutputPrimitive )
                    	    // InternalSculpt.g:4513:3: lv_primitives_4_0= ruleTLOutputPrimitive
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTLOutputAccess().getPrimitivesTLOutputPrimitiveParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_59);
                    	    lv_primitives_4_0=ruleTLOutputPrimitive();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTLOutputRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"primitives",
                    	              		lv_primitives_4_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TLOutputPrimitive");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTLOutputAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTLOutputAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLOutput"


    // $ANTLR start "entryRuleTLLoop"
    // InternalSculpt.g:4545:1: entryRuleTLLoop returns [EObject current=null] : iv_ruleTLLoop= ruleTLLoop EOF ;
    public final EObject entryRuleTLLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLLoop = null;


        try {
            // InternalSculpt.g:4546:2: (iv_ruleTLLoop= ruleTLLoop EOF )
            // InternalSculpt.g:4547:2: iv_ruleTLLoop= ruleTLLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLLoopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLLoop=ruleTLLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLLoop; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLLoop"


    // $ANTLR start "ruleTLLoop"
    // InternalSculpt.g:4554:1: ruleTLLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= 'each' otherlv_2= '(' ( (lv_variables_3_0= ruleTLVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_region_8_0= ruleNodeExpression ) ) (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )? otherlv_14= '{' ( (lv_statements_15_0= ruleTLStatement ) )* otherlv_16= '}' ) ;
    public final EObject ruleTLLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_region_8_0 = null;

        Enumerator lv_mode_10_0 = null;

        EObject lv_contentExpression_12_0 = null;

        EObject lv_statements_15_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4557:28: ( (otherlv_0= 'for' otherlv_1= 'each' otherlv_2= '(' ( (lv_variables_3_0= ruleTLVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_region_8_0= ruleNodeExpression ) ) (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )? otherlv_14= '{' ( (lv_statements_15_0= ruleTLStatement ) )* otherlv_16= '}' ) )
            // InternalSculpt.g:4558:1: (otherlv_0= 'for' otherlv_1= 'each' otherlv_2= '(' ( (lv_variables_3_0= ruleTLVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_region_8_0= ruleNodeExpression ) ) (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )? otherlv_14= '{' ( (lv_statements_15_0= ruleTLStatement ) )* otherlv_16= '}' )
            {
            // InternalSculpt.g:4558:1: (otherlv_0= 'for' otherlv_1= 'each' otherlv_2= '(' ( (lv_variables_3_0= ruleTLVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_region_8_0= ruleNodeExpression ) ) (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )? otherlv_14= '{' ( (lv_statements_15_0= ruleTLStatement ) )* otherlv_16= '}' )
            // InternalSculpt.g:4558:3: otherlv_0= 'for' otherlv_1= 'each' otherlv_2= '(' ( (lv_variables_3_0= ruleTLVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_region_8_0= ruleNodeExpression ) ) (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )? otherlv_14= '{' ( (lv_statements_15_0= ruleTLStatement ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTLLoopAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTLLoopAccess().getEachKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTLLoopAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSculpt.g:4570:1: ( (lv_variables_3_0= ruleTLVariable ) )
            // InternalSculpt.g:4571:1: (lv_variables_3_0= ruleTLVariable )
            {
            // InternalSculpt.g:4571:1: (lv_variables_3_0= ruleTLVariable )
            // InternalSculpt.g:4572:3: lv_variables_3_0= ruleTLVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTLLoopAccess().getVariablesTLVariableParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_variables_3_0=ruleTLVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_3_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TLVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:4588:2: (otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==51) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSculpt.g:4588:4: otherlv_4= ',' ( (lv_variables_5_0= ruleTLVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTLLoopAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSculpt.g:4592:1: ( (lv_variables_5_0= ruleTLVariable ) )
            	    // InternalSculpt.g:4593:1: (lv_variables_5_0= ruleTLVariable )
            	    {
            	    // InternalSculpt.g:4593:1: (lv_variables_5_0= ruleTLVariable )
            	    // InternalSculpt.g:4594:3: lv_variables_5_0= ruleTLVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTLLoopAccess().getVariablesTLVariableParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_variables_5_0=ruleTLVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_5_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.TLVariable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_6=(Token)match(input,58,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTLLoopAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,81,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTLLoopAccess().getInKeyword_6());
                  
            }
            // InternalSculpt.g:4618:1: ( (lv_region_8_0= ruleNodeExpression ) )
            // InternalSculpt.g:4619:1: (lv_region_8_0= ruleNodeExpression )
            {
            // InternalSculpt.g:4619:1: (lv_region_8_0= ruleNodeExpression )
            // InternalSculpt.g:4620:3: lv_region_8_0= ruleNodeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTLLoopAccess().getRegionNodeExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_62);
            lv_region_8_0=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
              	        }
                     		set(
                     			current, 
                     			"region",
                      		lv_region_8_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSculpt.g:4636:2: (otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==61) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSculpt.g:4636:4: otherlv_9= '.' ( (lv_mode_10_0= ruleTLLoopMode ) ) otherlv_11= '(' ( (lv_contentExpression_12_0= ruleTL_Ce_List ) ) otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,61,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTLLoopAccess().getFullStopKeyword_8_0());
                          
                    }
                    // InternalSculpt.g:4640:1: ( (lv_mode_10_0= ruleTLLoopMode ) )
                    // InternalSculpt.g:4641:1: (lv_mode_10_0= ruleTLLoopMode )
                    {
                    // InternalSculpt.g:4641:1: (lv_mode_10_0= ruleTLLoopMode )
                    // InternalSculpt.g:4642:3: lv_mode_10_0= ruleTLLoopMode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTLLoopAccess().getModeTLLoopModeEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_mode_10_0=ruleTLLoopMode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
                      	        }
                             		set(
                             			current, 
                             			"mode",
                              		lv_mode_10_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.TLLoopMode");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,57,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTLLoopAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // InternalSculpt.g:4662:1: ( (lv_contentExpression_12_0= ruleTL_Ce_List ) )
                    // InternalSculpt.g:4663:1: (lv_contentExpression_12_0= ruleTL_Ce_List )
                    {
                    // InternalSculpt.g:4663:1: (lv_contentExpression_12_0= ruleTL_Ce_List )
                    // InternalSculpt.g:4664:3: lv_contentExpression_12_0= ruleTL_Ce_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTLLoopAccess().getContentExpressionTL_Ce_ListParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_contentExpression_12_0=ruleTL_Ce_List();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
                      	        }
                             		set(
                             			current, 
                             			"contentExpression",
                              		lv_contentExpression_12_0, 
                              		"de.ubt.ai7.csv_validator.Sculpt.TL_Ce_List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,58,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTLLoopAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,50,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getTLLoopAccess().getLeftCurlyBracketKeyword_9());
                  
            }
            // InternalSculpt.g:4688:1: ( (lv_statements_15_0= ruleTLStatement ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=78 && LA75_0<=79)||LA75_0==82) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalSculpt.g:4689:1: (lv_statements_15_0= ruleTLStatement )
            	    {
            	    // InternalSculpt.g:4689:1: (lv_statements_15_0= ruleTLStatement )
            	    // InternalSculpt.g:4690:3: lv_statements_15_0= ruleTLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTLLoopAccess().getStatementsTLStatementParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_statements_15_0=ruleTLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTLLoopRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_15_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.TLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_16=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getTLLoopAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLLoop"


    // $ANTLR start "entryRuleTLStatement"
    // InternalSculpt.g:4718:1: entryRuleTLStatement returns [EObject current=null] : iv_ruleTLStatement= ruleTLStatement EOF ;
    public final EObject entryRuleTLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLStatement = null;


        try {
            // InternalSculpt.g:4719:2: (iv_ruleTLStatement= ruleTLStatement EOF )
            // InternalSculpt.g:4720:2: iv_ruleTLStatement= ruleTLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLStatement=ruleTLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLStatement"


    // $ANTLR start "ruleTLStatement"
    // InternalSculpt.g:4727:1: ruleTLStatement returns [EObject current=null] : (this_TLOutput_0= ruleTLOutput | this_TLLoop_1= ruleTLLoop | this_TLIf_2= ruleTLIf ) ;
    public final EObject ruleTLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TLOutput_0 = null;

        EObject this_TLLoop_1 = null;

        EObject this_TLIf_2 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4730:28: ( (this_TLOutput_0= ruleTLOutput | this_TLLoop_1= ruleTLLoop | this_TLIf_2= ruleTLIf ) )
            // InternalSculpt.g:4731:1: (this_TLOutput_0= ruleTLOutput | this_TLLoop_1= ruleTLLoop | this_TLIf_2= ruleTLIf )
            {
            // InternalSculpt.g:4731:1: (this_TLOutput_0= ruleTLOutput | this_TLLoop_1= ruleTLLoop | this_TLIf_2= ruleTLIf )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt76=1;
                }
                break;
            case 79:
                {
                alt76=2;
                }
                break;
            case 82:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalSculpt.g:4732:5: this_TLOutput_0= ruleTLOutput
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTLStatementAccess().getTLOutputParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TLOutput_0=ruleTLOutput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TLOutput_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSculpt.g:4742:5: this_TLLoop_1= ruleTLLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTLStatementAccess().getTLLoopParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TLLoop_1=ruleTLLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TLLoop_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSculpt.g:4752:5: this_TLIf_2= ruleTLIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTLStatementAccess().getTLIfParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TLIf_2=ruleTLIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TLIf_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLStatement"


    // $ANTLR start "entryRuleTLIf"
    // InternalSculpt.g:4768:1: entryRuleTLIf returns [EObject current=null] : iv_ruleTLIf= ruleTLIf EOF ;
    public final EObject entryRuleTLIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLIf = null;


        try {
            // InternalSculpt.g:4769:2: (iv_ruleTLIf= ruleTLIf EOF )
            // InternalSculpt.g:4770:2: iv_ruleTLIf= ruleTLIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLIfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLIf=ruleTLIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLIf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLIf"


    // $ANTLR start "ruleTLIf"
    // InternalSculpt.g:4777:1: ruleTLIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifBlock_5_0= ruleTLStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleTLIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ifBlock_5_0 = null;

        EObject lv_elseBlock_9_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4780:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifBlock_5_0= ruleTLStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )? ) )
            // InternalSculpt.g:4781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifBlock_5_0= ruleTLStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )? )
            {
            // InternalSculpt.g:4781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifBlock_5_0= ruleTLStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )? )
            // InternalSculpt.g:4781:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifBlock_5_0= ruleTLStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTLIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTLIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSculpt.g:4789:1: ( (lv_condition_2_0= ruleTLBoolExpr ) )
            // InternalSculpt.g:4790:1: (lv_condition_2_0= ruleTLBoolExpr )
            {
            // InternalSculpt.g:4790:1: (lv_condition_2_0= ruleTLBoolExpr )
            // InternalSculpt.g:4791:3: lv_condition_2_0= ruleTLBoolExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTLIfAccess().getConditionTLBoolExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_condition_2_0=ruleTLBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTLIfRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TLBoolExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTLIfAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTLIfAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalSculpt.g:4815:1: ( (lv_ifBlock_5_0= ruleTLStatement ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=78 && LA77_0<=79)||LA77_0==82) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalSculpt.g:4816:1: (lv_ifBlock_5_0= ruleTLStatement )
            	    {
            	    // InternalSculpt.g:4816:1: (lv_ifBlock_5_0= ruleTLStatement )
            	    // InternalSculpt.g:4817:3: lv_ifBlock_5_0= ruleTLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTLIfAccess().getIfBlockTLStatementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_ifBlock_5_0=ruleTLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTLIfRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ifBlock",
            	              		lv_ifBlock_5_0, 
            	              		"de.ubt.ai7.csv_validator.Sculpt.TLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTLIfAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // InternalSculpt.g:4837:1: (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==83) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSculpt.g:4837:3: otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBlock_9_0= ruleTLStatement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTLIfAccess().getElseKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,50,FollowSets000.FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTLIfAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // InternalSculpt.g:4845:1: ( (lv_elseBlock_9_0= ruleTLStatement ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=78 && LA78_0<=79)||LA78_0==82) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalSculpt.g:4846:1: (lv_elseBlock_9_0= ruleTLStatement )
                    	    {
                    	    // InternalSculpt.g:4846:1: (lv_elseBlock_9_0= ruleTLStatement )
                    	    // InternalSculpt.g:4847:3: lv_elseBlock_9_0= ruleTLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTLIfAccess().getElseBlockTLStatementParserRuleCall_7_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_65);
                    	    lv_elseBlock_9_0=ruleTLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTLIfRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseBlock",
                    	              		lv_elseBlock_9_0, 
                    	              		"de.ubt.ai7.csv_validator.Sculpt.TLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTLIfAccess().getRightCurlyBracketKeyword_7_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLIf"


    // $ANTLR start "entryRuleTLBoolExpr"
    // InternalSculpt.g:4875:1: entryRuleTLBoolExpr returns [EObject current=null] : iv_ruleTLBoolExpr= ruleTLBoolExpr EOF ;
    public final EObject entryRuleTLBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLBoolExpr = null;


        try {
            // InternalSculpt.g:4876:2: (iv_ruleTLBoolExpr= ruleTLBoolExpr EOF )
            // InternalSculpt.g:4877:2: iv_ruleTLBoolExpr= ruleTLBoolExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLBoolExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLBoolExpr=ruleTLBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLBoolExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLBoolExpr"


    // $ANTLR start "ruleTLBoolExpr"
    // InternalSculpt.g:4884:1: ruleTLBoolExpr returns [EObject current=null] : ( ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot ) | this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty ) ;
    public final EObject ruleTLBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TLBoolExprNot_0 = null;

        EObject this_TLBoolExprEmpty_1 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4887:28: ( ( ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot ) | this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty ) )
            // InternalSculpt.g:4888:1: ( ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot ) | this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty )
            {
            // InternalSculpt.g:4888:1: ( ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot ) | this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty )
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalSculpt.g:4888:2: ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot )
                    {
                    // InternalSculpt.g:4888:2: ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot )
                    // InternalSculpt.g:4888:3: ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTLBoolExprAccess().getTLBoolExprNotParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TLBoolExprNot_0=ruleTLBoolExprNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TLBoolExprNot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:4899:5: this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTLBoolExprAccess().getTLBoolExprEmptyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TLBoolExprEmpty_1=ruleTLBoolExprEmpty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TLBoolExprEmpty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLBoolExpr"


    // $ANTLR start "entryRuleTLBoolExprNot"
    // InternalSculpt.g:4915:1: entryRuleTLBoolExprNot returns [EObject current=null] : iv_ruleTLBoolExprNot= ruleTLBoolExprNot EOF ;
    public final EObject entryRuleTLBoolExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLBoolExprNot = null;


        try {
            // InternalSculpt.g:4916:2: (iv_ruleTLBoolExprNot= ruleTLBoolExprNot EOF )
            // InternalSculpt.g:4917:2: iv_ruleTLBoolExprNot= ruleTLBoolExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLBoolExprNotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLBoolExprNot=ruleTLBoolExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLBoolExprNot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLBoolExprNot"


    // $ANTLR start "ruleTLBoolExprNot"
    // InternalSculpt.g:4924:1: ruleTLBoolExprNot returns [EObject current=null] : (otherlv_0= 'not' otherlv_1= '(' ( (lv_expression_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTLBoolExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4927:28: ( (otherlv_0= 'not' otherlv_1= '(' ( (lv_expression_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' ) )
            // InternalSculpt.g:4928:1: (otherlv_0= 'not' otherlv_1= '(' ( (lv_expression_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' )
            {
            // InternalSculpt.g:4928:1: (otherlv_0= 'not' otherlv_1= '(' ( (lv_expression_2_0= ruleTLBoolExpr ) ) otherlv_3= ')' )
            // InternalSculpt.g:4928:3: otherlv_0= 'not' otherlv_1= '(' ( (lv_expression_2_0= ruleTLBoolExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTLBoolExprNotAccess().getNotKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTLBoolExprNotAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSculpt.g:4936:1: ( (lv_expression_2_0= ruleTLBoolExpr ) )
            // InternalSculpt.g:4937:1: (lv_expression_2_0= ruleTLBoolExpr )
            {
            // InternalSculpt.g:4937:1: (lv_expression_2_0= ruleTLBoolExpr )
            // InternalSculpt.g:4938:3: lv_expression_2_0= ruleTLBoolExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTLBoolExprNotAccess().getExpressionTLBoolExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_expression_2_0=ruleTLBoolExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTLBoolExprNotRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.TLBoolExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTLBoolExprNotAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLBoolExprNot"


    // $ANTLR start "entryRuleTLBoolExprEmpty"
    // InternalSculpt.g:4966:1: entryRuleTLBoolExprEmpty returns [EObject current=null] : iv_ruleTLBoolExprEmpty= ruleTLBoolExprEmpty EOF ;
    public final EObject entryRuleTLBoolExprEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLBoolExprEmpty = null;


        try {
            // InternalSculpt.g:4967:2: (iv_ruleTLBoolExprEmpty= ruleTLBoolExprEmpty EOF )
            // InternalSculpt.g:4968:2: iv_ruleTLBoolExprEmpty= ruleTLBoolExprEmpty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTLBoolExprEmptyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTLBoolExprEmpty=ruleTLBoolExprEmpty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTLBoolExprEmpty; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTLBoolExprEmpty"


    // $ANTLR start "ruleTLBoolExprEmpty"
    // InternalSculpt.g:4975:1: ruleTLBoolExprEmpty returns [EObject current=null] : ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= 'is' otherlv_2= 'empty' ) ;
    public final EObject ruleTLBoolExprEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_region_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSculpt.g:4978:28: ( ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= 'is' otherlv_2= 'empty' ) )
            // InternalSculpt.g:4979:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= 'is' otherlv_2= 'empty' )
            {
            // InternalSculpt.g:4979:1: ( ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= 'is' otherlv_2= 'empty' )
            // InternalSculpt.g:4979:2: ( (lv_region_0_0= ruleNodeExpression ) ) otherlv_1= 'is' otherlv_2= 'empty'
            {
            // InternalSculpt.g:4979:2: ( (lv_region_0_0= ruleNodeExpression ) )
            // InternalSculpt.g:4980:1: (lv_region_0_0= ruleNodeExpression )
            {
            // InternalSculpt.g:4980:1: (lv_region_0_0= ruleNodeExpression )
            // InternalSculpt.g:4981:3: lv_region_0_0= ruleNodeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTLBoolExprEmptyAccess().getRegionNodeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_67);
            lv_region_0_0=ruleNodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTLBoolExprEmptyRule());
              	        }
                     		set(
                     			current, 
                     			"region",
                      		lv_region_0_0, 
                      		"de.ubt.ai7.csv_validator.Sculpt.NodeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTLBoolExprEmptyAccess().getIsKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTLBoolExprEmptyAccess().getEmptyKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLBoolExprEmpty"


    // $ANTLR start "ruleRowCol"
    // InternalSculpt.g:5013:1: ruleRowCol returns [Enumerator current=null] : ( (enumLiteral_0= 'row' ) | (enumLiteral_1= 'col' ) ) ;
    public final Enumerator ruleRowCol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSculpt.g:5015:28: ( ( (enumLiteral_0= 'row' ) | (enumLiteral_1= 'col' ) ) )
            // InternalSculpt.g:5016:1: ( (enumLiteral_0= 'row' ) | (enumLiteral_1= 'col' ) )
            {
            // InternalSculpt.g:5016:1: ( (enumLiteral_0= 'row' ) | (enumLiteral_1= 'col' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==85) ) {
                alt81=1;
            }
            else if ( (LA81_0==86) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalSculpt.g:5016:2: (enumLiteral_0= 'row' )
                    {
                    // InternalSculpt.g:5016:2: (enumLiteral_0= 'row' )
                    // InternalSculpt.g:5016:4: enumLiteral_0= 'row'
                    {
                    enumLiteral_0=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRowColAccess().getROWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRowColAccess().getROWEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:5022:6: (enumLiteral_1= 'col' )
                    {
                    // InternalSculpt.g:5022:6: (enumLiteral_1= 'col' )
                    // InternalSculpt.g:5022:8: enumLiteral_1= 'col'
                    {
                    enumLiteral_1=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRowColAccess().getCOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRowColAccess().getCOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRowCol"


    // $ANTLR start "ruleComparator"
    // InternalSculpt.g:5032:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalSculpt.g:5034:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSculpt.g:5035:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSculpt.g:5035:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt82=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt82=1;
                }
                break;
            case 87:
                {
                alt82=2;
                }
                break;
            case 18:
                {
                alt82=3;
                }
                break;
            case 45:
                {
                alt82=4;
                }
                break;
            case 88:
                {
                alt82=5;
                }
                break;
            case 89:
                {
                alt82=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalSculpt.g:5035:2: (enumLiteral_0= '<' )
                    {
                    // InternalSculpt.g:5035:2: (enumLiteral_0= '<' )
                    // InternalSculpt.g:5035:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getLTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:5041:6: (enumLiteral_1= '<=' )
                    {
                    // InternalSculpt.g:5041:6: (enumLiteral_1= '<=' )
                    // InternalSculpt.g:5041:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getLTEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getLTEQEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:5047:6: (enumLiteral_2= '=' )
                    {
                    // InternalSculpt.g:5047:6: (enumLiteral_2= '=' )
                    // InternalSculpt.g:5047:8: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSculpt.g:5053:6: (enumLiteral_3= '>' )
                    {
                    // InternalSculpt.g:5053:6: (enumLiteral_3= '>' )
                    // InternalSculpt.g:5053:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSculpt.g:5059:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSculpt.g:5059:6: (enumLiteral_4= '>=' )
                    // InternalSculpt.g:5059:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getGTEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getGTEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSculpt.g:5065:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSculpt.g:5065:6: (enumLiteral_5= '!=' )
                    // InternalSculpt.g:5065:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getNEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparatorAccess().getNEQEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "ruleValidationMode"
    // InternalSculpt.g:5075:1: ruleValidationMode returns [Enumerator current=null] : ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '|>' ) ) ;
    public final Enumerator ruleValidationMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSculpt.g:5077:28: ( ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '|>' ) ) )
            // InternalSculpt.g:5078:1: ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '|>' ) )
            {
            // InternalSculpt.g:5078:1: ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '|>' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt83=1;
                }
                break;
            case 91:
                {
                alt83=2;
                }
                break;
            case 92:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalSculpt.g:5078:2: (enumLiteral_0= '=>' )
                    {
                    // InternalSculpt.g:5078:2: (enumLiteral_0= '=>' )
                    // InternalSculpt.g:5078:4: enumLiteral_0= '=>'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValidationModeAccess().getCOMPLETEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValidationModeAccess().getCOMPLETEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:5084:6: (enumLiteral_1= '->' )
                    {
                    // InternalSculpt.g:5084:6: (enumLiteral_1= '->' )
                    // InternalSculpt.g:5084:8: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValidationModeAccess().getROW_BY_ROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValidationModeAccess().getROW_BY_ROWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSculpt.g:5090:6: (enumLiteral_2= '|>' )
                    {
                    // InternalSculpt.g:5090:6: (enumLiteral_2= '|>' )
                    // InternalSculpt.g:5090:8: enumLiteral_2= '|>'
                    {
                    enumLiteral_2=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValidationModeAccess().getCOLUMN_BY_COLUMNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValidationModeAccess().getCOLUMN_BY_COLUMNEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidationMode"


    // $ANTLR start "ruleTLLoopMode"
    // InternalSculpt.g:5100:1: ruleTLLoopMode returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'split' ) ) ;
    public final Enumerator ruleTLLoopMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSculpt.g:5102:28: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'split' ) ) )
            // InternalSculpt.g:5103:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'split' ) )
            {
            // InternalSculpt.g:5103:1: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'split' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==84) ) {
                alt84=1;
            }
            else if ( (LA84_0==93) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalSculpt.g:5103:2: (enumLiteral_0= 'is' )
                    {
                    // InternalSculpt.g:5103:2: (enumLiteral_0= 'is' )
                    // InternalSculpt.g:5103:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTLLoopModeAccess().getCOMPLETEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTLLoopModeAccess().getCOMPLETEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSculpt.g:5109:6: (enumLiteral_1= 'split' )
                    {
                    // InternalSculpt.g:5109:6: (enumLiteral_1= 'split' )
                    // InternalSculpt.g:5109:8: enumLiteral_1= 'split'
                    {
                    enumLiteral_1=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTLLoopModeAccess().getSPLITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTLLoopModeAccess().getSPLITEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTLLoopMode"

    // $ANTLR start synpred1_InternalSculpt
    public final void synpred1_InternalSculpt_fragment() throws RecognitionException {   
        // InternalSculpt.g:2306:4: ( ruleNe_Primitive )
        // InternalSculpt.g:2306:6: ruleNe_Primitive
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleNe_Primitive();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSculpt

    // $ANTLR start synpred2_InternalSculpt
    public final void synpred2_InternalSculpt_fragment() throws RecognitionException {   
        // InternalSculpt.g:4888:3: ( ruleTLBoolExprNot )
        // InternalSculpt.g:4888:5: ruleTLBoolExprNot
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleTLBoolExprNot();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSculpt

    // Delegated rules

    public final boolean synpred2_InternalSculpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSculpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSculpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSculpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\5\15\uffff";
    static final String dfa_4s = "\1\45\15\uffff";
    static final String dfa_5s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_6s = "\1\0\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\4\1\2\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\2\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 494:3: ( ({...}? => ( ({...}? => (otherlv_7= 'format' otherlv_8= '=' ( (lv_format_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'decimalChar' otherlv_11= '=' ( (lv_decimalChar_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'groupChar' otherlv_14= '=' ( (lv_groupChar_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'length' otherlv_17= '=' ( (lv_length_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'minLength' otherlv_20= '=' ( (lv_minLength_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'maxLength' otherlv_23= '=' ( (lv_maxLength_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_25= 'minimum' | otherlv_26= 'minInclusive' ) otherlv_27= '=' ( (lv_minimum_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_29= 'maximum' | otherlv_30= 'maxInclusive' ) otherlv_31= '=' ( (lv_maximum_32_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'minExclusive' otherlv_34= '=' ( (lv_minExclusive_35_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'maxExclusive' otherlv_37= '=' ( (lv_maxExclusive_38_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'default' otherlv_40= '=' ( (lv_defaultValue_41_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'empty' otherlv_43= '=' ( (lv_emptyValue_44_0= RULE_STRING ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==EOF||LA18_0==RULE_ID||(LA18_0>=13 && LA18_0<=16)||LA18_0==19) ) {s = 1;}

                        else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 0) ) {s = 2;}

                        else if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 1) ) {s = 3;}

                        else if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 2) ) {s = 4;}

                        else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 3) ) {s = 5;}

                        else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 4) ) {s = 6;}

                        else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 5) ) {s = 7;}

                        else if ( LA18_0 >= 30 && LA18_0 <= 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 6) ) {s = 8;}

                        else if ( LA18_0 >= 32 && LA18_0 <= 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 7) ) {s = 9;}

                        else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 8) ) {s = 10;}

                        else if ( LA18_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 9) ) {s = 11;}

                        else if ( LA18_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 10) ) {s = 12;}

                        else if ( LA18_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypeAccess().getUnorderedGroup_0_4(), 11) ) {s = 13;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\4\1\0\13\uffff";
    static final String dfa_10s = "\1\126\1\0\13\uffff";
    static final String dfa_11s = "\2\uffff\5\1\1\2\1\3\4\uffff";
    static final String dfa_12s = "\1\0\1\1\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\62\uffff\1\7\1\1\2\uffff\1\6\6\uffff\5\10\15\uffff\1\4\1\5",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2306:1: ( ( ( ( ruleNe_Primitive )=>this_Ne_Primitive_0= ruleNe_Primitive ) ( () (otherlv_2= '/' ( (lv_path_3_0= rulePath_Expression ) ) ) )? ) | ( () otherlv_5= '/' ( (lv_path_6_0= rulePath_Expression ) ) ) | ( () ( (lv_path_8_0= rulePath_Expression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==57) ) {s = 1;}

                        else if ( (LA39_0==RULE_ID) && (synpred1_InternalSculpt())) {s = 2;}

                        else if ( (LA39_0==RULE_STRING) && (synpred1_InternalSculpt())) {s = 3;}

                        else if ( (LA39_0==85) && (synpred1_InternalSculpt())) {s = 4;}

                        else if ( (LA39_0==86) && (synpred1_InternalSculpt())) {s = 5;}

                        else if ( (LA39_0==60) && (synpred1_InternalSculpt())) {s = 6;}

                        else if ( (LA39_0==56) ) {s = 7;}

                        else if ( ((LA39_0>=67 && LA39_0<=71)) ) {s = 8;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSculpt()) ) {s = 6;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\1\5\1\uffff\2\71\1\uffff\1\4\3\uffff\1\63\2\uffff";
    static final String dfa_16s = "\1\126\1\uffff\2\71\1\uffff\1\73\3\uffff\1\72\2\uffff";
    static final String dfa_17s = "\1\uffff\1\1\2\uffff\1\7\1\uffff\1\6\1\5\1\4\1\uffff\1\2\1\3";
    static final String dfa_18s = "\14\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\63\uffff\1\1\2\uffff\1\4\30\uffff\1\2\1\3",
            "",
            "\1\5",
            "\1\5",
            "",
            "\1\7\1\10\1\11\64\uffff\1\6",
            "",
            "",
            "",
            "\1\12\6\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2476:1: (this_Ne_Atomic_Node_Test_0= ruleNe_Atomic_Node_Test | ( () ( (lv_mode_2_0= ruleRowCol ) ) otherlv_3= '(' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_column_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( () ( (lv_mode_9_0= ruleRowCol ) ) otherlv_10= '(' ( (lv_index_11_0= RULE_INT ) ) otherlv_12= ')' ) | ( () ( (lv_mode_14_0= ruleRowCol ) ) otherlv_15= '(' ( (otherlv_16= RULE_ID ) ) otherlv_17= ')' ) | ( () ( (lv_mode_19_0= ruleRowCol ) ) otherlv_20= '(' ( (lv_string_21_0= RULE_STRING ) ) otherlv_22= ')' ) | ( () ( (lv_mode_24_0= ruleRowCol ) ) otherlv_25= '(' otherlv_26= 'last' otherlv_27= ')' ) | ( () otherlv_29= 'True' ) )";
        }
    }
    static final String dfa_20s = "\26\uffff";
    static final String dfa_21s = "\2\uffff\1\5\1\uffff\1\5\21\uffff";
    static final String dfa_22s = "\3\4\1\uffff\1\4\2\uffff\1\4\1\5\1\6\6\4\1\22\1\77\1\4\1\22\1\55\1\22";
    static final String dfa_23s = "\2\115\1\131\1\uffff\1\131\2\uffff\1\131\1\5\1\6\6\115\1\131\1\77\1\115\1\131\1\55\1\131";
    static final String dfa_24s = "\3\uffff\1\2\1\uffff\1\3\1\1\17\uffff";
    static final String dfa_25s = "\26\uffff}>";
    static final String[] dfa_26s = {
            "\1\4\1\2\63\uffff\1\1\20\uffff\3\5\1\3",
            "\1\6\1\7\63\uffff\1\6\20\uffff\4\6",
            "\2\5\14\uffff\1\3\1\5\22\uffff\1\5\1\uffff\1\3\4\uffff\1\3\5\uffff\1\5\5\uffff\2\5\2\uffff\2\3\1\uffff\3\5\7\uffff\4\5\11\uffff\3\3",
            "",
            "\2\5\14\uffff\1\3\1\5\22\uffff\1\5\1\uffff\1\3\4\uffff\1\3\5\uffff\1\5\5\uffff\2\5\5\uffff\3\5\7\uffff\4\5\11\uffff\3\3",
            "",
            "",
            "\2\6\14\uffff\1\14\23\uffff\1\6\1\uffff\1\12\4\uffff\1\15\13\uffff\2\6\2\uffff\1\10\1\11\1\uffff\3\6\7\uffff\4\6\11\uffff\1\13\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\6\110\uffff\1\3",
            "\1\6\110\uffff\1\3",
            "\1\6\110\uffff\1\3",
            "\1\6\110\uffff\1\3",
            "\1\6\110\uffff\1\3",
            "\1\6\110\uffff\1\3",
            "\1\14\25\uffff\1\22\4\uffff\1\15\17\uffff\1\10\1\11\30\uffff\1\13\1\16\1\17",
            "\1\23",
            "\1\6\1\uffff\1\24\106\uffff\1\3",
            "\1\14\25\uffff\1\12\4\uffff\1\15\17\uffff\1\10\1\11\30\uffff\1\13\1\16\1\17",
            "\1\25",
            "\1\14\25\uffff\1\12\4\uffff\1\15\17\uffff\1\10\1\11\30\uffff\1\13\1\16\1\17"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3711:1: ( (otherlv_0= '(' this_ContentExpression_1= ruleContentExpression otherlv_2= ')' ) | this_Ce_Comparison_3= ruleCe_Comparison | this_Ce_Atomic_4= ruleCe_Atomic )";
        }
    }
    static final String dfa_27s = "\17\uffff";
    static final String dfa_28s = "\1\4\1\0\15\uffff";
    static final String dfa_29s = "\1\126\1\0\15\uffff";
    static final String dfa_30s = "\2\uffff\1\2\13\uffff\1\1";
    static final String dfa_31s = "\1\uffff\1\0\15\uffff}>";
    static final String[] dfa_32s = {
            "\2\2\61\uffff\1\1\2\2\2\uffff\1\2\6\uffff\5\2\15\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4888:1: ( ( ( ruleTLBoolExprNot )=>this_TLBoolExprNot_0= ruleTLBoolExprNot ) | this_TLBoolExprEmpty_1= ruleTLBoolExprEmpty )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSculpt()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E022L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C022L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018022L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1381400000010032L,0x00000000006000F8L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000320000L,0x000000000004C000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003A0002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000320002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FFF080002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000030L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003000080002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000B000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000160000800000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000360000800000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000B000080002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1380000000000030L,0x00000000006000F8L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000030L,0x0000000000003C00L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000320002L,0x000000000004C000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x6000210000040000L,0x0000000003800000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000003L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000300L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000020L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000032L,0x0000000000003C00L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000030L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0408000000000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2004000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000020100000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000030L,0x0000000000001C00L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0010000000320000L,0x000000000004C000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000002000000000L});
    }


}