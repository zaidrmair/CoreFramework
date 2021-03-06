
package core.dataview;

import javax.swing.JTextField;

/**
 *
 * @author  PRAM WEE
 */
public class JTextFieldEx extends JTextField implements CoreConstants {

    private int dataType = STRING;
    private String fieldName = "";
    private boolean focusFirst;
    private boolean manuallyFilled=false;

    public int getAsInt() {
        try{
            int i = Integer.parseInt(getText());
            return i;
        }catch(NumberFormatException e){
            return -1;
        }

    }

    public int getTextAsInt() {
        try { 
            int i  = Integer.parseInt(getText());
            return i;
        }catch(NumberFormatException e){
            
            return -1;
        }

    }

    

    public boolean isEmpty() {
        return getText().equals("");
    }

    public boolean isManuallyFilled() {
        return manuallyFilled;
    }

    public boolean mustNumber() {
        try{
            double d = Integer.parseInt(getText());
            return true;
        }catch(NumberFormatException e){
            return false;
        }

    }

    public void setManuallyFilled(boolean manuallyFilled) {
        this.manuallyFilled = manuallyFilled;
    }

    public boolean isFocusFirst() {
        return focusFirst;
    }

    public void setFocusFirst(boolean focusFirst) {
        this.focusFirst = focusFirst;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    /** Creates new form BeanForm */
    public JTextFieldEx() {
        initComponents();
        setText("");
    }

    public String getSQLValue() {
        if (dataType == DATE) {
            if ("".equals(getText())) {
                return null;
            } else {
                return "'" + getText() + "'";
            }
        }
        return getText();


    }


    public boolean toFew() {
        return getText().length()<=2;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
