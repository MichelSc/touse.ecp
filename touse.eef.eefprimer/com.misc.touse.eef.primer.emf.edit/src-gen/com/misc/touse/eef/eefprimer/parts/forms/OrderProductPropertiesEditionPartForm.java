/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.forms;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart;

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
public class OrderProductPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OrderProductPropertiesEditionPart {

	protected EObjectFlatComboViewer product;
	protected Text quantity;



	/**
	 * For {@link ISection} use only.
	 */
	public OrderProductPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OrderProductPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence orderProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = orderProductStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.product);
		propertiesStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.quantity);
		
		
		composer = new PartComposer(orderProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.OrderProduct.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefprimerViewsRepository.OrderProduct.Properties.product) {
					return createProductFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefprimerViewsRepository.OrderProduct.Properties.quantity) {
					return createQuantityText(widgetFactory, parent);
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
		propertiesSection.setText(EefprimerMessages.OrderProductPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerMessages.OrderProductPropertiesEditionPart_ProductLabel);
		product = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerViewsRepository.FORM_KIND));
		widgetFactory.adapt(product);
		product.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData productData = new GridData(GridData.FILL_HORIZONTAL);
		product.setLayoutData(productData);
		product.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderProductPropertiesEditionPartForm.this, EefprimerViewsRepository.OrderProduct.Properties.product, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProduct()));
			}

		});
		product.setID(EefprimerViewsRepository.OrderProduct.Properties.product);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProductFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQuantityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefprimerViewsRepository.OrderProduct.Properties.quantity, EefprimerMessages.OrderProductPropertiesEditionPart_QuantityLabel);
		quantity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		quantity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData quantityData = new GridData(GridData.FILL_HORIZONTAL);
		quantity.setLayoutData(quantityData);
		quantity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OrderProductPropertiesEditionPartForm.this,
							EefprimerViewsRepository.OrderProduct.Properties.quantity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OrderProductPropertiesEditionPartForm.this,
									EefprimerViewsRepository.OrderProduct.Properties.quantity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, quantity.getText()));
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
									OrderProductPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		quantity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderProductPropertiesEditionPartForm.this, EefprimerViewsRepository.OrderProduct.Properties.quantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
				}
			}
		});
		EditingUtils.setID(quantity, EefprimerViewsRepository.OrderProduct.Properties.quantity);
		EditingUtils.setEEFtype(quantity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.OrderProduct.Properties.quantity, EefprimerViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createQuantityText

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
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#getProduct()
	 * 
	 */
	public EObject getProduct() {
		if (product.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) product.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#initProduct(EObjectFlatComboSettings)
	 */
	public void initProduct(EObjectFlatComboSettings settings) {
		product.setInput(settings);
		if (current != null) {
			product.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.OrderProduct.Properties.product);
		if (eefElementEditorReadOnlyState && product.isEnabled()) {
			product.setEnabled(false);
			product.setToolTipText(EefprimerMessages.OrderProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !product.isEnabled()) {
			product.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#setProduct(EObject newValue)
	 * 
	 */
	public void setProduct(EObject newValue) {
		if (newValue != null) {
			product.setSelection(new StructuredSelection(newValue));
		} else {
			product.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.OrderProduct.Properties.product);
		if (eefElementEditorReadOnlyState && product.isEnabled()) {
			product.setEnabled(false);
			product.setToolTipText(EefprimerMessages.OrderProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !product.isEnabled()) {
			product.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#setProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProductButtonMode(ButtonsModeEnum newValue) {
		product.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#addFilterProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProduct(ViewerFilter filter) {
		product.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#addBusinessFilterProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProduct(ViewerFilter filter) {
		product.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#getQuantity()
	 * 
	 */
	public String getQuantity() {
		return quantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart#setQuantity(String newValue)
	 * 
	 */
	public void setQuantity(String newValue) {
		if (newValue != null) {
			quantity.setText(newValue);
		} else {
			quantity.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.OrderProduct.Properties.quantity);
		if (eefElementEditorReadOnlyState && quantity.isEnabled()) {
			quantity.setEnabled(false);
			quantity.setToolTipText(EefprimerMessages.OrderProduct_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !quantity.isEnabled()) {
			quantity.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.OrderProduct_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
