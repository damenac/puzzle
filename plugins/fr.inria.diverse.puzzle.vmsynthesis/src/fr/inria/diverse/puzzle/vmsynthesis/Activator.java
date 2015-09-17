package fr.inria.diverse.puzzle.vmsynthesis;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import es.us.isa.FAMA.Reasoner.QuestionTrader;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.inria.diverse.puzzle.vmsynthesis"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
//		 String className = QuestionTrader.class.getCanonicalName();
//		 //attribute sr (ServiceReference) defined on the Activator
//		 ServiceReference sr = context.getServiceReference(className);
//		 QuestionTrader qt = (QuestionTrader) context.getService(sr);
//		 if (qt != null){
//		 System.out.println("FaMa load successful");
//		 //here you use FaMa as on Standalone version
//		 consumeFaMa(qt);
//		 }
	}

//	private void consumeFaMa(QuestionTrader qt) {
//		// TODO Auto-generated method stub
//		
//	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
