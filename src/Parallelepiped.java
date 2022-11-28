public class Parallelepiped  {
    private int height;
    private int length;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public double getSquare(){
        return  2*((height * length) + (length * width) + (height * width));
    }
    public double getWeight(){
        return (length*width*height);
    }
}
