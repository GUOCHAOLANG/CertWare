/*
 * generated by Xtext
 */
package net.certware.planning.cpn;

import java.util.Properties;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {net.certware.planning.cpn.CpnDslRuntimeModule}
 */
 @SuppressWarnings("all")
public abstract class AbstractCpnDslRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "net/certware/planning/cpn/CpnDsl.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("net.certware.planning.cpn.CpnDsl");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("cpn");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return net.certware.planning.cpn.services.CpnDslGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISemanticSequencer> bindISemanticSequencer() {
		return net.certware.planning.cpn.serializer.CpnDslSemanticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer> bindISyntacticSequencer() {
		return net.certware.planning.cpn.serializer.CpnDslSyntacticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.ISerializer> bindISerializer() {
		return org.eclipse.xtext.serializer.impl.Serializer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return net.certware.planning.cpn.parser.antlr.CpnDslParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return net.certware.planning.cpn.parser.antlr.CpnDslAntlrTokenFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslLexer> provideInternalCpnDslLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(net.certware.planning.cpn.parser.antlr.internal.InternalCpnDslLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.ValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends net.certware.planning.cpn.validation.CpnDslValidator> bindCpnDslValidator() {
		return net.certware.planning.cpn.validation.CpnDslValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return net.certware.planning.cpn.scoping.CpnDslScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
	}

	// contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return net.certware.planning.cpn.generator.CpnDslGenerator.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return net.certware.planning.cpn.formatting.CpnDslFormatter.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public org.eclipse.xtext.common.types.TypesFactory bindTypesFactoryToInstance() {
		return org.eclipse.xtext.common.types.TypesFactory.eINSTANCE;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider.class;
	}

}
