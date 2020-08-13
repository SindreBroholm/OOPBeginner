package sindre.broholm;

public class ChildrensBook extends Book{
    private String recommendedAgeInfo = "All";


    public ChildrensBook(String title, String author, int price, long prductId,  String recommendedAgeInfo) {
        super(title, author, price, prductId);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        if(!(recommendedAgeInfo.contains("All"))){
            System.out.println("Recommended age: " + recommendedAgeInfo);
        }else{
            System.out.println("Recommended age: " + recommendedAgeInfo);
        }
    }
}
