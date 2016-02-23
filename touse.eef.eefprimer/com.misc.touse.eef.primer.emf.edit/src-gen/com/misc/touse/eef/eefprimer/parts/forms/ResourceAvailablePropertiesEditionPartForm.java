/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.forms;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class ResourceAvailablePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ResourceAvailablePropertiesEditionPart {

	protected Text availableFrom;
	protected Text availableTo;
	protected EObjectFlatComboViewer resource;



	/**
	 * For {@link ISection} use only.
	 */
	public ResourceAvailablePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ResourceAvailablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence resourceAvailableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = resourceAvailableStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo);
		propertiesStep.addStep(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		
		
		composer = new PartComposer(resourceAvailableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom) {
					return createAvailableFromText(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.availableTo) {
					return createAvailableToText(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.ResourceAvailable.Properties.resource) {
					return createResourceFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefprimerMessages.ResourceAvailablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createAvailableFromText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, EefprimerMessages.ResourceAvailablePropertiesEditionPart_AvailableFromLabel);
		availableFrom = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		availableFrom.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData availableFromData = new GridData(GridData.FILL_HORIZONTAL);
		availableFrom.setLayoutData(availableFromData);
		availableFrom.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ResourceAvailablePropertiesEditionPartForm.this,
							EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableFrom.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ResourceAvailablePropertiesEditionPartForm.this,
									EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, availableFrom.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ResourceAvailablePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		availableFrom.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartForm.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableFrom.getText()));
				}
			}
		});
		EditingUtils.setID(availableFrom, EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom);
		EditingUtils.setEEFtype(availableFrom, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAvailableFromText

		// End of user code
		return parent;
	}

	
	protected Composite createAvailableToText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, EefprimerMessages.ResourceAvailablePropertiesEditionPart_AvailableToLabel);
		availableTo = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		availableTo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData availableToData = new GridData(GridData.FILL_HORIZONTAL);
		availableTo.setLayoutData(availableToData);
		availableTo.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ResourceAvailablePropertiesEditionPartForm.this,
							EefprimerViewsRepository.ResourceAvailable.Properties.availableTo,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableTo.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ResourceAvailablePropertiesEditionPartForm.this,
									EefprimerViewsRepository.ResourceAvailable.Properties.availableTo,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, availableTo.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ResourceAvailablePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		availableTo.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartForm.this, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availableTo.getText()));
				}
			}
		});
		EditingUtils.setID(availableTo, EefprimerViewsRepository.ResourceAvailable.Properties.availableTo);
		EditingUtils.setEEFtype(availableTo, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAvailableToText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerMessages.ResourceAvailablePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerViewsRepository.FORM_KIND));
		widgetFactory.adapt(resource);
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceAvailablePropertiesEditionPartForm.this, EefprimerViewsRepository.ResourceAvailable.Properties.resource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		resource.setID(EefprimerViewsRepository.ResourceAvailable.Properties.resource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.ResourceAvailable.Properties.resource, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
