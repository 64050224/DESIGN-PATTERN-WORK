class ImageProxy implements IImage{
    String fileName;
    Image image;
    ImageProxy(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(image == null){
            image = new Image(fileName);
        }
        image.display();
    }
}