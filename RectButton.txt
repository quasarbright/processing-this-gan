/**
 *Creates a rectangular button that is clickable/touchable
 * Uses processing syntax
 * 
 * @author mdelmonaco
 */
class RectButton {
    float x,y,w,h;
    int R = 0;
    int G = 0;
    int B = 0;
    RectButton(float x,float y, float w,float h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        fill(R,G,B);
    }
    
    RectButton(float x,float y, float w,float h, int R, int G, int B){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.R = R;
        this.G = G;
        this.B = B;
        fill(R,G,B);
    }
    /**
     * 
     * 
     * @param mx x coordinate of point to be checked
     * @param my y coordinate of point to be checked
     * @return   true if point is in or on boundary of button
     */
    boolean isIn(float mx,float my){//checks if a point is in the button
        boolean xin = mx>=x && mx<=-x+w;
        boolean yin = my>=y && my<=-y+h;
        return xin && yin;
    }
    
    boolean isClicked(){
        //incomplete
    }
    
    /**
     * 
     */
    void update(){
        
    }
    
}
