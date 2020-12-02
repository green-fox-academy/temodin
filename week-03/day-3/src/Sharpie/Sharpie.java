package Sharpie;

public class Sharpie {
  String color;
  float width;
  float inkAmount = 5;

  public Sharpie (String color, float width) {
      this.color = color;
      this.width = width;
  }

  public void use() {
      if (this.inkAmount > 0) {this.inkAmount--;}
  }

}
