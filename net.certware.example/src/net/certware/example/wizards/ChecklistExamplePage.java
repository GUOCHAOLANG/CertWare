package net.certware.example.wizards;

import net.certware.core.ui.help.IHelpContext;
import net.certware.example.ExampleContributions;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;



/**
 * A details page for the document examples.
 * @author mrb
 * @since 1.0
 */
public class ChecklistExamplePage extends ExamplePage
{

	/**
	 * Example page for check lists.
	 * @param ec example contributions
	 */
	public ChecklistExamplePage(ExampleContributions ec) {
		super(ec);
	}

	@Override
	void setHelpContext(Control c) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(c, IHelpContext.EXAMPLE_WIZARD_CHECKLIST);
	}

}
