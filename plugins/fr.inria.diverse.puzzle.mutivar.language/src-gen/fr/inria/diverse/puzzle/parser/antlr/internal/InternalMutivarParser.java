package fr.inria.diverse.puzzle.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.puzzle.services.MutivarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMutivarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'languagefeatures'", "'orthogonalvariability'", "'{'", "'root'", "'}'", "'abstract'", "'languagefeature'", "'requires'", "','", "'excludes'", "'languagemodule'", "'children'", "'mandatory'", "'optional'", "'or'", "'('", "')'", "'alternative'", "'variationpoint'", "'involves'", "'default'", "'variation'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMutivarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMutivarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMutivarParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g"; }



     	private MutivarGrammarAccess grammarAccess;
     	
        public InternalMutivarParser(TokenStream input, MutivarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LanguageProductLine";	
       	}
       	
       	@Override
       	protected MutivarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLanguageProductLine"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:67:1: entryRuleLanguageProductLine returns [EObject current=null] : iv_ruleLanguageProductLine= ruleLanguageProductLine EOF ;
    public final EObject entryRuleLanguageProductLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageProductLine = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:68:2: (iv_ruleLanguageProductLine= ruleLanguageProductLine EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:69:2: iv_ruleLanguageProductLine= ruleLanguageProductLine EOF
            {
             newCompositeNode(grammarAccess.getLanguageProductLineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageProductLine_in_entryRuleLanguageProductLine75);
            iv_ruleLanguageProductLine=ruleLanguageProductLine();

            state._fsp--;

             current =iv_ruleLanguageProductLine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageProductLine85); 

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
    // $ANTLR end "entryRuleLanguageProductLine"


    // $ANTLR start "ruleLanguageProductLine"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:76:1: ruleLanguageProductLine returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )? (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )? (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )? ) ;
    public final EObject ruleLanguageProductLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_implementationFile_2_0 = null;

        EObject lv_productLineVariability_4_0 = null;

        EObject lv_languageVariability_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:79:28: ( ( () (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )? (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )? (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:80:1: ( () (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )? (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )? (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:80:1: ( () (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )? (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )? (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )? )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:80:2: () (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )? (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )? (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )?
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:80:2: ()
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLanguageProductLineAccess().getLanguageProductLineAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:86:2: (otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:86:4: otherlv_1= 'import' ( (lv_implementationFile_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLanguageProductLine132); 

                        	newLeafNode(otherlv_1, grammarAccess.getLanguageProductLineAccess().getImportKeyword_1_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:90:1: ( (lv_implementationFile_2_0= ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:91:1: (lv_implementationFile_2_0= ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:91:1: (lv_implementationFile_2_0= ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:92:3: lv_implementationFile_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageProductLineAccess().getImplementationFileEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageProductLine153);
                    lv_implementationFile_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageProductLineRule());
                    	        }
                           		set(
                           			current, 
                           			"implementationFile",
                            		lv_implementationFile_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:108:4: (otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:108:6: otherlv_3= 'languagefeatures' ( (lv_productLineVariability_4_0= ruleProductLineVariability ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLanguageProductLine168); 

                        	newLeafNode(otherlv_3, grammarAccess.getLanguageProductLineAccess().getLanguagefeaturesKeyword_2_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:112:1: ( (lv_productLineVariability_4_0= ruleProductLineVariability ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:113:1: (lv_productLineVariability_4_0= ruleProductLineVariability )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:113:1: (lv_productLineVariability_4_0= ruleProductLineVariability )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:114:3: lv_productLineVariability_4_0= ruleProductLineVariability
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageProductLineAccess().getProductLineVariabilityProductLineVariabilityParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductLineVariability_in_ruleLanguageProductLine189);
                    lv_productLineVariability_4_0=ruleProductLineVariability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageProductLineRule());
                    	        }
                           		set(
                           			current, 
                           			"productLineVariability",
                            		lv_productLineVariability_4_0, 
                            		"ProductLineVariability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:130:4: (otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:130:6: otherlv_5= 'orthogonalvariability' ( (lv_languageVariability_6_0= ruleLanguageVariability ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLanguageProductLine204); 

                        	newLeafNode(otherlv_5, grammarAccess.getLanguageProductLineAccess().getOrthogonalvariabilityKeyword_3_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:134:1: ( (lv_languageVariability_6_0= ruleLanguageVariability ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:135:1: (lv_languageVariability_6_0= ruleLanguageVariability )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:135:1: (lv_languageVariability_6_0= ruleLanguageVariability )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:136:3: lv_languageVariability_6_0= ruleLanguageVariability
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageProductLineAccess().getLanguageVariabilityLanguageVariabilityParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLanguageVariability_in_ruleLanguageProductLine225);
                    lv_languageVariability_6_0=ruleLanguageVariability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageProductLineRule());
                    	        }
                           		set(
                           			current, 
                           			"languageVariability",
                            		lv_languageVariability_6_0, 
                            		"LanguageVariability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleLanguageProductLine"


    // $ANTLR start "entryRuleRelation"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:160:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:161:2: (iv_ruleRelation= ruleRelation EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:162:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelation_in_entryRuleRelation263);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelation273); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:169:1: ruleRelation returns [EObject current=null] : (this_MandatoryChild_0= ruleMandatoryChild | this_OptionalChild_1= ruleOptionalChild | this_OrGroupChild_2= ruleOrGroupChild | this_AlternativeGroup_3= ruleAlternativeGroup ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryChild_0 = null;

        EObject this_OptionalChild_1 = null;

        EObject this_OrGroupChild_2 = null;

        EObject this_AlternativeGroup_3 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:172:28: ( (this_MandatoryChild_0= ruleMandatoryChild | this_OptionalChild_1= ruleOptionalChild | this_OrGroupChild_2= ruleOrGroupChild | this_AlternativeGroup_3= ruleAlternativeGroup ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:173:1: (this_MandatoryChild_0= ruleMandatoryChild | this_OptionalChild_1= ruleOptionalChild | this_OrGroupChild_2= ruleOrGroupChild | this_AlternativeGroup_3= ruleAlternativeGroup )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:173:1: (this_MandatoryChild_0= ruleMandatoryChild | this_OptionalChild_1= ruleOptionalChild | this_OrGroupChild_2= ruleOrGroupChild | this_AlternativeGroup_3= ruleAlternativeGroup )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:174:5: this_MandatoryChild_0= ruleMandatoryChild
                    {
                     
                            newCompositeNode(grammarAccess.getRelationAccess().getMandatoryChildParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMandatoryChild_in_ruleRelation320);
                    this_MandatoryChild_0=ruleMandatoryChild();

                    state._fsp--;

                     
                            current = this_MandatoryChild_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:184:5: this_OptionalChild_1= ruleOptionalChild
                    {
                     
                            newCompositeNode(grammarAccess.getRelationAccess().getOptionalChildParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptionalChild_in_ruleRelation347);
                    this_OptionalChild_1=ruleOptionalChild();

                    state._fsp--;

                     
                            current = this_OptionalChild_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:194:5: this_OrGroupChild_2= ruleOrGroupChild
                    {
                     
                            newCompositeNode(grammarAccess.getRelationAccess().getOrGroupChildParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrGroupChild_in_ruleRelation374);
                    this_OrGroupChild_2=ruleOrGroupChild();

                    state._fsp--;

                     
                            current = this_OrGroupChild_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:204:5: this_AlternativeGroup_3= ruleAlternativeGroup
                    {
                     
                            newCompositeNode(grammarAccess.getRelationAccess().getAlternativeGroupParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAlternativeGroup_in_ruleRelation401);
                    this_AlternativeGroup_3=ruleAlternativeGroup();

                    state._fsp--;

                     
                            current = this_AlternativeGroup_3; 
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:220:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:221:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:222:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString437);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString448); 

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
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:229:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:232:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:233:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:233:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:233:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString488); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:241:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString514); 

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


    // $ANTLR start "entryRuleProductLineVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:256:1: entryRuleProductLineVariability returns [EObject current=null] : iv_ruleProductLineVariability= ruleProductLineVariability EOF ;
    public final EObject entryRuleProductLineVariability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductLineVariability = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:257:2: (iv_ruleProductLineVariability= ruleProductLineVariability EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:258:2: iv_ruleProductLineVariability= ruleProductLineVariability EOF
            {
             newCompositeNode(grammarAccess.getProductLineVariabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductLineVariability_in_entryRuleProductLineVariability559);
            iv_ruleProductLineVariability=ruleProductLineVariability();

            state._fsp--;

             current =iv_ruleProductLineVariability; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductLineVariability569); 

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
    // $ANTLR end "entryRuleProductLineVariability"


    // $ANTLR start "ruleProductLineVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:265:1: ruleProductLineVariability returns [EObject current=null] : (otherlv_0= '{' ( (lv_features_1_0= ruleLanguageFeature ) ) ( (lv_features_2_0= ruleLanguageFeature ) )* otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProductLineVariability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_1_0 = null;

        EObject lv_features_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:268:28: ( (otherlv_0= '{' ( (lv_features_1_0= ruleLanguageFeature ) ) ( (lv_features_2_0= ruleLanguageFeature ) )* otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:269:1: (otherlv_0= '{' ( (lv_features_1_0= ruleLanguageFeature ) ) ( (lv_features_2_0= ruleLanguageFeature ) )* otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:269:1: (otherlv_0= '{' ( (lv_features_1_0= ruleLanguageFeature ) ) ( (lv_features_2_0= ruleLanguageFeature ) )* otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:269:3: otherlv_0= '{' ( (lv_features_1_0= ruleLanguageFeature ) ) ( (lv_features_2_0= ruleLanguageFeature ) )* otherlv_3= 'root' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProductLineVariability606); 

                	newLeafNode(otherlv_0, grammarAccess.getProductLineVariabilityAccess().getLeftCurlyBracketKeyword_0());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:273:1: ( (lv_features_1_0= ruleLanguageFeature ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:274:1: (lv_features_1_0= ruleLanguageFeature )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:274:1: (lv_features_1_0= ruleLanguageFeature )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:275:3: lv_features_1_0= ruleLanguageFeature
            {
             
            	        newCompositeNode(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_ruleProductLineVariability627);
            lv_features_1_0=ruleLanguageFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductLineVariabilityRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_1_0, 
                    		"LanguageFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:291:2: ( (lv_features_2_0= ruleLanguageFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:292:1: (lv_features_2_0= ruleLanguageFeature )
            	    {
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:292:1: (lv_features_2_0= ruleLanguageFeature )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:293:3: lv_features_2_0= ruleLanguageFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_ruleProductLineVariability648);
            	    lv_features_2_0=ruleLanguageFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProductLineVariabilityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_2_0, 
            	            		"LanguageFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductLineVariability661); 

                	newLeafNode(otherlv_3, grammarAccess.getProductLineVariabilityAccess().getRootKeyword_3());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:313:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:314:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:314:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:315:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProductLineVariabilityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProductLineVariabilityAccess().getRootFeatureLanguageFeatureCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProductLineVariability684);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProductLineVariability696); 

                	newLeafNode(otherlv_5, grammarAccess.getProductLineVariabilityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleProductLineVariability"


    // $ANTLR start "entryRuleLanguageVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:340:1: entryRuleLanguageVariability returns [EObject current=null] : iv_ruleLanguageVariability= ruleLanguageVariability EOF ;
    public final EObject entryRuleLanguageVariability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageVariability = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:341:2: (iv_ruleLanguageVariability= ruleLanguageVariability EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:342:2: iv_ruleLanguageVariability= ruleLanguageVariability EOF
            {
             newCompositeNode(grammarAccess.getLanguageVariabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageVariability_in_entryRuleLanguageVariability732);
            iv_ruleLanguageVariability=ruleLanguageVariability();

            state._fsp--;

             current =iv_ruleLanguageVariability; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageVariability742); 

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
    // $ANTLR end "entryRuleLanguageVariability"


    // $ANTLR start "ruleLanguageVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:349:1: ruleLanguageVariability returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleLanguageVariability() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_variabilityPoints_2_0 = null;

        EObject lv_variabilityPoints_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:352:28: ( ( () otherlv_1= '{' ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )? otherlv_4= '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:353:1: ( () otherlv_1= '{' ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )? otherlv_4= '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:353:1: ( () otherlv_1= '{' ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )? otherlv_4= '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:353:2: () otherlv_1= '{' ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )? otherlv_4= '}'
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:353:2: ()
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLanguageVariabilityAccess().getLanguageVariabilityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLanguageVariability788); 

                	newLeafNode(otherlv_1, grammarAccess.getLanguageVariabilityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:363:1: ( ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:363:2: ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) ) ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )*
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:363:2: ( (lv_variabilityPoints_2_0= ruleVariabilityPoint ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:364:1: (lv_variabilityPoints_2_0= ruleVariabilityPoint )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:364:1: (lv_variabilityPoints_2_0= ruleVariabilityPoint )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:365:3: lv_variabilityPoints_2_0= ruleVariabilityPoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_ruleLanguageVariability810);
                    lv_variabilityPoints_2_0=ruleVariabilityPoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageVariabilityRule());
                    	        }
                           		add(
                           			current, 
                           			"variabilityPoints",
                            		lv_variabilityPoints_2_0, 
                            		"VariabilityPoint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:381:2: ( (lv_variabilityPoints_3_0= ruleVariabilityPoint ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:382:1: (lv_variabilityPoints_3_0= ruleVariabilityPoint )
                    	    {
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:382:1: (lv_variabilityPoints_3_0= ruleVariabilityPoint )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:383:3: lv_variabilityPoints_3_0= ruleVariabilityPoint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_ruleLanguageVariability831);
                    	    lv_variabilityPoints_3_0=ruleVariabilityPoint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLanguageVariabilityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variabilityPoints",
                    	            		lv_variabilityPoints_3_0, 
                    	            		"VariabilityPoint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLanguageVariability846); 

                	newLeafNode(otherlv_4, grammarAccess.getLanguageVariabilityAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleLanguageVariability"


    // $ANTLR start "entryRuleLanguageFeature"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:411:1: entryRuleLanguageFeature returns [EObject current=null] : iv_ruleLanguageFeature= ruleLanguageFeature EOF ;
    public final EObject entryRuleLanguageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFeature = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:412:2: (iv_ruleLanguageFeature= ruleLanguageFeature EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:413:2: iv_ruleLanguageFeature= ruleLanguageFeature EOF
            {
             newCompositeNode(grammarAccess.getLanguageFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_entryRuleLanguageFeature882);
            iv_ruleLanguageFeature=ruleLanguageFeature();

            state._fsp--;

             current =iv_ruleLanguageFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageFeature892); 

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
    // $ANTLR end "entryRuleLanguageFeature"


    // $ANTLR start "ruleLanguageFeature"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:420:1: ruleLanguageFeature returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'languagefeature' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= '{' (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleLanguageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_module_14_0 = null;

        EObject lv_children_17_0 = null;

        EObject lv_children_18_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:423:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'languagefeature' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= '{' (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:424:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'languagefeature' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= '{' (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:424:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'languagefeature' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= '{' (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:424:2: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'languagefeature' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= '{' (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:424:2: ()
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:425:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLanguageFeatureAccess().getLanguageFeatureAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:430:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:431:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:431:1: (lv_abstract_1_0= 'abstract' )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:432:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLanguageFeature944); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getLanguageFeatureAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLanguageFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLanguageFeature970); 

                	newLeafNode(otherlv_2, grammarAccess.getLanguageFeatureAccess().getLanguagefeatureKeyword_2());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:449:1: ( (lv_name_3_0= ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:450:1: (lv_name_3_0= ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:450:1: (lv_name_3_0= ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:451:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature991);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLanguageFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:467:2: (otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:467:4: otherlv_4= 'requires' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLanguageFeature1004); 

                        	newLeafNode(otherlv_4, grammarAccess.getLanguageFeatureAccess().getRequiresKeyword_4_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:471:1: ( ( ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:472:1: ( ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:472:1: ( ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:473:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLanguageFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature1027);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:486:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:486:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLanguageFeature1040); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getLanguageFeatureAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:490:1: ( ( ruleEString ) )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:491:1: ( ruleEString )
                    	    {
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:491:1: ( ruleEString )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:492:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLanguageFeatureRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature1063);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:505:6: (otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:505:8: otherlv_8= 'excludes' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLanguageFeature1080); 

                        	newLeafNode(otherlv_8, grammarAccess.getLanguageFeatureAccess().getExcludesKeyword_5_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:509:1: ( ( ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:510:1: ( ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:510:1: ( ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:511:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLanguageFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature1103);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:524:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:524:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLanguageFeature1116); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLanguageFeatureAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:528:1: ( ( ruleEString ) )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:529:1: ( ruleEString )
                    	    {
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:529:1: ( ruleEString )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:530:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLanguageFeatureRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature1139);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLanguageFeature1155); 

                	newLeafNode(otherlv_12, grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_6());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:547:1: (otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:547:3: otherlv_13= 'languagemodule' ( (lv_module_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLanguageFeature1168); 

                        	newLeafNode(otherlv_13, grammarAccess.getLanguageFeatureAccess().getLanguagemoduleKeyword_7_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:551:1: ( (lv_module_14_0= ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:552:1: (lv_module_14_0= ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:552:1: (lv_module_14_0= ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:553:3: lv_module_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getModuleEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLanguageFeature1189);
                    lv_module_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"module",
                            		lv_module_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:569:4: (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:569:6: otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= ruleRelation ) ) ( (lv_children_18_0= ruleRelation ) )* otherlv_19= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLanguageFeature1204); 

                        	newLeafNode(otherlv_15, grammarAccess.getLanguageFeatureAccess().getChildrenKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLanguageFeature1216); 

                        	newLeafNode(otherlv_16, grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:577:1: ( (lv_children_17_0= ruleRelation ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:578:1: (lv_children_17_0= ruleRelation )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:578:1: (lv_children_17_0= ruleRelation )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:579:3: lv_children_17_0= ruleRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelation_in_ruleLanguageFeature1237);
                    lv_children_17_0=ruleRelation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_17_0, 
                            		"Relation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:595:2: ( (lv_children_18_0= ruleRelation ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=24 && LA15_0<=26)||LA15_0==29) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:596:1: (lv_children_18_0= ruleRelation )
                    	    {
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:596:1: (lv_children_18_0= ruleRelation )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:597:3: lv_children_18_0= ruleRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelation_in_ruleLanguageFeature1258);
                    	    lv_children_18_0=ruleRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLanguageFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_18_0, 
                    	            		"Relation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLanguageFeature1271); 

                        	newLeafNode(otherlv_19, grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLanguageFeature1285); 

                	newLeafNode(otherlv_20, grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleLanguageFeature"


    // $ANTLR start "entryRuleMandatoryChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:631:1: entryRuleMandatoryChild returns [EObject current=null] : iv_ruleMandatoryChild= ruleMandatoryChild EOF ;
    public final EObject entryRuleMandatoryChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryChild = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:632:2: (iv_ruleMandatoryChild= ruleMandatoryChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:633:2: iv_ruleMandatoryChild= ruleMandatoryChild EOF
            {
             newCompositeNode(grammarAccess.getMandatoryChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMandatoryChild_in_entryRuleMandatoryChild1323);
            iv_ruleMandatoryChild=ruleMandatoryChild();

            state._fsp--;

             current =iv_ruleMandatoryChild; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMandatoryChild1333); 

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
    // $ANTLR end "entryRuleMandatoryChild"


    // $ANTLR start "ruleMandatoryChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:640:1: ruleMandatoryChild returns [EObject current=null] : (otherlv_0= 'mandatory' ( ( ruleEString ) ) ) ;
    public final EObject ruleMandatoryChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:643:28: ( (otherlv_0= 'mandatory' ( ( ruleEString ) ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:644:1: (otherlv_0= 'mandatory' ( ( ruleEString ) ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:644:1: (otherlv_0= 'mandatory' ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:644:3: otherlv_0= 'mandatory' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMandatoryChild1370); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryChildAccess().getMandatoryKeyword_0());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:648:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:649:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:649:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:650:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMandatoryChildRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMandatoryChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMandatoryChild1393);
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
    // $ANTLR end "ruleMandatoryChild"


    // $ANTLR start "entryRuleOptionalChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:671:1: entryRuleOptionalChild returns [EObject current=null] : iv_ruleOptionalChild= ruleOptionalChild EOF ;
    public final EObject entryRuleOptionalChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalChild = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:672:2: (iv_ruleOptionalChild= ruleOptionalChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:673:2: iv_ruleOptionalChild= ruleOptionalChild EOF
            {
             newCompositeNode(grammarAccess.getOptionalChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionalChild_in_entryRuleOptionalChild1429);
            iv_ruleOptionalChild=ruleOptionalChild();

            state._fsp--;

             current =iv_ruleOptionalChild; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionalChild1439); 

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
    // $ANTLR end "entryRuleOptionalChild"


    // $ANTLR start "ruleOptionalChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:680:1: ruleOptionalChild returns [EObject current=null] : (otherlv_0= 'optional' ( ( ruleEString ) ) ) ;
    public final EObject ruleOptionalChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:683:28: ( (otherlv_0= 'optional' ( ( ruleEString ) ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:684:1: (otherlv_0= 'optional' ( ( ruleEString ) ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:684:1: (otherlv_0= 'optional' ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:684:3: otherlv_0= 'optional' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOptionalChild1476); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalChildAccess().getOptionalKeyword_0());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:688:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:689:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:689:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:690:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionalChildRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOptionalChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOptionalChild1499);
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
    // $ANTLR end "ruleOptionalChild"


    // $ANTLR start "entryRuleOrGroupChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:711:1: entryRuleOrGroupChild returns [EObject current=null] : iv_ruleOrGroupChild= ruleOrGroupChild EOF ;
    public final EObject entryRuleOrGroupChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGroupChild = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:712:2: (iv_ruleOrGroupChild= ruleOrGroupChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:713:2: iv_ruleOrGroupChild= ruleOrGroupChild EOF
            {
             newCompositeNode(grammarAccess.getOrGroupChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrGroupChild_in_entryRuleOrGroupChild1535);
            iv_ruleOrGroupChild=ruleOrGroupChild();

            state._fsp--;

             current =iv_ruleOrGroupChild; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrGroupChild1545); 

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
    // $ANTLR end "entryRuleOrGroupChild"


    // $ANTLR start "ruleOrGroupChild"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:720:1: ruleOrGroupChild returns [EObject current=null] : (otherlv_0= 'or' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleOrGroupChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:723:28: ( (otherlv_0= 'or' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:724:1: (otherlv_0= 'or' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:724:1: (otherlv_0= 'or' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:724:3: otherlv_0= 'or' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOrGroupChild1582); 

                	newLeafNode(otherlv_0, grammarAccess.getOrGroupChildAccess().getOrKeyword_0());
                
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrGroupChild1594); 

                	newLeafNode(otherlv_1, grammarAccess.getOrGroupChildAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:732:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:733:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:733:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:734:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrGroupChildRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrGroupChild1617);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:747:2: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:747:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOrGroupChild1630); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOrGroupChildAccess().getCommaKeyword_3_0());
            	        
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:751:1: ( ( ruleEString ) )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:752:1: ( ruleEString )
            	    {
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:752:1: ( ruleEString )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:753:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrGroupChildRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrGroupChild1653);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOrGroupChild1667); 

                	newLeafNode(otherlv_5, grammarAccess.getOrGroupChildAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleOrGroupChild"


    // $ANTLR start "entryRuleAlternativeGroup"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:778:1: entryRuleAlternativeGroup returns [EObject current=null] : iv_ruleAlternativeGroup= ruleAlternativeGroup EOF ;
    public final EObject entryRuleAlternativeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeGroup = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:779:2: (iv_ruleAlternativeGroup= ruleAlternativeGroup EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:780:2: iv_ruleAlternativeGroup= ruleAlternativeGroup EOF
            {
             newCompositeNode(grammarAccess.getAlternativeGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternativeGroup_in_entryRuleAlternativeGroup1703);
            iv_ruleAlternativeGroup=ruleAlternativeGroup();

            state._fsp--;

             current =iv_ruleAlternativeGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternativeGroup1713); 

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
    // $ANTLR end "entryRuleAlternativeGroup"


    // $ANTLR start "ruleAlternativeGroup"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:787:1: ruleAlternativeGroup returns [EObject current=null] : (otherlv_0= 'alternative' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleAlternativeGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:790:28: ( (otherlv_0= 'alternative' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:791:1: (otherlv_0= 'alternative' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:791:1: (otherlv_0= 'alternative' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:791:3: otherlv_0= 'alternative' otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAlternativeGroup1750); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeGroupAccess().getAlternativeKeyword_0());
                
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAlternativeGroup1762); 

                	newLeafNode(otherlv_1, grammarAccess.getAlternativeGroupAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:799:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:800:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:800:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:801:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativeGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAlternativeGroup1785);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:814:2: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:814:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlternativeGroup1798); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAlternativeGroupAccess().getCommaKeyword_3_0());
            	        
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:818:1: ( ( ruleEString ) )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:819:1: ( ruleEString )
            	    {
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:819:1: ( ruleEString )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:820:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAlternativeGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAlternativeGroup1821);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAlternativeGroup1835); 

                	newLeafNode(otherlv_5, grammarAccess.getAlternativeGroupAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAlternativeGroup"


    // $ANTLR start "entryRuleVariabilityPoint"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:845:1: entryRuleVariabilityPoint returns [EObject current=null] : iv_ruleVariabilityPoint= ruleVariabilityPoint EOF ;
    public final EObject entryRuleVariabilityPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariabilityPoint = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:846:2: (iv_ruleVariabilityPoint= ruleVariabilityPoint EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:847:2: iv_ruleVariabilityPoint= ruleVariabilityPoint EOF
            {
             newCompositeNode(grammarAccess.getVariabilityPointRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_entryRuleVariabilityPoint1871);
            iv_ruleVariabilityPoint=ruleVariabilityPoint();

            state._fsp--;

             current =iv_ruleVariabilityPoint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariabilityPoint1881); 

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
    // $ANTLR end "entryRuleVariabilityPoint"


    // $ANTLR start "ruleVariabilityPoint"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:854:1: ruleVariabilityPoint returns [EObject current=null] : (otherlv_0= 'variationpoint' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '{' ( (lv_variations_7_0= ruleVariation ) ) ( (lv_variations_8_0= ruleVariation ) )* otherlv_9= 'default' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
    public final EObject ruleVariabilityPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_variations_7_0 = null;

        EObject lv_variations_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:857:28: ( (otherlv_0= 'variationpoint' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '{' ( (lv_variations_7_0= ruleVariation ) ) ( (lv_variations_8_0= ruleVariation ) )* otherlv_9= 'default' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:858:1: (otherlv_0= 'variationpoint' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '{' ( (lv_variations_7_0= ruleVariation ) ) ( (lv_variations_8_0= ruleVariation ) )* otherlv_9= 'default' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:858:1: (otherlv_0= 'variationpoint' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '{' ( (lv_variations_7_0= ruleVariation ) ) ( (lv_variations_8_0= ruleVariation ) )* otherlv_9= 'default' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:858:3: otherlv_0= 'variationpoint' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '{' ( (lv_variations_7_0= ruleVariation ) ) ( (lv_variations_8_0= ruleVariation ) )* otherlv_9= 'default' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleVariabilityPoint1918); 

                	newLeafNode(otherlv_0, grammarAccess.getVariabilityPointAccess().getVariationpointKeyword_0());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:862:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:863:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:863:1: (lv_name_1_0= ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:864:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariabilityPointAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariabilityPoint1939);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariabilityPointRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:880:2: (otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:880:4: otherlv_2= 'involves' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleVariabilityPoint1952); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariabilityPointAccess().getInvolvesKeyword_2_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:884:1: ( ( ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:885:1: ( ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:885:1: ( ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:886:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariabilityPointRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariabilityPoint1975);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:899:2: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:899:4: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVariabilityPoint1988); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getVariabilityPointAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:903:1: ( ( ruleEString ) )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:904:1: ( ruleEString )
                    	    {
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:904:1: ( ruleEString )
                    	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:905:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getVariabilityPointRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariabilityPoint2011);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVariabilityPoint2027); 

                	newLeafNode(otherlv_6, grammarAccess.getVariabilityPointAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:922:1: ( (lv_variations_7_0= ruleVariation ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:923:1: (lv_variations_7_0= ruleVariation )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:923:1: (lv_variations_7_0= ruleVariation )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:924:3: lv_variations_7_0= ruleVariation
            {
             
            	        newCompositeNode(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariation_in_ruleVariabilityPoint2048);
            lv_variations_7_0=ruleVariation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariabilityPointRule());
            	        }
                   		add(
                   			current, 
                   			"variations",
                    		lv_variations_7_0, 
                    		"Variation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:940:2: ( (lv_variations_8_0= ruleVariation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:941:1: (lv_variations_8_0= ruleVariation )
            	    {
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:941:1: (lv_variations_8_0= ruleVariation )
            	    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:942:3: lv_variations_8_0= ruleVariation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariation_in_ruleVariabilityPoint2069);
            	    lv_variations_8_0=ruleVariation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariabilityPointRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variations",
            	            		lv_variations_8_0, 
            	            		"Variation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleVariabilityPoint2082); 

                	newLeafNode(otherlv_9, grammarAccess.getVariabilityPointAccess().getDefaultKeyword_6());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:962:1: ( (otherlv_10= RULE_ID ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:963:1: (otherlv_10= RULE_ID )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:963:1: (otherlv_10= RULE_ID )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:964:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariabilityPointRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariabilityPoint2102); 

            		newLeafNode(otherlv_10, grammarAccess.getVariabilityPointAccess().getDefaultVariationCrossReference_7_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVariabilityPoint2114); 

                	newLeafNode(otherlv_11, grammarAccess.getVariabilityPointAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleVariabilityPoint"


    // $ANTLR start "entryRuleVariation"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:987:1: entryRuleVariation returns [EObject current=null] : iv_ruleVariation= ruleVariation EOF ;
    public final EObject entryRuleVariation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariation = null;


        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:988:2: (iv_ruleVariation= ruleVariation EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:989:2: iv_ruleVariation= ruleVariation EOF
            {
             newCompositeNode(grammarAccess.getVariationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariation_in_entryRuleVariation2150);
            iv_ruleVariation=ruleVariation();

            state._fsp--;

             current =iv_ruleVariation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariation2160); 

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
    // $ANTLR end "entryRuleVariation"


    // $ANTLR start "ruleVariation"
    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:996:1: ruleVariation returns [EObject current=null] : ( () otherlv_1= 'variation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_module_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:999:28: ( ( () otherlv_1= 'variation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1000:1: ( () otherlv_1= 'variation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1000:1: ( () otherlv_1= 'variation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )? )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1000:2: () otherlv_1= 'variation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )?
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1000:2: ()
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1001:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariationAccess().getVariationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleVariation2206); 

                	newLeafNode(otherlv_1, grammarAccess.getVariationAccess().getVariationKeyword_1());
                
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1010:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1011:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1011:1: (lv_name_2_0= ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1012:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariation2227);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1028:2: (otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1028:4: otherlv_3= 'languagemodule' ( (lv_module_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariation2240); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariationAccess().getLanguagemoduleKeyword_3_0());
                        
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1032:1: ( (lv_module_4_0= ruleEString ) )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1033:1: (lv_module_4_0= ruleEString )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1033:1: (lv_module_4_0= ruleEString )
                    // ../fr.inria.diverse.puzzle.mutivar.language/src-gen/fr/inria/diverse/puzzle/parser/antlr/internal/InternalMutivar.g:1034:3: lv_module_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariationAccess().getModuleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariation2261);
                    lv_module_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariationRule());
                    	        }
                           		set(
                           			current, 
                           			"module",
                            		lv_module_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVariation"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLanguageProductLine_in_entryRuleLanguageProductLine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageProductLine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleLanguageProductLine132 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageProductLine153 = new BitSet(new long[]{0x0000000000003002L});
        public static final BitSet FOLLOW_12_in_ruleLanguageProductLine168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleProductLineVariability_in_ruleLanguageProductLine189 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleLanguageProductLine204 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleLanguageVariability_in_ruleLanguageProductLine225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelation273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatoryChild_in_ruleRelation320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionalChild_in_ruleRelation347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrGroupChild_in_ruleRelation374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternativeGroup_in_ruleRelation401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductLineVariability_in_entryRuleProductLineVariability559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductLineVariability569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleProductLineVariability606 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_ruleProductLineVariability627 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_ruleProductLineVariability648 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_15_in_ruleProductLineVariability661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProductLineVariability684 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProductLineVariability696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageVariability_in_entryRuleLanguageVariability732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageVariability742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleLanguageVariability788 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_ruleLanguageVariability810 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_ruleLanguageVariability831 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_16_in_ruleLanguageVariability846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_entryRuleLanguageFeature882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageFeature892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleLanguageFeature944 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLanguageFeature970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature991 = new BitSet(new long[]{0x0000000000284000L});
        public static final BitSet FOLLOW_19_in_ruleLanguageFeature1004 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature1027 = new BitSet(new long[]{0x0000000000304000L});
        public static final BitSet FOLLOW_20_in_ruleLanguageFeature1040 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature1063 = new BitSet(new long[]{0x0000000000304000L});
        public static final BitSet FOLLOW_21_in_ruleLanguageFeature1080 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature1103 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_ruleLanguageFeature1116 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature1139 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleLanguageFeature1155 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleLanguageFeature1168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLanguageFeature1189 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleLanguageFeature1204 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLanguageFeature1216 = new BitSet(new long[]{0x0000000027000000L});
        public static final BitSet FOLLOW_ruleRelation_in_ruleLanguageFeature1237 = new BitSet(new long[]{0x0000000027010000L});
        public static final BitSet FOLLOW_ruleRelation_in_ruleLanguageFeature1258 = new BitSet(new long[]{0x0000000027010000L});
        public static final BitSet FOLLOW_16_in_ruleLanguageFeature1271 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLanguageFeature1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatoryChild_in_entryRuleMandatoryChild1323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryChild1333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMandatoryChild1370 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMandatoryChild1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionalChild_in_entryRuleOptionalChild1429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionalChild1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleOptionalChild1476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOptionalChild1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrGroupChild_in_entryRuleOrGroupChild1535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrGroupChild1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleOrGroupChild1582 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleOrGroupChild1594 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrGroupChild1617 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleOrGroupChild1630 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrGroupChild1653 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleOrGroupChild1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternativeGroup_in_entryRuleAlternativeGroup1703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeGroup1713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAlternativeGroup1750 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAlternativeGroup1762 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAlternativeGroup1785 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleAlternativeGroup1798 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAlternativeGroup1821 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleAlternativeGroup1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_entryRuleVariabilityPoint1871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariabilityPoint1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleVariabilityPoint1918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariabilityPoint1939 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_31_in_ruleVariabilityPoint1952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariabilityPoint1975 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_ruleVariabilityPoint1988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariabilityPoint2011 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleVariabilityPoint2027 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleVariation_in_ruleVariabilityPoint2048 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_ruleVariation_in_ruleVariabilityPoint2069 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleVariabilityPoint2082 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariabilityPoint2102 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVariabilityPoint2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariation_in_entryRuleVariation2150 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariation2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleVariation2206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariation2227 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleVariation2240 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariation2261 = new BitSet(new long[]{0x0000000000000002L});
    }


}