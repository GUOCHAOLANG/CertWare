/*
* generated by Xtext
*/
package net.certware.planning.cpn.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import net.certware.planning.cpn.services.CpnDslGrammarAccess;

public class CpnDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CpnDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslParser createParser(XtextTokenStream stream) {
		return new net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Plans";
	}
	
	public CpnDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CpnDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
