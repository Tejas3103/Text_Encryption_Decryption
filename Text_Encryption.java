import java.awt.*;
import java.awt.event.*;
public class Text_Encryption extends Frame implements ActionListener{


    Label text_label = new Label("Enter Text");
    Label result_label = new Label("Result : ");
    Label ed_label = new Label(" ");
    TextField text = new TextField(20);
    Panel p1 = new Panel();

    Button btn_e = new Button("Encrypt");
    Button btn_d = new Button("Decrypt");
    Dimension d = new Dimension(600,100);

    Text_Encryption()
    {
        setSize(600,600);
        setTitle("Java CP");
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 60));

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });

        text_label.setFont(new Font("Times New Roman",Font.BOLD,20));
        text.setFont(new Font("Times New Roman",Font.PLAIN,17));

        add(text_label);
        add(text);

        p1.setLayout(new FlowLayout(FlowLayout.CENTER,40,0));
        p1.setPreferredSize(d);
        p1.add(btn_e);
        p1.add(btn_d);
        add(p1);

        result_label.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(result_label);
        add(ed_label);

        btn_e.addActionListener(this);
        btn_d.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        Object ref = e.getSource();
        if(ref==btn_e)
            setBackground(Color.RED);
        else
        if(ref==btn_d)
            setBackground(Color.GREEN);
        else
            setBackground(Color.BLUE);
    }
    public static void main(String[] args)
    {
        Text_Encryption t = new Text_Encryption();
        t.setVisible(true);
    }
}


