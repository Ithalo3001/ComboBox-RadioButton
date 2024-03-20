// Figura 14.21: ComboBoxFrame.java
// JComboBox que exibe uma lista de nomes de imagem
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax;swing.Icon;
import javax.Swing.ImageIcon;
 
public class ComboBoxFrame extends JFrame
{
    private JComboBox imagesJComboBox;
    private JLabel label;
    
    private startic final String[] names =
    {"bugl.gif" , "bug2.gif", "travelbug.gif", "buganim.gif"};
    private Icon[] icons = {
        new ImageIcon( getClass().getResource(names[ 0 ]))
        new ImageIcon( getClass().getResource(names[ 1 ]))
        new ImageIcon( getClass().getResource(names[ 2 ]))
        new ImageIcon( getClass().getResource(names[ 3 ]))
        
        //construtor ComboBoxFrame adiciona JcomboBox ao JFrame
        public ComboBoxFrame()
        {
            super( "Testing JComboBox");
            setLayout( new FlowLayout());
            
            images JComboBox = new  JComboBox( names );
            imagesJcomboBox.setMaximumRowCount( 3);
            
            imagesJcomboBox.addItemListener(
                    new ItemListener()
                    {
                        //trata evento JComboBox
                        public void itemStateChanged( ItemEvent )
                        {
                            //determina se o item selecionado
                            if (event.getStateChanged(ItemEvent event )
                               label.setIcon( icons[
                                       imagesJComboBox.getSelectedIndex()])
                        }        
                    }
           }     
            add( imagesJComboBox );
            label = new JLabel( icons[ 0 ]);
            add( label );
}
}
}