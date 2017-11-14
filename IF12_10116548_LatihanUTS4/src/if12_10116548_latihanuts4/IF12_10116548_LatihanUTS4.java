/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116548_latihanuts4;

import com.sun.media.sound.ModelDestination;

/**
 *
 * @author LENOVO
 */
public class IF12_10116548_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner mDes = new ModelDesigner();
        mDes.bonusDesigner(50000);
        
        ModelProgrammer mPro = new ModelProgrammer();
        mPro.bonusProgrammer(60000);
        
        ModelSystemAnalyst mSa = new ModelSystemAnalyst();
        mSa.bonusSa(90000);
    }

    private static void bonusprogrammer(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
