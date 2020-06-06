package org.noip.mrgreenleaves.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    // JButton must be the type like int or boolean and panelMain might be the variable
    private JButton button_msg;
    private JPanel panelMain;

    public App() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //JOption pane is used to show a message 2 arguments where the first argument is the context and the second is the message
            JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }
    //code would not run if there was no main method enter: psvm as a shortcut
    public static void main(String[] args) {

        //create a Frame object using the JFrame() constructor
        JFrame firstTry = new JFrame("First App");

        //fill this firstTry frame with the content
        //the content will be created using the constructor App() and calling the object=panelMain
        firstTry.setContentPane(new App().panelMain);
        firstTry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        the code specifies what happens when your user closes the frame. The EXIT_ON_CLOSE operation exits the program when your user closes the frame.
        This behavior is appropriate for this program because the program has only one frame, and closing the frame makes the program useless.
         */

        /*
        The pack method sizes the frame so that all its contents are at or above their preferred sizes.
        An alternative to pack is to establish a frame size explicitly by calling setSize or setBounds (which also sets the frame location).
        In general, using pack is preferable to calling setSize, since pack leaves the frame layout manager in charge of the frame size,
        and layout managers are good at adjusting to platform dependencies and other factors that affect component size.
        source: https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
         */
        firstTry.pack();

        //set the Location of the Frame into the center of the screen
        firstTry.setLocationRelativeTo(null);
        firstTry.setVisible(true);

        /* skipped:
        The next bit of code adds a blank label to the frame content pane. If you're not already familiar with content panes and how to add components to them,
        please read Adding Components to the Content Pane.
        https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html#contentpane

        For frames that have menus, you'd typically add the menu bar to the frame here using the setJMenuBar method. See How to Use Menus for details.
        https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
         */
    }
}
