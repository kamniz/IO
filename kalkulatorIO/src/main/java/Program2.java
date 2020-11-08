import java.awt.Container;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program2 {

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        SmpWindow2 wnd = new SmpWindow2();
        wnd.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        wnd.setVisible(true);
        wnd.setBounds( 70, 70, 500, 450);
        wnd.setTitle( "Przyciski" );
    }

}

class DrawWndPane2 extends JPanel implements ActionListener
{

   JButton button1;
   JButton button2;
   JButton button3;
   JButton button4;
   JButton button5;
   JButton button6;
   JButton button7;
   JButton button8;
   JButton button9;
   JButton button0;


   String  message;
   DrawWndPane2()
   {
       super();

       setLayout( null );

       
  
       button1 = new JButton( "1" );
       button2 = new JButton( "2" );
       button3 = new JButton( "3" ); 
       button4 = new JButton( "4" );
       button5 = new JButton( "5" );
       button6 = new JButton( "6" );
       button7 = new JButton( "7" );
       button8 = new JButton( "8" );
       button9 = new JButton( "9" );
       button0 = new JButton( "0" );

       button1.setBounds( 100, 100, 70, 30 );
       button2.setBounds( 190, 100, 70, 30 );
       button3.setBounds( 280, 100, 70, 30 ); 
       button4.setBounds( 100, 150, 70, 30 );
       button5.setBounds( 190, 150, 70, 30 );
       button6.setBounds( 280, 150, 70, 30 );
       button7.setBounds( 100, 200, 70, 30 );
       button8.setBounds( 190, 200, 70, 30 );
       button9.setBounds( 280, 200, 70, 30 );
       button0.setBounds( 190, 250, 70, 30 );
 
       add( button1 );
       add( button2 );
       add( button3 );
       add (button4);
       add (button5);
       add (button6);
       add (button7);
       add (button8);
       add (button9);
       add (button0);


       message = "Nie nacisnieto zadnego przycisku";

       button1.addActionListener( this );
       button2.addActionListener( this );
       button3.addActionListener( this );   
       button4.addActionListener( this );
       button5.addActionListener( this );
       button6.addActionListener( this );
       button7.addActionListener( this );
       button8.addActionListener( this );
       button9.addActionListener( this );
       button0.addActionListener( this );
   }

   public void paintComponent( Graphics g)
   {
       super.paintComponent(g);
   }

   public void actionPerformed( ActionEvent event)
   {
} 
}

class SmpWindow2 extends JFrame  
{

    public SmpWindow2()
    {       
       
        Container  contents = getContentPane();
        contents.add( new DrawWndPane2() );     
    }

}