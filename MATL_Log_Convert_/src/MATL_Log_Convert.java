
import ij.plugin.PlugIn;
import javax.swing.WindowConstants;

/**
 * Convert Olympus MATL log file to txt file for stitching in Fiji
 * 
 * @author Neil Anthony
 */
public class MATL_Log_Convert implements PlugIn {

    /**
     *
     * @param arg
     */
    @Override
        public void run(String arg) {
            //ImagePlus.addImageListener(this);
            MATLLogConForm fileConvertForm = new MATLLogConForm();
            fileConvertForm.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
            fileConvertForm.setLocation(128, 128);
            fileConvertForm.setVisible(true);
            		
        }
        
        
    }