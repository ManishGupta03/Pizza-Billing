public class Pizza {
    private int price;
    private boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int TakeawayPrice;
    private boolean CheeseAdded;
    private boolean ToppingsAdded;
    private boolean TakeawayAdded;

    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.CheeseAdded=false;
        this.ToppingsAdded=false;
        this.TakeawayAdded=false;
        this.extraCheesePrice=80;
        this.isVeg=isVeg;
        this.TakeawayPrice=20;

        if(isVeg==true){
            this.price=300;
            this.extraToppingsPrice=70;
        }
        else{
            this.price=400;
            this.extraToppingsPrice=120;
        }
        this.bill="Base Price of the Pizza: "+this.price+ "\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if (CheeseAdded == false) {
            this.price = this.price + this.extraCheesePrice;
            CheeseAdded = true;
        }
    }
        public void addExtraToppings() {
            if (ToppingsAdded == false) {
                this.price = this.price + this.extraToppingsPrice;
                ToppingsAdded = true;
            }
        }
            public void addTakeaway() {
                if (TakeawayAdded == false) {
                    this.price = this.price + this.TakeawayPrice;
                    TakeawayAdded = true;
                }
            }
                public String getBill(){
        if(isBillGenerated==false){
            isBillGenerated=true;
            if(CheeseAdded==true){
                this.bill = this.bill+"Extra Cheese Added: "+ this.extraCheesePrice+ "\n";
            }
            if(ToppingsAdded==true){
                this.bill = this.bill+"Extra Toppings Added: "+ this.extraToppingsPrice+ "\n";
            }
            if(TakeawayAdded==true){
                this.bill = this.bill+"Takeaway Added: "+ this.TakeawayPrice+ "\n";
            }
            this.bill = this.bill +"Total Price: "+this.price + "\n";
        }
                    return this.bill;
                }
        }



