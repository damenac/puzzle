package fr.inria.diverse.puzzle.adl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.inria.diverse.puzzle.adl.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'composite'", "'{'", "'}'", "'connector'", "'('", "','", "')'"
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
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g"; }


     
     	private LanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePuzzleComposition"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:60:1: entryRulePuzzleComposition : rulePuzzleComposition EOF ;
    public final void entryRulePuzzleComposition() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:61:1: ( rulePuzzleComposition EOF )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:62:1: rulePuzzleComposition EOF
            {
             before(grammarAccess.getPuzzleCompositionRule()); 
            pushFollow(FOLLOW_rulePuzzleComposition_in_entryRulePuzzleComposition61);
            rulePuzzleComposition();

            state._fsp--;

             after(grammarAccess.getPuzzleCompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePuzzleComposition68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePuzzleComposition"


    // $ANTLR start "rulePuzzleComposition"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:69:1: rulePuzzleComposition : ( ( rule__PuzzleComposition__Group__0 ) ) ;
    public final void rulePuzzleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:73:2: ( ( ( rule__PuzzleComposition__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__PuzzleComposition__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__PuzzleComposition__Group__0 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:75:1: ( rule__PuzzleComposition__Group__0 )
            {
             before(grammarAccess.getPuzzleCompositionAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:76:1: ( rule__PuzzleComposition__Group__0 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:76:2: rule__PuzzleComposition__Group__0
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group__0_in_rulePuzzleComposition94);
            rule__PuzzleComposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePuzzleComposition"


    // $ANTLR start "entryRuleCompositeLanguage"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:88:1: entryRuleCompositeLanguage : ruleCompositeLanguage EOF ;
    public final void entryRuleCompositeLanguage() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:89:1: ( ruleCompositeLanguage EOF )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:90:1: ruleCompositeLanguage EOF
            {
             before(grammarAccess.getCompositeLanguageRule()); 
            pushFollow(FOLLOW_ruleCompositeLanguage_in_entryRuleCompositeLanguage121);
            ruleCompositeLanguage();

            state._fsp--;

             after(grammarAccess.getCompositeLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeLanguage128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeLanguage"


    // $ANTLR start "ruleCompositeLanguage"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:97:1: ruleCompositeLanguage : ( ( rule__CompositeLanguage__Group__0 ) ) ;
    public final void ruleCompositeLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:101:2: ( ( ( rule__CompositeLanguage__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__CompositeLanguage__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__CompositeLanguage__Group__0 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:103:1: ( rule__CompositeLanguage__Group__0 )
            {
             before(grammarAccess.getCompositeLanguageAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:104:1: ( rule__CompositeLanguage__Group__0 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:104:2: rule__CompositeLanguage__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__0_in_ruleCompositeLanguage154);
            rule__CompositeLanguage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeLanguage"


    // $ANTLR start "entryRuleConnector"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:116:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:117:1: ( ruleConnector EOF )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:118:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector181);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:125:1: ruleConnector : ( ruleAggregationConnector ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:129:2: ( ( ruleAggregationConnector ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ruleAggregationConnector )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ruleAggregationConnector )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:131:1: ruleAggregationConnector
            {
             before(grammarAccess.getConnectorAccess().getAggregationConnectorParserRuleCall()); 
            pushFollow(FOLLOW_ruleAggregationConnector_in_ruleConnector214);
            ruleAggregationConnector();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAggregationConnectorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAggregationConnector"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:144:1: entryRuleAggregationConnector : ruleAggregationConnector EOF ;
    public final void entryRuleAggregationConnector() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:145:1: ( ruleAggregationConnector EOF )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:146:1: ruleAggregationConnector EOF
            {
             before(grammarAccess.getAggregationConnectorRule()); 
            pushFollow(FOLLOW_ruleAggregationConnector_in_entryRuleAggregationConnector240);
            ruleAggregationConnector();

            state._fsp--;

             after(grammarAccess.getAggregationConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregationConnector247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregationConnector"


    // $ANTLR start "ruleAggregationConnector"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:153:1: ruleAggregationConnector : ( ( rule__AggregationConnector__Group__0 ) ) ;
    public final void ruleAggregationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:157:2: ( ( ( rule__AggregationConnector__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__AggregationConnector__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__AggregationConnector__Group__0 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:159:1: ( rule__AggregationConnector__Group__0 )
            {
             before(grammarAccess.getAggregationConnectorAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:160:1: ( rule__AggregationConnector__Group__0 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:160:2: rule__AggregationConnector__Group__0
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__0_in_ruleAggregationConnector273);
            rule__AggregationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregationConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregationConnector"


    // $ANTLR start "rule__PuzzleComposition__Group__0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:174:1: rule__PuzzleComposition__Group__0 : rule__PuzzleComposition__Group__0__Impl rule__PuzzleComposition__Group__1 ;
    public final void rule__PuzzleComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:178:1: ( rule__PuzzleComposition__Group__0__Impl rule__PuzzleComposition__Group__1 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:179:2: rule__PuzzleComposition__Group__0__Impl rule__PuzzleComposition__Group__1
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group__0__Impl_in_rule__PuzzleComposition__Group__0307);
            rule__PuzzleComposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuzzleComposition__Group__1_in_rule__PuzzleComposition__Group__0310);
            rule__PuzzleComposition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__0"


    // $ANTLR start "rule__PuzzleComposition__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:186:1: rule__PuzzleComposition__Group__0__Impl : ( () ) ;
    public final void rule__PuzzleComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:190:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:191:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:191:1: ( () )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:192:1: ()
            {
             before(grammarAccess.getPuzzleCompositionAccess().getPuzzleCompositionAction_0()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:193:1: ()
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:195:1: 
            {
            }

             after(grammarAccess.getPuzzleCompositionAccess().getPuzzleCompositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__0__Impl"


    // $ANTLR start "rule__PuzzleComposition__Group__1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:205:1: rule__PuzzleComposition__Group__1 : rule__PuzzleComposition__Group__1__Impl rule__PuzzleComposition__Group__2 ;
    public final void rule__PuzzleComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:209:1: ( rule__PuzzleComposition__Group__1__Impl rule__PuzzleComposition__Group__2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:210:2: rule__PuzzleComposition__Group__1__Impl rule__PuzzleComposition__Group__2
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group__1__Impl_in_rule__PuzzleComposition__Group__1368);
            rule__PuzzleComposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuzzleComposition__Group__2_in_rule__PuzzleComposition__Group__1371);
            rule__PuzzleComposition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__1"


    // $ANTLR start "rule__PuzzleComposition__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:217:1: rule__PuzzleComposition__Group__1__Impl : ( 'import' ) ;
    public final void rule__PuzzleComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:221:1: ( ( 'import' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:222:1: ( 'import' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:222:1: ( 'import' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:223:1: 'import'
            {
             before(grammarAccess.getPuzzleCompositionAccess().getImportKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__PuzzleComposition__Group__1__Impl399); 
             after(grammarAccess.getPuzzleCompositionAccess().getImportKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__1__Impl"


    // $ANTLR start "rule__PuzzleComposition__Group__2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:236:1: rule__PuzzleComposition__Group__2 : rule__PuzzleComposition__Group__2__Impl rule__PuzzleComposition__Group__3 ;
    public final void rule__PuzzleComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:240:1: ( rule__PuzzleComposition__Group__2__Impl rule__PuzzleComposition__Group__3 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:241:2: rule__PuzzleComposition__Group__2__Impl rule__PuzzleComposition__Group__3
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group__2__Impl_in_rule__PuzzleComposition__Group__2430);
            rule__PuzzleComposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuzzleComposition__Group__3_in_rule__PuzzleComposition__Group__2433);
            rule__PuzzleComposition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__2"


    // $ANTLR start "rule__PuzzleComposition__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:248:1: rule__PuzzleComposition__Group__2__Impl : ( ( rule__PuzzleComposition__MelangeFileAssignment_2 ) ) ;
    public final void rule__PuzzleComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:252:1: ( ( ( rule__PuzzleComposition__MelangeFileAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:253:1: ( ( rule__PuzzleComposition__MelangeFileAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:253:1: ( ( rule__PuzzleComposition__MelangeFileAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:254:1: ( rule__PuzzleComposition__MelangeFileAssignment_2 )
            {
             before(grammarAccess.getPuzzleCompositionAccess().getMelangeFileAssignment_2()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:255:1: ( rule__PuzzleComposition__MelangeFileAssignment_2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:255:2: rule__PuzzleComposition__MelangeFileAssignment_2
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__MelangeFileAssignment_2_in_rule__PuzzleComposition__Group__2__Impl460);
            rule__PuzzleComposition__MelangeFileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleCompositionAccess().getMelangeFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__2__Impl"


    // $ANTLR start "rule__PuzzleComposition__Group__3"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:265:1: rule__PuzzleComposition__Group__3 : rule__PuzzleComposition__Group__3__Impl ;
    public final void rule__PuzzleComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:269:1: ( rule__PuzzleComposition__Group__3__Impl )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:270:2: rule__PuzzleComposition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group__3__Impl_in_rule__PuzzleComposition__Group__3490);
            rule__PuzzleComposition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__3"


    // $ANTLR start "rule__PuzzleComposition__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:276:1: rule__PuzzleComposition__Group__3__Impl : ( ( rule__PuzzleComposition__Group_3__0 )? ) ;
    public final void rule__PuzzleComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:280:1: ( ( ( rule__PuzzleComposition__Group_3__0 )? ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:281:1: ( ( rule__PuzzleComposition__Group_3__0 )? )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:281:1: ( ( rule__PuzzleComposition__Group_3__0 )? )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:282:1: ( rule__PuzzleComposition__Group_3__0 )?
            {
             before(grammarAccess.getPuzzleCompositionAccess().getGroup_3()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:283:1: ( rule__PuzzleComposition__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:283:2: rule__PuzzleComposition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PuzzleComposition__Group_3__0_in_rule__PuzzleComposition__Group__3__Impl517);
                    rule__PuzzleComposition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPuzzleCompositionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group__3__Impl"


    // $ANTLR start "rule__PuzzleComposition__Group_3__0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:301:1: rule__PuzzleComposition__Group_3__0 : rule__PuzzleComposition__Group_3__0__Impl rule__PuzzleComposition__Group_3__1 ;
    public final void rule__PuzzleComposition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:305:1: ( rule__PuzzleComposition__Group_3__0__Impl rule__PuzzleComposition__Group_3__1 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:306:2: rule__PuzzleComposition__Group_3__0__Impl rule__PuzzleComposition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group_3__0__Impl_in_rule__PuzzleComposition__Group_3__0556);
            rule__PuzzleComposition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuzzleComposition__Group_3__1_in_rule__PuzzleComposition__Group_3__0559);
            rule__PuzzleComposition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group_3__0"


    // $ANTLR start "rule__PuzzleComposition__Group_3__0__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:313:1: rule__PuzzleComposition__Group_3__0__Impl : ( ( rule__PuzzleComposition__CompositesAssignment_3_0 ) ) ;
    public final void rule__PuzzleComposition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:317:1: ( ( ( rule__PuzzleComposition__CompositesAssignment_3_0 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:318:1: ( ( rule__PuzzleComposition__CompositesAssignment_3_0 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:318:1: ( ( rule__PuzzleComposition__CompositesAssignment_3_0 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:319:1: ( rule__PuzzleComposition__CompositesAssignment_3_0 )
            {
             before(grammarAccess.getPuzzleCompositionAccess().getCompositesAssignment_3_0()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:320:1: ( rule__PuzzleComposition__CompositesAssignment_3_0 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:320:2: rule__PuzzleComposition__CompositesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__CompositesAssignment_3_0_in_rule__PuzzleComposition__Group_3__0__Impl586);
            rule__PuzzleComposition__CompositesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPuzzleCompositionAccess().getCompositesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group_3__0__Impl"


    // $ANTLR start "rule__PuzzleComposition__Group_3__1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:330:1: rule__PuzzleComposition__Group_3__1 : rule__PuzzleComposition__Group_3__1__Impl ;
    public final void rule__PuzzleComposition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:334:1: ( rule__PuzzleComposition__Group_3__1__Impl )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:335:2: rule__PuzzleComposition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PuzzleComposition__Group_3__1__Impl_in_rule__PuzzleComposition__Group_3__1616);
            rule__PuzzleComposition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group_3__1"


    // $ANTLR start "rule__PuzzleComposition__Group_3__1__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:341:1: rule__PuzzleComposition__Group_3__1__Impl : ( ( rule__PuzzleComposition__CompositesAssignment_3_1 )* ) ;
    public final void rule__PuzzleComposition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:345:1: ( ( ( rule__PuzzleComposition__CompositesAssignment_3_1 )* ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( ( rule__PuzzleComposition__CompositesAssignment_3_1 )* )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( ( rule__PuzzleComposition__CompositesAssignment_3_1 )* )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:347:1: ( rule__PuzzleComposition__CompositesAssignment_3_1 )*
            {
             before(grammarAccess.getPuzzleCompositionAccess().getCompositesAssignment_3_1()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:348:1: ( rule__PuzzleComposition__CompositesAssignment_3_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:348:2: rule__PuzzleComposition__CompositesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__PuzzleComposition__CompositesAssignment_3_1_in_rule__PuzzleComposition__Group_3__1__Impl643);
            	    rule__PuzzleComposition__CompositesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPuzzleCompositionAccess().getCompositesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:362:1: rule__CompositeLanguage__Group__0 : rule__CompositeLanguage__Group__0__Impl rule__CompositeLanguage__Group__1 ;
    public final void rule__CompositeLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:366:1: ( rule__CompositeLanguage__Group__0__Impl rule__CompositeLanguage__Group__1 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:367:2: rule__CompositeLanguage__Group__0__Impl rule__CompositeLanguage__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__0__Impl_in_rule__CompositeLanguage__Group__0678);
            rule__CompositeLanguage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group__1_in_rule__CompositeLanguage__Group__0681);
            rule__CompositeLanguage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__0"


    // $ANTLR start "rule__CompositeLanguage__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:374:1: rule__CompositeLanguage__Group__0__Impl : ( () ) ;
    public final void rule__CompositeLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:378:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:379:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:379:1: ( () )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:380:1: ()
            {
             before(grammarAccess.getCompositeLanguageAccess().getCompositeLanguageAction_0()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:381:1: ()
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:383:1: 
            {
            }

             after(grammarAccess.getCompositeLanguageAccess().getCompositeLanguageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__0__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:393:1: rule__CompositeLanguage__Group__1 : rule__CompositeLanguage__Group__1__Impl rule__CompositeLanguage__Group__2 ;
    public final void rule__CompositeLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:397:1: ( rule__CompositeLanguage__Group__1__Impl rule__CompositeLanguage__Group__2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:398:2: rule__CompositeLanguage__Group__1__Impl rule__CompositeLanguage__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__1__Impl_in_rule__CompositeLanguage__Group__1739);
            rule__CompositeLanguage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group__2_in_rule__CompositeLanguage__Group__1742);
            rule__CompositeLanguage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__1"


    // $ANTLR start "rule__CompositeLanguage__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:405:1: rule__CompositeLanguage__Group__1__Impl : ( 'composite' ) ;
    public final void rule__CompositeLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:409:1: ( ( 'composite' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:410:1: ( 'composite' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:410:1: ( 'composite' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:411:1: 'composite'
            {
             before(grammarAccess.getCompositeLanguageAccess().getCompositeKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__CompositeLanguage__Group__1__Impl770); 
             after(grammarAccess.getCompositeLanguageAccess().getCompositeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__1__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:424:1: rule__CompositeLanguage__Group__2 : rule__CompositeLanguage__Group__2__Impl rule__CompositeLanguage__Group__3 ;
    public final void rule__CompositeLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:428:1: ( rule__CompositeLanguage__Group__2__Impl rule__CompositeLanguage__Group__3 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:429:2: rule__CompositeLanguage__Group__2__Impl rule__CompositeLanguage__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__2__Impl_in_rule__CompositeLanguage__Group__2801);
            rule__CompositeLanguage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group__3_in_rule__CompositeLanguage__Group__2804);
            rule__CompositeLanguage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__2"


    // $ANTLR start "rule__CompositeLanguage__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:436:1: rule__CompositeLanguage__Group__2__Impl : ( ( rule__CompositeLanguage__NameAssignment_2 ) ) ;
    public final void rule__CompositeLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:440:1: ( ( ( rule__CompositeLanguage__NameAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:441:1: ( ( rule__CompositeLanguage__NameAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:441:1: ( ( rule__CompositeLanguage__NameAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:442:1: ( rule__CompositeLanguage__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeLanguageAccess().getNameAssignment_2()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:443:1: ( rule__CompositeLanguage__NameAssignment_2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:443:2: rule__CompositeLanguage__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__NameAssignment_2_in_rule__CompositeLanguage__Group__2__Impl831);
            rule__CompositeLanguage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeLanguageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__2__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__3"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:453:1: rule__CompositeLanguage__Group__3 : rule__CompositeLanguage__Group__3__Impl rule__CompositeLanguage__Group__4 ;
    public final void rule__CompositeLanguage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:457:1: ( rule__CompositeLanguage__Group__3__Impl rule__CompositeLanguage__Group__4 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:458:2: rule__CompositeLanguage__Group__3__Impl rule__CompositeLanguage__Group__4
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__3__Impl_in_rule__CompositeLanguage__Group__3861);
            rule__CompositeLanguage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group__4_in_rule__CompositeLanguage__Group__3864);
            rule__CompositeLanguage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__3"


    // $ANTLR start "rule__CompositeLanguage__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:465:1: rule__CompositeLanguage__Group__3__Impl : ( '{' ) ;
    public final void rule__CompositeLanguage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:469:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:470:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:470:1: ( '{' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:471:1: '{'
            {
             before(grammarAccess.getCompositeLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__CompositeLanguage__Group__3__Impl892); 
             after(grammarAccess.getCompositeLanguageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__3__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__4"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:484:1: rule__CompositeLanguage__Group__4 : rule__CompositeLanguage__Group__4__Impl rule__CompositeLanguage__Group__5 ;
    public final void rule__CompositeLanguage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:488:1: ( rule__CompositeLanguage__Group__4__Impl rule__CompositeLanguage__Group__5 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:489:2: rule__CompositeLanguage__Group__4__Impl rule__CompositeLanguage__Group__5
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__4__Impl_in_rule__CompositeLanguage__Group__4923);
            rule__CompositeLanguage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group__5_in_rule__CompositeLanguage__Group__4926);
            rule__CompositeLanguage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__4"


    // $ANTLR start "rule__CompositeLanguage__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:496:1: rule__CompositeLanguage__Group__4__Impl : ( ( rule__CompositeLanguage__Group_4__0 )? ) ;
    public final void rule__CompositeLanguage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:500:1: ( ( ( rule__CompositeLanguage__Group_4__0 )? ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:501:1: ( ( rule__CompositeLanguage__Group_4__0 )? )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:501:1: ( ( rule__CompositeLanguage__Group_4__0 )? )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:502:1: ( rule__CompositeLanguage__Group_4__0 )?
            {
             before(grammarAccess.getCompositeLanguageAccess().getGroup_4()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:503:1: ( rule__CompositeLanguage__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:503:2: rule__CompositeLanguage__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CompositeLanguage__Group_4__0_in_rule__CompositeLanguage__Group__4__Impl953);
                    rule__CompositeLanguage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeLanguageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__4__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group__5"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:513:1: rule__CompositeLanguage__Group__5 : rule__CompositeLanguage__Group__5__Impl ;
    public final void rule__CompositeLanguage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:517:1: ( rule__CompositeLanguage__Group__5__Impl )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:518:2: rule__CompositeLanguage__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group__5__Impl_in_rule__CompositeLanguage__Group__5984);
            rule__CompositeLanguage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__5"


    // $ANTLR start "rule__CompositeLanguage__Group__5__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:524:1: rule__CompositeLanguage__Group__5__Impl : ( '}' ) ;
    public final void rule__CompositeLanguage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:528:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:529:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:529:1: ( '}' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:530:1: '}'
            {
             before(grammarAccess.getCompositeLanguageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__CompositeLanguage__Group__5__Impl1012); 
             after(grammarAccess.getCompositeLanguageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group__5__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group_4__0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:555:1: rule__CompositeLanguage__Group_4__0 : rule__CompositeLanguage__Group_4__0__Impl rule__CompositeLanguage__Group_4__1 ;
    public final void rule__CompositeLanguage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:559:1: ( rule__CompositeLanguage__Group_4__0__Impl rule__CompositeLanguage__Group_4__1 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:560:2: rule__CompositeLanguage__Group_4__0__Impl rule__CompositeLanguage__Group_4__1
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group_4__0__Impl_in_rule__CompositeLanguage__Group_4__01055);
            rule__CompositeLanguage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeLanguage__Group_4__1_in_rule__CompositeLanguage__Group_4__01058);
            rule__CompositeLanguage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group_4__0"


    // $ANTLR start "rule__CompositeLanguage__Group_4__0__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:567:1: rule__CompositeLanguage__Group_4__0__Impl : ( ( rule__CompositeLanguage__LinksAssignment_4_0 ) ) ;
    public final void rule__CompositeLanguage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:571:1: ( ( ( rule__CompositeLanguage__LinksAssignment_4_0 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:572:1: ( ( rule__CompositeLanguage__LinksAssignment_4_0 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:572:1: ( ( rule__CompositeLanguage__LinksAssignment_4_0 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:573:1: ( rule__CompositeLanguage__LinksAssignment_4_0 )
            {
             before(grammarAccess.getCompositeLanguageAccess().getLinksAssignment_4_0()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:574:1: ( rule__CompositeLanguage__LinksAssignment_4_0 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:574:2: rule__CompositeLanguage__LinksAssignment_4_0
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__LinksAssignment_4_0_in_rule__CompositeLanguage__Group_4__0__Impl1085);
            rule__CompositeLanguage__LinksAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeLanguageAccess().getLinksAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeLanguage__Group_4__1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:584:1: rule__CompositeLanguage__Group_4__1 : rule__CompositeLanguage__Group_4__1__Impl ;
    public final void rule__CompositeLanguage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:588:1: ( rule__CompositeLanguage__Group_4__1__Impl )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:589:2: rule__CompositeLanguage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CompositeLanguage__Group_4__1__Impl_in_rule__CompositeLanguage__Group_4__11115);
            rule__CompositeLanguage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group_4__1"


    // $ANTLR start "rule__CompositeLanguage__Group_4__1__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:595:1: rule__CompositeLanguage__Group_4__1__Impl : ( ( rule__CompositeLanguage__LinksAssignment_4_1 )* ) ;
    public final void rule__CompositeLanguage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:599:1: ( ( ( rule__CompositeLanguage__LinksAssignment_4_1 )* ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:600:1: ( ( rule__CompositeLanguage__LinksAssignment_4_1 )* )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:600:1: ( ( rule__CompositeLanguage__LinksAssignment_4_1 )* )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:601:1: ( rule__CompositeLanguage__LinksAssignment_4_1 )*
            {
             before(grammarAccess.getCompositeLanguageAccess().getLinksAssignment_4_1()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:602:1: ( rule__CompositeLanguage__LinksAssignment_4_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:602:2: rule__CompositeLanguage__LinksAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__CompositeLanguage__LinksAssignment_4_1_in_rule__CompositeLanguage__Group_4__1__Impl1142);
            	    rule__CompositeLanguage__LinksAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCompositeLanguageAccess().getLinksAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__Group_4__1__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:616:1: rule__AggregationConnector__Group__0 : rule__AggregationConnector__Group__0__Impl rule__AggregationConnector__Group__1 ;
    public final void rule__AggregationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:620:1: ( rule__AggregationConnector__Group__0__Impl rule__AggregationConnector__Group__1 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:621:2: rule__AggregationConnector__Group__0__Impl rule__AggregationConnector__Group__1
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__0__Impl_in_rule__AggregationConnector__Group__01177);
            rule__AggregationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AggregationConnector__Group__1_in_rule__AggregationConnector__Group__01180);
            rule__AggregationConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__0"


    // $ANTLR start "rule__AggregationConnector__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:628:1: rule__AggregationConnector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__AggregationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:632:1: ( ( 'connector' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:633:1: ( 'connector' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:633:1: ( 'connector' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:634:1: 'connector'
            {
             before(grammarAccess.getAggregationConnectorAccess().getConnectorKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__AggregationConnector__Group__0__Impl1208); 
             after(grammarAccess.getAggregationConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__0__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:647:1: rule__AggregationConnector__Group__1 : rule__AggregationConnector__Group__1__Impl rule__AggregationConnector__Group__2 ;
    public final void rule__AggregationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:651:1: ( rule__AggregationConnector__Group__1__Impl rule__AggregationConnector__Group__2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:652:2: rule__AggregationConnector__Group__1__Impl rule__AggregationConnector__Group__2
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__1__Impl_in_rule__AggregationConnector__Group__11239);
            rule__AggregationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AggregationConnector__Group__2_in_rule__AggregationConnector__Group__11242);
            rule__AggregationConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__1"


    // $ANTLR start "rule__AggregationConnector__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:659:1: rule__AggregationConnector__Group__1__Impl : ( '(' ) ;
    public final void rule__AggregationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:663:1: ( ( '(' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:664:1: ( '(' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:664:1: ( '(' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:665:1: '('
            {
             before(grammarAccess.getAggregationConnectorAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__AggregationConnector__Group__1__Impl1270); 
             after(grammarAccess.getAggregationConnectorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__1__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:678:1: rule__AggregationConnector__Group__2 : rule__AggregationConnector__Group__2__Impl rule__AggregationConnector__Group__3 ;
    public final void rule__AggregationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:682:1: ( rule__AggregationConnector__Group__2__Impl rule__AggregationConnector__Group__3 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:683:2: rule__AggregationConnector__Group__2__Impl rule__AggregationConnector__Group__3
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__2__Impl_in_rule__AggregationConnector__Group__21301);
            rule__AggregationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AggregationConnector__Group__3_in_rule__AggregationConnector__Group__21304);
            rule__AggregationConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__2"


    // $ANTLR start "rule__AggregationConnector__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:690:1: rule__AggregationConnector__Group__2__Impl : ( ( rule__AggregationConnector__LeftAssignment_2 ) ) ;
    public final void rule__AggregationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:694:1: ( ( ( rule__AggregationConnector__LeftAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:695:1: ( ( rule__AggregationConnector__LeftAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:695:1: ( ( rule__AggregationConnector__LeftAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:696:1: ( rule__AggregationConnector__LeftAssignment_2 )
            {
             before(grammarAccess.getAggregationConnectorAccess().getLeftAssignment_2()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:697:1: ( rule__AggregationConnector__LeftAssignment_2 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:697:2: rule__AggregationConnector__LeftAssignment_2
            {
            pushFollow(FOLLOW_rule__AggregationConnector__LeftAssignment_2_in_rule__AggregationConnector__Group__2__Impl1331);
            rule__AggregationConnector__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAggregationConnectorAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__2__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__3"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:707:1: rule__AggregationConnector__Group__3 : rule__AggregationConnector__Group__3__Impl rule__AggregationConnector__Group__4 ;
    public final void rule__AggregationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:711:1: ( rule__AggregationConnector__Group__3__Impl rule__AggregationConnector__Group__4 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:712:2: rule__AggregationConnector__Group__3__Impl rule__AggregationConnector__Group__4
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__3__Impl_in_rule__AggregationConnector__Group__31361);
            rule__AggregationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AggregationConnector__Group__4_in_rule__AggregationConnector__Group__31364);
            rule__AggregationConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__3"


    // $ANTLR start "rule__AggregationConnector__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:719:1: rule__AggregationConnector__Group__3__Impl : ( ',' ) ;
    public final void rule__AggregationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:723:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:724:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:724:1: ( ',' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:725:1: ','
            {
             before(grammarAccess.getAggregationConnectorAccess().getCommaKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__AggregationConnector__Group__3__Impl1392); 
             after(grammarAccess.getAggregationConnectorAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__3__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__4"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:738:1: rule__AggregationConnector__Group__4 : rule__AggregationConnector__Group__4__Impl rule__AggregationConnector__Group__5 ;
    public final void rule__AggregationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:742:1: ( rule__AggregationConnector__Group__4__Impl rule__AggregationConnector__Group__5 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:743:2: rule__AggregationConnector__Group__4__Impl rule__AggregationConnector__Group__5
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__4__Impl_in_rule__AggregationConnector__Group__41423);
            rule__AggregationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AggregationConnector__Group__5_in_rule__AggregationConnector__Group__41426);
            rule__AggregationConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__4"


    // $ANTLR start "rule__AggregationConnector__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:750:1: rule__AggregationConnector__Group__4__Impl : ( ( rule__AggregationConnector__RightAssignment_4 ) ) ;
    public final void rule__AggregationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:754:1: ( ( ( rule__AggregationConnector__RightAssignment_4 ) ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:755:1: ( ( rule__AggregationConnector__RightAssignment_4 ) )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:755:1: ( ( rule__AggregationConnector__RightAssignment_4 ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:756:1: ( rule__AggregationConnector__RightAssignment_4 )
            {
             before(grammarAccess.getAggregationConnectorAccess().getRightAssignment_4()); 
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:757:1: ( rule__AggregationConnector__RightAssignment_4 )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:757:2: rule__AggregationConnector__RightAssignment_4
            {
            pushFollow(FOLLOW_rule__AggregationConnector__RightAssignment_4_in_rule__AggregationConnector__Group__4__Impl1453);
            rule__AggregationConnector__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAggregationConnectorAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__4__Impl"


    // $ANTLR start "rule__AggregationConnector__Group__5"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:767:1: rule__AggregationConnector__Group__5 : rule__AggregationConnector__Group__5__Impl ;
    public final void rule__AggregationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:771:1: ( rule__AggregationConnector__Group__5__Impl )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:772:2: rule__AggregationConnector__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AggregationConnector__Group__5__Impl_in_rule__AggregationConnector__Group__51483);
            rule__AggregationConnector__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__5"


    // $ANTLR start "rule__AggregationConnector__Group__5__Impl"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:778:1: rule__AggregationConnector__Group__5__Impl : ( ')' ) ;
    public final void rule__AggregationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:782:1: ( ( ')' ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:783:1: ( ')' )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:783:1: ( ')' )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:784:1: ')'
            {
             before(grammarAccess.getAggregationConnectorAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__AggregationConnector__Group__5__Impl1511); 
             after(grammarAccess.getAggregationConnectorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__Group__5__Impl"


    // $ANTLR start "rule__PuzzleComposition__MelangeFileAssignment_2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:810:1: rule__PuzzleComposition__MelangeFileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PuzzleComposition__MelangeFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:814:1: ( ( RULE_STRING ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:815:1: ( RULE_STRING )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:815:1: ( RULE_STRING )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:816:1: RULE_STRING
            {
             before(grammarAccess.getPuzzleCompositionAccess().getMelangeFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PuzzleComposition__MelangeFileAssignment_21559); 
             after(grammarAccess.getPuzzleCompositionAccess().getMelangeFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__MelangeFileAssignment_2"


    // $ANTLR start "rule__PuzzleComposition__CompositesAssignment_3_0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:825:1: rule__PuzzleComposition__CompositesAssignment_3_0 : ( ruleCompositeLanguage ) ;
    public final void rule__PuzzleComposition__CompositesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:829:1: ( ( ruleCompositeLanguage ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:830:1: ( ruleCompositeLanguage )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:830:1: ( ruleCompositeLanguage )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:831:1: ruleCompositeLanguage
            {
             before(grammarAccess.getPuzzleCompositionAccess().getCompositesCompositeLanguageParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleCompositeLanguage_in_rule__PuzzleComposition__CompositesAssignment_3_01590);
            ruleCompositeLanguage();

            state._fsp--;

             after(grammarAccess.getPuzzleCompositionAccess().getCompositesCompositeLanguageParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__CompositesAssignment_3_0"


    // $ANTLR start "rule__PuzzleComposition__CompositesAssignment_3_1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:840:1: rule__PuzzleComposition__CompositesAssignment_3_1 : ( ruleCompositeLanguage ) ;
    public final void rule__PuzzleComposition__CompositesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:844:1: ( ( ruleCompositeLanguage ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:845:1: ( ruleCompositeLanguage )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:845:1: ( ruleCompositeLanguage )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:846:1: ruleCompositeLanguage
            {
             before(grammarAccess.getPuzzleCompositionAccess().getCompositesCompositeLanguageParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleCompositeLanguage_in_rule__PuzzleComposition__CompositesAssignment_3_11621);
            ruleCompositeLanguage();

            state._fsp--;

             after(grammarAccess.getPuzzleCompositionAccess().getCompositesCompositeLanguageParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuzzleComposition__CompositesAssignment_3_1"


    // $ANTLR start "rule__CompositeLanguage__NameAssignment_2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:855:1: rule__CompositeLanguage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CompositeLanguage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:859:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:860:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:860:1: ( RULE_ID )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:861:1: RULE_ID
            {
             before(grammarAccess.getCompositeLanguageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompositeLanguage__NameAssignment_21652); 
             after(grammarAccess.getCompositeLanguageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__NameAssignment_2"


    // $ANTLR start "rule__CompositeLanguage__LinksAssignment_4_0"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:870:1: rule__CompositeLanguage__LinksAssignment_4_0 : ( ruleConnector ) ;
    public final void rule__CompositeLanguage__LinksAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:874:1: ( ( ruleConnector ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:875:1: ( ruleConnector )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:875:1: ( ruleConnector )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:876:1: ruleConnector
            {
             before(grammarAccess.getCompositeLanguageAccess().getLinksConnectorParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__CompositeLanguage__LinksAssignment_4_01683);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeLanguageAccess().getLinksConnectorParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__LinksAssignment_4_0"


    // $ANTLR start "rule__CompositeLanguage__LinksAssignment_4_1"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:885:1: rule__CompositeLanguage__LinksAssignment_4_1 : ( ruleConnector ) ;
    public final void rule__CompositeLanguage__LinksAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:889:1: ( ( ruleConnector ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:890:1: ( ruleConnector )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:890:1: ( ruleConnector )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:891:1: ruleConnector
            {
             before(grammarAccess.getCompositeLanguageAccess().getLinksConnectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__CompositeLanguage__LinksAssignment_4_11714);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeLanguageAccess().getLinksConnectorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeLanguage__LinksAssignment_4_1"


    // $ANTLR start "rule__AggregationConnector__LeftAssignment_2"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:900:1: rule__AggregationConnector__LeftAssignment_2 : ( RULE_ID ) ;
    public final void rule__AggregationConnector__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:904:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:905:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:905:1: ( RULE_ID )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:906:1: RULE_ID
            {
             before(grammarAccess.getAggregationConnectorAccess().getLeftIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AggregationConnector__LeftAssignment_21745); 
             after(grammarAccess.getAggregationConnectorAccess().getLeftIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__LeftAssignment_2"


    // $ANTLR start "rule__AggregationConnector__RightAssignment_4"
    // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:915:1: rule__AggregationConnector__RightAssignment_4 : ( RULE_ID ) ;
    public final void rule__AggregationConnector__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:919:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:920:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:920:1: ( RULE_ID )
            // ../fr.inria.diverse.puzzle.adl.language.ui/src-gen/fr/inria/diverse/puzzle/adl/ui/contentassist/antlr/internal/InternalLanguage.g:921:1: RULE_ID
            {
             before(grammarAccess.getAggregationConnectorAccess().getRightIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AggregationConnector__RightAssignment_41776); 
             after(grammarAccess.getAggregationConnectorAccess().getRightIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationConnector__RightAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePuzzleComposition_in_entryRulePuzzleComposition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuzzleComposition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__0_in_rulePuzzleComposition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeLanguage_in_entryRuleCompositeLanguage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeLanguage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__0_in_ruleCompositeLanguage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregationConnector_in_ruleConnector214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregationConnector_in_entryRuleAggregationConnector240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregationConnector247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__0_in_ruleAggregationConnector273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__0__Impl_in_rule__PuzzleComposition__Group__0307 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__1_in_rule__PuzzleComposition__Group__0310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__1__Impl_in_rule__PuzzleComposition__Group__1368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__2_in_rule__PuzzleComposition__Group__1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PuzzleComposition__Group__1__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__2__Impl_in_rule__PuzzleComposition__Group__2430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__3_in_rule__PuzzleComposition__Group__2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__MelangeFileAssignment_2_in_rule__PuzzleComposition__Group__2__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group__3__Impl_in_rule__PuzzleComposition__Group__3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group_3__0_in_rule__PuzzleComposition__Group__3__Impl517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group_3__0__Impl_in_rule__PuzzleComposition__Group_3__0556 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group_3__1_in_rule__PuzzleComposition__Group_3__0559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__CompositesAssignment_3_0_in_rule__PuzzleComposition__Group_3__0__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__Group_3__1__Impl_in_rule__PuzzleComposition__Group_3__1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuzzleComposition__CompositesAssignment_3_1_in_rule__PuzzleComposition__Group_3__1__Impl643 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__0__Impl_in_rule__CompositeLanguage__Group__0678 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__1_in_rule__CompositeLanguage__Group__0681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__1__Impl_in_rule__CompositeLanguage__Group__1739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__2_in_rule__CompositeLanguage__Group__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompositeLanguage__Group__1__Impl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__2__Impl_in_rule__CompositeLanguage__Group__2801 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__3_in_rule__CompositeLanguage__Group__2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__NameAssignment_2_in_rule__CompositeLanguage__Group__2__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__3__Impl_in_rule__CompositeLanguage__Group__3861 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__4_in_rule__CompositeLanguage__Group__3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompositeLanguage__Group__3__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__4__Impl_in_rule__CompositeLanguage__Group__4923 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__5_in_rule__CompositeLanguage__Group__4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group_4__0_in_rule__CompositeLanguage__Group__4__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group__5__Impl_in_rule__CompositeLanguage__Group__5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompositeLanguage__Group__5__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group_4__0__Impl_in_rule__CompositeLanguage__Group_4__01055 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group_4__1_in_rule__CompositeLanguage__Group_4__01058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__LinksAssignment_4_0_in_rule__CompositeLanguage__Group_4__0__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__Group_4__1__Impl_in_rule__CompositeLanguage__Group_4__11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeLanguage__LinksAssignment_4_1_in_rule__CompositeLanguage__Group_4__1__Impl1142 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__0__Impl_in_rule__AggregationConnector__Group__01177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__1_in_rule__AggregationConnector__Group__01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AggregationConnector__Group__0__Impl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__1__Impl_in_rule__AggregationConnector__Group__11239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__2_in_rule__AggregationConnector__Group__11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AggregationConnector__Group__1__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__2__Impl_in_rule__AggregationConnector__Group__21301 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__3_in_rule__AggregationConnector__Group__21304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__LeftAssignment_2_in_rule__AggregationConnector__Group__2__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__3__Impl_in_rule__AggregationConnector__Group__31361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__4_in_rule__AggregationConnector__Group__31364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AggregationConnector__Group__3__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__4__Impl_in_rule__AggregationConnector__Group__41423 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__5_in_rule__AggregationConnector__Group__41426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__RightAssignment_4_in_rule__AggregationConnector__Group__4__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AggregationConnector__Group__5__Impl_in_rule__AggregationConnector__Group__51483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AggregationConnector__Group__5__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PuzzleComposition__MelangeFileAssignment_21559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeLanguage_in_rule__PuzzleComposition__CompositesAssignment_3_01590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeLanguage_in_rule__PuzzleComposition__CompositesAssignment_3_11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeLanguage__NameAssignment_21652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__CompositeLanguage__LinksAssignment_4_01683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__CompositeLanguage__LinksAssignment_4_11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AggregationConnector__LeftAssignment_21745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AggregationConnector__RightAssignment_41776 = new BitSet(new long[]{0x0000000000000002L});

}