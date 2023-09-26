package kr.ed.haebeop.test.decorator;

public abstract class DisplayDecorator extends Display{
    private final Display decorateDisplay;

    public DisplayDecorator(Display decorateDisplay) {
        this.decorateDisplay = decorateDisplay;
    }

    @Override
    public void draw() {
        decorateDisplay.draw();
    }
}
