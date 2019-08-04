package com.company;

import javax.swing.*;//while we use jframe we import the following package
import java.awt.*;//??
import java.awt.event.ActionEvent;//for action event
import java.awt.event.ActionListener;//for action listner


/*jframe is extended by class bot and this frame ends after main .. ---->>>jframe is a swings component*/

public class bot extends JFrame {       //declare text area and field
    private JTextArea Chatarea = new JTextArea();//chat area declaration
    private JTextField chatbox = new JTextField();
    //create two objects in class bot which is chatarea and chatbox

    public bot() {
        JFrame frame = new JFrame();//frame is created and follwing properties are set to create a chat area
        frame.setLayout(null);
        frame.setName("bot");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//when window is closed the frame should be closed
        frame.setBackground(Color.blue);
        frame.setVisible(true); //the window is set to visible
        frame.add(chatbox);//object created in class bot is added to frame
        frame.add(Chatarea);//area of chat

        //for chat area
        Chatarea.setSize(500, 400);
        /* the chatarea is declared in class bot is then the function is called which is
        frame.add(Chatarea) this is added to frame*/
        Chatarea.setLocation(2, 10);
        //FOR CHAT BOX
        chatbox.setSize(540, 20);
        chatbox.setLocation(2, 500);
//action listner for input and response from bot

        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {



                String gText = chatbox.getText(); //gtext is variable which store input
                Chatarea.append("YOU--------->"+gText+"\n");//append the input from user
                chatbox.setText("");
                //simple response from bot
                if (gText.contains("hi"))
                {
                    bot("hola");
                }
                else {
                    bot("sorry!your so dumb");
                }
            }
        });

    }


    private void bot(String string) {
        Chatarea.append("BOT--------->" + string + "\n");// string is variable to store bots response
    }


    public static void main(String[] args) {

        new bot();//calling the function bot
    }
}
