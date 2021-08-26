public enum Price {
        FIFE(500), SIX(600), SEVEN(700), EIGHT(800), NINE(900), TEN(1000);
        private int price;

        Price(int price){
            this.price=price;
        }

        public int getPrice(){
            return price;
        }
}
