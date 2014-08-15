/*
 * generated by Xtext
 */
package net.certware.argument.sfp.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.certware.argument.sfp.ui.internal.SemiFormalProofActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SemiFormalProofExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SemiFormalProofActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SemiFormalProofActivator.getInstance().getInjector(SemiFormalProofActivator.NET_CERTWARE_ARGUMENT_SFP_SEMIFORMALPROOF);
	}
	
}
