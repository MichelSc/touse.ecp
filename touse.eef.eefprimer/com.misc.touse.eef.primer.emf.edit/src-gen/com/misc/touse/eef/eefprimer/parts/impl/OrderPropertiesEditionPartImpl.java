/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart;

import com.misc.touse.eef.eefprimer.providers.EefprimerMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
public class OrderPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OrderPropertiesEditionPart {

	protected Text iD;
	protected ReferencesTable products;
	protected List<ViewerFilter> productsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> productsFilters = new ArrayList<ViewerFilter>();
	protected Text dueDate;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OrderPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence orderStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = orderStep.addStep(EefprimerViewsRepository.Order.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.Order.Properties.iD);
		propertiesStep.addStep(EefprimerViewsRepository.Order.Properties.products);
		propertiesStep.addStep(EefprimerViewsRepository.Order.Properties.dueDate);
		
		
		composer = new PartComposer(orderStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.Order.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.Order.Properties.iD) {
					return createIDText(parent);
				}
				if (key == EefprimerViewsRepository.Order.Properties.products) {
					return createProductsAdvancedTableComposition(parent);
				}
				if (key == EefprimerViewsRepository.Order.Properties.dueDate) {
					return createDueDateText(parent);
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
		propertiesGroup.setText(EefprimerMessages.OrderPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIDText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Order.Properties.iD, EefprimerMessages.OrderPropertiesEditionPart_IDLabel);
		iD = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData iDData = new GridData(GridData.FILL_HORIZONTAL);
		iD.setLayoutData(iDData);
		iD.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
			}

		});
		iD.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, EefprimerViewsRepository.Order.Properties.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Order.Properties.iD, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIDText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProductsAdvancedTableComposition(Composite parent) {
		this.products = new ReferencesTable(getDescription(EefprimerViewsRepository.Order.Properties.products, EefprimerMessages.OrderPropertiesEditionPart_ProductsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				products.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				products.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				products.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				products.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.productsFilters) {
			this.products.addFilter(filter);
		}
		this.products.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Order.Properties.products, EefprimerViewsRepository.SWT_KIND));
		this.products.createControls(parent);
		this.products.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.products, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData productsData = new GridData(GridData.FILL_HORIZONTAL);
		productsData.horizontalSpan = 3;
		this.products.setLayoutData(productsData);
		this.products.setLowerBound(0);
		this.products.setUpperBound(-1);
		products.setID(EefprimerViewsRepository.Order.Properties.products);
		products.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProductsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createDueDateText(Composite parent) {
		createDescription(parent, EefprimerViewsRepository.Order.Properties.dueDate, EefprimerMessages.OrderPropertiesEditionPart_DueDateLabel);
		dueDate = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData dueDateData = new GridData(GridData.FILL_HORIZONTAL);
		dueDate.setLayoutData(dueDateData);
		dueDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.dueDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dueDate.getText()));
			}

		});
		dueDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrderPropertiesEditionPartImpl.this, EefprimerViewsRepository.Order.Properties.dueDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dueDate.getText()));
				}
			}

		});
		EditingUtils.setID(dueDate, EefprimerViewsRepository.Order.Properties.dueDate);
		EditingUtils.setEEFtype(dueDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Order.Properties.dueDate, EefprimerViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDueDateText

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
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#setID(String newValue)
	 * 
	 */
	public void setID(String newValue) {
		if (newValue != null) {
			iD.setText(newValue);
		} else {
			iD.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Order.Properties.iD);
		if (eefElementEditorReadOnlyState && iD.isEnabled()) {
			iD.setEnabled(false);
			iD.setToolTipText(EefprimerMessages.Order_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !iD.isEnabled()) {
			iD.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#initProducts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		products.setContentProvider(contentProvider);
		products.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Order.Properties.products);
		if (eefElementEditorReadOnlyState && products.isEnabled()) {
			products.setEnabled(false);
			products.setToolTipText(EefprimerMessages.Order_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !products.isEnabled()) {
			products.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#updateProducts()
	 * 
	 */
	public void updateProducts() {
	products.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#addFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProducts(ViewerFilter filter) {
		productsFilters.add(filter);
		if (this.products != null) {
			this.products.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#addBusinessFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter) {
		productsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#isContainedInProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element) {
		return ((ReferencesTableSettings)products.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#getDueDate()
	 * 
	 */
	public String getDueDate() {
		return dueDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart#setDueDate(String newValue)
	 * 
	 */
	public void setDueDate(String newValue) {
		if (newValue != null) {
			dueDate.setText(newValue);
		} else {
			dueDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Order.Properties.dueDate);
		if (eefElementEditorReadOnlyState && dueDate.isEnabled()) {
			dueDate.setEnabled(false);
			dueDate.setToolTipText(EefprimerMessages.Order_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dueDate.isEnabled()) {
			dueDate.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.Order_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
