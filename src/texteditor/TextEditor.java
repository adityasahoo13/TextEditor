
package texteditor;

import javax.swing.JFrame;

public class TextEditor 
{
    public static void main(String[] args) 
    {
        Texteditorgui obj = new Texteditorgui();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
