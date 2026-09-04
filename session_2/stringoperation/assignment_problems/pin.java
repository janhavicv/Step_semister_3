class pin{
    void checkPinLength(String pin){
        if(pin.length()==4){
            System.out.println("Valid pin");
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public static void main(String[] args) {
        pin p = new pin();
        String pin = "1234";
        p.checkPinLength(pin);
    }
}