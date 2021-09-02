public class Restaurant {
  private String name;
  private int rating;
  private double avgPrice;
  private boolean hasVeg;
  
  public Restaurant(String n, int r, double aP, boolean hV) {
    name = n;
    rating = r;
    avgPrice = aP;
    hasVeg = hV;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setRating(int rating){
    this.rating = rating;
  }
  public void setAvgPrice(double avgPrice){
    this.avgPrice = avgPrice;
  }
  public void setHasVeg(boolean hasVeg){
    this.hasVeg = hasVeg;
  }
  public int compareTo(Restaurant r1) {
    if(r1.rating == rating){
      return 0;
    }
      else if(r1.rating > rating) {
        return -1;
      }
        else{
          return 1;
        }
  }
  public String equals(Restaurant r1) {
    String okay = "";
    if(name.equals(r1.name)) {
      if(rating == r1.rating) {
        if(avgPrice == r1.avgPrice) {
          if(hasVeg == r1.hasVeg) {
            okay = "Equals";
          }
        }
      }
    } else {
      okay = "Not Equals";
    }
    return okay;
  }  
    public String toString() {
    String word = "";
    word += name + "\n";
    word += "Rating: ";
    for(int i = 0; i < rating; i++) {
      word+= "*";
    }
    word+="\n";
    word+="Average Price: $"+avgPrice+"\n";
    word+="Has Vegetarian?: "+hasVeg;
    
    return word;
  }
                        }