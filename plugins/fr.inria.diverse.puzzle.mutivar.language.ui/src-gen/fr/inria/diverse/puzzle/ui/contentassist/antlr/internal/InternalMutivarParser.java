package fr.inria.diverse.puzzle.ui.contentassist.antlr.internal; 

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
import fr.inria.diverse.puzzle.services.MutivarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMutivarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'languagefeatures'", "'orthogonalvariability'", "'{'", "'root'", "'}'", "'languagefeature'", "'requires'", "','", "'excludes'", "'languagemodule'", "'children'", "'mandatory'", "'optional'", "'or'", "'('", "')'", "'alternative'", "'variationpoint'", "'default'", "'involves'", "'variation'", "'abstract'"
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
    public String getGrammarFileName() { return "../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g"; }


     
     	private MutivarGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MutivarGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLanguageProductLine"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:60:1: entryRuleLanguageProductLine : ruleLanguageProductLine EOF ;
    public final void entryRuleLanguageProductLine() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:61:1: ( ruleLanguageProductLine EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:62:1: ruleLanguageProductLine EOF
            {
             before(grammarAccess.getLanguageProductLineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageProductLine_in_entryRuleLanguageProductLine61);
            ruleLanguageProductLine();

            state._fsp--;

             after(grammarAccess.getLanguageProductLineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageProductLine68); 

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
    // $ANTLR end "entryRuleLanguageProductLine"


    // $ANTLR start "ruleLanguageProductLine"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:69:1: ruleLanguageProductLine : ( ( rule__LanguageProductLine__Group__0 ) ) ;
    public final void ruleLanguageProductLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:73:2: ( ( ( rule__LanguageProductLine__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:74:1: ( ( rule__LanguageProductLine__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:74:1: ( ( rule__LanguageProductLine__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:75:1: ( rule__LanguageProductLine__Group__0 )
            {
             before(grammarAccess.getLanguageProductLineAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:76:1: ( rule__LanguageProductLine__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:76:2: rule__LanguageProductLine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__0_in_ruleLanguageProductLine94);
            rule__LanguageProductLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageProductLineAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageProductLine"


    // $ANTLR start "entryRuleRelation"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:88:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:89:1: ( ruleRelation EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:90:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelation_in_entryRuleRelation121);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelation128); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:97:1: ruleRelation : ( ( rule__Relation__Alternatives ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:101:2: ( ( ( rule__Relation__Alternatives ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:102:1: ( ( rule__Relation__Alternatives ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:102:1: ( ( rule__Relation__Alternatives ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:103:1: ( rule__Relation__Alternatives )
            {
             before(grammarAccess.getRelationAccess().getAlternatives()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:104:1: ( rule__Relation__Alternatives )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:104:2: rule__Relation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relation__Alternatives_in_ruleRelation154);
            rule__Relation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:117:1: ( ruleEString EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:132:1: ( rule__EString__Alternatives )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProductLineVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:144:1: entryRuleProductLineVariability : ruleProductLineVariability EOF ;
    public final void entryRuleProductLineVariability() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:145:1: ( ruleProductLineVariability EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:146:1: ruleProductLineVariability EOF
            {
             before(grammarAccess.getProductLineVariabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductLineVariability_in_entryRuleProductLineVariability241);
            ruleProductLineVariability();

            state._fsp--;

             after(grammarAccess.getProductLineVariabilityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductLineVariability248); 

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
    // $ANTLR end "entryRuleProductLineVariability"


    // $ANTLR start "ruleProductLineVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:153:1: ruleProductLineVariability : ( ( rule__ProductLineVariability__Group__0 ) ) ;
    public final void ruleProductLineVariability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:157:2: ( ( ( rule__ProductLineVariability__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:158:1: ( ( rule__ProductLineVariability__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:158:1: ( ( rule__ProductLineVariability__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:159:1: ( rule__ProductLineVariability__Group__0 )
            {
             before(grammarAccess.getProductLineVariabilityAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:160:1: ( rule__ProductLineVariability__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:160:2: rule__ProductLineVariability__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__0_in_ruleProductLineVariability274);
            rule__ProductLineVariability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductLineVariabilityAccess().getGroup()); 

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
    // $ANTLR end "ruleProductLineVariability"


    // $ANTLR start "entryRuleLanguageVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:172:1: entryRuleLanguageVariability : ruleLanguageVariability EOF ;
    public final void entryRuleLanguageVariability() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:173:1: ( ruleLanguageVariability EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:174:1: ruleLanguageVariability EOF
            {
             before(grammarAccess.getLanguageVariabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageVariability_in_entryRuleLanguageVariability301);
            ruleLanguageVariability();

            state._fsp--;

             after(grammarAccess.getLanguageVariabilityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageVariability308); 

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
    // $ANTLR end "entryRuleLanguageVariability"


    // $ANTLR start "ruleLanguageVariability"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:181:1: ruleLanguageVariability : ( ( rule__LanguageVariability__Group__0 ) ) ;
    public final void ruleLanguageVariability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:185:2: ( ( ( rule__LanguageVariability__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:186:1: ( ( rule__LanguageVariability__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:186:1: ( ( rule__LanguageVariability__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:187:1: ( rule__LanguageVariability__Group__0 )
            {
             before(grammarAccess.getLanguageVariabilityAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:188:1: ( rule__LanguageVariability__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:188:2: rule__LanguageVariability__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__0_in_ruleLanguageVariability334);
            rule__LanguageVariability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageVariabilityAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageVariability"


    // $ANTLR start "entryRuleLanguageFeature"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:200:1: entryRuleLanguageFeature : ruleLanguageFeature EOF ;
    public final void entryRuleLanguageFeature() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:201:1: ( ruleLanguageFeature EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:202:1: ruleLanguageFeature EOF
            {
             before(grammarAccess.getLanguageFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_entryRuleLanguageFeature361);
            ruleLanguageFeature();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguageFeature368); 

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
    // $ANTLR end "entryRuleLanguageFeature"


    // $ANTLR start "ruleLanguageFeature"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:209:1: ruleLanguageFeature : ( ( rule__LanguageFeature__Group__0 ) ) ;
    public final void ruleLanguageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:213:2: ( ( ( rule__LanguageFeature__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:214:1: ( ( rule__LanguageFeature__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:214:1: ( ( rule__LanguageFeature__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:215:1: ( rule__LanguageFeature__Group__0 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:216:1: ( rule__LanguageFeature__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:216:2: rule__LanguageFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__0_in_ruleLanguageFeature394);
            rule__LanguageFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageFeature"


    // $ANTLR start "entryRuleMandatoryChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:230:1: entryRuleMandatoryChild : ruleMandatoryChild EOF ;
    public final void entryRuleMandatoryChild() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:231:1: ( ruleMandatoryChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:232:1: ruleMandatoryChild EOF
            {
             before(grammarAccess.getMandatoryChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMandatoryChild_in_entryRuleMandatoryChild423);
            ruleMandatoryChild();

            state._fsp--;

             after(grammarAccess.getMandatoryChildRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMandatoryChild430); 

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
    // $ANTLR end "entryRuleMandatoryChild"


    // $ANTLR start "ruleMandatoryChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:239:1: ruleMandatoryChild : ( ( rule__MandatoryChild__Group__0 ) ) ;
    public final void ruleMandatoryChild() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:243:2: ( ( ( rule__MandatoryChild__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:244:1: ( ( rule__MandatoryChild__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:244:1: ( ( rule__MandatoryChild__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:245:1: ( rule__MandatoryChild__Group__0 )
            {
             before(grammarAccess.getMandatoryChildAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:246:1: ( rule__MandatoryChild__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:246:2: rule__MandatoryChild__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MandatoryChild__Group__0_in_ruleMandatoryChild456);
            rule__MandatoryChild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryChildAccess().getGroup()); 

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
    // $ANTLR end "ruleMandatoryChild"


    // $ANTLR start "entryRuleOptionalChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:258:1: entryRuleOptionalChild : ruleOptionalChild EOF ;
    public final void entryRuleOptionalChild() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:259:1: ( ruleOptionalChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:260:1: ruleOptionalChild EOF
            {
             before(grammarAccess.getOptionalChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionalChild_in_entryRuleOptionalChild483);
            ruleOptionalChild();

            state._fsp--;

             after(grammarAccess.getOptionalChildRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionalChild490); 

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
    // $ANTLR end "entryRuleOptionalChild"


    // $ANTLR start "ruleOptionalChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:267:1: ruleOptionalChild : ( ( rule__OptionalChild__Group__0 ) ) ;
    public final void ruleOptionalChild() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:271:2: ( ( ( rule__OptionalChild__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:272:1: ( ( rule__OptionalChild__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:272:1: ( ( rule__OptionalChild__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:273:1: ( rule__OptionalChild__Group__0 )
            {
             before(grammarAccess.getOptionalChildAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:274:1: ( rule__OptionalChild__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:274:2: rule__OptionalChild__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionalChild__Group__0_in_ruleOptionalChild516);
            rule__OptionalChild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalChildAccess().getGroup()); 

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
    // $ANTLR end "ruleOptionalChild"


    // $ANTLR start "entryRuleOrGroupChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:286:1: entryRuleOrGroupChild : ruleOrGroupChild EOF ;
    public final void entryRuleOrGroupChild() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:287:1: ( ruleOrGroupChild EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:288:1: ruleOrGroupChild EOF
            {
             before(grammarAccess.getOrGroupChildRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrGroupChild_in_entryRuleOrGroupChild543);
            ruleOrGroupChild();

            state._fsp--;

             after(grammarAccess.getOrGroupChildRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrGroupChild550); 

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
    // $ANTLR end "entryRuleOrGroupChild"


    // $ANTLR start "ruleOrGroupChild"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:295:1: ruleOrGroupChild : ( ( rule__OrGroupChild__Group__0 ) ) ;
    public final void ruleOrGroupChild() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:299:2: ( ( ( rule__OrGroupChild__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:300:1: ( ( rule__OrGroupChild__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:300:1: ( ( rule__OrGroupChild__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:301:1: ( rule__OrGroupChild__Group__0 )
            {
             before(grammarAccess.getOrGroupChildAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:302:1: ( rule__OrGroupChild__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:302:2: rule__OrGroupChild__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__0_in_ruleOrGroupChild576);
            rule__OrGroupChild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupChildAccess().getGroup()); 

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
    // $ANTLR end "ruleOrGroupChild"


    // $ANTLR start "entryRuleAlternativeGroup"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:314:1: entryRuleAlternativeGroup : ruleAlternativeGroup EOF ;
    public final void entryRuleAlternativeGroup() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:315:1: ( ruleAlternativeGroup EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:316:1: ruleAlternativeGroup EOF
            {
             before(grammarAccess.getAlternativeGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternativeGroup_in_entryRuleAlternativeGroup603);
            ruleAlternativeGroup();

            state._fsp--;

             after(grammarAccess.getAlternativeGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternativeGroup610); 

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
    // $ANTLR end "entryRuleAlternativeGroup"


    // $ANTLR start "ruleAlternativeGroup"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:323:1: ruleAlternativeGroup : ( ( rule__AlternativeGroup__Group__0 ) ) ;
    public final void ruleAlternativeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:327:2: ( ( ( rule__AlternativeGroup__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:328:1: ( ( rule__AlternativeGroup__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:328:1: ( ( rule__AlternativeGroup__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:329:1: ( rule__AlternativeGroup__Group__0 )
            {
             before(grammarAccess.getAlternativeGroupAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:330:1: ( rule__AlternativeGroup__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:330:2: rule__AlternativeGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__0_in_ruleAlternativeGroup636);
            rule__AlternativeGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleAlternativeGroup"


    // $ANTLR start "entryRuleVariabilityPoint"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:342:1: entryRuleVariabilityPoint : ruleVariabilityPoint EOF ;
    public final void entryRuleVariabilityPoint() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:343:1: ( ruleVariabilityPoint EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:344:1: ruleVariabilityPoint EOF
            {
             before(grammarAccess.getVariabilityPointRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_entryRuleVariabilityPoint663);
            ruleVariabilityPoint();

            state._fsp--;

             after(grammarAccess.getVariabilityPointRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariabilityPoint670); 

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
    // $ANTLR end "entryRuleVariabilityPoint"


    // $ANTLR start "ruleVariabilityPoint"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:351:1: ruleVariabilityPoint : ( ( rule__VariabilityPoint__Group__0 ) ) ;
    public final void ruleVariabilityPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:355:2: ( ( ( rule__VariabilityPoint__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:356:1: ( ( rule__VariabilityPoint__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:356:1: ( ( rule__VariabilityPoint__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:357:1: ( rule__VariabilityPoint__Group__0 )
            {
             before(grammarAccess.getVariabilityPointAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:358:1: ( rule__VariabilityPoint__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:358:2: rule__VariabilityPoint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__0_in_ruleVariabilityPoint696);
            rule__VariabilityPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getGroup()); 

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
    // $ANTLR end "ruleVariabilityPoint"


    // $ANTLR start "entryRuleVariation"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:370:1: entryRuleVariation : ruleVariation EOF ;
    public final void entryRuleVariation() throws RecognitionException {
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:371:1: ( ruleVariation EOF )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:372:1: ruleVariation EOF
            {
             before(grammarAccess.getVariationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariation_in_entryRuleVariation723);
            ruleVariation();

            state._fsp--;

             after(grammarAccess.getVariationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariation730); 

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
    // $ANTLR end "entryRuleVariation"


    // $ANTLR start "ruleVariation"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:379:1: ruleVariation : ( ( rule__Variation__Group__0 ) ) ;
    public final void ruleVariation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:383:2: ( ( ( rule__Variation__Group__0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:384:1: ( ( rule__Variation__Group__0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:384:1: ( ( rule__Variation__Group__0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:385:1: ( rule__Variation__Group__0 )
            {
             before(grammarAccess.getVariationAccess().getGroup()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:386:1: ( rule__Variation__Group__0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:386:2: rule__Variation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__0_in_ruleVariation756);
            rule__Variation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariation"


    // $ANTLR start "rule__Relation__Alternatives"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:398:1: rule__Relation__Alternatives : ( ( ruleMandatoryChild ) | ( ruleOptionalChild ) | ( ruleOrGroupChild ) | ( ruleAlternativeGroup ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:402:1: ( ( ruleMandatoryChild ) | ( ruleOptionalChild ) | ( ruleOrGroupChild ) | ( ruleAlternativeGroup ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:403:1: ( ruleMandatoryChild )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:403:1: ( ruleMandatoryChild )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:404:1: ruleMandatoryChild
                    {
                     before(grammarAccess.getRelationAccess().getMandatoryChildParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMandatoryChild_in_rule__Relation__Alternatives792);
                    ruleMandatoryChild();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getMandatoryChildParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:409:6: ( ruleOptionalChild )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:409:6: ( ruleOptionalChild )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:410:1: ruleOptionalChild
                    {
                     before(grammarAccess.getRelationAccess().getOptionalChildParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptionalChild_in_rule__Relation__Alternatives809);
                    ruleOptionalChild();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getOptionalChildParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:415:6: ( ruleOrGroupChild )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:415:6: ( ruleOrGroupChild )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:416:1: ruleOrGroupChild
                    {
                     before(grammarAccess.getRelationAccess().getOrGroupChildParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrGroupChild_in_rule__Relation__Alternatives826);
                    ruleOrGroupChild();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getOrGroupChildParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:421:6: ( ruleAlternativeGroup )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:421:6: ( ruleAlternativeGroup )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:422:1: ruleAlternativeGroup
                    {
                     before(grammarAccess.getRelationAccess().getAlternativeGroupParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAlternativeGroup_in_rule__Relation__Alternatives843);
                    ruleAlternativeGroup();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getAlternativeGroupParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Relation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:432:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:436:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:437:1: ( RULE_STRING )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:437:1: ( RULE_STRING )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:438:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives875); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:443:6: ( RULE_ID )
                    {
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:443:6: ( RULE_ID )
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:444:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives892); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__LanguageProductLine__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:457:1: rule__LanguageProductLine__Group__0 : rule__LanguageProductLine__Group__0__Impl rule__LanguageProductLine__Group__1 ;
    public final void rule__LanguageProductLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:461:1: ( rule__LanguageProductLine__Group__0__Impl rule__LanguageProductLine__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:462:2: rule__LanguageProductLine__Group__0__Impl rule__LanguageProductLine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__0__Impl_in_rule__LanguageProductLine__Group__0923);
            rule__LanguageProductLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__1_in_rule__LanguageProductLine__Group__0926);
            rule__LanguageProductLine__Group__1();

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
    // $ANTLR end "rule__LanguageProductLine__Group__0"


    // $ANTLR start "rule__LanguageProductLine__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:469:1: rule__LanguageProductLine__Group__0__Impl : ( () ) ;
    public final void rule__LanguageProductLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:473:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:474:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:474:1: ( () )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:475:1: ()
            {
             before(grammarAccess.getLanguageProductLineAccess().getLanguageProductLineAction_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:476:1: ()
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:478:1: 
            {
            }

             after(grammarAccess.getLanguageProductLineAccess().getLanguageProductLineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageProductLine__Group__0__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:488:1: rule__LanguageProductLine__Group__1 : rule__LanguageProductLine__Group__1__Impl rule__LanguageProductLine__Group__2 ;
    public final void rule__LanguageProductLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:492:1: ( rule__LanguageProductLine__Group__1__Impl rule__LanguageProductLine__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:493:2: rule__LanguageProductLine__Group__1__Impl rule__LanguageProductLine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__1__Impl_in_rule__LanguageProductLine__Group__1984);
            rule__LanguageProductLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__2_in_rule__LanguageProductLine__Group__1987);
            rule__LanguageProductLine__Group__2();

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
    // $ANTLR end "rule__LanguageProductLine__Group__1"


    // $ANTLR start "rule__LanguageProductLine__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:500:1: rule__LanguageProductLine__Group__1__Impl : ( ( rule__LanguageProductLine__Group_1__0 )? ) ;
    public final void rule__LanguageProductLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:504:1: ( ( ( rule__LanguageProductLine__Group_1__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:505:1: ( ( rule__LanguageProductLine__Group_1__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:505:1: ( ( rule__LanguageProductLine__Group_1__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:506:1: ( rule__LanguageProductLine__Group_1__0 )?
            {
             before(grammarAccess.getLanguageProductLineAccess().getGroup_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:507:1: ( rule__LanguageProductLine__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:507:2: rule__LanguageProductLine__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_1__0_in_rule__LanguageProductLine__Group__1__Impl1014);
                    rule__LanguageProductLine__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageProductLineAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group__1__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:517:1: rule__LanguageProductLine__Group__2 : rule__LanguageProductLine__Group__2__Impl rule__LanguageProductLine__Group__3 ;
    public final void rule__LanguageProductLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:521:1: ( rule__LanguageProductLine__Group__2__Impl rule__LanguageProductLine__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:522:2: rule__LanguageProductLine__Group__2__Impl rule__LanguageProductLine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__2__Impl_in_rule__LanguageProductLine__Group__21045);
            rule__LanguageProductLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__3_in_rule__LanguageProductLine__Group__21048);
            rule__LanguageProductLine__Group__3();

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
    // $ANTLR end "rule__LanguageProductLine__Group__2"


    // $ANTLR start "rule__LanguageProductLine__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:529:1: rule__LanguageProductLine__Group__2__Impl : ( ( rule__LanguageProductLine__Group_2__0 )? ) ;
    public final void rule__LanguageProductLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:533:1: ( ( ( rule__LanguageProductLine__Group_2__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:534:1: ( ( rule__LanguageProductLine__Group_2__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:534:1: ( ( rule__LanguageProductLine__Group_2__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:535:1: ( rule__LanguageProductLine__Group_2__0 )?
            {
             before(grammarAccess.getLanguageProductLineAccess().getGroup_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:536:1: ( rule__LanguageProductLine__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:536:2: rule__LanguageProductLine__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_2__0_in_rule__LanguageProductLine__Group__2__Impl1075);
                    rule__LanguageProductLine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageProductLineAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group__2__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:546:1: rule__LanguageProductLine__Group__3 : rule__LanguageProductLine__Group__3__Impl ;
    public final void rule__LanguageProductLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:550:1: ( rule__LanguageProductLine__Group__3__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:551:2: rule__LanguageProductLine__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group__3__Impl_in_rule__LanguageProductLine__Group__31106);
            rule__LanguageProductLine__Group__3__Impl();

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
    // $ANTLR end "rule__LanguageProductLine__Group__3"


    // $ANTLR start "rule__LanguageProductLine__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:557:1: rule__LanguageProductLine__Group__3__Impl : ( ( rule__LanguageProductLine__Group_3__0 )? ) ;
    public final void rule__LanguageProductLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:561:1: ( ( ( rule__LanguageProductLine__Group_3__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:562:1: ( ( rule__LanguageProductLine__Group_3__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:562:1: ( ( rule__LanguageProductLine__Group_3__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:563:1: ( rule__LanguageProductLine__Group_3__0 )?
            {
             before(grammarAccess.getLanguageProductLineAccess().getGroup_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:564:1: ( rule__LanguageProductLine__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:564:2: rule__LanguageProductLine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_3__0_in_rule__LanguageProductLine__Group__3__Impl1133);
                    rule__LanguageProductLine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageProductLineAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group__3__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_1__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:582:1: rule__LanguageProductLine__Group_1__0 : rule__LanguageProductLine__Group_1__0__Impl rule__LanguageProductLine__Group_1__1 ;
    public final void rule__LanguageProductLine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:586:1: ( rule__LanguageProductLine__Group_1__0__Impl rule__LanguageProductLine__Group_1__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:587:2: rule__LanguageProductLine__Group_1__0__Impl rule__LanguageProductLine__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_1__0__Impl_in_rule__LanguageProductLine__Group_1__01172);
            rule__LanguageProductLine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_1__1_in_rule__LanguageProductLine__Group_1__01175);
            rule__LanguageProductLine__Group_1__1();

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
    // $ANTLR end "rule__LanguageProductLine__Group_1__0"


    // $ANTLR start "rule__LanguageProductLine__Group_1__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:594:1: rule__LanguageProductLine__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__LanguageProductLine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:598:1: ( ( 'import' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:599:1: ( 'import' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:599:1: ( 'import' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:600:1: 'import'
            {
             before(grammarAccess.getLanguageProductLineAccess().getImportKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__LanguageProductLine__Group_1__0__Impl1203); 
             after(grammarAccess.getLanguageProductLineAccess().getImportKeyword_1_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_1__0__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_1__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:613:1: rule__LanguageProductLine__Group_1__1 : rule__LanguageProductLine__Group_1__1__Impl ;
    public final void rule__LanguageProductLine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:617:1: ( rule__LanguageProductLine__Group_1__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:618:2: rule__LanguageProductLine__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_1__1__Impl_in_rule__LanguageProductLine__Group_1__11234);
            rule__LanguageProductLine__Group_1__1__Impl();

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
    // $ANTLR end "rule__LanguageProductLine__Group_1__1"


    // $ANTLR start "rule__LanguageProductLine__Group_1__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:624:1: rule__LanguageProductLine__Group_1__1__Impl : ( ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 ) ) ;
    public final void rule__LanguageProductLine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:628:1: ( ( ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:629:1: ( ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:629:1: ( ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:630:1: ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 )
            {
             before(grammarAccess.getLanguageProductLineAccess().getImplementationFileAssignment_1_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:631:1: ( rule__LanguageProductLine__ImplementationFileAssignment_1_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:631:2: rule__LanguageProductLine__ImplementationFileAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__ImplementationFileAssignment_1_1_in_rule__LanguageProductLine__Group_1__1__Impl1261);
            rule__LanguageProductLine__ImplementationFileAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageProductLineAccess().getImplementationFileAssignment_1_1()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_1__1__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:645:1: rule__LanguageProductLine__Group_2__0 : rule__LanguageProductLine__Group_2__0__Impl rule__LanguageProductLine__Group_2__1 ;
    public final void rule__LanguageProductLine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:649:1: ( rule__LanguageProductLine__Group_2__0__Impl rule__LanguageProductLine__Group_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:650:2: rule__LanguageProductLine__Group_2__0__Impl rule__LanguageProductLine__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_2__0__Impl_in_rule__LanguageProductLine__Group_2__01295);
            rule__LanguageProductLine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_2__1_in_rule__LanguageProductLine__Group_2__01298);
            rule__LanguageProductLine__Group_2__1();

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
    // $ANTLR end "rule__LanguageProductLine__Group_2__0"


    // $ANTLR start "rule__LanguageProductLine__Group_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:657:1: rule__LanguageProductLine__Group_2__0__Impl : ( 'languagefeatures' ) ;
    public final void rule__LanguageProductLine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:661:1: ( ( 'languagefeatures' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:662:1: ( 'languagefeatures' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:662:1: ( 'languagefeatures' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:663:1: 'languagefeatures'
            {
             before(grammarAccess.getLanguageProductLineAccess().getLanguagefeaturesKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__LanguageProductLine__Group_2__0__Impl1326); 
             after(grammarAccess.getLanguageProductLineAccess().getLanguagefeaturesKeyword_2_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_2__0__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:676:1: rule__LanguageProductLine__Group_2__1 : rule__LanguageProductLine__Group_2__1__Impl ;
    public final void rule__LanguageProductLine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:680:1: ( rule__LanguageProductLine__Group_2__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:681:2: rule__LanguageProductLine__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_2__1__Impl_in_rule__LanguageProductLine__Group_2__11357);
            rule__LanguageProductLine__Group_2__1__Impl();

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
    // $ANTLR end "rule__LanguageProductLine__Group_2__1"


    // $ANTLR start "rule__LanguageProductLine__Group_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:687:1: rule__LanguageProductLine__Group_2__1__Impl : ( ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 ) ) ;
    public final void rule__LanguageProductLine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:691:1: ( ( ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:692:1: ( ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:692:1: ( ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:693:1: ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 )
            {
             before(grammarAccess.getLanguageProductLineAccess().getProductLineVariabilityAssignment_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:694:1: ( rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:694:2: rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1_in_rule__LanguageProductLine__Group_2__1__Impl1384);
            rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageProductLineAccess().getProductLineVariabilityAssignment_2_1()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_2__1__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_3__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:708:1: rule__LanguageProductLine__Group_3__0 : rule__LanguageProductLine__Group_3__0__Impl rule__LanguageProductLine__Group_3__1 ;
    public final void rule__LanguageProductLine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:712:1: ( rule__LanguageProductLine__Group_3__0__Impl rule__LanguageProductLine__Group_3__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:713:2: rule__LanguageProductLine__Group_3__0__Impl rule__LanguageProductLine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_3__0__Impl_in_rule__LanguageProductLine__Group_3__01418);
            rule__LanguageProductLine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_3__1_in_rule__LanguageProductLine__Group_3__01421);
            rule__LanguageProductLine__Group_3__1();

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
    // $ANTLR end "rule__LanguageProductLine__Group_3__0"


    // $ANTLR start "rule__LanguageProductLine__Group_3__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:720:1: rule__LanguageProductLine__Group_3__0__Impl : ( 'orthogonalvariability' ) ;
    public final void rule__LanguageProductLine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:724:1: ( ( 'orthogonalvariability' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:725:1: ( 'orthogonalvariability' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:725:1: ( 'orthogonalvariability' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:726:1: 'orthogonalvariability'
            {
             before(grammarAccess.getLanguageProductLineAccess().getOrthogonalvariabilityKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__LanguageProductLine__Group_3__0__Impl1449); 
             after(grammarAccess.getLanguageProductLineAccess().getOrthogonalvariabilityKeyword_3_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_3__0__Impl"


    // $ANTLR start "rule__LanguageProductLine__Group_3__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:739:1: rule__LanguageProductLine__Group_3__1 : rule__LanguageProductLine__Group_3__1__Impl ;
    public final void rule__LanguageProductLine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:743:1: ( rule__LanguageProductLine__Group_3__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:744:2: rule__LanguageProductLine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__Group_3__1__Impl_in_rule__LanguageProductLine__Group_3__11480);
            rule__LanguageProductLine__Group_3__1__Impl();

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
    // $ANTLR end "rule__LanguageProductLine__Group_3__1"


    // $ANTLR start "rule__LanguageProductLine__Group_3__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:750:1: rule__LanguageProductLine__Group_3__1__Impl : ( ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 ) ) ;
    public final void rule__LanguageProductLine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:754:1: ( ( ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:755:1: ( ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:755:1: ( ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:756:1: ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 )
            {
             before(grammarAccess.getLanguageProductLineAccess().getLanguageVariabilityAssignment_3_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:757:1: ( rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:757:2: rule__LanguageProductLine__LanguageVariabilityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageProductLine__LanguageVariabilityAssignment_3_1_in_rule__LanguageProductLine__Group_3__1__Impl1507);
            rule__LanguageProductLine__LanguageVariabilityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageProductLineAccess().getLanguageVariabilityAssignment_3_1()); 

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
    // $ANTLR end "rule__LanguageProductLine__Group_3__1__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:771:1: rule__ProductLineVariability__Group__0 : rule__ProductLineVariability__Group__0__Impl rule__ProductLineVariability__Group__1 ;
    public final void rule__ProductLineVariability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:775:1: ( rule__ProductLineVariability__Group__0__Impl rule__ProductLineVariability__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:776:2: rule__ProductLineVariability__Group__0__Impl rule__ProductLineVariability__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__0__Impl_in_rule__ProductLineVariability__Group__01541);
            rule__ProductLineVariability__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__1_in_rule__ProductLineVariability__Group__01544);
            rule__ProductLineVariability__Group__1();

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
    // $ANTLR end "rule__ProductLineVariability__Group__0"


    // $ANTLR start "rule__ProductLineVariability__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:783:1: rule__ProductLineVariability__Group__0__Impl : ( '{' ) ;
    public final void rule__ProductLineVariability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:787:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:788:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:788:1: ( '{' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:789:1: '{'
            {
             before(grammarAccess.getProductLineVariabilityAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ProductLineVariability__Group__0__Impl1572); 
             after(grammarAccess.getProductLineVariabilityAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__0__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:802:1: rule__ProductLineVariability__Group__1 : rule__ProductLineVariability__Group__1__Impl rule__ProductLineVariability__Group__2 ;
    public final void rule__ProductLineVariability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:806:1: ( rule__ProductLineVariability__Group__1__Impl rule__ProductLineVariability__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:807:2: rule__ProductLineVariability__Group__1__Impl rule__ProductLineVariability__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__1__Impl_in_rule__ProductLineVariability__Group__11603);
            rule__ProductLineVariability__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__2_in_rule__ProductLineVariability__Group__11606);
            rule__ProductLineVariability__Group__2();

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
    // $ANTLR end "rule__ProductLineVariability__Group__1"


    // $ANTLR start "rule__ProductLineVariability__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:814:1: rule__ProductLineVariability__Group__1__Impl : ( ( rule__ProductLineVariability__FeaturesAssignment_1 ) ) ;
    public final void rule__ProductLineVariability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:818:1: ( ( ( rule__ProductLineVariability__FeaturesAssignment_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:819:1: ( ( rule__ProductLineVariability__FeaturesAssignment_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:819:1: ( ( rule__ProductLineVariability__FeaturesAssignment_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:820:1: ( rule__ProductLineVariability__FeaturesAssignment_1 )
            {
             before(grammarAccess.getProductLineVariabilityAccess().getFeaturesAssignment_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:821:1: ( rule__ProductLineVariability__FeaturesAssignment_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:821:2: rule__ProductLineVariability__FeaturesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__FeaturesAssignment_1_in_rule__ProductLineVariability__Group__1__Impl1633);
            rule__ProductLineVariability__FeaturesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductLineVariabilityAccess().getFeaturesAssignment_1()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__1__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:831:1: rule__ProductLineVariability__Group__2 : rule__ProductLineVariability__Group__2__Impl rule__ProductLineVariability__Group__3 ;
    public final void rule__ProductLineVariability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:835:1: ( rule__ProductLineVariability__Group__2__Impl rule__ProductLineVariability__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:836:2: rule__ProductLineVariability__Group__2__Impl rule__ProductLineVariability__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__2__Impl_in_rule__ProductLineVariability__Group__21663);
            rule__ProductLineVariability__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__3_in_rule__ProductLineVariability__Group__21666);
            rule__ProductLineVariability__Group__3();

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
    // $ANTLR end "rule__ProductLineVariability__Group__2"


    // $ANTLR start "rule__ProductLineVariability__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:843:1: rule__ProductLineVariability__Group__2__Impl : ( ( rule__ProductLineVariability__FeaturesAssignment_2 )* ) ;
    public final void rule__ProductLineVariability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:847:1: ( ( ( rule__ProductLineVariability__FeaturesAssignment_2 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:848:1: ( ( rule__ProductLineVariability__FeaturesAssignment_2 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:848:1: ( ( rule__ProductLineVariability__FeaturesAssignment_2 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:849:1: ( rule__ProductLineVariability__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getProductLineVariabilityAccess().getFeaturesAssignment_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:850:1: ( rule__ProductLineVariability__FeaturesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:850:2: rule__ProductLineVariability__FeaturesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__FeaturesAssignment_2_in_rule__ProductLineVariability__Group__2__Impl1693);
            	    rule__ProductLineVariability__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProductLineVariabilityAccess().getFeaturesAssignment_2()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__2__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:860:1: rule__ProductLineVariability__Group__3 : rule__ProductLineVariability__Group__3__Impl rule__ProductLineVariability__Group__4 ;
    public final void rule__ProductLineVariability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:864:1: ( rule__ProductLineVariability__Group__3__Impl rule__ProductLineVariability__Group__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:865:2: rule__ProductLineVariability__Group__3__Impl rule__ProductLineVariability__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__3__Impl_in_rule__ProductLineVariability__Group__31724);
            rule__ProductLineVariability__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__4_in_rule__ProductLineVariability__Group__31727);
            rule__ProductLineVariability__Group__4();

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
    // $ANTLR end "rule__ProductLineVariability__Group__3"


    // $ANTLR start "rule__ProductLineVariability__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:872:1: rule__ProductLineVariability__Group__3__Impl : ( 'root' ) ;
    public final void rule__ProductLineVariability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:876:1: ( ( 'root' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:877:1: ( 'root' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:877:1: ( 'root' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:878:1: 'root'
            {
             before(grammarAccess.getProductLineVariabilityAccess().getRootKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ProductLineVariability__Group__3__Impl1755); 
             after(grammarAccess.getProductLineVariabilityAccess().getRootKeyword_3()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__3__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:891:1: rule__ProductLineVariability__Group__4 : rule__ProductLineVariability__Group__4__Impl rule__ProductLineVariability__Group__5 ;
    public final void rule__ProductLineVariability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:895:1: ( rule__ProductLineVariability__Group__4__Impl rule__ProductLineVariability__Group__5 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:896:2: rule__ProductLineVariability__Group__4__Impl rule__ProductLineVariability__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__4__Impl_in_rule__ProductLineVariability__Group__41786);
            rule__ProductLineVariability__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__5_in_rule__ProductLineVariability__Group__41789);
            rule__ProductLineVariability__Group__5();

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
    // $ANTLR end "rule__ProductLineVariability__Group__4"


    // $ANTLR start "rule__ProductLineVariability__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:903:1: rule__ProductLineVariability__Group__4__Impl : ( ( rule__ProductLineVariability__RootFeatureAssignment_4 ) ) ;
    public final void rule__ProductLineVariability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:907:1: ( ( ( rule__ProductLineVariability__RootFeatureAssignment_4 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:908:1: ( ( rule__ProductLineVariability__RootFeatureAssignment_4 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:908:1: ( ( rule__ProductLineVariability__RootFeatureAssignment_4 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:909:1: ( rule__ProductLineVariability__RootFeatureAssignment_4 )
            {
             before(grammarAccess.getProductLineVariabilityAccess().getRootFeatureAssignment_4()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:910:1: ( rule__ProductLineVariability__RootFeatureAssignment_4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:910:2: rule__ProductLineVariability__RootFeatureAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__RootFeatureAssignment_4_in_rule__ProductLineVariability__Group__4__Impl1816);
            rule__ProductLineVariability__RootFeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProductLineVariabilityAccess().getRootFeatureAssignment_4()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__4__Impl"


    // $ANTLR start "rule__ProductLineVariability__Group__5"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:920:1: rule__ProductLineVariability__Group__5 : rule__ProductLineVariability__Group__5__Impl ;
    public final void rule__ProductLineVariability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:924:1: ( rule__ProductLineVariability__Group__5__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:925:2: rule__ProductLineVariability__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProductLineVariability__Group__5__Impl_in_rule__ProductLineVariability__Group__51846);
            rule__ProductLineVariability__Group__5__Impl();

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
    // $ANTLR end "rule__ProductLineVariability__Group__5"


    // $ANTLR start "rule__ProductLineVariability__Group__5__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:931:1: rule__ProductLineVariability__Group__5__Impl : ( '}' ) ;
    public final void rule__ProductLineVariability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:935:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:936:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:936:1: ( '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:937:1: '}'
            {
             before(grammarAccess.getProductLineVariabilityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ProductLineVariability__Group__5__Impl1874); 
             after(grammarAccess.getProductLineVariabilityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ProductLineVariability__Group__5__Impl"


    // $ANTLR start "rule__LanguageVariability__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:962:1: rule__LanguageVariability__Group__0 : rule__LanguageVariability__Group__0__Impl rule__LanguageVariability__Group__1 ;
    public final void rule__LanguageVariability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:966:1: ( rule__LanguageVariability__Group__0__Impl rule__LanguageVariability__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:967:2: rule__LanguageVariability__Group__0__Impl rule__LanguageVariability__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__0__Impl_in_rule__LanguageVariability__Group__01917);
            rule__LanguageVariability__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__1_in_rule__LanguageVariability__Group__01920);
            rule__LanguageVariability__Group__1();

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
    // $ANTLR end "rule__LanguageVariability__Group__0"


    // $ANTLR start "rule__LanguageVariability__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:974:1: rule__LanguageVariability__Group__0__Impl : ( () ) ;
    public final void rule__LanguageVariability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:978:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:979:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:979:1: ( () )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:980:1: ()
            {
             before(grammarAccess.getLanguageVariabilityAccess().getLanguageVariabilityAction_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:981:1: ()
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:983:1: 
            {
            }

             after(grammarAccess.getLanguageVariabilityAccess().getLanguageVariabilityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageVariability__Group__0__Impl"


    // $ANTLR start "rule__LanguageVariability__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:993:1: rule__LanguageVariability__Group__1 : rule__LanguageVariability__Group__1__Impl rule__LanguageVariability__Group__2 ;
    public final void rule__LanguageVariability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:997:1: ( rule__LanguageVariability__Group__1__Impl rule__LanguageVariability__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:998:2: rule__LanguageVariability__Group__1__Impl rule__LanguageVariability__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__1__Impl_in_rule__LanguageVariability__Group__11978);
            rule__LanguageVariability__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__2_in_rule__LanguageVariability__Group__11981);
            rule__LanguageVariability__Group__2();

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
    // $ANTLR end "rule__LanguageVariability__Group__1"


    // $ANTLR start "rule__LanguageVariability__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1005:1: rule__LanguageVariability__Group__1__Impl : ( '{' ) ;
    public final void rule__LanguageVariability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1009:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1010:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1010:1: ( '{' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1011:1: '{'
            {
             before(grammarAccess.getLanguageVariabilityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LanguageVariability__Group__1__Impl2009); 
             after(grammarAccess.getLanguageVariabilityAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__LanguageVariability__Group__1__Impl"


    // $ANTLR start "rule__LanguageVariability__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1024:1: rule__LanguageVariability__Group__2 : rule__LanguageVariability__Group__2__Impl rule__LanguageVariability__Group__3 ;
    public final void rule__LanguageVariability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1028:1: ( rule__LanguageVariability__Group__2__Impl rule__LanguageVariability__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1029:2: rule__LanguageVariability__Group__2__Impl rule__LanguageVariability__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__2__Impl_in_rule__LanguageVariability__Group__22040);
            rule__LanguageVariability__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__3_in_rule__LanguageVariability__Group__22043);
            rule__LanguageVariability__Group__3();

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
    // $ANTLR end "rule__LanguageVariability__Group__2"


    // $ANTLR start "rule__LanguageVariability__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1036:1: rule__LanguageVariability__Group__2__Impl : ( ( rule__LanguageVariability__Group_2__0 )? ) ;
    public final void rule__LanguageVariability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1040:1: ( ( ( rule__LanguageVariability__Group_2__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1041:1: ( ( rule__LanguageVariability__Group_2__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1041:1: ( ( rule__LanguageVariability__Group_2__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1042:1: ( rule__LanguageVariability__Group_2__0 )?
            {
             before(grammarAccess.getLanguageVariabilityAccess().getGroup_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1043:1: ( rule__LanguageVariability__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1043:2: rule__LanguageVariability__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group_2__0_in_rule__LanguageVariability__Group__2__Impl2070);
                    rule__LanguageVariability__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageVariabilityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LanguageVariability__Group__2__Impl"


    // $ANTLR start "rule__LanguageVariability__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1053:1: rule__LanguageVariability__Group__3 : rule__LanguageVariability__Group__3__Impl ;
    public final void rule__LanguageVariability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1057:1: ( rule__LanguageVariability__Group__3__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1058:2: rule__LanguageVariability__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group__3__Impl_in_rule__LanguageVariability__Group__32101);
            rule__LanguageVariability__Group__3__Impl();

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
    // $ANTLR end "rule__LanguageVariability__Group__3"


    // $ANTLR start "rule__LanguageVariability__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1064:1: rule__LanguageVariability__Group__3__Impl : ( '}' ) ;
    public final void rule__LanguageVariability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1068:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1069:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1069:1: ( '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1070:1: '}'
            {
             before(grammarAccess.getLanguageVariabilityAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LanguageVariability__Group__3__Impl2129); 
             after(grammarAccess.getLanguageVariabilityAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LanguageVariability__Group__3__Impl"


    // $ANTLR start "rule__LanguageVariability__Group_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1091:1: rule__LanguageVariability__Group_2__0 : rule__LanguageVariability__Group_2__0__Impl rule__LanguageVariability__Group_2__1 ;
    public final void rule__LanguageVariability__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1095:1: ( rule__LanguageVariability__Group_2__0__Impl rule__LanguageVariability__Group_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1096:2: rule__LanguageVariability__Group_2__0__Impl rule__LanguageVariability__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group_2__0__Impl_in_rule__LanguageVariability__Group_2__02168);
            rule__LanguageVariability__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group_2__1_in_rule__LanguageVariability__Group_2__02171);
            rule__LanguageVariability__Group_2__1();

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
    // $ANTLR end "rule__LanguageVariability__Group_2__0"


    // $ANTLR start "rule__LanguageVariability__Group_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1103:1: rule__LanguageVariability__Group_2__0__Impl : ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 ) ) ;
    public final void rule__LanguageVariability__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1107:1: ( ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1108:1: ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1108:1: ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1109:1: ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 )
            {
             before(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsAssignment_2_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1110:1: ( rule__LanguageVariability__VariabilityPointsAssignment_2_0 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1110:2: rule__LanguageVariability__VariabilityPointsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__VariabilityPointsAssignment_2_0_in_rule__LanguageVariability__Group_2__0__Impl2198);
            rule__LanguageVariability__VariabilityPointsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsAssignment_2_0()); 

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
    // $ANTLR end "rule__LanguageVariability__Group_2__0__Impl"


    // $ANTLR start "rule__LanguageVariability__Group_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1120:1: rule__LanguageVariability__Group_2__1 : rule__LanguageVariability__Group_2__1__Impl ;
    public final void rule__LanguageVariability__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1124:1: ( rule__LanguageVariability__Group_2__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1125:2: rule__LanguageVariability__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__Group_2__1__Impl_in_rule__LanguageVariability__Group_2__12228);
            rule__LanguageVariability__Group_2__1__Impl();

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
    // $ANTLR end "rule__LanguageVariability__Group_2__1"


    // $ANTLR start "rule__LanguageVariability__Group_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1131:1: rule__LanguageVariability__Group_2__1__Impl : ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )* ) ;
    public final void rule__LanguageVariability__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1135:1: ( ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1136:1: ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1136:1: ( ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1137:1: ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )*
            {
             before(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsAssignment_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1138:1: ( rule__LanguageVariability__VariabilityPointsAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1138:2: rule__LanguageVariability__VariabilityPointsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LanguageVariability__VariabilityPointsAssignment_2_1_in_rule__LanguageVariability__Group_2__1__Impl2255);
            	    rule__LanguageVariability__VariabilityPointsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsAssignment_2_1()); 

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
    // $ANTLR end "rule__LanguageVariability__Group_2__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1152:1: rule__LanguageFeature__Group__0 : rule__LanguageFeature__Group__0__Impl rule__LanguageFeature__Group__1 ;
    public final void rule__LanguageFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1156:1: ( rule__LanguageFeature__Group__0__Impl rule__LanguageFeature__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1157:2: rule__LanguageFeature__Group__0__Impl rule__LanguageFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__0__Impl_in_rule__LanguageFeature__Group__02290);
            rule__LanguageFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__1_in_rule__LanguageFeature__Group__02293);
            rule__LanguageFeature__Group__1();

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
    // $ANTLR end "rule__LanguageFeature__Group__0"


    // $ANTLR start "rule__LanguageFeature__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1164:1: rule__LanguageFeature__Group__0__Impl : ( () ) ;
    public final void rule__LanguageFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1168:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1169:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1169:1: ( () )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1170:1: ()
            {
             before(grammarAccess.getLanguageFeatureAccess().getLanguageFeatureAction_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1171:1: ()
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1173:1: 
            {
            }

             after(grammarAccess.getLanguageFeatureAccess().getLanguageFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageFeature__Group__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1183:1: rule__LanguageFeature__Group__1 : rule__LanguageFeature__Group__1__Impl rule__LanguageFeature__Group__2 ;
    public final void rule__LanguageFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1187:1: ( rule__LanguageFeature__Group__1__Impl rule__LanguageFeature__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1188:2: rule__LanguageFeature__Group__1__Impl rule__LanguageFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__1__Impl_in_rule__LanguageFeature__Group__12351);
            rule__LanguageFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__2_in_rule__LanguageFeature__Group__12354);
            rule__LanguageFeature__Group__2();

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
    // $ANTLR end "rule__LanguageFeature__Group__1"


    // $ANTLR start "rule__LanguageFeature__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1195:1: rule__LanguageFeature__Group__1__Impl : ( ( rule__LanguageFeature__AbstractAssignment_1 )? ) ;
    public final void rule__LanguageFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1199:1: ( ( ( rule__LanguageFeature__AbstractAssignment_1 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1200:1: ( ( rule__LanguageFeature__AbstractAssignment_1 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1200:1: ( ( rule__LanguageFeature__AbstractAssignment_1 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1201:1: ( rule__LanguageFeature__AbstractAssignment_1 )?
            {
             before(grammarAccess.getLanguageFeatureAccess().getAbstractAssignment_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1202:1: ( rule__LanguageFeature__AbstractAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1202:2: rule__LanguageFeature__AbstractAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__AbstractAssignment_1_in_rule__LanguageFeature__Group__1__Impl2381);
                    rule__LanguageFeature__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageFeatureAccess().getAbstractAssignment_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1212:1: rule__LanguageFeature__Group__2 : rule__LanguageFeature__Group__2__Impl rule__LanguageFeature__Group__3 ;
    public final void rule__LanguageFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1216:1: ( rule__LanguageFeature__Group__2__Impl rule__LanguageFeature__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1217:2: rule__LanguageFeature__Group__2__Impl rule__LanguageFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__2__Impl_in_rule__LanguageFeature__Group__22412);
            rule__LanguageFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__3_in_rule__LanguageFeature__Group__22415);
            rule__LanguageFeature__Group__3();

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
    // $ANTLR end "rule__LanguageFeature__Group__2"


    // $ANTLR start "rule__LanguageFeature__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1224:1: rule__LanguageFeature__Group__2__Impl : ( 'languagefeature' ) ;
    public final void rule__LanguageFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1228:1: ( ( 'languagefeature' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1229:1: ( 'languagefeature' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1229:1: ( 'languagefeature' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1230:1: 'languagefeature'
            {
             before(grammarAccess.getLanguageFeatureAccess().getLanguagefeatureKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__LanguageFeature__Group__2__Impl2443); 
             after(grammarAccess.getLanguageFeatureAccess().getLanguagefeatureKeyword_2()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__2__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1243:1: rule__LanguageFeature__Group__3 : rule__LanguageFeature__Group__3__Impl rule__LanguageFeature__Group__4 ;
    public final void rule__LanguageFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1247:1: ( rule__LanguageFeature__Group__3__Impl rule__LanguageFeature__Group__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1248:2: rule__LanguageFeature__Group__3__Impl rule__LanguageFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__3__Impl_in_rule__LanguageFeature__Group__32474);
            rule__LanguageFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__4_in_rule__LanguageFeature__Group__32477);
            rule__LanguageFeature__Group__4();

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
    // $ANTLR end "rule__LanguageFeature__Group__3"


    // $ANTLR start "rule__LanguageFeature__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1255:1: rule__LanguageFeature__Group__3__Impl : ( ( rule__LanguageFeature__NameAssignment_3 ) ) ;
    public final void rule__LanguageFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1259:1: ( ( ( rule__LanguageFeature__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1260:1: ( ( rule__LanguageFeature__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1260:1: ( ( rule__LanguageFeature__NameAssignment_3 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1261:1: ( rule__LanguageFeature__NameAssignment_3 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1262:1: ( rule__LanguageFeature__NameAssignment_3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1262:2: rule__LanguageFeature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__NameAssignment_3_in_rule__LanguageFeature__Group__3__Impl2504);
            rule__LanguageFeature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__3__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1272:1: rule__LanguageFeature__Group__4 : rule__LanguageFeature__Group__4__Impl rule__LanguageFeature__Group__5 ;
    public final void rule__LanguageFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1276:1: ( rule__LanguageFeature__Group__4__Impl rule__LanguageFeature__Group__5 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1277:2: rule__LanguageFeature__Group__4__Impl rule__LanguageFeature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__4__Impl_in_rule__LanguageFeature__Group__42534);
            rule__LanguageFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__5_in_rule__LanguageFeature__Group__42537);
            rule__LanguageFeature__Group__5();

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
    // $ANTLR end "rule__LanguageFeature__Group__4"


    // $ANTLR start "rule__LanguageFeature__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1284:1: rule__LanguageFeature__Group__4__Impl : ( ( rule__LanguageFeature__Group_4__0 )? ) ;
    public final void rule__LanguageFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1288:1: ( ( ( rule__LanguageFeature__Group_4__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1289:1: ( ( rule__LanguageFeature__Group_4__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1289:1: ( ( rule__LanguageFeature__Group_4__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1290:1: ( rule__LanguageFeature__Group_4__0 )?
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_4()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1291:1: ( rule__LanguageFeature__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1291:2: rule__LanguageFeature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__0_in_rule__LanguageFeature__Group__4__Impl2564);
                    rule__LanguageFeature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageFeatureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__4__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__5"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1301:1: rule__LanguageFeature__Group__5 : rule__LanguageFeature__Group__5__Impl rule__LanguageFeature__Group__6 ;
    public final void rule__LanguageFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1305:1: ( rule__LanguageFeature__Group__5__Impl rule__LanguageFeature__Group__6 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1306:2: rule__LanguageFeature__Group__5__Impl rule__LanguageFeature__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__5__Impl_in_rule__LanguageFeature__Group__52595);
            rule__LanguageFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__6_in_rule__LanguageFeature__Group__52598);
            rule__LanguageFeature__Group__6();

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
    // $ANTLR end "rule__LanguageFeature__Group__5"


    // $ANTLR start "rule__LanguageFeature__Group__5__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1313:1: rule__LanguageFeature__Group__5__Impl : ( ( rule__LanguageFeature__Group_5__0 )? ) ;
    public final void rule__LanguageFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1317:1: ( ( ( rule__LanguageFeature__Group_5__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1318:1: ( ( rule__LanguageFeature__Group_5__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1318:1: ( ( rule__LanguageFeature__Group_5__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1319:1: ( rule__LanguageFeature__Group_5__0 )?
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_5()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1320:1: ( rule__LanguageFeature__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1320:2: rule__LanguageFeature__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__0_in_rule__LanguageFeature__Group__5__Impl2625);
                    rule__LanguageFeature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__5__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__6"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1330:1: rule__LanguageFeature__Group__6 : rule__LanguageFeature__Group__6__Impl rule__LanguageFeature__Group__7 ;
    public final void rule__LanguageFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1334:1: ( rule__LanguageFeature__Group__6__Impl rule__LanguageFeature__Group__7 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1335:2: rule__LanguageFeature__Group__6__Impl rule__LanguageFeature__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__6__Impl_in_rule__LanguageFeature__Group__62656);
            rule__LanguageFeature__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__7_in_rule__LanguageFeature__Group__62659);
            rule__LanguageFeature__Group__7();

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
    // $ANTLR end "rule__LanguageFeature__Group__6"


    // $ANTLR start "rule__LanguageFeature__Group__6__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1342:1: rule__LanguageFeature__Group__6__Impl : ( '{' ) ;
    public final void rule__LanguageFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1346:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1347:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1347:1: ( '{' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1348:1: '{'
            {
             before(grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LanguageFeature__Group__6__Impl2687); 
             after(grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__6__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__7"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1361:1: rule__LanguageFeature__Group__7 : rule__LanguageFeature__Group__7__Impl rule__LanguageFeature__Group__8 ;
    public final void rule__LanguageFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1365:1: ( rule__LanguageFeature__Group__7__Impl rule__LanguageFeature__Group__8 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1366:2: rule__LanguageFeature__Group__7__Impl rule__LanguageFeature__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__7__Impl_in_rule__LanguageFeature__Group__72718);
            rule__LanguageFeature__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__8_in_rule__LanguageFeature__Group__72721);
            rule__LanguageFeature__Group__8();

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
    // $ANTLR end "rule__LanguageFeature__Group__7"


    // $ANTLR start "rule__LanguageFeature__Group__7__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1373:1: rule__LanguageFeature__Group__7__Impl : ( ( rule__LanguageFeature__Group_7__0 )? ) ;
    public final void rule__LanguageFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1377:1: ( ( ( rule__LanguageFeature__Group_7__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1378:1: ( ( rule__LanguageFeature__Group_7__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1378:1: ( ( rule__LanguageFeature__Group_7__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1379:1: ( rule__LanguageFeature__Group_7__0 )?
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_7()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1380:1: ( rule__LanguageFeature__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1380:2: rule__LanguageFeature__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_7__0_in_rule__LanguageFeature__Group__7__Impl2748);
                    rule__LanguageFeature__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageFeatureAccess().getGroup_7()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__7__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__8"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1390:1: rule__LanguageFeature__Group__8 : rule__LanguageFeature__Group__8__Impl rule__LanguageFeature__Group__9 ;
    public final void rule__LanguageFeature__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1394:1: ( rule__LanguageFeature__Group__8__Impl rule__LanguageFeature__Group__9 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1395:2: rule__LanguageFeature__Group__8__Impl rule__LanguageFeature__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__8__Impl_in_rule__LanguageFeature__Group__82779);
            rule__LanguageFeature__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__9_in_rule__LanguageFeature__Group__82782);
            rule__LanguageFeature__Group__9();

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
    // $ANTLR end "rule__LanguageFeature__Group__8"


    // $ANTLR start "rule__LanguageFeature__Group__8__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1402:1: rule__LanguageFeature__Group__8__Impl : ( ( rule__LanguageFeature__Group_8__0 )? ) ;
    public final void rule__LanguageFeature__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1406:1: ( ( ( rule__LanguageFeature__Group_8__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1407:1: ( ( rule__LanguageFeature__Group_8__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1407:1: ( ( rule__LanguageFeature__Group_8__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1408:1: ( rule__LanguageFeature__Group_8__0 )?
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_8()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1409:1: ( rule__LanguageFeature__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1409:2: rule__LanguageFeature__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__0_in_rule__LanguageFeature__Group__8__Impl2809);
                    rule__LanguageFeature__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageFeatureAccess().getGroup_8()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__8__Impl"


    // $ANTLR start "rule__LanguageFeature__Group__9"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1419:1: rule__LanguageFeature__Group__9 : rule__LanguageFeature__Group__9__Impl ;
    public final void rule__LanguageFeature__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1423:1: ( rule__LanguageFeature__Group__9__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1424:2: rule__LanguageFeature__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group__9__Impl_in_rule__LanguageFeature__Group__92840);
            rule__LanguageFeature__Group__9__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group__9"


    // $ANTLR start "rule__LanguageFeature__Group__9__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1430:1: rule__LanguageFeature__Group__9__Impl : ( '}' ) ;
    public final void rule__LanguageFeature__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1434:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1435:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1435:1: ( '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1436:1: '}'
            {
             before(grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LanguageFeature__Group__9__Impl2868); 
             after(grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__LanguageFeature__Group__9__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_4__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1469:1: rule__LanguageFeature__Group_4__0 : rule__LanguageFeature__Group_4__0__Impl rule__LanguageFeature__Group_4__1 ;
    public final void rule__LanguageFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1473:1: ( rule__LanguageFeature__Group_4__0__Impl rule__LanguageFeature__Group_4__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1474:2: rule__LanguageFeature__Group_4__0__Impl rule__LanguageFeature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__0__Impl_in_rule__LanguageFeature__Group_4__02919);
            rule__LanguageFeature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__1_in_rule__LanguageFeature__Group_4__02922);
            rule__LanguageFeature__Group_4__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_4__0"


    // $ANTLR start "rule__LanguageFeature__Group_4__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1481:1: rule__LanguageFeature__Group_4__0__Impl : ( 'requires' ) ;
    public final void rule__LanguageFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1485:1: ( ( 'requires' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1486:1: ( 'requires' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1486:1: ( 'requires' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1487:1: 'requires'
            {
             before(grammarAccess.getLanguageFeatureAccess().getRequiresKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__LanguageFeature__Group_4__0__Impl2950); 
             after(grammarAccess.getLanguageFeatureAccess().getRequiresKeyword_4_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_4__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_4__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1500:1: rule__LanguageFeature__Group_4__1 : rule__LanguageFeature__Group_4__1__Impl rule__LanguageFeature__Group_4__2 ;
    public final void rule__LanguageFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1504:1: ( rule__LanguageFeature__Group_4__1__Impl rule__LanguageFeature__Group_4__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1505:2: rule__LanguageFeature__Group_4__1__Impl rule__LanguageFeature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__1__Impl_in_rule__LanguageFeature__Group_4__12981);
            rule__LanguageFeature__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__2_in_rule__LanguageFeature__Group_4__12984);
            rule__LanguageFeature__Group_4__2();

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
    // $ANTLR end "rule__LanguageFeature__Group_4__1"


    // $ANTLR start "rule__LanguageFeature__Group_4__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1512:1: rule__LanguageFeature__Group_4__1__Impl : ( ( rule__LanguageFeature__DependsAssignment_4_1 ) ) ;
    public final void rule__LanguageFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1516:1: ( ( ( rule__LanguageFeature__DependsAssignment_4_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1517:1: ( ( rule__LanguageFeature__DependsAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1517:1: ( ( rule__LanguageFeature__DependsAssignment_4_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1518:1: ( rule__LanguageFeature__DependsAssignment_4_1 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsAssignment_4_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1519:1: ( rule__LanguageFeature__DependsAssignment_4_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1519:2: rule__LanguageFeature__DependsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__DependsAssignment_4_1_in_rule__LanguageFeature__Group_4__1__Impl3011);
            rule__LanguageFeature__DependsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getDependsAssignment_4_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_4__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_4__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1529:1: rule__LanguageFeature__Group_4__2 : rule__LanguageFeature__Group_4__2__Impl ;
    public final void rule__LanguageFeature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1533:1: ( rule__LanguageFeature__Group_4__2__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1534:2: rule__LanguageFeature__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4__2__Impl_in_rule__LanguageFeature__Group_4__23041);
            rule__LanguageFeature__Group_4__2__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_4__2"


    // $ANTLR start "rule__LanguageFeature__Group_4__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1540:1: rule__LanguageFeature__Group_4__2__Impl : ( ( rule__LanguageFeature__Group_4_2__0 )* ) ;
    public final void rule__LanguageFeature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1544:1: ( ( ( rule__LanguageFeature__Group_4_2__0 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1545:1: ( ( rule__LanguageFeature__Group_4_2__0 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1545:1: ( ( rule__LanguageFeature__Group_4_2__0 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1546:1: ( rule__LanguageFeature__Group_4_2__0 )*
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_4_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1547:1: ( rule__LanguageFeature__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1547:2: rule__LanguageFeature__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4_2__0_in_rule__LanguageFeature__Group_4__2__Impl3068);
            	    rule__LanguageFeature__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLanguageFeatureAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_4__2__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_4_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1563:1: rule__LanguageFeature__Group_4_2__0 : rule__LanguageFeature__Group_4_2__0__Impl rule__LanguageFeature__Group_4_2__1 ;
    public final void rule__LanguageFeature__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1567:1: ( rule__LanguageFeature__Group_4_2__0__Impl rule__LanguageFeature__Group_4_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1568:2: rule__LanguageFeature__Group_4_2__0__Impl rule__LanguageFeature__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4_2__0__Impl_in_rule__LanguageFeature__Group_4_2__03105);
            rule__LanguageFeature__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4_2__1_in_rule__LanguageFeature__Group_4_2__03108);
            rule__LanguageFeature__Group_4_2__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_4_2__0"


    // $ANTLR start "rule__LanguageFeature__Group_4_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1575:1: rule__LanguageFeature__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__LanguageFeature__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1579:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1580:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1580:1: ( ',' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1581:1: ','
            {
             before(grammarAccess.getLanguageFeatureAccess().getCommaKeyword_4_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LanguageFeature__Group_4_2__0__Impl3136); 
             after(grammarAccess.getLanguageFeatureAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_4_2__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_4_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1594:1: rule__LanguageFeature__Group_4_2__1 : rule__LanguageFeature__Group_4_2__1__Impl ;
    public final void rule__LanguageFeature__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1598:1: ( rule__LanguageFeature__Group_4_2__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1599:2: rule__LanguageFeature__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_4_2__1__Impl_in_rule__LanguageFeature__Group_4_2__13167);
            rule__LanguageFeature__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_4_2__1"


    // $ANTLR start "rule__LanguageFeature__Group_4_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1605:1: rule__LanguageFeature__Group_4_2__1__Impl : ( ( rule__LanguageFeature__DependsAssignment_4_2_1 ) ) ;
    public final void rule__LanguageFeature__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1609:1: ( ( ( rule__LanguageFeature__DependsAssignment_4_2_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1610:1: ( ( rule__LanguageFeature__DependsAssignment_4_2_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1610:1: ( ( rule__LanguageFeature__DependsAssignment_4_2_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1611:1: ( rule__LanguageFeature__DependsAssignment_4_2_1 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsAssignment_4_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1612:1: ( rule__LanguageFeature__DependsAssignment_4_2_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1612:2: rule__LanguageFeature__DependsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__DependsAssignment_4_2_1_in_rule__LanguageFeature__Group_4_2__1__Impl3194);
            rule__LanguageFeature__DependsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getDependsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_4_2__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_5__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1626:1: rule__LanguageFeature__Group_5__0 : rule__LanguageFeature__Group_5__0__Impl rule__LanguageFeature__Group_5__1 ;
    public final void rule__LanguageFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1630:1: ( rule__LanguageFeature__Group_5__0__Impl rule__LanguageFeature__Group_5__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1631:2: rule__LanguageFeature__Group_5__0__Impl rule__LanguageFeature__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__0__Impl_in_rule__LanguageFeature__Group_5__03228);
            rule__LanguageFeature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__1_in_rule__LanguageFeature__Group_5__03231);
            rule__LanguageFeature__Group_5__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_5__0"


    // $ANTLR start "rule__LanguageFeature__Group_5__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1638:1: rule__LanguageFeature__Group_5__0__Impl : ( 'excludes' ) ;
    public final void rule__LanguageFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1642:1: ( ( 'excludes' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1643:1: ( 'excludes' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1643:1: ( 'excludes' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1644:1: 'excludes'
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__LanguageFeature__Group_5__0__Impl3259); 
             after(grammarAccess.getLanguageFeatureAccess().getExcludesKeyword_5_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_5__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_5__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1657:1: rule__LanguageFeature__Group_5__1 : rule__LanguageFeature__Group_5__1__Impl rule__LanguageFeature__Group_5__2 ;
    public final void rule__LanguageFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1661:1: ( rule__LanguageFeature__Group_5__1__Impl rule__LanguageFeature__Group_5__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1662:2: rule__LanguageFeature__Group_5__1__Impl rule__LanguageFeature__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__1__Impl_in_rule__LanguageFeature__Group_5__13290);
            rule__LanguageFeature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__2_in_rule__LanguageFeature__Group_5__13293);
            rule__LanguageFeature__Group_5__2();

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
    // $ANTLR end "rule__LanguageFeature__Group_5__1"


    // $ANTLR start "rule__LanguageFeature__Group_5__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1669:1: rule__LanguageFeature__Group_5__1__Impl : ( ( rule__LanguageFeature__ExcludesAssignment_5_1 ) ) ;
    public final void rule__LanguageFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1673:1: ( ( ( rule__LanguageFeature__ExcludesAssignment_5_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1674:1: ( ( rule__LanguageFeature__ExcludesAssignment_5_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1674:1: ( ( rule__LanguageFeature__ExcludesAssignment_5_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1675:1: ( rule__LanguageFeature__ExcludesAssignment_5_1 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesAssignment_5_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1676:1: ( rule__LanguageFeature__ExcludesAssignment_5_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1676:2: rule__LanguageFeature__ExcludesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__ExcludesAssignment_5_1_in_rule__LanguageFeature__Group_5__1__Impl3320);
            rule__LanguageFeature__ExcludesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getExcludesAssignment_5_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_5__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_5__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1686:1: rule__LanguageFeature__Group_5__2 : rule__LanguageFeature__Group_5__2__Impl ;
    public final void rule__LanguageFeature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1690:1: ( rule__LanguageFeature__Group_5__2__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1691:2: rule__LanguageFeature__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5__2__Impl_in_rule__LanguageFeature__Group_5__23350);
            rule__LanguageFeature__Group_5__2__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_5__2"


    // $ANTLR start "rule__LanguageFeature__Group_5__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1697:1: rule__LanguageFeature__Group_5__2__Impl : ( ( rule__LanguageFeature__Group_5_2__0 )* ) ;
    public final void rule__LanguageFeature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1701:1: ( ( ( rule__LanguageFeature__Group_5_2__0 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1702:1: ( ( rule__LanguageFeature__Group_5_2__0 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1702:1: ( ( rule__LanguageFeature__Group_5_2__0 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1703:1: ( rule__LanguageFeature__Group_5_2__0 )*
            {
             before(grammarAccess.getLanguageFeatureAccess().getGroup_5_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1704:1: ( rule__LanguageFeature__Group_5_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1704:2: rule__LanguageFeature__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5_2__0_in_rule__LanguageFeature__Group_5__2__Impl3377);
            	    rule__LanguageFeature__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLanguageFeatureAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_5__2__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_5_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1720:1: rule__LanguageFeature__Group_5_2__0 : rule__LanguageFeature__Group_5_2__0__Impl rule__LanguageFeature__Group_5_2__1 ;
    public final void rule__LanguageFeature__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1724:1: ( rule__LanguageFeature__Group_5_2__0__Impl rule__LanguageFeature__Group_5_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1725:2: rule__LanguageFeature__Group_5_2__0__Impl rule__LanguageFeature__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5_2__0__Impl_in_rule__LanguageFeature__Group_5_2__03414);
            rule__LanguageFeature__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5_2__1_in_rule__LanguageFeature__Group_5_2__03417);
            rule__LanguageFeature__Group_5_2__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_5_2__0"


    // $ANTLR start "rule__LanguageFeature__Group_5_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1732:1: rule__LanguageFeature__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__LanguageFeature__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1736:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1737:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1737:1: ( ',' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1738:1: ','
            {
             before(grammarAccess.getLanguageFeatureAccess().getCommaKeyword_5_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LanguageFeature__Group_5_2__0__Impl3445); 
             after(grammarAccess.getLanguageFeatureAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_5_2__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_5_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1751:1: rule__LanguageFeature__Group_5_2__1 : rule__LanguageFeature__Group_5_2__1__Impl ;
    public final void rule__LanguageFeature__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1755:1: ( rule__LanguageFeature__Group_5_2__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1756:2: rule__LanguageFeature__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_5_2__1__Impl_in_rule__LanguageFeature__Group_5_2__13476);
            rule__LanguageFeature__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_5_2__1"


    // $ANTLR start "rule__LanguageFeature__Group_5_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1762:1: rule__LanguageFeature__Group_5_2__1__Impl : ( ( rule__LanguageFeature__ExcludesAssignment_5_2_1 ) ) ;
    public final void rule__LanguageFeature__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1766:1: ( ( ( rule__LanguageFeature__ExcludesAssignment_5_2_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1767:1: ( ( rule__LanguageFeature__ExcludesAssignment_5_2_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1767:1: ( ( rule__LanguageFeature__ExcludesAssignment_5_2_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1768:1: ( rule__LanguageFeature__ExcludesAssignment_5_2_1 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesAssignment_5_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1769:1: ( rule__LanguageFeature__ExcludesAssignment_5_2_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1769:2: rule__LanguageFeature__ExcludesAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__ExcludesAssignment_5_2_1_in_rule__LanguageFeature__Group_5_2__1__Impl3503);
            rule__LanguageFeature__ExcludesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getExcludesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_5_2__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_7__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1783:1: rule__LanguageFeature__Group_7__0 : rule__LanguageFeature__Group_7__0__Impl rule__LanguageFeature__Group_7__1 ;
    public final void rule__LanguageFeature__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1787:1: ( rule__LanguageFeature__Group_7__0__Impl rule__LanguageFeature__Group_7__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1788:2: rule__LanguageFeature__Group_7__0__Impl rule__LanguageFeature__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_7__0__Impl_in_rule__LanguageFeature__Group_7__03537);
            rule__LanguageFeature__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_7__1_in_rule__LanguageFeature__Group_7__03540);
            rule__LanguageFeature__Group_7__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_7__0"


    // $ANTLR start "rule__LanguageFeature__Group_7__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1795:1: rule__LanguageFeature__Group_7__0__Impl : ( 'languagemodule' ) ;
    public final void rule__LanguageFeature__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1799:1: ( ( 'languagemodule' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1800:1: ( 'languagemodule' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1800:1: ( 'languagemodule' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1801:1: 'languagemodule'
            {
             before(grammarAccess.getLanguageFeatureAccess().getLanguagemoduleKeyword_7_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LanguageFeature__Group_7__0__Impl3568); 
             after(grammarAccess.getLanguageFeatureAccess().getLanguagemoduleKeyword_7_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_7__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_7__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1814:1: rule__LanguageFeature__Group_7__1 : rule__LanguageFeature__Group_7__1__Impl ;
    public final void rule__LanguageFeature__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1818:1: ( rule__LanguageFeature__Group_7__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1819:2: rule__LanguageFeature__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_7__1__Impl_in_rule__LanguageFeature__Group_7__13599);
            rule__LanguageFeature__Group_7__1__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_7__1"


    // $ANTLR start "rule__LanguageFeature__Group_7__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1825:1: rule__LanguageFeature__Group_7__1__Impl : ( ( rule__LanguageFeature__ModuleAssignment_7_1 ) ) ;
    public final void rule__LanguageFeature__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1829:1: ( ( ( rule__LanguageFeature__ModuleAssignment_7_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1830:1: ( ( rule__LanguageFeature__ModuleAssignment_7_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1830:1: ( ( rule__LanguageFeature__ModuleAssignment_7_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1831:1: ( rule__LanguageFeature__ModuleAssignment_7_1 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getModuleAssignment_7_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1832:1: ( rule__LanguageFeature__ModuleAssignment_7_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1832:2: rule__LanguageFeature__ModuleAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__ModuleAssignment_7_1_in_rule__LanguageFeature__Group_7__1__Impl3626);
            rule__LanguageFeature__ModuleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getModuleAssignment_7_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_7__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_8__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1846:1: rule__LanguageFeature__Group_8__0 : rule__LanguageFeature__Group_8__0__Impl rule__LanguageFeature__Group_8__1 ;
    public final void rule__LanguageFeature__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1850:1: ( rule__LanguageFeature__Group_8__0__Impl rule__LanguageFeature__Group_8__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1851:2: rule__LanguageFeature__Group_8__0__Impl rule__LanguageFeature__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__0__Impl_in_rule__LanguageFeature__Group_8__03660);
            rule__LanguageFeature__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__1_in_rule__LanguageFeature__Group_8__03663);
            rule__LanguageFeature__Group_8__1();

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
    // $ANTLR end "rule__LanguageFeature__Group_8__0"


    // $ANTLR start "rule__LanguageFeature__Group_8__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1858:1: rule__LanguageFeature__Group_8__0__Impl : ( 'children' ) ;
    public final void rule__LanguageFeature__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1862:1: ( ( 'children' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1863:1: ( 'children' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1863:1: ( 'children' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1864:1: 'children'
            {
             before(grammarAccess.getLanguageFeatureAccess().getChildrenKeyword_8_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LanguageFeature__Group_8__0__Impl3691); 
             after(grammarAccess.getLanguageFeatureAccess().getChildrenKeyword_8_0()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_8__0__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_8__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1877:1: rule__LanguageFeature__Group_8__1 : rule__LanguageFeature__Group_8__1__Impl rule__LanguageFeature__Group_8__2 ;
    public final void rule__LanguageFeature__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1881:1: ( rule__LanguageFeature__Group_8__1__Impl rule__LanguageFeature__Group_8__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1882:2: rule__LanguageFeature__Group_8__1__Impl rule__LanguageFeature__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__1__Impl_in_rule__LanguageFeature__Group_8__13722);
            rule__LanguageFeature__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__2_in_rule__LanguageFeature__Group_8__13725);
            rule__LanguageFeature__Group_8__2();

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
    // $ANTLR end "rule__LanguageFeature__Group_8__1"


    // $ANTLR start "rule__LanguageFeature__Group_8__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1889:1: rule__LanguageFeature__Group_8__1__Impl : ( '{' ) ;
    public final void rule__LanguageFeature__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1893:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1894:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1894:1: ( '{' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1895:1: '{'
            {
             before(grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LanguageFeature__Group_8__1__Impl3753); 
             after(grammarAccess.getLanguageFeatureAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_8__1__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_8__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1908:1: rule__LanguageFeature__Group_8__2 : rule__LanguageFeature__Group_8__2__Impl rule__LanguageFeature__Group_8__3 ;
    public final void rule__LanguageFeature__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1912:1: ( rule__LanguageFeature__Group_8__2__Impl rule__LanguageFeature__Group_8__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1913:2: rule__LanguageFeature__Group_8__2__Impl rule__LanguageFeature__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__2__Impl_in_rule__LanguageFeature__Group_8__23784);
            rule__LanguageFeature__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__3_in_rule__LanguageFeature__Group_8__23787);
            rule__LanguageFeature__Group_8__3();

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
    // $ANTLR end "rule__LanguageFeature__Group_8__2"


    // $ANTLR start "rule__LanguageFeature__Group_8__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1920:1: rule__LanguageFeature__Group_8__2__Impl : ( ( rule__LanguageFeature__ChildrenAssignment_8_2 ) ) ;
    public final void rule__LanguageFeature__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1924:1: ( ( ( rule__LanguageFeature__ChildrenAssignment_8_2 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1925:1: ( ( rule__LanguageFeature__ChildrenAssignment_8_2 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1925:1: ( ( rule__LanguageFeature__ChildrenAssignment_8_2 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1926:1: ( rule__LanguageFeature__ChildrenAssignment_8_2 )
            {
             before(grammarAccess.getLanguageFeatureAccess().getChildrenAssignment_8_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1927:1: ( rule__LanguageFeature__ChildrenAssignment_8_2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1927:2: rule__LanguageFeature__ChildrenAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__ChildrenAssignment_8_2_in_rule__LanguageFeature__Group_8__2__Impl3814);
            rule__LanguageFeature__ChildrenAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageFeatureAccess().getChildrenAssignment_8_2()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_8__2__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_8__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1937:1: rule__LanguageFeature__Group_8__3 : rule__LanguageFeature__Group_8__3__Impl rule__LanguageFeature__Group_8__4 ;
    public final void rule__LanguageFeature__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1941:1: ( rule__LanguageFeature__Group_8__3__Impl rule__LanguageFeature__Group_8__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1942:2: rule__LanguageFeature__Group_8__3__Impl rule__LanguageFeature__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__3__Impl_in_rule__LanguageFeature__Group_8__33844);
            rule__LanguageFeature__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__4_in_rule__LanguageFeature__Group_8__33847);
            rule__LanguageFeature__Group_8__4();

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
    // $ANTLR end "rule__LanguageFeature__Group_8__3"


    // $ANTLR start "rule__LanguageFeature__Group_8__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1949:1: rule__LanguageFeature__Group_8__3__Impl : ( ( rule__LanguageFeature__ChildrenAssignment_8_3 )* ) ;
    public final void rule__LanguageFeature__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1953:1: ( ( ( rule__LanguageFeature__ChildrenAssignment_8_3 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1954:1: ( ( rule__LanguageFeature__ChildrenAssignment_8_3 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1954:1: ( ( rule__LanguageFeature__ChildrenAssignment_8_3 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1955:1: ( rule__LanguageFeature__ChildrenAssignment_8_3 )*
            {
             before(grammarAccess.getLanguageFeatureAccess().getChildrenAssignment_8_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1956:1: ( rule__LanguageFeature__ChildrenAssignment_8_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=23 && LA16_0<=25)||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1956:2: rule__LanguageFeature__ChildrenAssignment_8_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__ChildrenAssignment_8_3_in_rule__LanguageFeature__Group_8__3__Impl3874);
            	    rule__LanguageFeature__ChildrenAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLanguageFeatureAccess().getChildrenAssignment_8_3()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_8__3__Impl"


    // $ANTLR start "rule__LanguageFeature__Group_8__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1966:1: rule__LanguageFeature__Group_8__4 : rule__LanguageFeature__Group_8__4__Impl ;
    public final void rule__LanguageFeature__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1970:1: ( rule__LanguageFeature__Group_8__4__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1971:2: rule__LanguageFeature__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LanguageFeature__Group_8__4__Impl_in_rule__LanguageFeature__Group_8__43905);
            rule__LanguageFeature__Group_8__4__Impl();

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
    // $ANTLR end "rule__LanguageFeature__Group_8__4"


    // $ANTLR start "rule__LanguageFeature__Group_8__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1977:1: rule__LanguageFeature__Group_8__4__Impl : ( '}' ) ;
    public final void rule__LanguageFeature__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1981:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1982:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1982:1: ( '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:1983:1: '}'
            {
             before(grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LanguageFeature__Group_8__4__Impl3933); 
             after(grammarAccess.getLanguageFeatureAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__LanguageFeature__Group_8__4__Impl"


    // $ANTLR start "rule__MandatoryChild__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2006:1: rule__MandatoryChild__Group__0 : rule__MandatoryChild__Group__0__Impl rule__MandatoryChild__Group__1 ;
    public final void rule__MandatoryChild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2010:1: ( rule__MandatoryChild__Group__0__Impl rule__MandatoryChild__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2011:2: rule__MandatoryChild__Group__0__Impl rule__MandatoryChild__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MandatoryChild__Group__0__Impl_in_rule__MandatoryChild__Group__03974);
            rule__MandatoryChild__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MandatoryChild__Group__1_in_rule__MandatoryChild__Group__03977);
            rule__MandatoryChild__Group__1();

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
    // $ANTLR end "rule__MandatoryChild__Group__0"


    // $ANTLR start "rule__MandatoryChild__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2018:1: rule__MandatoryChild__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryChild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2022:1: ( ( 'mandatory' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2023:1: ( 'mandatory' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2023:1: ( 'mandatory' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2024:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryChildAccess().getMandatoryKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MandatoryChild__Group__0__Impl4005); 
             after(grammarAccess.getMandatoryChildAccess().getMandatoryKeyword_0()); 

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
    // $ANTLR end "rule__MandatoryChild__Group__0__Impl"


    // $ANTLR start "rule__MandatoryChild__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2037:1: rule__MandatoryChild__Group__1 : rule__MandatoryChild__Group__1__Impl ;
    public final void rule__MandatoryChild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2041:1: ( rule__MandatoryChild__Group__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2042:2: rule__MandatoryChild__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MandatoryChild__Group__1__Impl_in_rule__MandatoryChild__Group__14036);
            rule__MandatoryChild__Group__1__Impl();

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
    // $ANTLR end "rule__MandatoryChild__Group__1"


    // $ANTLR start "rule__MandatoryChild__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2048:1: rule__MandatoryChild__Group__1__Impl : ( ( rule__MandatoryChild__FeatureAssignment_1 ) ) ;
    public final void rule__MandatoryChild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2052:1: ( ( ( rule__MandatoryChild__FeatureAssignment_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2053:1: ( ( rule__MandatoryChild__FeatureAssignment_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2053:1: ( ( rule__MandatoryChild__FeatureAssignment_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2054:1: ( rule__MandatoryChild__FeatureAssignment_1 )
            {
             before(grammarAccess.getMandatoryChildAccess().getFeatureAssignment_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2055:1: ( rule__MandatoryChild__FeatureAssignment_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2055:2: rule__MandatoryChild__FeatureAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MandatoryChild__FeatureAssignment_1_in_rule__MandatoryChild__Group__1__Impl4063);
            rule__MandatoryChild__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryChildAccess().getFeatureAssignment_1()); 

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
    // $ANTLR end "rule__MandatoryChild__Group__1__Impl"


    // $ANTLR start "rule__OptionalChild__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2069:1: rule__OptionalChild__Group__0 : rule__OptionalChild__Group__0__Impl rule__OptionalChild__Group__1 ;
    public final void rule__OptionalChild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2073:1: ( rule__OptionalChild__Group__0__Impl rule__OptionalChild__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2074:2: rule__OptionalChild__Group__0__Impl rule__OptionalChild__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionalChild__Group__0__Impl_in_rule__OptionalChild__Group__04097);
            rule__OptionalChild__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OptionalChild__Group__1_in_rule__OptionalChild__Group__04100);
            rule__OptionalChild__Group__1();

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
    // $ANTLR end "rule__OptionalChild__Group__0"


    // $ANTLR start "rule__OptionalChild__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2081:1: rule__OptionalChild__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalChild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2085:1: ( ( 'optional' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2086:1: ( 'optional' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2086:1: ( 'optional' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2087:1: 'optional'
            {
             before(grammarAccess.getOptionalChildAccess().getOptionalKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OptionalChild__Group__0__Impl4128); 
             after(grammarAccess.getOptionalChildAccess().getOptionalKeyword_0()); 

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
    // $ANTLR end "rule__OptionalChild__Group__0__Impl"


    // $ANTLR start "rule__OptionalChild__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2100:1: rule__OptionalChild__Group__1 : rule__OptionalChild__Group__1__Impl ;
    public final void rule__OptionalChild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2104:1: ( rule__OptionalChild__Group__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2105:2: rule__OptionalChild__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionalChild__Group__1__Impl_in_rule__OptionalChild__Group__14159);
            rule__OptionalChild__Group__1__Impl();

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
    // $ANTLR end "rule__OptionalChild__Group__1"


    // $ANTLR start "rule__OptionalChild__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2111:1: rule__OptionalChild__Group__1__Impl : ( ( rule__OptionalChild__FeatureAssignment_1 ) ) ;
    public final void rule__OptionalChild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2115:1: ( ( ( rule__OptionalChild__FeatureAssignment_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2116:1: ( ( rule__OptionalChild__FeatureAssignment_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2116:1: ( ( rule__OptionalChild__FeatureAssignment_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2117:1: ( rule__OptionalChild__FeatureAssignment_1 )
            {
             before(grammarAccess.getOptionalChildAccess().getFeatureAssignment_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2118:1: ( rule__OptionalChild__FeatureAssignment_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2118:2: rule__OptionalChild__FeatureAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionalChild__FeatureAssignment_1_in_rule__OptionalChild__Group__1__Impl4186);
            rule__OptionalChild__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalChildAccess().getFeatureAssignment_1()); 

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
    // $ANTLR end "rule__OptionalChild__Group__1__Impl"


    // $ANTLR start "rule__OrGroupChild__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2132:1: rule__OrGroupChild__Group__0 : rule__OrGroupChild__Group__0__Impl rule__OrGroupChild__Group__1 ;
    public final void rule__OrGroupChild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2136:1: ( rule__OrGroupChild__Group__0__Impl rule__OrGroupChild__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2137:2: rule__OrGroupChild__Group__0__Impl rule__OrGroupChild__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__0__Impl_in_rule__OrGroupChild__Group__04220);
            rule__OrGroupChild__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__1_in_rule__OrGroupChild__Group__04223);
            rule__OrGroupChild__Group__1();

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
    // $ANTLR end "rule__OrGroupChild__Group__0"


    // $ANTLR start "rule__OrGroupChild__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2144:1: rule__OrGroupChild__Group__0__Impl : ( 'or' ) ;
    public final void rule__OrGroupChild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2148:1: ( ( 'or' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2149:1: ( 'or' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2149:1: ( 'or' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2150:1: 'or'
            {
             before(grammarAccess.getOrGroupChildAccess().getOrKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OrGroupChild__Group__0__Impl4251); 
             after(grammarAccess.getOrGroupChildAccess().getOrKeyword_0()); 

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
    // $ANTLR end "rule__OrGroupChild__Group__0__Impl"


    // $ANTLR start "rule__OrGroupChild__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2163:1: rule__OrGroupChild__Group__1 : rule__OrGroupChild__Group__1__Impl rule__OrGroupChild__Group__2 ;
    public final void rule__OrGroupChild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2167:1: ( rule__OrGroupChild__Group__1__Impl rule__OrGroupChild__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2168:2: rule__OrGroupChild__Group__1__Impl rule__OrGroupChild__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__1__Impl_in_rule__OrGroupChild__Group__14282);
            rule__OrGroupChild__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__2_in_rule__OrGroupChild__Group__14285);
            rule__OrGroupChild__Group__2();

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
    // $ANTLR end "rule__OrGroupChild__Group__1"


    // $ANTLR start "rule__OrGroupChild__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2175:1: rule__OrGroupChild__Group__1__Impl : ( '(' ) ;
    public final void rule__OrGroupChild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2179:1: ( ( '(' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2180:1: ( '(' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2180:1: ( '(' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2181:1: '('
            {
             before(grammarAccess.getOrGroupChildAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrGroupChild__Group__1__Impl4313); 
             after(grammarAccess.getOrGroupChildAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__OrGroupChild__Group__1__Impl"


    // $ANTLR start "rule__OrGroupChild__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2194:1: rule__OrGroupChild__Group__2 : rule__OrGroupChild__Group__2__Impl rule__OrGroupChild__Group__3 ;
    public final void rule__OrGroupChild__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2198:1: ( rule__OrGroupChild__Group__2__Impl rule__OrGroupChild__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2199:2: rule__OrGroupChild__Group__2__Impl rule__OrGroupChild__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__2__Impl_in_rule__OrGroupChild__Group__24344);
            rule__OrGroupChild__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__3_in_rule__OrGroupChild__Group__24347);
            rule__OrGroupChild__Group__3();

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
    // $ANTLR end "rule__OrGroupChild__Group__2"


    // $ANTLR start "rule__OrGroupChild__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2206:1: rule__OrGroupChild__Group__2__Impl : ( ( rule__OrGroupChild__FeaturesAssignment_2 ) ) ;
    public final void rule__OrGroupChild__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2210:1: ( ( ( rule__OrGroupChild__FeaturesAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2211:1: ( ( rule__OrGroupChild__FeaturesAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2211:1: ( ( rule__OrGroupChild__FeaturesAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2212:1: ( rule__OrGroupChild__FeaturesAssignment_2 )
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesAssignment_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2213:1: ( rule__OrGroupChild__FeaturesAssignment_2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2213:2: rule__OrGroupChild__FeaturesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__FeaturesAssignment_2_in_rule__OrGroupChild__Group__2__Impl4374);
            rule__OrGroupChild__FeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupChildAccess().getFeaturesAssignment_2()); 

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
    // $ANTLR end "rule__OrGroupChild__Group__2__Impl"


    // $ANTLR start "rule__OrGroupChild__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2223:1: rule__OrGroupChild__Group__3 : rule__OrGroupChild__Group__3__Impl rule__OrGroupChild__Group__4 ;
    public final void rule__OrGroupChild__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2227:1: ( rule__OrGroupChild__Group__3__Impl rule__OrGroupChild__Group__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2228:2: rule__OrGroupChild__Group__3__Impl rule__OrGroupChild__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__3__Impl_in_rule__OrGroupChild__Group__34404);
            rule__OrGroupChild__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__4_in_rule__OrGroupChild__Group__34407);
            rule__OrGroupChild__Group__4();

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
    // $ANTLR end "rule__OrGroupChild__Group__3"


    // $ANTLR start "rule__OrGroupChild__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2235:1: rule__OrGroupChild__Group__3__Impl : ( ( rule__OrGroupChild__Group_3__0 )* ) ;
    public final void rule__OrGroupChild__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2239:1: ( ( ( rule__OrGroupChild__Group_3__0 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2240:1: ( ( rule__OrGroupChild__Group_3__0 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2240:1: ( ( rule__OrGroupChild__Group_3__0 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2241:1: ( rule__OrGroupChild__Group_3__0 )*
            {
             before(grammarAccess.getOrGroupChildAccess().getGroup_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2242:1: ( rule__OrGroupChild__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2242:2: rule__OrGroupChild__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group_3__0_in_rule__OrGroupChild__Group__3__Impl4434);
            	    rule__OrGroupChild__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOrGroupChildAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OrGroupChild__Group__3__Impl"


    // $ANTLR start "rule__OrGroupChild__Group__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2252:1: rule__OrGroupChild__Group__4 : rule__OrGroupChild__Group__4__Impl ;
    public final void rule__OrGroupChild__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2256:1: ( rule__OrGroupChild__Group__4__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2257:2: rule__OrGroupChild__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group__4__Impl_in_rule__OrGroupChild__Group__44465);
            rule__OrGroupChild__Group__4__Impl();

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
    // $ANTLR end "rule__OrGroupChild__Group__4"


    // $ANTLR start "rule__OrGroupChild__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2263:1: rule__OrGroupChild__Group__4__Impl : ( ')' ) ;
    public final void rule__OrGroupChild__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2267:1: ( ( ')' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2268:1: ( ')' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2268:1: ( ')' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2269:1: ')'
            {
             before(grammarAccess.getOrGroupChildAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrGroupChild__Group__4__Impl4493); 
             after(grammarAccess.getOrGroupChildAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__OrGroupChild__Group__4__Impl"


    // $ANTLR start "rule__OrGroupChild__Group_3__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2292:1: rule__OrGroupChild__Group_3__0 : rule__OrGroupChild__Group_3__0__Impl rule__OrGroupChild__Group_3__1 ;
    public final void rule__OrGroupChild__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2296:1: ( rule__OrGroupChild__Group_3__0__Impl rule__OrGroupChild__Group_3__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2297:2: rule__OrGroupChild__Group_3__0__Impl rule__OrGroupChild__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group_3__0__Impl_in_rule__OrGroupChild__Group_3__04534);
            rule__OrGroupChild__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group_3__1_in_rule__OrGroupChild__Group_3__04537);
            rule__OrGroupChild__Group_3__1();

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
    // $ANTLR end "rule__OrGroupChild__Group_3__0"


    // $ANTLR start "rule__OrGroupChild__Group_3__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2304:1: rule__OrGroupChild__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OrGroupChild__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2308:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2309:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2309:1: ( ',' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2310:1: ','
            {
             before(grammarAccess.getOrGroupChildAccess().getCommaKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrGroupChild__Group_3__0__Impl4565); 
             after(grammarAccess.getOrGroupChildAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__OrGroupChild__Group_3__0__Impl"


    // $ANTLR start "rule__OrGroupChild__Group_3__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2323:1: rule__OrGroupChild__Group_3__1 : rule__OrGroupChild__Group_3__1__Impl ;
    public final void rule__OrGroupChild__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2327:1: ( rule__OrGroupChild__Group_3__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2328:2: rule__OrGroupChild__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__Group_3__1__Impl_in_rule__OrGroupChild__Group_3__14596);
            rule__OrGroupChild__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrGroupChild__Group_3__1"


    // $ANTLR start "rule__OrGroupChild__Group_3__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2334:1: rule__OrGroupChild__Group_3__1__Impl : ( ( rule__OrGroupChild__FeaturesAssignment_3_1 ) ) ;
    public final void rule__OrGroupChild__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2338:1: ( ( ( rule__OrGroupChild__FeaturesAssignment_3_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2339:1: ( ( rule__OrGroupChild__FeaturesAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2339:1: ( ( rule__OrGroupChild__FeaturesAssignment_3_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2340:1: ( rule__OrGroupChild__FeaturesAssignment_3_1 )
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesAssignment_3_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2341:1: ( rule__OrGroupChild__FeaturesAssignment_3_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2341:2: rule__OrGroupChild__FeaturesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrGroupChild__FeaturesAssignment_3_1_in_rule__OrGroupChild__Group_3__1__Impl4623);
            rule__OrGroupChild__FeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupChildAccess().getFeaturesAssignment_3_1()); 

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
    // $ANTLR end "rule__OrGroupChild__Group_3__1__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2355:1: rule__AlternativeGroup__Group__0 : rule__AlternativeGroup__Group__0__Impl rule__AlternativeGroup__Group__1 ;
    public final void rule__AlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2359:1: ( rule__AlternativeGroup__Group__0__Impl rule__AlternativeGroup__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2360:2: rule__AlternativeGroup__Group__0__Impl rule__AlternativeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__0__Impl_in_rule__AlternativeGroup__Group__04657);
            rule__AlternativeGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__1_in_rule__AlternativeGroup__Group__04660);
            rule__AlternativeGroup__Group__1();

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
    // $ANTLR end "rule__AlternativeGroup__Group__0"


    // $ANTLR start "rule__AlternativeGroup__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2367:1: rule__AlternativeGroup__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2371:1: ( ( 'alternative' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2372:1: ( 'alternative' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2372:1: ( 'alternative' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2373:1: 'alternative'
            {
             before(grammarAccess.getAlternativeGroupAccess().getAlternativeKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AlternativeGroup__Group__0__Impl4688); 
             after(grammarAccess.getAlternativeGroupAccess().getAlternativeKeyword_0()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group__0__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2386:1: rule__AlternativeGroup__Group__1 : rule__AlternativeGroup__Group__1__Impl rule__AlternativeGroup__Group__2 ;
    public final void rule__AlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2390:1: ( rule__AlternativeGroup__Group__1__Impl rule__AlternativeGroup__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2391:2: rule__AlternativeGroup__Group__1__Impl rule__AlternativeGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__1__Impl_in_rule__AlternativeGroup__Group__14719);
            rule__AlternativeGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__2_in_rule__AlternativeGroup__Group__14722);
            rule__AlternativeGroup__Group__2();

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
    // $ANTLR end "rule__AlternativeGroup__Group__1"


    // $ANTLR start "rule__AlternativeGroup__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2398:1: rule__AlternativeGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__AlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2402:1: ( ( '(' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2403:1: ( '(' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2403:1: ( '(' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2404:1: '('
            {
             before(grammarAccess.getAlternativeGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AlternativeGroup__Group__1__Impl4750); 
             after(grammarAccess.getAlternativeGroupAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group__1__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2417:1: rule__AlternativeGroup__Group__2 : rule__AlternativeGroup__Group__2__Impl rule__AlternativeGroup__Group__3 ;
    public final void rule__AlternativeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2421:1: ( rule__AlternativeGroup__Group__2__Impl rule__AlternativeGroup__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2422:2: rule__AlternativeGroup__Group__2__Impl rule__AlternativeGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__2__Impl_in_rule__AlternativeGroup__Group__24781);
            rule__AlternativeGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__3_in_rule__AlternativeGroup__Group__24784);
            rule__AlternativeGroup__Group__3();

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
    // $ANTLR end "rule__AlternativeGroup__Group__2"


    // $ANTLR start "rule__AlternativeGroup__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2429:1: rule__AlternativeGroup__Group__2__Impl : ( ( rule__AlternativeGroup__FeaturesAssignment_2 ) ) ;
    public final void rule__AlternativeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2433:1: ( ( ( rule__AlternativeGroup__FeaturesAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2434:1: ( ( rule__AlternativeGroup__FeaturesAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2434:1: ( ( rule__AlternativeGroup__FeaturesAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2435:1: ( rule__AlternativeGroup__FeaturesAssignment_2 )
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesAssignment_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2436:1: ( rule__AlternativeGroup__FeaturesAssignment_2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2436:2: rule__AlternativeGroup__FeaturesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__FeaturesAssignment_2_in_rule__AlternativeGroup__Group__2__Impl4811);
            rule__AlternativeGroup__FeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesAssignment_2()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group__2__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2446:1: rule__AlternativeGroup__Group__3 : rule__AlternativeGroup__Group__3__Impl rule__AlternativeGroup__Group__4 ;
    public final void rule__AlternativeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2450:1: ( rule__AlternativeGroup__Group__3__Impl rule__AlternativeGroup__Group__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2451:2: rule__AlternativeGroup__Group__3__Impl rule__AlternativeGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__3__Impl_in_rule__AlternativeGroup__Group__34841);
            rule__AlternativeGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__4_in_rule__AlternativeGroup__Group__34844);
            rule__AlternativeGroup__Group__4();

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
    // $ANTLR end "rule__AlternativeGroup__Group__3"


    // $ANTLR start "rule__AlternativeGroup__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2458:1: rule__AlternativeGroup__Group__3__Impl : ( ( rule__AlternativeGroup__Group_3__0 )* ) ;
    public final void rule__AlternativeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2462:1: ( ( ( rule__AlternativeGroup__Group_3__0 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2463:1: ( ( rule__AlternativeGroup__Group_3__0 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2463:1: ( ( rule__AlternativeGroup__Group_3__0 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2464:1: ( rule__AlternativeGroup__Group_3__0 )*
            {
             before(grammarAccess.getAlternativeGroupAccess().getGroup_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2465:1: ( rule__AlternativeGroup__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2465:2: rule__AlternativeGroup__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group_3__0_in_rule__AlternativeGroup__Group__3__Impl4871);
            	    rule__AlternativeGroup__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAlternativeGroupAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group__3__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2475:1: rule__AlternativeGroup__Group__4 : rule__AlternativeGroup__Group__4__Impl ;
    public final void rule__AlternativeGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2479:1: ( rule__AlternativeGroup__Group__4__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2480:2: rule__AlternativeGroup__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group__4__Impl_in_rule__AlternativeGroup__Group__44902);
            rule__AlternativeGroup__Group__4__Impl();

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
    // $ANTLR end "rule__AlternativeGroup__Group__4"


    // $ANTLR start "rule__AlternativeGroup__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2486:1: rule__AlternativeGroup__Group__4__Impl : ( ')' ) ;
    public final void rule__AlternativeGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2490:1: ( ( ')' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2491:1: ( ')' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2491:1: ( ')' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2492:1: ')'
            {
             before(grammarAccess.getAlternativeGroupAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AlternativeGroup__Group__4__Impl4930); 
             after(grammarAccess.getAlternativeGroupAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group__4__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group_3__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2515:1: rule__AlternativeGroup__Group_3__0 : rule__AlternativeGroup__Group_3__0__Impl rule__AlternativeGroup__Group_3__1 ;
    public final void rule__AlternativeGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2519:1: ( rule__AlternativeGroup__Group_3__0__Impl rule__AlternativeGroup__Group_3__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2520:2: rule__AlternativeGroup__Group_3__0__Impl rule__AlternativeGroup__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group_3__0__Impl_in_rule__AlternativeGroup__Group_3__04971);
            rule__AlternativeGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group_3__1_in_rule__AlternativeGroup__Group_3__04974);
            rule__AlternativeGroup__Group_3__1();

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
    // $ANTLR end "rule__AlternativeGroup__Group_3__0"


    // $ANTLR start "rule__AlternativeGroup__Group_3__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2527:1: rule__AlternativeGroup__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AlternativeGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2531:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2532:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2532:1: ( ',' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2533:1: ','
            {
             before(grammarAccess.getAlternativeGroupAccess().getCommaKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AlternativeGroup__Group_3__0__Impl5002); 
             after(grammarAccess.getAlternativeGroupAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group_3__0__Impl"


    // $ANTLR start "rule__AlternativeGroup__Group_3__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2546:1: rule__AlternativeGroup__Group_3__1 : rule__AlternativeGroup__Group_3__1__Impl ;
    public final void rule__AlternativeGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2550:1: ( rule__AlternativeGroup__Group_3__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2551:2: rule__AlternativeGroup__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__Group_3__1__Impl_in_rule__AlternativeGroup__Group_3__15033);
            rule__AlternativeGroup__Group_3__1__Impl();

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
    // $ANTLR end "rule__AlternativeGroup__Group_3__1"


    // $ANTLR start "rule__AlternativeGroup__Group_3__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2557:1: rule__AlternativeGroup__Group_3__1__Impl : ( ( rule__AlternativeGroup__FeaturesAssignment_3_1 ) ) ;
    public final void rule__AlternativeGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2561:1: ( ( ( rule__AlternativeGroup__FeaturesAssignment_3_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2562:1: ( ( rule__AlternativeGroup__FeaturesAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2562:1: ( ( rule__AlternativeGroup__FeaturesAssignment_3_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2563:1: ( rule__AlternativeGroup__FeaturesAssignment_3_1 )
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesAssignment_3_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2564:1: ( rule__AlternativeGroup__FeaturesAssignment_3_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2564:2: rule__AlternativeGroup__FeaturesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AlternativeGroup__FeaturesAssignment_3_1_in_rule__AlternativeGroup__Group_3__1__Impl5060);
            rule__AlternativeGroup__FeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesAssignment_3_1()); 

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
    // $ANTLR end "rule__AlternativeGroup__Group_3__1__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2578:1: rule__VariabilityPoint__Group__0 : rule__VariabilityPoint__Group__0__Impl rule__VariabilityPoint__Group__1 ;
    public final void rule__VariabilityPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2582:1: ( rule__VariabilityPoint__Group__0__Impl rule__VariabilityPoint__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2583:2: rule__VariabilityPoint__Group__0__Impl rule__VariabilityPoint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__0__Impl_in_rule__VariabilityPoint__Group__05094);
            rule__VariabilityPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__1_in_rule__VariabilityPoint__Group__05097);
            rule__VariabilityPoint__Group__1();

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
    // $ANTLR end "rule__VariabilityPoint__Group__0"


    // $ANTLR start "rule__VariabilityPoint__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2590:1: rule__VariabilityPoint__Group__0__Impl : ( 'variationpoint' ) ;
    public final void rule__VariabilityPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2594:1: ( ( 'variationpoint' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2595:1: ( 'variationpoint' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2595:1: ( 'variationpoint' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2596:1: 'variationpoint'
            {
             before(grammarAccess.getVariabilityPointAccess().getVariationpointKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__VariabilityPoint__Group__0__Impl5125); 
             after(grammarAccess.getVariabilityPointAccess().getVariationpointKeyword_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__0__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2609:1: rule__VariabilityPoint__Group__1 : rule__VariabilityPoint__Group__1__Impl rule__VariabilityPoint__Group__2 ;
    public final void rule__VariabilityPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2613:1: ( rule__VariabilityPoint__Group__1__Impl rule__VariabilityPoint__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2614:2: rule__VariabilityPoint__Group__1__Impl rule__VariabilityPoint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__1__Impl_in_rule__VariabilityPoint__Group__15156);
            rule__VariabilityPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__2_in_rule__VariabilityPoint__Group__15159);
            rule__VariabilityPoint__Group__2();

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
    // $ANTLR end "rule__VariabilityPoint__Group__1"


    // $ANTLR start "rule__VariabilityPoint__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2621:1: rule__VariabilityPoint__Group__1__Impl : ( ( rule__VariabilityPoint__NameAssignment_1 ) ) ;
    public final void rule__VariabilityPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2625:1: ( ( ( rule__VariabilityPoint__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2626:1: ( ( rule__VariabilityPoint__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2626:1: ( ( rule__VariabilityPoint__NameAssignment_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2627:1: ( rule__VariabilityPoint__NameAssignment_1 )
            {
             before(grammarAccess.getVariabilityPointAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2628:1: ( rule__VariabilityPoint__NameAssignment_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2628:2: rule__VariabilityPoint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__NameAssignment_1_in_rule__VariabilityPoint__Group__1__Impl5186);
            rule__VariabilityPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__1__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2638:1: rule__VariabilityPoint__Group__2 : rule__VariabilityPoint__Group__2__Impl rule__VariabilityPoint__Group__3 ;
    public final void rule__VariabilityPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2642:1: ( rule__VariabilityPoint__Group__2__Impl rule__VariabilityPoint__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2643:2: rule__VariabilityPoint__Group__2__Impl rule__VariabilityPoint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__2__Impl_in_rule__VariabilityPoint__Group__25216);
            rule__VariabilityPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__3_in_rule__VariabilityPoint__Group__25219);
            rule__VariabilityPoint__Group__3();

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
    // $ANTLR end "rule__VariabilityPoint__Group__2"


    // $ANTLR start "rule__VariabilityPoint__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2650:1: rule__VariabilityPoint__Group__2__Impl : ( ( rule__VariabilityPoint__Group_2__0 )? ) ;
    public final void rule__VariabilityPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2654:1: ( ( ( rule__VariabilityPoint__Group_2__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2655:1: ( ( rule__VariabilityPoint__Group_2__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2655:1: ( ( rule__VariabilityPoint__Group_2__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2656:1: ( rule__VariabilityPoint__Group_2__0 )?
            {
             before(grammarAccess.getVariabilityPointAccess().getGroup_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2657:1: ( rule__VariabilityPoint__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2657:2: rule__VariabilityPoint__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__0_in_rule__VariabilityPoint__Group__2__Impl5246);
                    rule__VariabilityPoint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariabilityPointAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__2__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2667:1: rule__VariabilityPoint__Group__3 : rule__VariabilityPoint__Group__3__Impl rule__VariabilityPoint__Group__4 ;
    public final void rule__VariabilityPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2671:1: ( rule__VariabilityPoint__Group__3__Impl rule__VariabilityPoint__Group__4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2672:2: rule__VariabilityPoint__Group__3__Impl rule__VariabilityPoint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__3__Impl_in_rule__VariabilityPoint__Group__35277);
            rule__VariabilityPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__4_in_rule__VariabilityPoint__Group__35280);
            rule__VariabilityPoint__Group__4();

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
    // $ANTLR end "rule__VariabilityPoint__Group__3"


    // $ANTLR start "rule__VariabilityPoint__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2679:1: rule__VariabilityPoint__Group__3__Impl : ( '{' ) ;
    public final void rule__VariabilityPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2683:1: ( ( '{' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2684:1: ( '{' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2684:1: ( '{' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2685:1: '{'
            {
             before(grammarAccess.getVariabilityPointAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__VariabilityPoint__Group__3__Impl5308); 
             after(grammarAccess.getVariabilityPointAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__3__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2698:1: rule__VariabilityPoint__Group__4 : rule__VariabilityPoint__Group__4__Impl rule__VariabilityPoint__Group__5 ;
    public final void rule__VariabilityPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2702:1: ( rule__VariabilityPoint__Group__4__Impl rule__VariabilityPoint__Group__5 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2703:2: rule__VariabilityPoint__Group__4__Impl rule__VariabilityPoint__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__4__Impl_in_rule__VariabilityPoint__Group__45339);
            rule__VariabilityPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__5_in_rule__VariabilityPoint__Group__45342);
            rule__VariabilityPoint__Group__5();

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
    // $ANTLR end "rule__VariabilityPoint__Group__4"


    // $ANTLR start "rule__VariabilityPoint__Group__4__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2710:1: rule__VariabilityPoint__Group__4__Impl : ( ( rule__VariabilityPoint__VariationsAssignment_4 ) ) ;
    public final void rule__VariabilityPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2714:1: ( ( ( rule__VariabilityPoint__VariationsAssignment_4 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2715:1: ( ( rule__VariabilityPoint__VariationsAssignment_4 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2715:1: ( ( rule__VariabilityPoint__VariationsAssignment_4 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2716:1: ( rule__VariabilityPoint__VariationsAssignment_4 )
            {
             before(grammarAccess.getVariabilityPointAccess().getVariationsAssignment_4()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2717:1: ( rule__VariabilityPoint__VariationsAssignment_4 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2717:2: rule__VariabilityPoint__VariationsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__VariationsAssignment_4_in_rule__VariabilityPoint__Group__4__Impl5369);
            rule__VariabilityPoint__VariationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getVariationsAssignment_4()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__4__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__5"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2727:1: rule__VariabilityPoint__Group__5 : rule__VariabilityPoint__Group__5__Impl rule__VariabilityPoint__Group__6 ;
    public final void rule__VariabilityPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2731:1: ( rule__VariabilityPoint__Group__5__Impl rule__VariabilityPoint__Group__6 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2732:2: rule__VariabilityPoint__Group__5__Impl rule__VariabilityPoint__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__5__Impl_in_rule__VariabilityPoint__Group__55399);
            rule__VariabilityPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__6_in_rule__VariabilityPoint__Group__55402);
            rule__VariabilityPoint__Group__6();

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
    // $ANTLR end "rule__VariabilityPoint__Group__5"


    // $ANTLR start "rule__VariabilityPoint__Group__5__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2739:1: rule__VariabilityPoint__Group__5__Impl : ( ( rule__VariabilityPoint__VariationsAssignment_5 )* ) ;
    public final void rule__VariabilityPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2743:1: ( ( ( rule__VariabilityPoint__VariationsAssignment_5 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2744:1: ( ( rule__VariabilityPoint__VariationsAssignment_5 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2744:1: ( ( rule__VariabilityPoint__VariationsAssignment_5 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2745:1: ( rule__VariabilityPoint__VariationsAssignment_5 )*
            {
             before(grammarAccess.getVariabilityPointAccess().getVariationsAssignment_5()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2746:1: ( rule__VariabilityPoint__VariationsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2746:2: rule__VariabilityPoint__VariationsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__VariationsAssignment_5_in_rule__VariabilityPoint__Group__5__Impl5429);
            	    rule__VariabilityPoint__VariationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getVariabilityPointAccess().getVariationsAssignment_5()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__5__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__6"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2756:1: rule__VariabilityPoint__Group__6 : rule__VariabilityPoint__Group__6__Impl rule__VariabilityPoint__Group__7 ;
    public final void rule__VariabilityPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2760:1: ( rule__VariabilityPoint__Group__6__Impl rule__VariabilityPoint__Group__7 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2761:2: rule__VariabilityPoint__Group__6__Impl rule__VariabilityPoint__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__6__Impl_in_rule__VariabilityPoint__Group__65460);
            rule__VariabilityPoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__7_in_rule__VariabilityPoint__Group__65463);
            rule__VariabilityPoint__Group__7();

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
    // $ANTLR end "rule__VariabilityPoint__Group__6"


    // $ANTLR start "rule__VariabilityPoint__Group__6__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2768:1: rule__VariabilityPoint__Group__6__Impl : ( 'default' ) ;
    public final void rule__VariabilityPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2772:1: ( ( 'default' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2773:1: ( 'default' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2773:1: ( 'default' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2774:1: 'default'
            {
             before(grammarAccess.getVariabilityPointAccess().getDefaultKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__VariabilityPoint__Group__6__Impl5491); 
             after(grammarAccess.getVariabilityPointAccess().getDefaultKeyword_6()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__6__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__7"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2787:1: rule__VariabilityPoint__Group__7 : rule__VariabilityPoint__Group__7__Impl rule__VariabilityPoint__Group__8 ;
    public final void rule__VariabilityPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2791:1: ( rule__VariabilityPoint__Group__7__Impl rule__VariabilityPoint__Group__8 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2792:2: rule__VariabilityPoint__Group__7__Impl rule__VariabilityPoint__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__7__Impl_in_rule__VariabilityPoint__Group__75522);
            rule__VariabilityPoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__8_in_rule__VariabilityPoint__Group__75525);
            rule__VariabilityPoint__Group__8();

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
    // $ANTLR end "rule__VariabilityPoint__Group__7"


    // $ANTLR start "rule__VariabilityPoint__Group__7__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2799:1: rule__VariabilityPoint__Group__7__Impl : ( ( rule__VariabilityPoint__DefaultAssignment_7 ) ) ;
    public final void rule__VariabilityPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2803:1: ( ( ( rule__VariabilityPoint__DefaultAssignment_7 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2804:1: ( ( rule__VariabilityPoint__DefaultAssignment_7 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2804:1: ( ( rule__VariabilityPoint__DefaultAssignment_7 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2805:1: ( rule__VariabilityPoint__DefaultAssignment_7 )
            {
             before(grammarAccess.getVariabilityPointAccess().getDefaultAssignment_7()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2806:1: ( rule__VariabilityPoint__DefaultAssignment_7 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2806:2: rule__VariabilityPoint__DefaultAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__DefaultAssignment_7_in_rule__VariabilityPoint__Group__7__Impl5552);
            rule__VariabilityPoint__DefaultAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getDefaultAssignment_7()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__7__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group__8"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2816:1: rule__VariabilityPoint__Group__8 : rule__VariabilityPoint__Group__8__Impl ;
    public final void rule__VariabilityPoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2820:1: ( rule__VariabilityPoint__Group__8__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2821:2: rule__VariabilityPoint__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group__8__Impl_in_rule__VariabilityPoint__Group__85582);
            rule__VariabilityPoint__Group__8__Impl();

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
    // $ANTLR end "rule__VariabilityPoint__Group__8"


    // $ANTLR start "rule__VariabilityPoint__Group__8__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2827:1: rule__VariabilityPoint__Group__8__Impl : ( '}' ) ;
    public final void rule__VariabilityPoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2831:1: ( ( '}' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2832:1: ( '}' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2832:1: ( '}' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2833:1: '}'
            {
             before(grammarAccess.getVariabilityPointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__VariabilityPoint__Group__8__Impl5610); 
             after(grammarAccess.getVariabilityPointAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group__8__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2864:1: rule__VariabilityPoint__Group_2__0 : rule__VariabilityPoint__Group_2__0__Impl rule__VariabilityPoint__Group_2__1 ;
    public final void rule__VariabilityPoint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2868:1: ( rule__VariabilityPoint__Group_2__0__Impl rule__VariabilityPoint__Group_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2869:2: rule__VariabilityPoint__Group_2__0__Impl rule__VariabilityPoint__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__0__Impl_in_rule__VariabilityPoint__Group_2__05659);
            rule__VariabilityPoint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__1_in_rule__VariabilityPoint__Group_2__05662);
            rule__VariabilityPoint__Group_2__1();

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__0"


    // $ANTLR start "rule__VariabilityPoint__Group_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2876:1: rule__VariabilityPoint__Group_2__0__Impl : ( 'involves' ) ;
    public final void rule__VariabilityPoint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2880:1: ( ( 'involves' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2881:1: ( 'involves' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2881:1: ( 'involves' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2882:1: 'involves'
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvesKeyword_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__VariabilityPoint__Group_2__0__Impl5690); 
             after(grammarAccess.getVariabilityPointAccess().getInvolvesKeyword_2_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__0__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2895:1: rule__VariabilityPoint__Group_2__1 : rule__VariabilityPoint__Group_2__1__Impl rule__VariabilityPoint__Group_2__2 ;
    public final void rule__VariabilityPoint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2899:1: ( rule__VariabilityPoint__Group_2__1__Impl rule__VariabilityPoint__Group_2__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2900:2: rule__VariabilityPoint__Group_2__1__Impl rule__VariabilityPoint__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__1__Impl_in_rule__VariabilityPoint__Group_2__15721);
            rule__VariabilityPoint__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__2_in_rule__VariabilityPoint__Group_2__15724);
            rule__VariabilityPoint__Group_2__2();

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__1"


    // $ANTLR start "rule__VariabilityPoint__Group_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2907:1: rule__VariabilityPoint__Group_2__1__Impl : ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 ) ) ;
    public final void rule__VariabilityPoint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2911:1: ( ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2912:1: ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2912:1: ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2913:1: ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 )
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesAssignment_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2914:1: ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2914:2: rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1_in_rule__VariabilityPoint__Group_2__1__Impl5751);
            rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesAssignment_2_1()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__1__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group_2__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2924:1: rule__VariabilityPoint__Group_2__2 : rule__VariabilityPoint__Group_2__2__Impl ;
    public final void rule__VariabilityPoint__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2928:1: ( rule__VariabilityPoint__Group_2__2__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2929:2: rule__VariabilityPoint__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2__2__Impl_in_rule__VariabilityPoint__Group_2__25781);
            rule__VariabilityPoint__Group_2__2__Impl();

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__2"


    // $ANTLR start "rule__VariabilityPoint__Group_2__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2935:1: rule__VariabilityPoint__Group_2__2__Impl : ( ( rule__VariabilityPoint__Group_2_2__0 )* ) ;
    public final void rule__VariabilityPoint__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2939:1: ( ( ( rule__VariabilityPoint__Group_2_2__0 )* ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2940:1: ( ( rule__VariabilityPoint__Group_2_2__0 )* )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2940:1: ( ( rule__VariabilityPoint__Group_2_2__0 )* )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2941:1: ( rule__VariabilityPoint__Group_2_2__0 )*
            {
             before(grammarAccess.getVariabilityPointAccess().getGroup_2_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2942:1: ( rule__VariabilityPoint__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2942:2: rule__VariabilityPoint__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2_2__0_in_rule__VariabilityPoint__Group_2__2__Impl5808);
            	    rule__VariabilityPoint__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getVariabilityPointAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group_2__2__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group_2_2__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2958:1: rule__VariabilityPoint__Group_2_2__0 : rule__VariabilityPoint__Group_2_2__0__Impl rule__VariabilityPoint__Group_2_2__1 ;
    public final void rule__VariabilityPoint__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2962:1: ( rule__VariabilityPoint__Group_2_2__0__Impl rule__VariabilityPoint__Group_2_2__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2963:2: rule__VariabilityPoint__Group_2_2__0__Impl rule__VariabilityPoint__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2_2__0__Impl_in_rule__VariabilityPoint__Group_2_2__05845);
            rule__VariabilityPoint__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2_2__1_in_rule__VariabilityPoint__Group_2_2__05848);
            rule__VariabilityPoint__Group_2_2__1();

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
    // $ANTLR end "rule__VariabilityPoint__Group_2_2__0"


    // $ANTLR start "rule__VariabilityPoint__Group_2_2__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2970:1: rule__VariabilityPoint__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__VariabilityPoint__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2974:1: ( ( ',' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2975:1: ( ',' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2975:1: ( ',' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2976:1: ','
            {
             before(grammarAccess.getVariabilityPointAccess().getCommaKeyword_2_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__VariabilityPoint__Group_2_2__0__Impl5876); 
             after(grammarAccess.getVariabilityPointAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group_2_2__0__Impl"


    // $ANTLR start "rule__VariabilityPoint__Group_2_2__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2989:1: rule__VariabilityPoint__Group_2_2__1 : rule__VariabilityPoint__Group_2_2__1__Impl ;
    public final void rule__VariabilityPoint__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2993:1: ( rule__VariabilityPoint__Group_2_2__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:2994:2: rule__VariabilityPoint__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__Group_2_2__1__Impl_in_rule__VariabilityPoint__Group_2_2__15907);
            rule__VariabilityPoint__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__VariabilityPoint__Group_2_2__1"


    // $ANTLR start "rule__VariabilityPoint__Group_2_2__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3000:1: rule__VariabilityPoint__Group_2_2__1__Impl : ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 ) ) ;
    public final void rule__VariabilityPoint__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3004:1: ( ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3005:1: ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3005:1: ( ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3006:1: ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 )
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesAssignment_2_2_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3007:1: ( rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3007:2: rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1_in_rule__VariabilityPoint__Group_2_2__1__Impl5934);
            rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__VariabilityPoint__Group_2_2__1__Impl"


    // $ANTLR start "rule__Variation__Group__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3021:1: rule__Variation__Group__0 : rule__Variation__Group__0__Impl rule__Variation__Group__1 ;
    public final void rule__Variation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3025:1: ( rule__Variation__Group__0__Impl rule__Variation__Group__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3026:2: rule__Variation__Group__0__Impl rule__Variation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__0__Impl_in_rule__Variation__Group__05968);
            rule__Variation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__1_in_rule__Variation__Group__05971);
            rule__Variation__Group__1();

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
    // $ANTLR end "rule__Variation__Group__0"


    // $ANTLR start "rule__Variation__Group__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3033:1: rule__Variation__Group__0__Impl : ( () ) ;
    public final void rule__Variation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3037:1: ( ( () ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3038:1: ( () )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3038:1: ( () )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3039:1: ()
            {
             before(grammarAccess.getVariationAccess().getVariationAction_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3040:1: ()
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3042:1: 
            {
            }

             after(grammarAccess.getVariationAccess().getVariationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variation__Group__0__Impl"


    // $ANTLR start "rule__Variation__Group__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3052:1: rule__Variation__Group__1 : rule__Variation__Group__1__Impl rule__Variation__Group__2 ;
    public final void rule__Variation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3056:1: ( rule__Variation__Group__1__Impl rule__Variation__Group__2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3057:2: rule__Variation__Group__1__Impl rule__Variation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__1__Impl_in_rule__Variation__Group__16029);
            rule__Variation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__2_in_rule__Variation__Group__16032);
            rule__Variation__Group__2();

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
    // $ANTLR end "rule__Variation__Group__1"


    // $ANTLR start "rule__Variation__Group__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3064:1: rule__Variation__Group__1__Impl : ( 'variation' ) ;
    public final void rule__Variation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3068:1: ( ( 'variation' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3069:1: ( 'variation' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3069:1: ( 'variation' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3070:1: 'variation'
            {
             before(grammarAccess.getVariationAccess().getVariationKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Variation__Group__1__Impl6060); 
             after(grammarAccess.getVariationAccess().getVariationKeyword_1()); 

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
    // $ANTLR end "rule__Variation__Group__1__Impl"


    // $ANTLR start "rule__Variation__Group__2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3083:1: rule__Variation__Group__2 : rule__Variation__Group__2__Impl rule__Variation__Group__3 ;
    public final void rule__Variation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3087:1: ( rule__Variation__Group__2__Impl rule__Variation__Group__3 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3088:2: rule__Variation__Group__2__Impl rule__Variation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__2__Impl_in_rule__Variation__Group__26091);
            rule__Variation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__3_in_rule__Variation__Group__26094);
            rule__Variation__Group__3();

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
    // $ANTLR end "rule__Variation__Group__2"


    // $ANTLR start "rule__Variation__Group__2__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3095:1: rule__Variation__Group__2__Impl : ( ( rule__Variation__NameAssignment_2 ) ) ;
    public final void rule__Variation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3099:1: ( ( ( rule__Variation__NameAssignment_2 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3100:1: ( ( rule__Variation__NameAssignment_2 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3100:1: ( ( rule__Variation__NameAssignment_2 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3101:1: ( rule__Variation__NameAssignment_2 )
            {
             before(grammarAccess.getVariationAccess().getNameAssignment_2()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3102:1: ( rule__Variation__NameAssignment_2 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3102:2: rule__Variation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__NameAssignment_2_in_rule__Variation__Group__2__Impl6121);
            rule__Variation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Variation__Group__2__Impl"


    // $ANTLR start "rule__Variation__Group__3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3112:1: rule__Variation__Group__3 : rule__Variation__Group__3__Impl ;
    public final void rule__Variation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3116:1: ( rule__Variation__Group__3__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3117:2: rule__Variation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group__3__Impl_in_rule__Variation__Group__36151);
            rule__Variation__Group__3__Impl();

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
    // $ANTLR end "rule__Variation__Group__3"


    // $ANTLR start "rule__Variation__Group__3__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3123:1: rule__Variation__Group__3__Impl : ( ( rule__Variation__Group_3__0 )? ) ;
    public final void rule__Variation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3127:1: ( ( ( rule__Variation__Group_3__0 )? ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3128:1: ( ( rule__Variation__Group_3__0 )? )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3128:1: ( ( rule__Variation__Group_3__0 )? )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3129:1: ( rule__Variation__Group_3__0 )?
            {
             before(grammarAccess.getVariationAccess().getGroup_3()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3130:1: ( rule__Variation__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3130:2: rule__Variation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variation__Group_3__0_in_rule__Variation__Group__3__Impl6178);
                    rule__Variation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Variation__Group__3__Impl"


    // $ANTLR start "rule__Variation__Group_3__0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3148:1: rule__Variation__Group_3__0 : rule__Variation__Group_3__0__Impl rule__Variation__Group_3__1 ;
    public final void rule__Variation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3152:1: ( rule__Variation__Group_3__0__Impl rule__Variation__Group_3__1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3153:2: rule__Variation__Group_3__0__Impl rule__Variation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group_3__0__Impl_in_rule__Variation__Group_3__06217);
            rule__Variation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group_3__1_in_rule__Variation__Group_3__06220);
            rule__Variation__Group_3__1();

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
    // $ANTLR end "rule__Variation__Group_3__0"


    // $ANTLR start "rule__Variation__Group_3__0__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3160:1: rule__Variation__Group_3__0__Impl : ( 'languagemodule' ) ;
    public final void rule__Variation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3164:1: ( ( 'languagemodule' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3165:1: ( 'languagemodule' )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3165:1: ( 'languagemodule' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3166:1: 'languagemodule'
            {
             before(grammarAccess.getVariationAccess().getLanguagemoduleKeyword_3_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Variation__Group_3__0__Impl6248); 
             after(grammarAccess.getVariationAccess().getLanguagemoduleKeyword_3_0()); 

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
    // $ANTLR end "rule__Variation__Group_3__0__Impl"


    // $ANTLR start "rule__Variation__Group_3__1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3179:1: rule__Variation__Group_3__1 : rule__Variation__Group_3__1__Impl ;
    public final void rule__Variation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3183:1: ( rule__Variation__Group_3__1__Impl )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3184:2: rule__Variation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__Group_3__1__Impl_in_rule__Variation__Group_3__16279);
            rule__Variation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Variation__Group_3__1"


    // $ANTLR start "rule__Variation__Group_3__1__Impl"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3190:1: rule__Variation__Group_3__1__Impl : ( ( rule__Variation__ModuleAssignment_3_1 ) ) ;
    public final void rule__Variation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3194:1: ( ( ( rule__Variation__ModuleAssignment_3_1 ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3195:1: ( ( rule__Variation__ModuleAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3195:1: ( ( rule__Variation__ModuleAssignment_3_1 ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3196:1: ( rule__Variation__ModuleAssignment_3_1 )
            {
             before(grammarAccess.getVariationAccess().getModuleAssignment_3_1()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3197:1: ( rule__Variation__ModuleAssignment_3_1 )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3197:2: rule__Variation__ModuleAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variation__ModuleAssignment_3_1_in_rule__Variation__Group_3__1__Impl6306);
            rule__Variation__ModuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariationAccess().getModuleAssignment_3_1()); 

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
    // $ANTLR end "rule__Variation__Group_3__1__Impl"


    // $ANTLR start "rule__LanguageProductLine__ImplementationFileAssignment_1_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3212:1: rule__LanguageProductLine__ImplementationFileAssignment_1_1 : ( ruleEString ) ;
    public final void rule__LanguageProductLine__ImplementationFileAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3216:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3217:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3217:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3218:1: ruleEString
            {
             before(grammarAccess.getLanguageProductLineAccess().getImplementationFileEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageProductLine__ImplementationFileAssignment_1_16345);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageProductLineAccess().getImplementationFileEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__ImplementationFileAssignment_1_1"


    // $ANTLR start "rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3227:1: rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1 : ( ruleProductLineVariability ) ;
    public final void rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3231:1: ( ( ruleProductLineVariability ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3232:1: ( ruleProductLineVariability )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3232:1: ( ruleProductLineVariability )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3233:1: ruleProductLineVariability
            {
             before(grammarAccess.getLanguageProductLineAccess().getProductLineVariabilityProductLineVariabilityParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductLineVariability_in_rule__LanguageProductLine__ProductLineVariabilityAssignment_2_16376);
            ruleProductLineVariability();

            state._fsp--;

             after(grammarAccess.getLanguageProductLineAccess().getProductLineVariabilityProductLineVariabilityParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1"


    // $ANTLR start "rule__LanguageProductLine__LanguageVariabilityAssignment_3_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3242:1: rule__LanguageProductLine__LanguageVariabilityAssignment_3_1 : ( ruleLanguageVariability ) ;
    public final void rule__LanguageProductLine__LanguageVariabilityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3246:1: ( ( ruleLanguageVariability ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3247:1: ( ruleLanguageVariability )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3247:1: ( ruleLanguageVariability )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3248:1: ruleLanguageVariability
            {
             before(grammarAccess.getLanguageProductLineAccess().getLanguageVariabilityLanguageVariabilityParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageVariability_in_rule__LanguageProductLine__LanguageVariabilityAssignment_3_16407);
            ruleLanguageVariability();

            state._fsp--;

             after(grammarAccess.getLanguageProductLineAccess().getLanguageVariabilityLanguageVariabilityParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__LanguageProductLine__LanguageVariabilityAssignment_3_1"


    // $ANTLR start "rule__ProductLineVariability__FeaturesAssignment_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3257:1: rule__ProductLineVariability__FeaturesAssignment_1 : ( ruleLanguageFeature ) ;
    public final void rule__ProductLineVariability__FeaturesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3261:1: ( ( ruleLanguageFeature ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3262:1: ( ruleLanguageFeature )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3262:1: ( ruleLanguageFeature )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3263:1: ruleLanguageFeature
            {
             before(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_rule__ProductLineVariability__FeaturesAssignment_16438);
            ruleLanguageFeature();

            state._fsp--;

             after(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProductLineVariability__FeaturesAssignment_1"


    // $ANTLR start "rule__ProductLineVariability__FeaturesAssignment_2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3272:1: rule__ProductLineVariability__FeaturesAssignment_2 : ( ruleLanguageFeature ) ;
    public final void rule__ProductLineVariability__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3276:1: ( ( ruleLanguageFeature ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3277:1: ( ruleLanguageFeature )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3277:1: ( ruleLanguageFeature )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3278:1: ruleLanguageFeature
            {
             before(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguageFeature_in_rule__ProductLineVariability__FeaturesAssignment_26469);
            ruleLanguageFeature();

            state._fsp--;

             after(grammarAccess.getProductLineVariabilityAccess().getFeaturesLanguageFeatureParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProductLineVariability__FeaturesAssignment_2"


    // $ANTLR start "rule__ProductLineVariability__RootFeatureAssignment_4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3287:1: rule__ProductLineVariability__RootFeatureAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ProductLineVariability__RootFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3291:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3292:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3292:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3293:1: ( ruleEString )
            {
             before(grammarAccess.getProductLineVariabilityAccess().getRootFeatureLanguageFeatureCrossReference_4_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3294:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3295:1: ruleEString
            {
             before(grammarAccess.getProductLineVariabilityAccess().getRootFeatureLanguageFeatureEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ProductLineVariability__RootFeatureAssignment_46504);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProductLineVariabilityAccess().getRootFeatureLanguageFeatureEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProductLineVariabilityAccess().getRootFeatureLanguageFeatureCrossReference_4_0()); 

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
    // $ANTLR end "rule__ProductLineVariability__RootFeatureAssignment_4"


    // $ANTLR start "rule__LanguageVariability__VariabilityPointsAssignment_2_0"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3306:1: rule__LanguageVariability__VariabilityPointsAssignment_2_0 : ( ruleVariabilityPoint ) ;
    public final void rule__LanguageVariability__VariabilityPointsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3310:1: ( ( ruleVariabilityPoint ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3311:1: ( ruleVariabilityPoint )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3311:1: ( ruleVariabilityPoint )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3312:1: ruleVariabilityPoint
            {
             before(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_rule__LanguageVariability__VariabilityPointsAssignment_2_06539);
            ruleVariabilityPoint();

            state._fsp--;

             after(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__LanguageVariability__VariabilityPointsAssignment_2_0"


    // $ANTLR start "rule__LanguageVariability__VariabilityPointsAssignment_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3321:1: rule__LanguageVariability__VariabilityPointsAssignment_2_1 : ( ruleVariabilityPoint ) ;
    public final void rule__LanguageVariability__VariabilityPointsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3325:1: ( ( ruleVariabilityPoint ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3326:1: ( ruleVariabilityPoint )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3326:1: ( ruleVariabilityPoint )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3327:1: ruleVariabilityPoint
            {
             before(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariabilityPoint_in_rule__LanguageVariability__VariabilityPointsAssignment_2_16570);
            ruleVariabilityPoint();

            state._fsp--;

             after(grammarAccess.getLanguageVariabilityAccess().getVariabilityPointsVariabilityPointParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LanguageVariability__VariabilityPointsAssignment_2_1"


    // $ANTLR start "rule__LanguageFeature__AbstractAssignment_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3336:1: rule__LanguageFeature__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__LanguageFeature__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3340:1: ( ( ( 'abstract' ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3341:1: ( ( 'abstract' ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3341:1: ( ( 'abstract' ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3342:1: ( 'abstract' )
            {
             before(grammarAccess.getLanguageFeatureAccess().getAbstractAbstractKeyword_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3343:1: ( 'abstract' )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3344:1: 'abstract'
            {
             before(grammarAccess.getLanguageFeatureAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LanguageFeature__AbstractAssignment_16606); 
             after(grammarAccess.getLanguageFeatureAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getLanguageFeatureAccess().getAbstractAbstractKeyword_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__AbstractAssignment_1"


    // $ANTLR start "rule__LanguageFeature__NameAssignment_3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3359:1: rule__LanguageFeature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__LanguageFeature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3363:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3364:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3364:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3365:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__NameAssignment_36645);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LanguageFeature__NameAssignment_3"


    // $ANTLR start "rule__LanguageFeature__DependsAssignment_4_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3374:1: rule__LanguageFeature__DependsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__LanguageFeature__DependsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3378:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3379:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3379:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3380:1: ( ruleEString )
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3381:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3382:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__DependsAssignment_4_16680);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__DependsAssignment_4_1"


    // $ANTLR start "rule__LanguageFeature__DependsAssignment_4_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3393:1: rule__LanguageFeature__DependsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__LanguageFeature__DependsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3397:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3398:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3398:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3399:1: ( ruleEString )
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_2_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3400:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3401:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__DependsAssignment_4_2_16719);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getLanguageFeatureAccess().getDependsLanguageFeatureCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__DependsAssignment_4_2_1"


    // $ANTLR start "rule__LanguageFeature__ExcludesAssignment_5_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3412:1: rule__LanguageFeature__ExcludesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LanguageFeature__ExcludesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3416:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3417:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3417:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3418:1: ( ruleEString )
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3419:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3420:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__ExcludesAssignment_5_16758);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__ExcludesAssignment_5_1"


    // $ANTLR start "rule__LanguageFeature__ExcludesAssignment_5_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3431:1: rule__LanguageFeature__ExcludesAssignment_5_2_1 : ( ( ruleEString ) ) ;
    public final void rule__LanguageFeature__ExcludesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3435:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3436:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3436:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3437:1: ( ruleEString )
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_2_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3438:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3439:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureEStringParserRuleCall_5_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__ExcludesAssignment_5_2_16797);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureEStringParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getLanguageFeatureAccess().getExcludesLanguageFeatureCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__ExcludesAssignment_5_2_1"


    // $ANTLR start "rule__LanguageFeature__ModuleAssignment_7_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3450:1: rule__LanguageFeature__ModuleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LanguageFeature__ModuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3454:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3455:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3455:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3456:1: ruleEString
            {
             before(grammarAccess.getLanguageFeatureAccess().getModuleEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LanguageFeature__ModuleAssignment_7_16832);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getModuleEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__LanguageFeature__ModuleAssignment_7_1"


    // $ANTLR start "rule__LanguageFeature__ChildrenAssignment_8_2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3465:1: rule__LanguageFeature__ChildrenAssignment_8_2 : ( ruleRelation ) ;
    public final void rule__LanguageFeature__ChildrenAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3469:1: ( ( ruleRelation ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3470:1: ( ruleRelation )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3470:1: ( ruleRelation )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3471:1: ruleRelation
            {
             before(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelation_in_rule__LanguageFeature__ChildrenAssignment_8_26863);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__LanguageFeature__ChildrenAssignment_8_2"


    // $ANTLR start "rule__LanguageFeature__ChildrenAssignment_8_3"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3480:1: rule__LanguageFeature__ChildrenAssignment_8_3 : ( ruleRelation ) ;
    public final void rule__LanguageFeature__ChildrenAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3484:1: ( ( ruleRelation ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3485:1: ( ruleRelation )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3485:1: ( ruleRelation )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3486:1: ruleRelation
            {
             before(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelation_in_rule__LanguageFeature__ChildrenAssignment_8_36894);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getLanguageFeatureAccess().getChildrenRelationParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__LanguageFeature__ChildrenAssignment_8_3"


    // $ANTLR start "rule__MandatoryChild__FeatureAssignment_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3495:1: rule__MandatoryChild__FeatureAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__MandatoryChild__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3499:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3500:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3500:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3501:1: ( ruleEString )
            {
             before(grammarAccess.getMandatoryChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3502:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3503:1: ruleEString
            {
             before(grammarAccess.getMandatoryChildAccess().getFeatureLanguageFeatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MandatoryChild__FeatureAssignment_16929);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMandatoryChildAccess().getFeatureLanguageFeatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMandatoryChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 

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
    // $ANTLR end "rule__MandatoryChild__FeatureAssignment_1"


    // $ANTLR start "rule__OptionalChild__FeatureAssignment_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3514:1: rule__OptionalChild__FeatureAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__OptionalChild__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3518:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3519:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3519:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3520:1: ( ruleEString )
            {
             before(grammarAccess.getOptionalChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3521:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3522:1: ruleEString
            {
             before(grammarAccess.getOptionalChildAccess().getFeatureLanguageFeatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OptionalChild__FeatureAssignment_16968);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionalChildAccess().getFeatureLanguageFeatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOptionalChildAccess().getFeatureLanguageFeatureCrossReference_1_0()); 

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
    // $ANTLR end "rule__OptionalChild__FeatureAssignment_1"


    // $ANTLR start "rule__OrGroupChild__FeaturesAssignment_2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3533:1: rule__OrGroupChild__FeaturesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__OrGroupChild__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3537:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3538:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3538:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3539:1: ( ruleEString )
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3540:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3541:1: ruleEString
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OrGroupChild__FeaturesAssignment_27007);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 

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
    // $ANTLR end "rule__OrGroupChild__FeaturesAssignment_2"


    // $ANTLR start "rule__OrGroupChild__FeaturesAssignment_3_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3552:1: rule__OrGroupChild__FeaturesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OrGroupChild__FeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3556:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3557:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3557:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3558:1: ( ruleEString )
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3559:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3560:1: ruleEString
            {
             before(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OrGroupChild__FeaturesAssignment_3_17046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrGroupChildAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__OrGroupChild__FeaturesAssignment_3_1"


    // $ANTLR start "rule__AlternativeGroup__FeaturesAssignment_2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3571:1: rule__AlternativeGroup__FeaturesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__AlternativeGroup__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3575:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3576:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3576:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3577:1: ( ruleEString )
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3578:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3579:1: ruleEString
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AlternativeGroup__FeaturesAssignment_27085);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_2_0()); 

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
    // $ANTLR end "rule__AlternativeGroup__FeaturesAssignment_2"


    // $ANTLR start "rule__AlternativeGroup__FeaturesAssignment_3_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3590:1: rule__AlternativeGroup__FeaturesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AlternativeGroup__FeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3594:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3595:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3595:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3596:1: ( ruleEString )
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3597:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3598:1: ruleEString
            {
             before(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AlternativeGroup__FeaturesAssignment_3_17124);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAlternativeGroupAccess().getFeaturesLanguageFeatureCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__AlternativeGroup__FeaturesAssignment_3_1"


    // $ANTLR start "rule__VariabilityPoint__NameAssignment_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3609:1: rule__VariabilityPoint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__VariabilityPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3613:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3614:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3614:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3615:1: ruleEString
            {
             before(grammarAccess.getVariabilityPointAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariabilityPoint__NameAssignment_17159);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariabilityPointAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__NameAssignment_1"


    // $ANTLR start "rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3624:1: rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3628:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3629:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3629:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3630:1: ( ruleEString )
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3631:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3632:1: ruleEString
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_17194);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1"


    // $ANTLR start "rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3643:1: rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1 : ( ( ruleEString ) ) ;
    public final void rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3647:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3648:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3648:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3649:1: ( ruleEString )
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_2_1_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3650:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3651:1: ruleEString
            {
             before(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureEStringParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_17233);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureEStringParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getVariabilityPointAccess().getInvolvedFeaturesLanguageFeatureCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1"


    // $ANTLR start "rule__VariabilityPoint__VariationsAssignment_4"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3662:1: rule__VariabilityPoint__VariationsAssignment_4 : ( ruleVariation ) ;
    public final void rule__VariabilityPoint__VariationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3666:1: ( ( ruleVariation ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3667:1: ( ruleVariation )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3667:1: ( ruleVariation )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3668:1: ruleVariation
            {
             before(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariation_in_rule__VariabilityPoint__VariationsAssignment_47268);
            ruleVariation();

            state._fsp--;

             after(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__VariationsAssignment_4"


    // $ANTLR start "rule__VariabilityPoint__VariationsAssignment_5"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3677:1: rule__VariabilityPoint__VariationsAssignment_5 : ( ruleVariation ) ;
    public final void rule__VariabilityPoint__VariationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3681:1: ( ( ruleVariation ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3682:1: ( ruleVariation )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3682:1: ( ruleVariation )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3683:1: ruleVariation
            {
             before(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariation_in_rule__VariabilityPoint__VariationsAssignment_57299);
            ruleVariation();

            state._fsp--;

             after(grammarAccess.getVariabilityPointAccess().getVariationsVariationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__VariationsAssignment_5"


    // $ANTLR start "rule__VariabilityPoint__DefaultAssignment_7"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3692:1: rule__VariabilityPoint__DefaultAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__VariabilityPoint__DefaultAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3696:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3697:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3697:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3698:1: ( RULE_ID )
            {
             before(grammarAccess.getVariabilityPointAccess().getDefaultVariationCrossReference_7_0()); 
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3699:1: ( RULE_ID )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3700:1: RULE_ID
            {
             before(grammarAccess.getVariabilityPointAccess().getDefaultVariationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariabilityPoint__DefaultAssignment_77334); 
             after(grammarAccess.getVariabilityPointAccess().getDefaultVariationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getVariabilityPointAccess().getDefaultVariationCrossReference_7_0()); 

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
    // $ANTLR end "rule__VariabilityPoint__DefaultAssignment_7"


    // $ANTLR start "rule__Variation__NameAssignment_2"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3711:1: rule__Variation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3715:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3716:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3716:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3717:1: ruleEString
            {
             before(grammarAccess.getVariationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variation__NameAssignment_27369);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariationAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variation__NameAssignment_2"


    // $ANTLR start "rule__Variation__ModuleAssignment_3_1"
    // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3726:1: rule__Variation__ModuleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variation__ModuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3730:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3731:1: ( ruleEString )
            {
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3731:1: ( ruleEString )
            // ../fr.inria.diverse.puzzle.mutivar.language.ui/src-gen/fr/inria/diverse/puzzle/ui/contentassist/antlr/internal/InternalMutivar.g:3732:1: ruleEString
            {
             before(grammarAccess.getVariationAccess().getModuleEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variation__ModuleAssignment_3_17400);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariationAccess().getModuleEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Variation__ModuleAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLanguageProductLine_in_entryRuleLanguageProductLine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageProductLine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__0_in_ruleLanguageProductLine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelation128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relation__Alternatives_in_ruleRelation154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductLineVariability_in_entryRuleProductLineVariability241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductLineVariability248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__0_in_ruleProductLineVariability274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageVariability_in_entryRuleLanguageVariability301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageVariability308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__0_in_ruleLanguageVariability334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_entryRuleLanguageFeature361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguageFeature368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__0_in_ruleLanguageFeature394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatoryChild_in_entryRuleMandatoryChild423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryChild430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MandatoryChild__Group__0_in_ruleMandatoryChild456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionalChild_in_entryRuleOptionalChild483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionalChild490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionalChild__Group__0_in_ruleOptionalChild516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrGroupChild_in_entryRuleOrGroupChild543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrGroupChild550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__0_in_ruleOrGroupChild576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternativeGroup_in_entryRuleAlternativeGroup603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeGroup610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__0_in_ruleAlternativeGroup636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_entryRuleVariabilityPoint663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariabilityPoint670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__0_in_ruleVariabilityPoint696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariation_in_entryRuleVariation723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariation730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group__0_in_ruleVariation756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatoryChild_in_rule__Relation__Alternatives792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionalChild_in_rule__Relation__Alternatives809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrGroupChild_in_rule__Relation__Alternatives826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternativeGroup_in_rule__Relation__Alternatives843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__0__Impl_in_rule__LanguageProductLine__Group__0923 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__1_in_rule__LanguageProductLine__Group__0926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__1__Impl_in_rule__LanguageProductLine__Group__1984 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__2_in_rule__LanguageProductLine__Group__1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_1__0_in_rule__LanguageProductLine__Group__1__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__2__Impl_in_rule__LanguageProductLine__Group__21045 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__3_in_rule__LanguageProductLine__Group__21048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_2__0_in_rule__LanguageProductLine__Group__2__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group__3__Impl_in_rule__LanguageProductLine__Group__31106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_3__0_in_rule__LanguageProductLine__Group__3__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_1__0__Impl_in_rule__LanguageProductLine__Group_1__01172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_1__1_in_rule__LanguageProductLine__Group_1__01175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__LanguageProductLine__Group_1__0__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_1__1__Impl_in_rule__LanguageProductLine__Group_1__11234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__ImplementationFileAssignment_1_1_in_rule__LanguageProductLine__Group_1__1__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_2__0__Impl_in_rule__LanguageProductLine__Group_2__01295 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_2__1_in_rule__LanguageProductLine__Group_2__01298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LanguageProductLine__Group_2__0__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_2__1__Impl_in_rule__LanguageProductLine__Group_2__11357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__ProductLineVariabilityAssignment_2_1_in_rule__LanguageProductLine__Group_2__1__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_3__0__Impl_in_rule__LanguageProductLine__Group_3__01418 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_3__1_in_rule__LanguageProductLine__Group_3__01421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LanguageProductLine__Group_3__0__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__Group_3__1__Impl_in_rule__LanguageProductLine__Group_3__11480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageProductLine__LanguageVariabilityAssignment_3_1_in_rule__LanguageProductLine__Group_3__1__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__0__Impl_in_rule__ProductLineVariability__Group__01541 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__1_in_rule__ProductLineVariability__Group__01544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ProductLineVariability__Group__0__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__1__Impl_in_rule__ProductLineVariability__Group__11603 = new BitSet(new long[]{0x0000000200028000L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__2_in_rule__ProductLineVariability__Group__11606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__FeaturesAssignment_1_in_rule__ProductLineVariability__Group__1__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__2__Impl_in_rule__ProductLineVariability__Group__21663 = new BitSet(new long[]{0x0000000200028000L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__3_in_rule__ProductLineVariability__Group__21666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__FeaturesAssignment_2_in_rule__ProductLineVariability__Group__2__Impl1693 = new BitSet(new long[]{0x0000000200020002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__3__Impl_in_rule__ProductLineVariability__Group__31724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__4_in_rule__ProductLineVariability__Group__31727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ProductLineVariability__Group__3__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__4__Impl_in_rule__ProductLineVariability__Group__41786 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__5_in_rule__ProductLineVariability__Group__41789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__RootFeatureAssignment_4_in_rule__ProductLineVariability__Group__4__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProductLineVariability__Group__5__Impl_in_rule__ProductLineVariability__Group__51846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ProductLineVariability__Group__5__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__0__Impl_in_rule__LanguageVariability__Group__01917 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__1_in_rule__LanguageVariability__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__1__Impl_in_rule__LanguageVariability__Group__11978 = new BitSet(new long[]{0x0000000020010000L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__2_in_rule__LanguageVariability__Group__11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LanguageVariability__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__2__Impl_in_rule__LanguageVariability__Group__22040 = new BitSet(new long[]{0x0000000020010000L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__3_in_rule__LanguageVariability__Group__22043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group_2__0_in_rule__LanguageVariability__Group__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group__3__Impl_in_rule__LanguageVariability__Group__32101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LanguageVariability__Group__3__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group_2__0__Impl_in_rule__LanguageVariability__Group_2__02168 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group_2__1_in_rule__LanguageVariability__Group_2__02171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__VariabilityPointsAssignment_2_0_in_rule__LanguageVariability__Group_2__0__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__Group_2__1__Impl_in_rule__LanguageVariability__Group_2__12228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageVariability__VariabilityPointsAssignment_2_1_in_rule__LanguageVariability__Group_2__1__Impl2255 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__0__Impl_in_rule__LanguageFeature__Group__02290 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__1_in_rule__LanguageFeature__Group__02293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__1__Impl_in_rule__LanguageFeature__Group__12351 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__2_in_rule__LanguageFeature__Group__12354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__AbstractAssignment_1_in_rule__LanguageFeature__Group__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__2__Impl_in_rule__LanguageFeature__Group__22412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__3_in_rule__LanguageFeature__Group__22415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__LanguageFeature__Group__2__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__3__Impl_in_rule__LanguageFeature__Group__32474 = new BitSet(new long[]{0x0000000000144000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__4_in_rule__LanguageFeature__Group__32477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__NameAssignment_3_in_rule__LanguageFeature__Group__3__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__4__Impl_in_rule__LanguageFeature__Group__42534 = new BitSet(new long[]{0x0000000000144000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__5_in_rule__LanguageFeature__Group__42537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__0_in_rule__LanguageFeature__Group__4__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__5__Impl_in_rule__LanguageFeature__Group__52595 = new BitSet(new long[]{0x0000000000144000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__6_in_rule__LanguageFeature__Group__52598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__0_in_rule__LanguageFeature__Group__5__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__6__Impl_in_rule__LanguageFeature__Group__62656 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__7_in_rule__LanguageFeature__Group__62659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LanguageFeature__Group__6__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__7__Impl_in_rule__LanguageFeature__Group__72718 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__8_in_rule__LanguageFeature__Group__72721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_7__0_in_rule__LanguageFeature__Group__7__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__8__Impl_in_rule__LanguageFeature__Group__82779 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__9_in_rule__LanguageFeature__Group__82782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__0_in_rule__LanguageFeature__Group__8__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group__9__Impl_in_rule__LanguageFeature__Group__92840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LanguageFeature__Group__9__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__0__Impl_in_rule__LanguageFeature__Group_4__02919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__1_in_rule__LanguageFeature__Group_4__02922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__LanguageFeature__Group_4__0__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__1__Impl_in_rule__LanguageFeature__Group_4__12981 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__2_in_rule__LanguageFeature__Group_4__12984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__DependsAssignment_4_1_in_rule__LanguageFeature__Group_4__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4__2__Impl_in_rule__LanguageFeature__Group_4__23041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4_2__0_in_rule__LanguageFeature__Group_4__2__Impl3068 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4_2__0__Impl_in_rule__LanguageFeature__Group_4_2__03105 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4_2__1_in_rule__LanguageFeature__Group_4_2__03108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LanguageFeature__Group_4_2__0__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_4_2__1__Impl_in_rule__LanguageFeature__Group_4_2__13167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__DependsAssignment_4_2_1_in_rule__LanguageFeature__Group_4_2__1__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__0__Impl_in_rule__LanguageFeature__Group_5__03228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__1_in_rule__LanguageFeature__Group_5__03231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LanguageFeature__Group_5__0__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__1__Impl_in_rule__LanguageFeature__Group_5__13290 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__2_in_rule__LanguageFeature__Group_5__13293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__ExcludesAssignment_5_1_in_rule__LanguageFeature__Group_5__1__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5__2__Impl_in_rule__LanguageFeature__Group_5__23350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5_2__0_in_rule__LanguageFeature__Group_5__2__Impl3377 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5_2__0__Impl_in_rule__LanguageFeature__Group_5_2__03414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5_2__1_in_rule__LanguageFeature__Group_5_2__03417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LanguageFeature__Group_5_2__0__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_5_2__1__Impl_in_rule__LanguageFeature__Group_5_2__13476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__ExcludesAssignment_5_2_1_in_rule__LanguageFeature__Group_5_2__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_7__0__Impl_in_rule__LanguageFeature__Group_7__03537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_7__1_in_rule__LanguageFeature__Group_7__03540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LanguageFeature__Group_7__0__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_7__1__Impl_in_rule__LanguageFeature__Group_7__13599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__ModuleAssignment_7_1_in_rule__LanguageFeature__Group_7__1__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__0__Impl_in_rule__LanguageFeature__Group_8__03660 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__1_in_rule__LanguageFeature__Group_8__03663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LanguageFeature__Group_8__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__1__Impl_in_rule__LanguageFeature__Group_8__13722 = new BitSet(new long[]{0x0000000013800000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__2_in_rule__LanguageFeature__Group_8__13725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LanguageFeature__Group_8__1__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__2__Impl_in_rule__LanguageFeature__Group_8__23784 = new BitSet(new long[]{0x0000000013810000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__3_in_rule__LanguageFeature__Group_8__23787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__ChildrenAssignment_8_2_in_rule__LanguageFeature__Group_8__2__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__3__Impl_in_rule__LanguageFeature__Group_8__33844 = new BitSet(new long[]{0x0000000013810000L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__4_in_rule__LanguageFeature__Group_8__33847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__ChildrenAssignment_8_3_in_rule__LanguageFeature__Group_8__3__Impl3874 = new BitSet(new long[]{0x0000000013800002L});
        public static final BitSet FOLLOW_rule__LanguageFeature__Group_8__4__Impl_in_rule__LanguageFeature__Group_8__43905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LanguageFeature__Group_8__4__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MandatoryChild__Group__0__Impl_in_rule__MandatoryChild__Group__03974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MandatoryChild__Group__1_in_rule__MandatoryChild__Group__03977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MandatoryChild__Group__0__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MandatoryChild__Group__1__Impl_in_rule__MandatoryChild__Group__14036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MandatoryChild__FeatureAssignment_1_in_rule__MandatoryChild__Group__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionalChild__Group__0__Impl_in_rule__OptionalChild__Group__04097 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OptionalChild__Group__1_in_rule__OptionalChild__Group__04100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OptionalChild__Group__0__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionalChild__Group__1__Impl_in_rule__OptionalChild__Group__14159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionalChild__FeatureAssignment_1_in_rule__OptionalChild__Group__1__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__0__Impl_in_rule__OrGroupChild__Group__04220 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__1_in_rule__OrGroupChild__Group__04223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OrGroupChild__Group__0__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__1__Impl_in_rule__OrGroupChild__Group__14282 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__2_in_rule__OrGroupChild__Group__14285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrGroupChild__Group__1__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__2__Impl_in_rule__OrGroupChild__Group__24344 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__3_in_rule__OrGroupChild__Group__24347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__FeaturesAssignment_2_in_rule__OrGroupChild__Group__2__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__3__Impl_in_rule__OrGroupChild__Group__34404 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__4_in_rule__OrGroupChild__Group__34407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group_3__0_in_rule__OrGroupChild__Group__3__Impl4434 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group__4__Impl_in_rule__OrGroupChild__Group__44465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrGroupChild__Group__4__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group_3__0__Impl_in_rule__OrGroupChild__Group_3__04534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group_3__1_in_rule__OrGroupChild__Group_3__04537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrGroupChild__Group_3__0__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__Group_3__1__Impl_in_rule__OrGroupChild__Group_3__14596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrGroupChild__FeaturesAssignment_3_1_in_rule__OrGroupChild__Group_3__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__0__Impl_in_rule__AlternativeGroup__Group__04657 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__1_in_rule__AlternativeGroup__Group__04660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AlternativeGroup__Group__0__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__1__Impl_in_rule__AlternativeGroup__Group__14719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__2_in_rule__AlternativeGroup__Group__14722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AlternativeGroup__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__2__Impl_in_rule__AlternativeGroup__Group__24781 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__3_in_rule__AlternativeGroup__Group__24784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__FeaturesAssignment_2_in_rule__AlternativeGroup__Group__2__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__3__Impl_in_rule__AlternativeGroup__Group__34841 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__4_in_rule__AlternativeGroup__Group__34844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group_3__0_in_rule__AlternativeGroup__Group__3__Impl4871 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group__4__Impl_in_rule__AlternativeGroup__Group__44902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AlternativeGroup__Group__4__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group_3__0__Impl_in_rule__AlternativeGroup__Group_3__04971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group_3__1_in_rule__AlternativeGroup__Group_3__04974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AlternativeGroup__Group_3__0__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__Group_3__1__Impl_in_rule__AlternativeGroup__Group_3__15033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AlternativeGroup__FeaturesAssignment_3_1_in_rule__AlternativeGroup__Group_3__1__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__0__Impl_in_rule__VariabilityPoint__Group__05094 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__1_in_rule__VariabilityPoint__Group__05097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__VariabilityPoint__Group__0__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__1__Impl_in_rule__VariabilityPoint__Group__15156 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__2_in_rule__VariabilityPoint__Group__15159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__NameAssignment_1_in_rule__VariabilityPoint__Group__1__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__2__Impl_in_rule__VariabilityPoint__Group__25216 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__3_in_rule__VariabilityPoint__Group__25219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__0_in_rule__VariabilityPoint__Group__2__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__3__Impl_in_rule__VariabilityPoint__Group__35277 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__4_in_rule__VariabilityPoint__Group__35280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__VariabilityPoint__Group__3__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__4__Impl_in_rule__VariabilityPoint__Group__45339 = new BitSet(new long[]{0x0000000140000000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__5_in_rule__VariabilityPoint__Group__45342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__VariationsAssignment_4_in_rule__VariabilityPoint__Group__4__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__5__Impl_in_rule__VariabilityPoint__Group__55399 = new BitSet(new long[]{0x0000000140000000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__6_in_rule__VariabilityPoint__Group__55402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__VariationsAssignment_5_in_rule__VariabilityPoint__Group__5__Impl5429 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__6__Impl_in_rule__VariabilityPoint__Group__65460 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__7_in_rule__VariabilityPoint__Group__65463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__VariabilityPoint__Group__6__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__7__Impl_in_rule__VariabilityPoint__Group__75522 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__8_in_rule__VariabilityPoint__Group__75525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__DefaultAssignment_7_in_rule__VariabilityPoint__Group__7__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group__8__Impl_in_rule__VariabilityPoint__Group__85582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VariabilityPoint__Group__8__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__0__Impl_in_rule__VariabilityPoint__Group_2__05659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__1_in_rule__VariabilityPoint__Group_2__05662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__VariabilityPoint__Group_2__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__1__Impl_in_rule__VariabilityPoint__Group_2__15721 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__2_in_rule__VariabilityPoint__Group_2__15724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_1_in_rule__VariabilityPoint__Group_2__1__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2__2__Impl_in_rule__VariabilityPoint__Group_2__25781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2_2__0_in_rule__VariabilityPoint__Group_2__2__Impl5808 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2_2__0__Impl_in_rule__VariabilityPoint__Group_2_2__05845 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2_2__1_in_rule__VariabilityPoint__Group_2_2__05848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__VariabilityPoint__Group_2_2__0__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__Group_2_2__1__Impl_in_rule__VariabilityPoint__Group_2_2__15907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_1_in_rule__VariabilityPoint__Group_2_2__1__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group__0__Impl_in_rule__Variation__Group__05968 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Variation__Group__1_in_rule__Variation__Group__05971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group__1__Impl_in_rule__Variation__Group__16029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variation__Group__2_in_rule__Variation__Group__16032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Variation__Group__1__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group__2__Impl_in_rule__Variation__Group__26091 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Variation__Group__3_in_rule__Variation__Group__26094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__NameAssignment_2_in_rule__Variation__Group__2__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group__3__Impl_in_rule__Variation__Group__36151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group_3__0_in_rule__Variation__Group__3__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group_3__0__Impl_in_rule__Variation__Group_3__06217 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variation__Group_3__1_in_rule__Variation__Group_3__06220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Variation__Group_3__0__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__Group_3__1__Impl_in_rule__Variation__Group_3__16279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variation__ModuleAssignment_3_1_in_rule__Variation__Group_3__1__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageProductLine__ImplementationFileAssignment_1_16345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductLineVariability_in_rule__LanguageProductLine__ProductLineVariabilityAssignment_2_16376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageVariability_in_rule__LanguageProductLine__LanguageVariabilityAssignment_3_16407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_rule__ProductLineVariability__FeaturesAssignment_16438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguageFeature_in_rule__ProductLineVariability__FeaturesAssignment_26469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ProductLineVariability__RootFeatureAssignment_46504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_rule__LanguageVariability__VariabilityPointsAssignment_2_06539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariabilityPoint_in_rule__LanguageVariability__VariabilityPointsAssignment_2_16570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LanguageFeature__AbstractAssignment_16606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__NameAssignment_36645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__DependsAssignment_4_16680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__DependsAssignment_4_2_16719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__ExcludesAssignment_5_16758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__ExcludesAssignment_5_2_16797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LanguageFeature__ModuleAssignment_7_16832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelation_in_rule__LanguageFeature__ChildrenAssignment_8_26863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelation_in_rule__LanguageFeature__ChildrenAssignment_8_36894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MandatoryChild__FeatureAssignment_16929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OptionalChild__FeatureAssignment_16968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OrGroupChild__FeaturesAssignment_27007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OrGroupChild__FeaturesAssignment_3_17046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AlternativeGroup__FeaturesAssignment_27085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AlternativeGroup__FeaturesAssignment_3_17124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariabilityPoint__NameAssignment_17159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_17194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariabilityPoint__InvolvedFeaturesAssignment_2_2_17233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariation_in_rule__VariabilityPoint__VariationsAssignment_47268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariation_in_rule__VariabilityPoint__VariationsAssignment_57299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariabilityPoint__DefaultAssignment_77334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variation__NameAssignment_27369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variation__ModuleAssignment_3_17400 = new BitSet(new long[]{0x0000000000000002L});
    }


}