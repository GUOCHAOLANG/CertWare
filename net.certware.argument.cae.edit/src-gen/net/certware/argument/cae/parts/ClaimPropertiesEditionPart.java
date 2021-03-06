/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ClaimPropertiesEditionPart {

	/**
	 * @return the identifier
	 * 
	 */
	public String getIdentifier();

	/**
	 * Defines a new identifier
	 * @param newValue the new identifier to set
	 * 
	 */
	public void setIdentifier(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the content
	 * 
	 */
	public String getContent();

	/**
	 * Defines a new content
	 * @param newValue the new content to set
	 * 
	 */
	public void setContent(String newValue);




	/**
	 * Init the isTagged
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIsTagged(ReferencesTableSettings settings);

	/**
	 * Update the isTagged
	 * @param newValue the isTagged to update
	 * 
	 */
	public void updateIsTagged();

	/**
	 * Adds the given filter to the isTagged edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter);

	/**
	 * Adds the given filter to the isTagged edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the isTagged table
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element);


	/**
	 * @return the assumed
	 * 
	 */
	public Boolean getAssumed();

	/**
	 * Defines a new assumed
	 * @param newValue the new assumed to set
	 * 
	 */
	public void setAssumed(Boolean newValue);


	/**
	 * @return the toBeSupported
	 * 
	 */
	public Boolean getToBeSupported();

	/**
	 * Defines a new toBeSupported
	 * @param newValue the new toBeSupported to set
	 * 
	 */
	public void setToBeSupported(Boolean newValue);




	/**
	 * Init the strategy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategy(ReferencesTableSettings settings);

	/**
	 * Update the strategy
	 * @param newValue the strategy to update
	 * 
	 */
	public void updateStrategy();

	/**
	 * Adds the given filter to the strategy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrategy(ViewerFilter filter);

	/**
	 * Adds the given filter to the strategy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strategy table
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element);




	/**
	 * Init the assumption
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAssumption(ReferencesTableSettings settings);

	/**
	 * Update the assumption
	 * @param newValue the assumption to update
	 * 
	 */
	public void updateAssumption();

	/**
	 * Adds the given filter to the assumption edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter);

	/**
	 * Adds the given filter to the assumption edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the assumption table
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element);




	/**
	 * Init the context
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContext(ReferencesTableSettings settings);

	/**
	 * Update the context
	 * @param newValue the context to update
	 * 
	 */
	public void updateContext();

	/**
	 * Adds the given filter to the context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the context table
	 * 
	 */
	public boolean isContainedInContextTable(EObject element);




	/**
	 * Init the solution
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSolution(ReferencesTableSettings settings);

	/**
	 * Update the solution
	 * @param newValue the solution to update
	 * 
	 */
	public void updateSolution();

	/**
	 * Adds the given filter to the solution edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter);

	/**
	 * Adds the given filter to the solution edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the solution table
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
