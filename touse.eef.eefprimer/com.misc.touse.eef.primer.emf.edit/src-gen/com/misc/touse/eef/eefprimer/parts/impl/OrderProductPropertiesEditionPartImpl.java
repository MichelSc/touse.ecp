/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart;

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
public class OrderProductPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OrderProductPropertiesEditionPart {

	protected EObjectFlatComboViewer product;
	protected Text quantity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OrderProductPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence orderProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = orderProductStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.product);
		propertiesStep.addStep(EefprimerViewsRepository.OrderProduct.Properties.quantity);
		
		
		composer = new PartComposer(orderProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.OrderProduct.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.OrderProduct.Properties.product) {
					return createProductFlatComboViewer(parent);
				}
				if (key == EefprimerViewsRepository.OrderProduct.Properties.quantity) {
					return createQuantityText(parent);
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
		propertiesGroup.setText(EefprimerMessages.OrderProductPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createProductFlatComboViewer(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerMessages.OrderProductPropertiesEditionPart_ProductLabel);
		product = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerViewsRepository.SWT_KIND));
		product.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		product.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderProductPropertiesEditionPartImpl.this, EefprimerViewsRepository.OrderProduct.Properties.product, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getProduct()));
			}

		});
		GridData productData = new GridData(GridData.FILL_HORIZONTAL);
		product.setLayoutData(productData);
		product.setID(EefprimerViewsRepository.OrderProduct.Properties.product);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.OrderProduct.Properties.product, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createProductFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQuantityText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.OrderProduct.Properties.quantity, EefprimerMessages.OrderProductPropertiesEditionPart_QuantityLabel);
		quantity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData quantityData = new GridData(GridData.FILL_HORIZONTAL);
		quantity.setLayoutData(quantityData);
		quantity.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderProductPropertiesEditionPartImpl.this, EefprimerViewsRepository.OrderProduct.Properties.quantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
			}

		});
		quantity.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderProductPropertiesEditionPartImpl.this, EefprimerViewsRepository.OrderProduct.Properties.quantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
				}
			}

		});
		EditingUtils.setID(quantity, EefprimerViewsRepository.OrderProduct.Properties.quantity);
		EditingUtils.setEEFtype(quantity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.OrderProduct.Properties.quantity, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
