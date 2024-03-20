//Figura 14.19: RadioButtonFrame.java
// Criando botões de opção utilizando ButtonGroup e JRadioButton
import java.awt.FlowLayout;
import java.awt.Font;        
import java.awt.event.ItemListenner;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
    private JTextField textField;
    private Font plainFont;
    private Font boldFont; 
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;

//construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
   public RadioButtonFrame()
   {
       super( "RadioButton Test");
       setLayout( new FlowLayout());
       
       textField = new JTextField( "Watch the font style change", 25);
       add( textField);
       
       //cria botões de opção
       plainJRadioButton("Plain", true);
       boldRadioButton = new JRadioButton( "Bold", false);
       italicJRadioButton = new JRadioButton("Italic", false);
       boldItalicJRadioButton = new JRadioButton("Bold/italic", false);
       add(plainJRadioButton );
       add( boldJRadioButton );
       add(italicJRadioButton );
       add(boldItalicJRadioButton ); 
      
       // cria relacionamento lógico entre JRadioButtons
       radioGroup = new ButtonGroup();
       radioGroup.add( plainJRadioButton );
       radioGroup.add(boldJRadioButton);
       radioGroup.add(italicJRadioButton );
       radioGroup.add( boldItalicJRadioButton );
       
       //cria fonte objetos
       plainFont = new Font( "Serif", Font.PLAIN, 14 );
       boldFont = new Font("Serif", Font.BOLD, 14 );
       italicFont = new Font("Serif, Font.ITALIC, 14" );
       boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14 );
       textField.setFont( plainFont );
       
       // registra eventos para JRadioButtons
       plainJRadioButton.addItemListenner(
               new RadioButtonHandler(plainFont ) );
       boldJRadioButton.addItemListener(
               new RadioButtonHandler(boldFont ) );
       italicJRadioButton.addItemListener(
               new RadioButtonHandler( italicFont ) );
       boldItalicJRadioButton.addItemListener(
               new RadioButtonHandler( boldItalicFont ) );
   }  //fim do construtor RadioButtonFrame
   
// classe interna privatepara tratar eventos de botão de opção
   private class RadioButtonHandler implements ItemListener
   {
       private Font font;
       
       public RadioButtonHandler( Font f )
       {
           font = f;
       }
       
       //trata eventos de botão de opção
       public void itemStateChanged( ItemEvent event )
       {
           textField.setFont( font );
       }        
   }        
}  