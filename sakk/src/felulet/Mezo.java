package felulet;

import javafx.scene.paint.Color;

import javax.swing.*;

public class Mezo extends JButton {

    private  int x;
    private int y;
    private int ertek;

    public Mezo(int x, int y, int ertek) {
        this.x = x;
        this.y = y;
        this.ertek = ertek;
        this.frissit();
    }

    public void frissit(){
        if ((this.x+this.y)%2==0){
            this.setBackground(Color.decode("#FFFFF"));
        }else{
            this.setBackground(Color.decode("#884513"));
        }
        String  fajlNev="img/user.png";
        switch (this.ertek){
            case 11: fajlNev="img/feherGyalog.png";break;
            case 12: fajlNev="img/feherBastya.png";break;
            case 13: fajlNev="img/feherHuszar.png";break;
            case 14: fajlNev="img/feherFuto.png";break;
            case 15: fajlNev="img/FeherVezer.png";break;
            case 16: fajlNev="img/feherKiraly.png";break;
            case 21: fajlNev="img/feherGyalog.png";break;
            case 22: fajlNev="img/feherBastya.png";break;
            case 23: fajlNev="img/feherHuszar.png";break;
            case 24: fajlNev="img/feherFuto.png";break;
            case 25: fajlNev="img/FeherVezer.png";break;
            case 26: fajlNev="img/feher-gyalog.png";break;




        }

        image ing = new ImageIcon((fajlNev).getImage().getScaledInstance)
    }

}
