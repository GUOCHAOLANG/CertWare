/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.CitationElementPropertiesEditionPart;
import net.certware.argument.arm.providers.ArmMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code

/**
 * 
 * 
 */
public class CitationElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CitationElementPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
protected ReferencesTable isTagged;
protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer refersToArgumentElement;
	protected EObjectFlatComboViewer refersToArgument;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CitationElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence citationElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = citationElementStep.addStep(ArmViewsRepository.CitationElement.Properties.class);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.identifier);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.description);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.content);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.isTagged);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement);
		propertiesStep.addStep(ArmViewsRepository.CitationElement.Properties.refersToArgument);
		
		
		composer = new PartComposer(citationElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArmViewsRepository.CitationElement.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.content) {
					return createContentText(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.refersToArgumentElement) {
					return createRefersToArgumentElementFlatComboViewer(parent);
				}
				if (key == ArmViewsRepository.CitationElement.Properties.refersToArgument) {
					return createRefersToArgumentFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ArmMessages.CitationElementPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.identifier, ArmViewsRepository.SWT_KIND));
		identifier = new Text(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, ArmViewsRepository.CitationElement.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.identifier, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.description, ArmViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArmViewsRepository.CitationElement.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.description, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.content, ArmViewsRepository.SWT_KIND));
		content = new Text(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ArmViewsRepository.CitationElement.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.content, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(ArmMessages.CitationElementPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.isTagged, ArmViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(ArmViewsRepository.CitationElement.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRefersToArgumentElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_RefersToArgumentElementLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement, ArmViewsRepository.SWT_KIND));
		refersToArgumentElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement, ArmViewsRepository.SWT_KIND));
		refersToArgumentElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		refersToArgumentElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.refersToArgumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRefersToArgumentElement()));
			}

		});
		GridData refersToArgumentElementData = new GridData(GridData.FILL_HORIZONTAL);
		refersToArgumentElement.setLayoutData(refersToArgumentElementData);
		refersToArgumentElement.setID(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRefersToArgumentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_RefersToArgumentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.refersToArgument, ArmViewsRepository.SWT_KIND));
		refersToArgument = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.Properties.refersToArgument, ArmViewsRepository.SWT_KIND));
		refersToArgument.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		refersToArgument.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.Properties.refersToArgument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRefersToArgument()));
			}

		});
		GridData refersToArgumentData = new GridData(GridData.FILL_HORIZONTAL);
		refersToArgument.setLayoutData(refersToArgumentData);
		refersToArgument.setID(ArmViewsRepository.CitationElement.Properties.refersToArgument);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.Properties.refersToArgument, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getRefersToArgumentElement()
	 * 
	 */
	public EObject getRefersToArgumentElement() {
		if (refersToArgumentElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refersToArgumentElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initRefersToArgumentElement(EObjectFlatComboSettings)
	 */
	public void initRefersToArgumentElement(EObjectFlatComboSettings settings) {
		refersToArgumentElement.setInput(settings);
		if (current != null) {
			refersToArgumentElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentElement(EObject newValue)
	 * 
	 */
	public void setRefersToArgumentElement(EObject newValue) {
		if (newValue != null) {
			refersToArgumentElement.setSelection(new StructuredSelection(newValue));
		} else {
			refersToArgumentElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefersToArgumentElementButtonMode(ButtonsModeEnum newValue) {
		refersToArgumentElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterRefersToArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefersToArgumentElement(ViewerFilter filter) {
		refersToArgumentElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterRefersToArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefersToArgumentElement(ViewerFilter filter) {
		refersToArgumentElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getRefersToArgument()
	 * 
	 */
	public EObject getRefersToArgument() {
		if (refersToArgument.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refersToArgument.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initRefersToArgument(EObjectFlatComboSettings)
	 */
	public void initRefersToArgument(EObjectFlatComboSettings settings) {
		refersToArgument.setInput(settings);
		if (current != null) {
			refersToArgument.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgument(EObject newValue)
	 * 
	 */
	public void setRefersToArgument(EObject newValue) {
		if (newValue != null) {
			refersToArgument.setSelection(new StructuredSelection(newValue));
		} else {
			refersToArgument.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefersToArgumentButtonMode(ButtonsModeEnum newValue) {
		refersToArgument.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterRefersToArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefersToArgument(ViewerFilter filter) {
		refersToArgument.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterRefersToArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefersToArgument(ViewerFilter filter) {
		refersToArgument.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.CitationElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
