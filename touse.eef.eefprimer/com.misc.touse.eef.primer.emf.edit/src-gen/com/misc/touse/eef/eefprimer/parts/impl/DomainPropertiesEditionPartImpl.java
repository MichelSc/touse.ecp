/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts.impl;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart;
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class DomainPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DomainPropertiesEditionPart {

	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable skills;
	protected List<ViewerFilter> skillsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> skillsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable products;
	protected List<ViewerFilter> productsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> productsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable plans;
	protected List<ViewerFilter> plansBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> plansFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DomainPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence domainStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = domainStep.addStep(EefprimerViewsRepository.Domain.Properties.class);
		propertiesStep.addStep(EefprimerViewsRepository.Domain.Properties.resources);
		propertiesStep.addStep(EefprimerViewsRepository.Domain.Properties.skills);
		propertiesStep.addStep(EefprimerViewsRepository.Domain.Properties.products);
		propertiesStep.addStep(EefprimerViewsRepository.Domain.Properties.plans);
		
		
		composer = new PartComposer(domainStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefprimerViewsRepository.Domain.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefprimerViewsRepository.Domain.Properties.resources) {
					return createResourcesAdvancedTableComposition(parent);
				}
				if (key == EefprimerViewsRepository.Domain.Properties.skills) {
					return createSkillsAdvancedTableComposition(parent);
				}
				if (key == EefprimerViewsRepository.Domain.Properties.products) {
					return createProductsAdvancedTableComposition(parent);
				}
				if (key == EefprimerViewsRepository.Domain.Properties.plans) {
					return createPlansAdvancedTableComposition(parent);
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
		propertiesGroup.setText(EefprimerMessages.DomainPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesAdvancedTableComposition(Composite parent) {
		this.resources = new ReferencesTable(getDescription(EefprimerViewsRepository.Domain.Properties.resources, EefprimerMessages.DomainPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Domain.Properties.resources, EefprimerViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(EefprimerViewsRepository.Domain.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResourcesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSkillsAdvancedTableComposition(Composite parent) {
		this.skills = new ReferencesTable(getDescription(EefprimerViewsRepository.Domain.Properties.skills, EefprimerMessages.DomainPropertiesEditionPart_SkillsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				skills.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				skills.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				skills.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				skills.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.skillsFilters) {
			this.skills.addFilter(filter);
		}
		this.skills.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Domain.Properties.skills, EefprimerViewsRepository.SWT_KIND));
		this.skills.createControls(parent);
		this.skills.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.skills, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData skillsData = new GridData(GridData.FILL_HORIZONTAL);
		skillsData.horizontalSpan = 3;
		this.skills.setLayoutData(skillsData);
		this.skills.setLowerBound(0);
		this.skills.setUpperBound(-1);
		skills.setID(EefprimerViewsRepository.Domain.Properties.skills);
		skills.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSkillsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProductsAdvancedTableComposition(Composite parent) {
		this.products = new ReferencesTable(getDescription(EefprimerViewsRepository.Domain.Properties.products, EefprimerMessages.DomainPropertiesEditionPart_ProductsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				products.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				products.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				products.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				products.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.productsFilters) {
			this.products.addFilter(filter);
		}
		this.products.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Domain.Properties.products, EefprimerViewsRepository.SWT_KIND));
		this.products.createControls(parent);
		this.products.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.products, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData productsData = new GridData(GridData.FILL_HORIZONTAL);
		productsData.horizontalSpan = 3;
		this.products.setLayoutData(productsData);
		this.products.setLowerBound(0);
		this.products.setUpperBound(-1);
		products.setID(EefprimerViewsRepository.Domain.Properties.products);
		products.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProductsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPlansAdvancedTableComposition(Composite parent) {
		this.plans = new ReferencesTable(getDescription(EefprimerViewsRepository.Domain.Properties.plans, EefprimerMessages.DomainPropertiesEditionPart_PlansLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.plans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				plans.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.plans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				plans.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.plans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				plans.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.plans, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				plans.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.plansFilters) {
			this.plans.addFilter(filter);
		}
		this.plans.setHelpText(propertiesEditionComponent.getHelpContent(EefprimerViewsRepository.Domain.Properties.plans, EefprimerViewsRepository.SWT_KIND));
		this.plans.createControls(parent);
		this.plans.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DomainPropertiesEditionPartImpl.this, EefprimerViewsRepository.Domain.Properties.plans, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData plansData = new GridData(GridData.FILL_HORIZONTAL);
		plansData.horizontalSpan = 3;
		this.plans.setLayoutData(plansData);
		this.plans.setLowerBound(0);
		this.plans.setUpperBound(-1);
		plans.setID(EefprimerViewsRepository.Domain.Properties.plans);
		plans.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPlansAdvancedTableComposition

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
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Domain.Properties.resources);
		if (eefElementEditorReadOnlyState && resources.isEnabled()) {
			resources.setEnabled(false);
			resources.setToolTipText(EefprimerMessages.Domain_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resources.isEnabled()) {
			resources.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#initSkills(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSkills(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		skills.setContentProvider(contentProvider);
		skills.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Domain.Properties.skills);
		if (eefElementEditorReadOnlyState && skills.isEnabled()) {
			skills.setEnabled(false);
			skills.setToolTipText(EefprimerMessages.Domain_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !skills.isEnabled()) {
			skills.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#updateSkills()
	 * 
	 */
	public void updateSkills() {
	skills.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addFilterSkills(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSkills(ViewerFilter filter) {
		skillsFilters.add(filter);
		if (this.skills != null) {
			this.skills.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addBusinessFilterSkills(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSkills(ViewerFilter filter) {
		skillsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#isContainedInSkillsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSkillsTable(EObject element) {
		return ((ReferencesTableSettings)skills.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#initProducts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		products.setContentProvider(contentProvider);
		products.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Domain.Properties.products);
		if (eefElementEditorReadOnlyState && products.isEnabled()) {
			products.setEnabled(false);
			products.setToolTipText(EefprimerMessages.Domain_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !products.isEnabled()) {
			products.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#updateProducts()
	 * 
	 */
	public void updateProducts() {
	products.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addFilterProducts(ViewerFilter filter)
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
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addBusinessFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter) {
		productsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#isContainedInProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element) {
		return ((ReferencesTableSettings)products.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#initPlans(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPlans(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		plans.setContentProvider(contentProvider);
		plans.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefprimerViewsRepository.Domain.Properties.plans);
		if (eefElementEditorReadOnlyState && plans.isEnabled()) {
			plans.setEnabled(false);
			plans.setToolTipText(EefprimerMessages.Domain_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !plans.isEnabled()) {
			plans.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#updatePlans()
	 * 
	 */
	public void updatePlans() {
	plans.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addFilterPlans(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPlans(ViewerFilter filter) {
		plansFilters.add(filter);
		if (this.plans != null) {
			this.plans.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#addBusinessFilterPlans(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPlans(ViewerFilter filter) {
		plansBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart#isContainedInPlansTable(EObject element)
	 * 
	 */
	public boolean isContainedInPlansTable(EObject element) {
		return ((ReferencesTableSettings)plans.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefprimerMessages.Domain_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
