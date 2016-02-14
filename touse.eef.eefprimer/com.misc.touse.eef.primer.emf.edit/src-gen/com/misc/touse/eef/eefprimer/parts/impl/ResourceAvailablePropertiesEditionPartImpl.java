/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import org.eclipse.emf.ecore.EObject;

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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class ResourceAvailablePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ResourceAvailablePropertiesEditionPart {

	protected Text availableFrom;
	protected Text availableTo;
	protected EObjectFlatComboViewer resource;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ResourceAvailablePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence resourceAvailableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = resourceAvailableStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		
		
		composer = new PartComposer(resourceAvailableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom) {
					return createAvailableFromText(parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.availableTo) {
					return createAvailableToText(parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.resource) {
					return createResourceFlatComboViewer(parent);
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
		propertiesGroup.setText(EefprimerMessages.ResourceAvailablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createAvailableFromText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, EefprimerMessages.ResourceAvailablePropertiesEditionPart_AvailableFromLabel);
		availableFrom = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData availableFromData = new GridData(GridData.FILL_HORIZONTAL);
		availableFrom.setLayoutData(availableFromData);
		availableFrom.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartImpl.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableFrom.getText()));
			}

		});
		availableFrom.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartImpl.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableFrom.getText()));
				}
			}

		});
		EditingUtils.setID(availableFrom, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom);
		EditingUtils.setEEFtype(availableFrom, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAvailableFromText

		// End of user code
		return parent;
	}

	
	protected Composite createAvailableToText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, EefprimerMessages.ResourceAvailablePropertiesEditionPart_AvailableToLabel);
		availableTo = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData availableToData = new GridData(GridData.FILL_HORIZONTAL);
		availableTo.setLayoutData(availableToData);
		availableTo.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartImpl.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableTo.getText()));
			}

		});
		availableTo.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartImpl.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableTo.getText()));
				}
			}

		});
		EditingUtils.setID(availableTo, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo);
		EditingUtils.setEEFtype(availableTo, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAvailableToText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerMessages.ResourceAvailablePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerViewsRepository.SWT_KIND));
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartImpl.this, EefprimerViewsRepository.ResourceAvailable.Properties.resource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.setID(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createResourceFlatComboViewer

		// End of user code
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
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#getAvailableFrom()
	 * 
	 */
	public String getAvailableFrom() {
		return availableFrom.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#setAvailableFrom(String newValue)
	 * 
	 */
	public void setAvailableFrom(String newValue) {
		if (newValue != null) {
			availableFrom.setText(newValue);
		} else {
			availableFrom.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom);
		if (eefElementEditorReadOnlyState && availableFrom.isEnabled()) {
			availableFrom.setEnabled(false);
			availableFrom.setToolTipText(EefprimerMessages.ResourceAvailable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !availableFrom.isEnabled()) {
			availableFrom.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#getAvailableTo()
	 * 
	 */
	public String getAvailableTo() {
		return availableTo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#setAvailableTo(String newValue)
	 * 
	 */
	public void setAvailableTo(String newValue) {
		if (newValue != null) {
			availableTo.setText(newValue);
		} else {
			availableTo.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo);
		if (eefElementEditorReadOnlyState && availableTo.isEnabled()) {
			availableTo.setEnabled(false);
			availableTo.setToolTipText(EefprimerMessages.ResourceAvailable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !availableTo.isEnabled()) {
			availableTo.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#getResource()
	 * 
	 */
	public EObject getResource() {
		if (resource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#initResource(EObjectFlatComboSettings)
	 */
	public void initResource(EObjectFlatComboSettings settings) {
		resource.setInput(settings);
		if (current != null) {
			resource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		if (eefElementEditorReadOnlyState && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(EefprimerMessages.ResourceAvailable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#setResource(EObject newValue)
	 * 
	 */
	public void setResource(EObject newValue) {
		if (newValue != null) {
			resource.setSelection(new StructuredSelection(newValue));
		} else {
			resource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		if (eefElementEditorReadOnlyState && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(EefprimerMessages.ResourceAvailable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter) {
		resource.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.ResourceAvailable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
