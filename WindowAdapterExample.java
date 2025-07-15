import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
  public static void main(String[] args) {
    Frame frame = new Frame("My Window");

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.out.println("Window closing...");
        frame.dispose();
      }
    });

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
