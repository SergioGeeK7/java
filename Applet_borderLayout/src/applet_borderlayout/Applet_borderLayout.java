
package applet_borderlayout;
  import java.awt.*;
import java.applet.*;



 

public class Applet_borderLayout extends Applet {
   Button b1, b2, b3;
   TextField t1, t2;
   public Applet_borderLayout() {
      setLayout(new BorderLayout());
      t1 = new TextField("a");
      t2 = new TextField("b");
      b1 = new Button("b1");
      b2 = new Button("b2");
      b3 = new Button("b3");
      add(t1, BorderLayout.NORTH);
      add(t2, BorderLayout.EAST);
      add(b1, BorderLayout.WEST);
      add(b2, BorderLayout.SOUTH);
      add(b3, BorderLayout.CENTER);
   }


}
