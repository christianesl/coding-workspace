package lab;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JavaSwing {

    public String typePassword() {
        String password = "";
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Please type your password :", JOptionPane.OK_OPTION);
        if (okCxl == JOptionPane.OK_OPTION) {
            password = new String(pf.getPassword());
        } else {
            System.exit(1);
        }
        return password;
    }

    public String capturePasswordConfirmation() {
        String password = "";
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Please confirm password :", JOptionPane.OK_OPTION);
        if (okCxl == JOptionPane.OK_OPTION) {
            password = new String(pf.getPassword());
        } else {
            System.exit(1);
        }
        return (password);
    }

    public String captureInputValue() {
        String period = "";
        JTextField tf = new JTextField();
        int okCxl = JOptionPane.showConfirmDialog(null, tf, "Enter number: ", JOptionPane.OK_OPTION);
        if (okCxl == JOptionPane.OK_OPTION) {
            period = new String(tf.getText());
        } else {
            System.exit(1);
        }

        return (period.trim());

    }

    public String selectTab() {
        String environment = "";
        String[] envOptions = {"Review", "Represent", "Approve"};
        JComboBox envListCombo = new JComboBox(envOptions);
        envListCombo.setSelectedIndex(0);

        int envSelected = JOptionPane.showConfirmDialog(null, envListCombo, "Select the tab", JOptionPane.OK_OPTION);
        envSelected = envListCombo.getSelectedIndex();
        switch (envSelected) {
            case 0:
                environment = "review";
                break;
            case 1:
                environment = "represent";
                break;
            case 2:
                environment = "approve";
        }

        return (environment);
    }

    public static void main(String[] args) {
        JavaSwing obj = new JavaSwing();
//        String pwd1 = "1";
//        String pwd2 = "2";
//
//        do {
//            pwd1 = obj.typePassword();
//            pwd2 = obj.capturePasswordConfirmation();
//        } while (!pwd1.equals(pwd2));

        String sString = obj.captureInputValue();
        System.out.println("Value captured :" + sString);


    }


}
