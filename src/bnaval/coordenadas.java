
package bnaval;
public class coordenadas {
    
    private Integer x;
    private Integer y;

    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }
    
    public coordenadas (int x, int y){
    this.x= x;
    this.y=y;
}
}
