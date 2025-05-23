public class EventOpr {
    public static void main(String[] args) {
        EventDemo ev1 = new EventDemo();

        ev1.keyPressed();
        ev1.keyReleased();
        ev1.mouseClicked();
        ev1.mouseDragged();
        ev1.mouseMoved();
        ev1.mousePressed();
        ev1.mouseReleased();
        ev1.performEvent();
        
    }    
}

interface EventListener {
    public void performEvent();
}

interface MouseListener extends EventListener{

    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();

}

interface KeyListener extends EventListener{

    public void keyPressed();
    public void keyReleased();

}

class EventDemo implements MouseListener , KeyListener{

    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    public void keyReleased() {
        System.out.println("Key Released");
    }

    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }


    public void mouseReleased() {
        System.out.println("Mouse Released");
    }
    
    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }
    
    public void performEvent(){
        System.out.println("Event Performed");
    }
}