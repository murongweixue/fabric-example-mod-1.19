package rickroll.script;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame (){

        setTitle("Demo");

        setSize(1920,1280);

        setLocationRelativeTo(null);

    }
    public static void rickroll (){

        GameFrame frame = new GameFrame();

        frame.setVisible(true);

    }


}
