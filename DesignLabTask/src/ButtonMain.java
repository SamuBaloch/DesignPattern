public class ButtonMain {
    public static void main(String[] args) {
        Dialog dialog;
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
        dialog.renderWindow();
    }
}