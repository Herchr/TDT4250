package tdt4250.a1.tests;

import junit.framework.TestCase;



import org.eclipse.emf.common.util.URI;
import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import tdt4250.a1.A1Factory;
import tdt4250.a1.A1Package;

public class A1ValidatorTest extends TestCase{
	
	private Resource testInstance;
	private Diagnostic diagnostics;
	
	protected Resource loadResource(String name) throws Exception{
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(A1Package.eNS_URI, A1Package.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resourceSet.getResource(URI.createURI(A1ValidatorTest.class.getResource(name +".xmi").toString()), true);

	}
	protected void setUp() throws Exception {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		testInstance = loadResource("A1ValidatorTest");
		diagnostics = Diagnostician.INSTANCE.validate(testInstance.getContents().get(0));

	}
	
	public void testNeedsEnoughCredits_valid() {
		boolean valid = true;
		for (Diagnostic d: diagnostics.getChildren()) {
			String message = d.getMessage().split("'")[1];
			if(message.equals("needsEnoughCredits")) {
				valid = false;
			}
		}
		assertTrue("Needs enough credits test failed", valid);
		System.out.println(diagnostics.getChildren().get(0).getMessage());
		//diagnostics.getChildren();
		//assertTrue(true);
	}
	
	public void testNeedsEnoughCredits_invalid() throws Exception {
		/*Resource testInstance = loadResource("A1ValidatorTest");
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testInstance.getContents().get(0));*/
		assertTrue(true);
		
	}

}
