package functions;

import javax.swing.JOptionPane;

public class VerifyPasswordSecurity {

    private static final String simbolo = (" +,-!·$%&=¿?@#|~€");

    public static void safe(String password) {

        boolean upper = false;
        boolean digit = false;
        boolean sign = false;
        boolean size = false;
        char c;

        for (int i = 0; i < password.length(); i++) {

            c = password.charAt(i);

            if (Character.isDigit(c)) {
                digit = true;
            }
            if (Character.isUpperCase(c)) {
                upper = true;
            }
            for (int j = 0; j < simbolo.length(); j++) {
                if (c == simbolo.charAt(j)) {
                    sign = true;
                }
            }
            if (password.length() >= 8) {
                size = true;
            }

        }

        if (digit && upper && sign && size) {
            JOptionPane.showMessageDialog(null, "Contraseña cumple con los requisitos", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && upper && sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && upper && !sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos un signo", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && !upper && !sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos un signo \nSu contraseña debe tener al menos una mayuscula", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && !upper && !sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos un signo \nSu contraseña debe tener al menos una mayuscula \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && upper && !sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && !upper && sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos\nSu contraseña debe tener al menos una mayuscula \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && !upper && !sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos un signo \nSu contraseña debe tener al menos una mayuscula \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && upper && sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && !upper && sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos una mayuscula", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && upper && !sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos un signo", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && upper && !sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos un signo \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && !upper && sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos una mayuscula", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (digit && !upper && !sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos un signo \nSu contraseña debe tener al menos una mayuscula", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && upper && sign && !size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe ser de al menos 8 digitos \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!digit && !upper && sign && size) {
            JOptionPane.showMessageDialog(null, "Su contraseña debe tener al menos una mayuscula \nSu contraseña debe tener al menos un numero", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
